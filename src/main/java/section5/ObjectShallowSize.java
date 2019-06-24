package section5;

import java.lang.instrument.Instrumentation;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 17:35
 */
public class ObjectShallowSize {
    private static Instrumentation inst;

    public static void premain(String agentArgs, Instrumentation instP){
        inst = instP;
    }

    public static long sizeOf(Object obj){
        return inst.getObjectSize(obj);
    }
}
