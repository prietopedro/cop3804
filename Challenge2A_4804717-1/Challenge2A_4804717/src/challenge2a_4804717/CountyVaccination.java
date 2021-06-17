/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2a_4804717;

import java.util.Scanner;

/**
 *
 * @author 4804717
 * Title: Creating and Using Objects 
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program's Functionality:
 *      This program demonstrates the use of classes and objects.
 *      It asks user for information about patients and vaccines and then displays the information gathered
 */
public class CountyVaccination {
    // Future improvements - Use arrayLists instead of standalone patient and vaccine variables.
    static Patient patient1;
    static Patient patient2;
    static Patient patient3;
    
    static CoronaVaccine record1;
    static CoronaVaccine record2;
    static CoronaVaccine record3;
    
    public static void vaccinatePeople(){
        /*
         This method is in charge of creating, gathering, and saving all information needed from the user about the vaccine and the patients
        */
        
        // Future improvements - If we had arrayLists of patients instead of standalone variables we could have a while loop instead to give the user to save as little or as many patients as needed. We wouldn't be restricted to 3.        
        // ***** FIRST VACCINE AND PATIENT ***** \\
        record1 = new CoronaVaccine();
        patient1 = new Patient(record1);
        System.out.println("Welcome, let's start with the first vaccine and patient!");
        savePatientInfo(patient1);
        
        // ***** SECOND VACCINE AND PATIENT ***** \\
        record2 = new CoronaVaccine();
        patient2 = new Patient(record2);
        
        System.out.println("\n\nPerfect, let's continue with the second vaccine and patient!");
        savePatientInfo(patient2);
        
        // ***** THIRD VACCINE AND PATIENT ***** \\
        record3 = new CoronaVaccine();
        patient3 = new Patient(record3);
        
        System.out.println("\n\nPerfect, let's continue with the third vaccine and patient!");
       savePatientInfo(patient3);
            
    }
    
    public static void reportVaccinations(){
        /*
         This method is in charge of displaying all the information entered by the user.
        IMPORTANT: vaccinatePeople needs to run before to gather the information. 
        */
        // Future improvements: We could create a small table instead of using the toString so that it's more user friendly. It's currently displaying information similar to a JSON object.
        System.out.println("\n\nThank you for using my program.");
        System.out.println("Here is what we gathered this session.");
        
        System.out.println("\nPatient and Vaccine #1:");
        System.out.println(patient1);
        
        System.out.println("\nPatient and Vaccine #2:");
        System.out.println(patient2);
        
        System.out.println("\nPatient and Vaccine #3:");
        System.out.println(patient3);
    }
    public static void main(String[] args) {
        /*
         This is the main method. It's main function is to run the program. It first run vaccinatePeople to gather information and it thens runs reportVaccinations to display the information.
        */
        vaccinatePeople();
        reportVaccinations();
    }
    private static void savePatientInfo(Patient patient){
        /*
         This method is used so that asking the user does not have to be repeated 3 times. Could be more useful if we needed additional patients in the future.
         @param {Patient} The patient object where the info will be saved to
        */
        // Future improvements - If we had error validations in the setters we could have loops for each user entry to make sure the correct information is entered.

        Scanner scnr = new Scanner(System.in);
        System.out.println("\nWho's the manufacturer of this vaccine?");
        patient.vaccine.setManufacturer(scnr.nextLine());
        
        System.out.println("How many doses does this vaccine require?");
        patient.vaccine.setNumberOfDoses(scnr.nextInt());
        scnr.nextLine(); // Needed because it skips the next line because the cursor remains in the int line - more info here: https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
        
        System.out.println("When will the first dose of this vaccine be administred? - MM/DD/YYYY format");
        patient.vaccine.setFirstInjectionDate(scnr.nextLine());
        
        
        System.out.println("Where will the first dose of this vaccine be administred?");
        patient.vaccine.setFirstInjectionLocation(scnr.nextLine());
        
        System.out.println("When will the second dose of this vaccine be administred? - MM/DD/YYYY format");
        patient.vaccine.setSecondInjectionDate(scnr.nextLine());
        
        System.out.println("Where will the second dose of this vaccine be administred?");
        patient.vaccine.setSecondInjectionLocation(scnr.nextLine());
        
        System.out.println("What's the name of the patient receiving this vaccine? - First Last format");
        patient.setFirstName(scnr.next());
        patient.setLastName(scnr.next());
        scnr.nextLine(); // Needed because it skips the next line because the cursor remains in the previous line - more info here: https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
        
        System.out.println("What's the date of birth of this patient? - MM/DD/YYYY format");
        patient.setDateOfBirth(scnr.nextLine());
    }
    
}
