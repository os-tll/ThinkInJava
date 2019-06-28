package section7;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 14:24
 */
public class Ex9 {
    public static void main(String[] args) {
        new Ex9Aid4();
    }
}
class Ex9Aid{
    Ex9Aid(){
        System.out.println("Ex9Aid");
    }
}
class Ex9Aid2{
    Ex9Aid2(){
        System.out.println("Ex9Aid2");
    }
}

class Ex9Aid3{
    Ex9Aid3(){
        System.out.println("Ex9Aid3");
    }
    Ex9Aid ex9Aid = new Ex9Aid();
    Ex9Aid2 ex9Aid2 = new Ex9Aid2();
}
class Ex9Aid4 extends Ex9Aid3{
    Ex9Aid4(){
        System.out.println("Ex9Aid4");
    }
}

