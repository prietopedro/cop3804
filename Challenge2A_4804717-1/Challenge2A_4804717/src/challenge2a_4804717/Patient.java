/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2a_4804717;

/**
 *
 * @author pedroprieto
 * This class stores each patient information
 */
public class Patient {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    CoronaVaccine vaccine;

    // Overloaded the constructor since there could be different ways to create this object
    // Setters are final and not overridable so that we can use them in constructor without bugs that could come from overriding them in a child class.
    
    public Patient() {
    // this constructor is to be used if I want to gather information from user line by line like in this example using the cli
    } 
    public Patient(CoronaVaccine vaccine) {
        // this constructor is to be used if I want to gather information from user line by line like in this example using the cli
        this.vaccine = vaccine;
    }
        
    public Patient(String _firstName, String _lastName, String _dateOfBirth, CoronaVaccine _vaccine) {
        // this constructor is to be used if this was a web backend application and we received all this information at once from an HTTP request
        setFirstName(_firstName);
        setLastName(_lastName);
        setDateOfBirth(_dateOfBirth);
        setVaccine(_vaccine);
    } 

    public String getFirstName() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have first name saved before returning.
        return firstName;
    }

    public final void setFirstName(String firstName) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.firstName = firstName;
    }


    public String getLastName() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have last name saved before returning.
        return lastName;
    }

    public final void setLastName(String lastName) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have dob saved before returning.
        return dateOfBirth;
    }

    public final void setDateOfBirth(String dateOfBirth) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.dateOfBirth = dateOfBirth;
    }

    public CoronaVaccine getVaccine() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have vaccine saved before returning.
        return vaccine;
    }

    public final void setVaccine(CoronaVaccine vaccine) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.vaccine = vaccine;
    }
    
    @Override
    public String toString() {
        // FUTURE IMPROVEMENTS: More readable formatting
        return "Patient{" + "firstName=" + firstName + ",\n"
                + "lastName=" + lastName + ",\n"
                + "dateOfBirth=" + dateOfBirth + ",\n"
                + "vaccine=" + vaccine + "\n"
    + "}";
    }
}
