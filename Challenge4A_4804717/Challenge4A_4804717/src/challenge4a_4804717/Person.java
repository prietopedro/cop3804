/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge4a_4804717;
import java.text.DecimalFormat;

/*
 *
 * @author 4804717
 * Title: BMI Health
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program's Functionality:
 *      This class stores a person object and is able to calculate their BMI, healthCondition, and recommendedWeight.
*/
public class Person {

    private String firstName;
    private String lastName;
    private double heightInches;
    private double weightPounds;
    
    public Person(String firstName, String lastName, double heightInches, double heightPounds){
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightInches = heightInches;
        this.weightPounds = heightPounds;
    }
    
       /**
     * This is the method that calculates a persons BMI.
     * Precondition: The person height and weight must be defined.
     * @return BMI The person's BMI
     */
    public double calculateBMI(){
        double BMI = (weightPounds / Math.pow(heightInches, 2)) * 703;
        return BMI;
    }
    
   /**
     * This is the method that determines a person health depending on their BMI.
     * @param aBMI The BMI of a person
     * @return healthStatus A string that describes the person health.
     */
    public static String determineHealth(double aBMI){
        // I created this method as static since the instruction asked for the BMI to be a parameter. If we would calculate it here instead or if we had the BMI stored as a field I would not have used a static method
        String healthStatus = "";
     
        if(aBMI < 18.5) healthStatus = "underweight";
        else if(aBMI < 25) healthStatus = "healthy";
        else if(aBMI < 30) healthStatus = "overweight";
        else if(aBMI < 39.99) healthStatus = "obese";
        else healthStatus = "extremely obese";
        return healthStatus;
    }
    
    /**
     * This is the method that determines a person recommended weight.
     * Precondition: The person height must be defined.
     * @return optimumWeight A double of the recommended weight of this person.
     */
    public double recommendedWeight(){
        double optimumWeight = (25 * Math.pow(heightInches, 2))/703;
        return optimumWeight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeightInches() {
        return heightInches;
    }

    public double getWeightPounds() {
        return weightPounds;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeightInches(double heightInches) {
        this.heightInches = heightInches;
    }

    public void setWeightPounds(double weightInches) {
        this.weightPounds = weightInches;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,###.##");
        return firstName + " " + lastName + " weighs " + weightPounds + " pounds and measures " + heightInches + " inches tall, Their BMI is "+ df.format(calculateBMI());
    }
}
