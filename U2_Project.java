import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
public class U2_Project {

    static Random rnd = new Random();
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Part 1 - Name Extraction
        System.out.println("What is your full name?");
        String fullName = keyboard.nextLine();
        name(fullName);
        System.out.println(); //break in the output
        //***************************************************************************
        //Part 2 - Counting Change
        System.out.println("How many quarters do you have?");
        int quarters = keyboard.nextInt();
        System.out.println("How many dimes do you have?");
        int dimes = keyboard.nextInt();
        System.out.println("How many nickels do you have?");
        int nickels = keyboard.nextInt();
        System.out.println("How many pennies do you have?");
        int pennies = keyboard.nextInt();
        System.out.println("You have $" + change(quarters, dimes, nickels, pennies));
        System.out.println(); //break in the output
        //**************************************************************************
        //Part 3 - Rolling Dice
        System.out.println(rollDice());
    }
    //Method for Part 1
    public static void name(String name){
        try{
        String[] broke_name = name.split(" ", -1);
        System.out.print("Your first name is " + broke_name[0] + " and it is " + broke_name[0].length() + " characters long." + '\n' +
        "Your middle name is " + broke_name[1] + " and it is " + broke_name[1].length() + " characters long." + '\n' +
        "Your last name is " + broke_name[2] + " and it is " + broke_name[2].length() + " characters long." + '\n' +
        "Your initals are " + broke_name[0].substring(0,1) + broke_name[1].substring(0,1) + broke_name[2].substring(0,1) + '\n');

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Are you happy? Breaking the System? WOW");
        }
    } 
    //Method for Part 2
    public static double change(int quarters, int dimes, int nickels, int pennies){
        double x = ((quarters*0.25) + (dimes*.1) + (nickels*0.05) + (pennies * 0.01));
        x = Math.round(x * 100);
        x /= 100;
        return x;
    }
    //Method for Part 3
    public static String rollDice(){
        int roll1 = (rnd.nextInt(6)+1);
        int roll2 = (rnd.nextInt(6)+1);
        return ("Your first roll was " + roll1 + '\n' +
        "Your second roll was " + roll2 + '\n' +
        "The sum of your rolls are " + (roll1+roll2));

    }
    }
