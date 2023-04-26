package step2;

public class Q5_2884_3 {
    public static void main(String[] args) {
        /*String input = "apple banana kiwi";
        String input2 = "apple,banana,kiwi";
        StringTokenizer tokenizer = new StringTokenizer(input2,",");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }*/

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.delete(5, 6);
        sb.replace(6, 11, "Java");
        sb.reverse();
        System.out.println(sb.toString());


    }
}
