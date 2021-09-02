import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add some code here!

        System.out.println("What is your name?"); // name
        String name = scan.next();
        System.out.println("Hi, " + name);

        System.out.println("What is your favorite color?"); // color
        String color = scan.next();
        System.out.println(color + "is a great color");

        System.out.println("What is your favorite sport?");
        String sport = scan.next();
        System.out.println("I like basketball, but " + sport + " is fun too");

        System.out.println("What is your dream location to live?");
        String location = scan.next();
        System.out.println(location + " is a great choice");

        System.out.println("What is your favorite food?");
        String food = scan.next();
        System.out.println(food + " is yummy");

        scan.close();
    }
}
