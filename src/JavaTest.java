import java.util.Scanner;

//Kody Graham, OOP Java, 4:05-5:20 T/TH
public class JavaTest
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!");

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("Hi, " + name);
        if (age<=20)
            System.out.println("Wow, you are young!");

        else if(age>20)
            System.out.println("Wow, you are old!");
        //Git test line
    }
    }