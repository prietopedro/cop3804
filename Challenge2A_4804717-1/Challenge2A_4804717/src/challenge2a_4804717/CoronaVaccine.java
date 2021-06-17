/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2a_4804717;

/**
 *
 * @author pedroprieto
 * This class is to store each vaccine instance. 
 */
public class CoronaVaccine {
    private String manufacturer;
    private int numberOfDoses;
    private String firstInjectionLocation;
    private String firstInjectionDate;
    private String secondInjectionLocation;
    private String secondInjectionDate;
    
    // Overloaded the constructor since there could be different ways to create this object
    // Setters are final and not overridable so that we can use them in constructor without bugs that could come from overriding them in a child class.
    
    public CoronaVaccine() {
    // this constructor is to be used if I want to gather information from user line by line like in this example using the cli
    }
    public CoronaVaccine(String _manufacturer, int _numberOfDoses, String _firstInjectionLocation, String _firstInjectionDate, String _secondInjectionLocation, String _secondInjectionDate) {
        // this constructor is to be used if this was a web backend application and we received all this information at once from an HTTP request
        setManufacturer(_manufacturer);
        setNumberOfDoses(_numberOfDoses);
        setFirstInjectionLocation(_firstInjectionLocation);
        setSecondInjectionLocation(_secondInjectionLocation);
        setFirstInjectionDate(_firstInjectionDate);
        setSecondInjectionDate(_secondInjectionDate);
    }

    public String getManufacturer() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have manufacturer saved before returning.
        return manufacturer;
    }

    public final void setManufacturer(String manufacturer) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.manufacturer = manufacturer;
    }

    public int getNumberOfDoses() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have numberOfDoses saved before returning.
        return numberOfDoses;
    }

    public final void setNumberOfDoses(int numberOfDoses) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.numberOfDoses = numberOfDoses;
    }

    public String getFirstInjectionLocation() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have first injection location saved before returning.
        return firstInjectionLocation;
    }

    public final void setFirstInjectionLocation(String firstInjectionLocation) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.firstInjectionLocation = firstInjectionLocation;
    }

    public String getFirstInjectionDate() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have first injection date saved before returning.
        return firstInjectionDate;
    }

    public final void setFirstInjectionDate(String firstInjectionDate) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.firstInjectionDate = firstInjectionDate;
    }

    public String getSecondInjectionLocation() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have second injection location saved before returning.
        return secondInjectionLocation;
    }

    public final void setSecondInjectionLocation(String secondInjectionLocation) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.secondInjectionLocation = secondInjectionLocation;
    }

    public String getSecondInjectionDate() {
        // FUTURE IMPROVEMENTS: Error validation. Make sure we have second injection date saved before returning.
        return secondInjectionDate;
    }

    public final void setSecondInjectionDate(String secondInjectionDate) {
        // FUTURE IMPROVEMENTS: Input validation.
        this.secondInjectionDate = secondInjectionDate;
    }

    @Override
    public String toString() {
        // FUTURE IMPROVEMENTS: More readable formatting
        return "CoronaVaccine{" + "manufacturer=" + manufacturer + ",\n"
                + "numberOfDoses=" + numberOfDoses + ",\n"
                + "firstInjectionLocation=" + firstInjectionLocation + ",\n"
                + "firstInjectionDate=" + firstInjectionDate + ",\n"
                + "secondInjectionLocation=" + secondInjectionLocation + ",\n"
                + "secondInjectionDate=" + secondInjectionDate + "\n" 
                + "}";
    }
    
}
