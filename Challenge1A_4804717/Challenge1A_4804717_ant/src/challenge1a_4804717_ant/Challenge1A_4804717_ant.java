/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge1a_4804717_ant;

import java.util.Scanner;

/**
 *
 * @author 4804717
 * Title: Calories Consumed & Burned
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program's Functionality:
 *      This program demonstrates the use of variables, types, casting, and arithmetic expressions.
 *      It asks the user for calories consumed and burned throughout a 7 day period and outputs the average for both and calculates an estimate of how many lbs that person gained or lost
 */
public class Challenge1A_4804717_ant {

    /**
     * This is the main class. We stored all variables in this class so that all methods have access to them.
     * I also added additional constants to make the code easier to read in complex operations.
     */
    static final int DAYS_IN_WEEK = 7;
    static final int CALORIES_PER_POUND = 3000; 
    
    // Future improvement: Store this in an array so we could loop through all the days easily.
    static int day1CalConsumed;
    static int day2CalConsumed;
    static int day3CalConsumed;
    static int day4CalConsumed;
    static int day5CalConsumed;
    static int day6CalConsumed;
    static int day7CalConsumed;
    
    static int day1CalBurned;
    static int day2CalBurned;
    static int day3CalBurned;
    static int day4CalBurned;
    static int day5CalBurned;
    static int day6CalBurned;
    static int day7CalBurned;
    
    static int totalCaloriesConsumed;
    static int totalCaloriesBurned;
    
    static double averageCaloriesConsumed;
    static double averageCaloriesBurned;
    static double netWeeklyPounds;
    
    public static void main(String[] args) {
        // Asks user calories consumed and calories burned throughout a 7 day period. 
        getUserInput();
        calculateCalories();
        displayCalories();
    }
    
    private static void getUserInput(){
     /**
        * Asks user calories consumed and calories burned throughout a 7 day period using the scanner class.
        * The inputs by the user gets stored in int variables declared in the class
     */
     // Future improvement: If we had calConsumed and calBurned in an array, we could use a loop to have less repetition.
     // Future improvement: Input validation, in case the user makes a mistake. It would prevent errors that could stop the program from running, or display incorrect information.
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter calories consumed for day #1: ");
        day1CalConsumed = scnr.nextInt();
        System.out.print("Enter calories burned for day #1: ");
        day1CalBurned = scnr.nextInt();
        
        System.out.print("\nEnter calories consumed for day #2: ");
        day2CalConsumed = scnr.nextInt();
        System.out.print("Enter calories burned for day #2: ");
        day2CalBurned = scnr.nextInt();
        
        System.out.print("\nEnter calories consumed for day #3: ");
        day3CalConsumed = scnr.nextInt();
        System.out.print("Enter calories burned for day #3: ");
        day3CalBurned = scnr.nextInt();
        
        System.out.print("\nEnter calories consumed for day #4: ");
        day4CalConsumed = scnr.nextInt();
        System.out.print("Enter calories burned for day #4: ");
        day4CalBurned = scnr.nextInt();
        
        System.out.print("\nEnter calories consumed for day #5: ");
        day5CalConsumed = scnr.nextInt();
        System.out.print("Enter calories burned for day #5: ");
        day5CalBurned = scnr.nextInt();
        
        System.out.print("\nEnter calories consumed for day #6: ");
        day6CalConsumed = scnr.nextInt();
        System.out.print("Enter calories burned for day #6: ");
        day6CalBurned = scnr.nextInt();
        
        System.out.print("\nEnter calories consumed for day #7: ");
        day7CalConsumed = scnr.nextInt();
        System.out.print("Enter calories burned for day #7: ");
        day7CalBurned = scnr.nextInt();
    }

    private static void calculateCalories() {
    /**
        * This method does the heavy lifting when it comes to the arithmetic operations.
        * It adds up all calories consumed into a variable called totalCaloriesConsumed.
        * It adds up all calories burned into a variable called totalCaloriesBurned.
        * It then calculates the average calories consumed and burned in that week and saves them into averageCaloriesConsumed & averageCaloriesBurned respectively.
        * It then calculates how many pounds the user gained or lost during the 7 day period and stores it in netWeeklyPounds
        * Precondition: It's important to have all user input for each day already saved, otherwise it will throw an error. getUserInput method needs to be called before.
     */
        totalCaloriesConsumed = day1CalConsumed;
        totalCaloriesConsumed += day2CalConsumed;
        totalCaloriesConsumed += day3CalConsumed;
        totalCaloriesConsumed += day4CalConsumed;
        totalCaloriesConsumed += day5CalConsumed;
        totalCaloriesConsumed += day6CalConsumed;
        totalCaloriesConsumed += day7CalConsumed;
        
        totalCaloriesBurned = day1CalBurned;
        totalCaloriesBurned += day2CalBurned;
        totalCaloriesBurned += day3CalBurned;
        totalCaloriesBurned += day4CalBurned;
        totalCaloriesBurned += day5CalBurned;
        totalCaloriesBurned += day6CalBurned;
        totalCaloriesBurned += day7CalBurned;
        
        averageCaloriesConsumed = (double) totalCaloriesConsumed / DAYS_IN_WEEK;
        averageCaloriesBurned = (double) totalCaloriesBurned / DAYS_IN_WEEK;
        
        netWeeklyPounds = (double) (totalCaloriesConsumed - totalCaloriesBurned) / CALORIES_PER_POUND;
    }

    private static void displayCalories() {
    /**
        * This method just displays all calories consumed, burned, their average in a 7 days period, and the net weight the user gained to the console.
        * Precondition: It's important that calculateCalories method is invoked before since it does all the calculations needed to display to the user.
     */
        System.out.printf("\nYou consumed a total of %,d calories this week.\n", totalCaloriesConsumed);
        System.out.printf("You burned a total of %,d calories this week.\n", totalCaloriesBurned);
        
        System.out.printf("\nYou consumed an average of %,.2f calories a day.\n", averageCaloriesConsumed);
        System.out.printf("You burned an average of %,.2f calories a day.\n\n", averageCaloriesBurned);
        
        // I can not figure out how to remove the leading zero so it outputs -.xyz instead of -0.xyz
        System.out.printf("Your net weekly gain/loss were %+.3f pounds.\n", netWeeklyPounds);
    }
    
}
