package Peart4;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    menu();
    }

    private static void menu() {
        int selection = 0;
        String errorMsg = "Please enter a valid input!\n";
        System.out.println("Enter your selection:\n1. Play against computer\n2. Play against other player\n3. Exit\n");

        while (selection != 3) {
            Scanner scanner = new Scanner(System.in);
            try{
                selection = scanner.nextInt();
            } catch (Exception e) {
                // do nothing
            }

            switch (selection) {
                case 1:
                    selection = 1;
                    System.out.println("Starting game vs. computer...\n");
                    break;
                case 2:
                    selection = 2;
                    System.out.println("Starting game vs player...\n");
                    break;
                case 3:
                    selection = 3;
                    System.out.println("Exiting...\n");
                    break;
                default:
                    System.out.println(errorMsg);
                    break;
            }
        }
    }

}
