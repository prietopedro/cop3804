/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge3a_4804717;

/*
 *
 * @author 4804717
 * Title: Fun With Strings 
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program's Functionality:
 *      This program demonstrates the use of string manipulation and common String class methods.
 *      It gets the length, finds indexes, and substrings of a given word. 
*/
public class FunStrings {

    /*
     *    This method contains the main logic. Here we could improve it by adding a scanner and asking the user for a word instead of hardcoding it.
     *    @param args Cli arguments.
     */
    public static void main(String[] args) {
        funWithStrings("supercalifragilisticexpialidocious");
    }
    
    
    /*
    *    This method contains all the logic and any string manipulation we want to do.
    *    @param word The word that we want to use
    */
    public static void funWithStrings(String word){  
        // Just displays the word length
        System.out.println("Answer 1: " + word.length());
        
        // To make it more dynamic I will get the index first in case we want to use another word in the future.
        // We could get what substring we want to get from user input. Hardcoded for now for the assignment.
        System.out.println("Answer 2: " + getSubstring(word,"fragil"));
        System.out.println("Answer 3: " + getSubstring(word,"docious"));
        
        // Get last index of the letter i
        System.out.println("Answer 4: " + word.lastIndexOf('i'));
        
        // Get first index of the letter 4
        System.out.println("Answer 5: " + word.indexOf('e'));
        
        // Get char in the middle of string
        System.out.println("Answer 6: " + word.charAt(word.length() / 2));
        
        // Get uppercase of the word
        System.out.println("Answer 7 " + word.toUpperCase());
    }
    
    
    /*
    *    This method purpose is to return a substring of the word if the substring given appears in the word given. Other wise it will return Not Found
    *    @param word      The word that we want to look through
    *    @param subString The substring that we want to see if appears in word
    *    @return          The substring first given but we will return it directly from param word instead of just returning subString
    */
    private static String getSubstring(String word, String subString){
        String result;
        int startingIndex = word.indexOf(subString);
        result = startingIndex >= 0 ? word.substring(startingIndex,startingIndex + subString.length()) : "Not found";
        return result;
    }
    
}
