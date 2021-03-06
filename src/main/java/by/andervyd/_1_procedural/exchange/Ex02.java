package by.andervyd._1_procedural.exchange;

public class Ex02 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        System.out.println("a: " + a + "\nb: " + b);
        // output: a: 3
        //         b: 5

        System.out.println("====");

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a: " + a + "\nb: " + b);
        // output: a: 5
        //         b: 3
    }
}
