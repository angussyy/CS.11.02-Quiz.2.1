/* I have neither given nor received any unauthorised aid on this piece of work*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultOne = add(1, 2);
        System.out.println(resultOne);

        String resultTwo = greeting("Audrey");
        System.out.println(resultTwo);

        int resultThree = add(5, 6, 7, 8);
        System.out.println(resultThree);

        printMe("Oh no this test is so scaryyy");
    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static String greeting(String name) {
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(add(numOne, numTwo), numThree), numFour);
    }

    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
}