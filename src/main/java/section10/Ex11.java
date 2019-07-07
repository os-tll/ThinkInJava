package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 13:43
 */
public class Ex11 {
    public static void main(String[] args) {
        Ex11Aid ex11Aid = new Ex11Aid();
        //私有内部类，类外不可见
        //! Ex11Aid.Ex9AidImpl ex9AidImpl = (Ex11Aid.Ex9AidImpl)ex11Aid.getEx9AidImpl();
    }
}
class Ex11Aid{
    public Ex9Aid getEx9AidImpl(){
        return new Ex9AidImpl();
    }
    private class Ex9AidImpl implements Ex9Aid{

        @Override
        public void fun() {

        }
    }
}
