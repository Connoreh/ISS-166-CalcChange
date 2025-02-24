
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

//        do {

//        System.out.print("Do you have change? (Y/N) ");
//        userChoice = sc.nextLine();

//            } catch (Exception e) {
//                System.out.println("I do not understand your answer");
//            }


        // move calculations and print statemtents into a showTotal method


//        System.out.println("Welcome to the Change Calculator!\n");
//        System.out.print("Do you have change? (Y/N) ");
//        userChoice = sc.nextLine();

//        while (userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("Yes")) {
//                    double totalChange;
//                    double runningTotal;
//                System.out.println(userChoice);
        String userChoiceParsed;


        System.out.println("Welcome to the Change Calculator!\n");
        System.out.print("Do you have change? (Y/N) ");
        userChoice = sc.nextLine();


//                if (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y")) {

        while (userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("Yes")) {
            try {
                userPennies = getCoin("How many pennies do you have? ");
                userNickels = getCoin("How many nickels do you have? ");
                userDimes = getCoin("How many dimes do you have? ");
                userQuarters = getCoin("How many quarters do you have? ");
                userHalfDollars = getCoin("How many half-dolllars do you have? ");

                showTotal(userPennies, userNickels, userDimes, userQuarters, userHalfDollars);
            } catch (Exception e) {
                System.out.println("I do not understand your answer");
            }
        }

//            userChoice = "";
//                }




//                {
////                if (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y")) {
//
//                    userPennies = getCoin("How many pennies do you have? ");
//                    userNickels = getCoin("How many nickels do you have? ");
//                    userDimes = getCoin("How many dimes do you have? ");
//                    userQuarters = getCoin("How many quarters do you have? ");
//                    userHalfDollars = getCoin("How many half-dolllars do you have? ");
//
//                    showTotal(userPennies, userNickels, userDimes, userQuarters, userHalfDollars);
////            userChoice = "";
////                }
//                }


//            } catch (Exception e) {
//                System.out.println("I do not understand your answer");
//
//
//        }
//            while (userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("Yes")) ;
            userChoice = "";
            System.out.println("Thanks for using the Change Calculator!");

//        }


//      while (userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("Yes")) {
////                    double totalChange;
////                    double runningTotal;
//
//                    userPennies = getCoin("How many pennies do you have? ");
//                    userNickels = getCoin("How many nickels do you have? ");
//                    userDimes = getCoin("How many dimes do you have? ");
//                    userQuarters = getCoin("How many quarters do you have? ");
//                    userHalfDollars = getCoin("How many half-dolllars do you have? ");
//            runningTotal += totalChange;
//            double runningTotal = 0.00;


//                    get pennies
//        System.out.print("How many pennies do you have? ");
//        userPennies = sc.nextInt();

            ////       get nickels
//        System.out.print("How many nickels do you have? ");
//        userNickels = sc.nextInt();

            //       // get dimes
//        System.out.print("How many dimes do you have? ");
//        userDimes = sc.nextInt();

            ////       get quarters
//        System.out.print("How many quarters do you have? ");
//        userQuarters = sc.nextInt();
//            NumberFormat curr = NumberFormat.getCurrencyInstance();
//            totalChange = (userPennies) + (userNickels * 5) + (userDimes * 10) + (userQuarters * 25) + (userHalfDollars * 50);
//            totalChange = totalChange / 100;
//            runningTotal += totalChange;
//            System.out.println("You have a total of total of " + curr.format(totalChange) + " cents.\n");

//                    showTotal(userPennies, userNickels, userDimes, userQuarters, userHalfDollars);
//            userChoice = "";
//            userChoice = "";
//            System.out.print("Do you have more change? (Y/N) ");

//            if ((!userChoice.equalsIgnoreCase("no"))){
//                System.out.println("You entered a grand total of " + curr.format(runningTotal));
//
//            }
//        userChoice = "";
//            System.out.print("Do you have more change? (Y/N) ");
//        System.out.println(userChoice);
//            userChoice = sc.nextLine();
//            if ((userChoice.toLowerCase() == "n") || (userChoice.toLowerCase() == "no")){
//            System.out.println("You have a total of total of " + totalChange + " cents.\n");
//            }

//            if (userChoice != "y" || "Y")


//            System.out.println("You entered a grand total of " + curr.format(runningTotal));
//                }


//        if (runningTotal != 0) {
//            System.out.println("You entered a grand total of " + curr.format(runningTotal));
//        }


//        get pennies
//        System.out.print("How many pennies do you have? ");
//        userPennies = sc.nextInt();
//
////       get nickels
//        System.out.print("How many nickels do you have? ");
//        userNickels = sc.nextInt();
//
//       // get dimes
//        System.out.print("How many dimes do you have? ");
//        userDimes = sc.nextInt();
//
////       get quarters
//        System.out.print("How many quarters do you have? ");
//        userQuarters = sc.nextInt();
//        calculate change
//        totalChange = (userPennies) + (userNickels * 5) + (userDimes * 10) + (userQuarters * 25);
//        System.out.println("You have a total of total of " + totalChange + " cents.\n");
//        System.out.println("Thanks for using the Change Calculator!");
//
    }


        static double runningTotal = 0;
        private static void showTotal ( int pennies, int nickels, int dimes, int quarters, int halfDollars){
            double totalChange;
//        double runningTotal;
//            String userChoice = "";

//        System.out.println("Welcome to the Change Calculator!\n");
//        System.out.print("Do you have change? (Y/N) ");
//        userChoice = sc.nextLine();

            NumberFormat curr = NumberFormat.getCurrencyInstance();

            totalChange = (pennies) + (nickels * 5) + (dimes * 10) + (quarters * 25) + (halfDollars * 50);
            totalChange = totalChange / 100;
            runningTotal += totalChange;
//        System.out.println(runningTotal);
//        System.out.println(totalChange);
            System.out.println("You have a total of " + curr.format(totalChange) + " cents.\n");


//       userChoice = "";
//            System.out.println(userChoice);
            System.out.print("Do you have more change? (Y/N) ");
            userChoice = sc.nextLine();
//        System.out.println(userChoice);
            if ((userChoice.toLowerCase().contains("no"))) {
                System.out.println("You have a grand total of " + curr.format(runningTotal) + " cents.\n");
//                userChoice = "";
            }
//            userChoice = "";


//        if (runningTotal != 0) {
//            System.out.println("You entered a grand total of " + curr.format(runningTotal));
//        }
//            userChoice = "";
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



