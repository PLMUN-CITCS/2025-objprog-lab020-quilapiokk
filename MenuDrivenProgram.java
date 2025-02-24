import java.util.Scanner;

public class MenuDrivenProgram {



    public static void displayMenu() {

        System.out.println("Menu:");

        System.out.println("1. Greet User");

        System.out.println("2. Check Even/Odd");

        System.out.println("3. Exit");

        System.out.print("Enter your choice (1-3): ");

    }



    public static boolean handleMenuChoice(int choice) {

        Scanner scanner = new Scanner(System.in);



        switch (choice) {

            case 1:

                greetUser(); 

                break;

            case 2:

                checkEvenOrOdd(); 

                break;

            case 3:

                System.out.println("Exiting program. Goodbye!"); 

                return true; 

            default:

                System.out.println("Invalid choice. Please enter 1, 2, or 3."); 

                break;

        }

        return false;

    }

    public static void greetUser() {

        System.out.println("Hello! Welcome!");

    }

    public static void checkEvenOrOdd() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = scanner.nextInt();

        

        if (number % 2 == 0) {

            System.out.println(number + " is an Even number.");

        } else {

            System.out.println(number + " is an Odd number.");

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exitProgram = false;

        while (!exitProgram) {

            

            displayMenu(); 

            int choice = scanner.nextInt(); 

            exitProgram = handleMenuChoice(choice);

        }

    }
}