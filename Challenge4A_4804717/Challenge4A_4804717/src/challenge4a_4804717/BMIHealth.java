/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge4a_4804717;

import java.util.Scanner;

/*
 *
 * @author 4804717
 * Title: BMI Health
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program's Functionality:
 *      This program demonstrates the use of classes and if else statements.
 *      It calculates the BMI of a person and says if the person health condition and the recommended weight in the scenario that the person is not healthy. 
*/
public class BMIHealth {
    public static Person anyPerson; // Will store the information gathered from the user.
    /**
     * This is the main class and just drives the whole program.
     * @param args the command line arguments
     * Precondition: createPersonObject and showBMI must be defined.
     */
    public static void main(String[] args) {
        createPersonObject();
        showBMI();
    }
    /**
     * This is the method that asks the user their information through the CLI and assigns the anyPerson global variable.
     * Precondition: Person object must be defined and must include a constructor containing firstName, lastName, heightInches, and weightPounds.
     */
    public static void createPersonObject(){
        String firstName, lastName;
        double height, weight;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("What's your first name?");
        firstName = scnr.nextLine();
        
        System.out.println("What's your last name?");
        lastName = scnr.nextLine();
        
        System.out.println("What's your height in inches?");
        height = scnr.nextDouble();
        scnr.nextLine();
        
        System.out.println("What's your weight in pounds?");
        weight = scnr.nextDouble();
        scnr.close();
        
        anyPerson = new Person(firstName, lastName, height, weight);
    }
    
    /**
     * This is the method that prints the anyPerson object and checks if they are healthy, if they are not, it will display the recommended weight.
     * Precondition: a Person object must be assigned to anyPerson global variable.
     * Precondition: Person class must have a static method called determineHealth that takes a double as a parameter
     * Precondition: Person class must have methods called calculateBMI, and recommendedWeight, as well as getters for firstName
     */
    public static void showBMI(){
        double anyPersonBMI;
        String anyPersonHealthStatus;
        double anyPersonRecommendedWeight;
        System.out.println(anyPerson);
        anyPersonBMI = anyPerson.calculateBMI();
        System.out.println("BMI: " + anyPersonBMI);
        anyPersonHealthStatus = Person.determineHealth(anyPersonBMI);
        System.out.println("Health Status: " + anyPersonHealthStatus);
        if(!anyPersonHealthStatus.equals("healthy")) {
            anyPersonRecommendedWeight = anyPerson.recommendedWeight();
            System.out.printf(anyPerson.getFirstName() + " recommended weight is %.2f", anyPersonRecommendedWeight);
        }
        
    }
    
}
