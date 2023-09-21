/* I have neither given nor received any unauthorised aid on this piece of work*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What two numbers do you want to add? Please enter the two numbers seperately. ");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int resultOne = add(numOne, numTwo);
        System.out.println(resultOne);

        System.out.println("What is your name?");
        String name = scanner.next();
        String resultTwo = greeting(name);
        System.out.println(resultTwo);

        System.out.println("What four numbers do you want to add? Please enter the four numbers seperately. ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int resultThree = add(one, two, three, four);
        System.out.println(resultThree);

        Scanner newscanner = new Scanner(System.in);

        System.out.println("What do you want to print?");
        String text = newscanner.nextLine();
        printMe(text);
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