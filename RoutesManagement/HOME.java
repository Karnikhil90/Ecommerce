package RoutesManagement;

import java.util.Scanner;

public class HOME extends Routes {

    Scanner scanner;
    String CurrentUser;

    // Position of a user can be defined
    final String[] CurrentUserType = { "admin", "buyer", "seller" };

    public HOME() {
        scanner = new Scanner(System.in);
    }

    public void choice() {
        while (true) {
            System.out.println("1.OPEN CART (or 'C')");
            System.out.println("2.ORDERS (or 'O')");
            System.out.println("3.View Products ");
            System.out.print("Enter Your choice : ");

            String userInput_Choice = scanner.nextLine().trim().toLowerCase();

            if (!(userInput_Choice.equalsIgnoreCase("exit"))) {
                if (userInput_Choice.equalsIgnoreCase("C") || userInput_Choice.equalsIgnoreCase("1")) {
                    System.out.println(1);
                } else if (userInput_Choice.equalsIgnoreCase("o") || userInput_Choice.equalsIgnoreCase("2")) {
                    System.out.println(2);
                } else if (userInput_Choice.equalsIgnoreCase("v") || userInput_Choice.equalsIgnoreCase("3")) {
                    System.out.println(3);
                    ViewProduct();
                } else if (userInput_Choice.equalsIgnoreCase("clear") || userInput_Choice.equalsIgnoreCase("home")) {
                    clear();
                } else {
                    System.out.println("\n\t***InputError :Invalid Input ! ***");
                }
            } else
                break;

        }
    }
}
