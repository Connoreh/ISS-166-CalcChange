
import java.util.Scanner;
import java.text.NumberFormat;
public class CalcChange {
    static Scanner sc = new Scanner(System.in);
;

    public static void main (String [] args){

        String userChoice;
        int userPennies;
        int userNickels;
        int userDimes;
        int userQuarters;
        double totalChange;
        double runningTotal = 0.0;
        NumberFormat curr = NumberFormat.getCurrencyInstance();

        System.out.println("Welcome to the Change Calculator!\n");
        System.out.print("Do you have change? (Y?N) ");
        userChoice = sc.nextLine();

        while( userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("Yes")){

            userPennies = getCoin("How many pennies do you have? ");
            userNickels = getCoin ("How many nickels do you have? ");
            userDimes = getCoin("How many dimes do you have? ");
            userQuarters = getCoin("How many quarters do you have? ");
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
            totalChange = (userPennies) + (userNickels * 5) + (userDimes * 10) + (userQuarters * 25);
            totalChange = totalChange / 100;
            runningTotal += totalChange;
        System.out.println("You have a total of total of " + curr.format(totalChange) + " cents.\n");
//        userChoice = "";
        System.out.print("Do you have more change? (Y/N) ");
//        System.out.println(userChoice);
        userChoice = sc.nextLine();




//            System.out.println("You entered a grand total of " + curr.format(runningTotal));
        }
        if(runningTotal != 0) {
            System.out.println("You entered a grand total of " + curr.format(runningTotal));
        }

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
        System.out.println("Thanks for using the Change Calculator!");

    }
    private static int getCoin(String prompt){
        int val;

        do{
            try{
                System.out.print(prompt);
                val = Integer.parseInt(sc.nextLine());
                if (val < 0){
                    System.out.println("Amount can not be negative. Please re-enter.");
                }
            } catch (Exception e){
                System.out.println("Illegal input: not a number. " + e.getMessage() + " Please re-enter.");
                val = -1;
            }
        }
        while (val < 0);
        return val;
    }
}
