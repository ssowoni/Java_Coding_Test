package step4;

public class wrapperEx {
    public static void main(String[] args) {

        Integer num = new Integer(17); // 박싱
        int n = num.intValue(); // 언박싱
        System.out.println(n); //17

        Character ch = 'X'; // Character ch = new Character('X'); 오토박싱
        char c = ch; // char c = ch.charValue(); 오토 언박싱
        System.out.println(c); //c

    }
}
