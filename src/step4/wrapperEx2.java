package step4;

public class wrapperEx2 {
    public static void main(String[] args) {
        Integer num1 = new Integer(7); //박싱
/*        Integer num1 = 7오토박싱*/
        Integer num2 = new Integer(3);

        int int1 = num1.intValue();//언박싱
        int int2 = num2.intValue(); //언박싱

        Integer result1 = num1 + num2; //10
        Integer result2 = int1 - int2; //4
        int result3= num1 * int2; //21
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
