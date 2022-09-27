
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second " + secondContainer + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            int wordCount = 0;
            String amount = "";
            if (input.equals("quit")) {
                break;
            }
            
            for (int i = 0; i <= input.length() - 1; i++) {
                if (Character.isDigit(input.charAt(i))) {
                    amount = amount + input.charAt(i);
                } else {
                    wordCount++;
                }
            }
            
            if (wordCount == 3) {
                
                if (firstContainer + Integer.valueOf(amount) >= 100) {
                    firstContainer = 100;
                } else if (Integer.valueOf(amount) > 0) {
                    firstContainer += Integer.valueOf(amount);
                }
            }
            
            if (wordCount == 4) {
                if (Integer.valueOf(amount) > firstContainer) {
                    secondContainer = secondContainer + firstContainer;
                    firstContainer = 0;
                } else if (Integer.valueOf(amount) > 0) {
                    firstContainer -= Integer.valueOf(amount);
                    secondContainer += Integer.valueOf(amount);
                }
            }
            
            if (wordCount == 6) {
                if (secondContainer - Integer.valueOf(amount) < 0) {
                    secondContainer = 0;
                } else if (Integer.valueOf(amount) > 0) {
                    secondContainer -= Integer.valueOf(amount);
                }
            }

        }
    }
    

}
