
import java.util.Scanner;
public class CalcChange {
    static Scanner sc = new Scanner(System.in);

    public static void main (String [] args){

        int userPennies;
        int userNickels;
        int userDimes;
        int userQuarters;
        int totalChange;

        System.out.println("Welcome to the Change Calculator!\n");

//        get pennies
        System.out.print("How many pennies do you have? ");
        userPennies = sc.nextInt();

//       get nickels
        System.out.print("How many nickels do you have? ");
        userNickels = sc.nextInt();

       // get dimes
        System.out.print("How many dimes do you have? ");
        userDimes = sc.nextInt();

//       get quarters
        System.out.print("How many quarters do you have? ");
        userQuarters = sc.nextInt();
//        calculate change
        totalChange = (userPennies) + (userNickels * 5) + (userDimes * 10) + (userQuarters * 25);
        System.out.println("You have a total of total of " + totalChange + " cents.\n");
        System.out.println("Thanks for using the Change Calculator!");

    }
}
