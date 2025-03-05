
import java.util.Scanner;
import java.text.NumberFormat;
public class CalcChange {
    public static Scanner sc = new Scanner(System.in);
    private static String userChoice;


    public static void main(String[] args) {

//         String userChoice;
        int userPennies;
        int userNickels;
        int userDimes;
        int userQuarters;

        double runningTotal = 0.0;
        int userHalfDollars;
        NumberFormat curr = NumberFormat.getCurrencyInstance();


        System.out.println("Welcome to the Change Calculator!\n");



            System.out.println("Welcome to the Change Calculator!\n");
                System.out.print("Do you have change? (Y/N) ");
                userChoice = sc.nextLine();
        while (!userChoice.equalsIgnoreCase("no")  && !userChoice.equalsIgnoreCase("n")  && !userChoice.equalsIgnoreCase("y")  && !userChoice.equalsIgnoreCase("yes") ) {
//            userChoice = "";
            System.out.println("I do not understand your answer");
            System.out.print("Do you have change? (Y/N) ");
            userChoice = sc.nextLine();
        }

        while  (userChoice.equalsIgnoreCase("N") || userChoice.equalsIgnoreCase("no") && runningTotal == 0 ){
            System.out.println("Thanks for using the Change Calculator!");
                userChoice = "";



        }


        while (userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("Yes")) {


            userPennies = getCoin("How many pennies do you have? ");
            userNickels = getCoin("How many nickels do you have? ");
            userDimes = getCoin("How many dimes do you have? ");
            userQuarters = getCoin("How many quarters do you have? ");
            userHalfDollars = getCoin("How many half-dolllars do you have? ");

            showTotal(userPennies, userNickels, userDimes, userQuarters, userHalfDollars);
        }

//        while (userChoice.equalsIgnoreCase("N") || userChoice.equalsIgnoreCase("no")) {
//            System.out.println("Thanks for using the Change Calculator!");
//
//        }

        }


        static double runningTotal = 0;
        private static void showTotal ( int pennies, int nickels, int dimes, int quarters, int halfDollars){
            double totalChange;


            NumberFormat curr = NumberFormat.getCurrencyInstance();

            totalChange = (pennies) + (nickels * 5) + (dimes * 10) + (quarters * 25) + (halfDollars * 50);
            totalChange = totalChange / 100;
            runningTotal += totalChange;

            System.out.print("You have a total of " + curr.format(totalChange) + " cents.\n");



            System.out.print("Do you have more change? (Y/N) ");
            userChoice = sc.nextLine();
            while (!userChoice.equalsIgnoreCase("no")  && !userChoice.equalsIgnoreCase("n")  && !userChoice.equalsIgnoreCase("y")  && !userChoice.equalsIgnoreCase("yes") ) {
                userChoice = "";
                System.out.println("I do not understand your answer");
                System.out.print("Do you have any more change? (Y/N) ");
                userChoice = sc.nextLine();


            }

            if  (userChoice.equalsIgnoreCase("n") || userChoice.equalsIgnoreCase("no") && totalChange != 0 ) {
                System.out.println("You have a grand total of " + curr.format(runningTotal) + " cents.\n");
                System.out.print("Thanks for using the Change Calculator!");
//                userChoice = "";
            }
            while  (userChoice.equalsIgnoreCase("N") || userChoice.equalsIgnoreCase("no") && runningTotal == 0 ){
                System.out.println("Thanks for using the Change Calculator!");
//                userChoice = "";



            }



        }


        private static int getCoin (String prompt){
            int val;

            do {
                try {
                    System.out.print(prompt);
                    val = Integer.parseInt(sc.nextLine());
                    if (val < 0) {
                        System.out.println("Amount can not be negative. Please re-enter.");
                    }
                } catch (Exception e) {
                    System.out.println("Illegal input: not a number. " + e.getMessage() + " Please re-enter.");
                    val = -1;
                }
            }
            while (val < 0);
            return val;
        }


    }



