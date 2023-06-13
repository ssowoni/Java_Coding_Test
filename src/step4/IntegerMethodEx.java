package step4;

public class IntegerMethodEx {
    public static void main(String[] args) {

        //객체 타입 반환하는 valueOf 비교
        boolean a = Integer.valueOf("127") == Integer.valueOf("127"); //true
        boolean b = Integer.valueOf("128") == Integer.valueOf("128"); //false

        //자료형(int)타입 반환하는 parseInt 비교
        boolean c = Integer.parseInt("127") == Integer.parseInt("127"); //true
        boolean d = Integer.parseInt("128") == Integer.parseInt("128"); //true

        //parseInt와 valueOf 비교 ( 오토 언박싱)
        boolean e = Integer.parseInt("127") == Integer.valueOf("127"); //true
        boolean f = Integer.parseInt("128") == Integer.valueOf("128"); //true

        boolean g = new Integer("127") == new Integer("127"); //false
        boolean h =  new Integer("127").equals( new Integer("127")); //true

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);



    }
}
