/**
 * -------------------------------------------------------------
 * File Name: Division.java
 * Project Name: 1250-Semester-Project
 * -------------------------------------------------------------
 * Creator's name and email: Garrett Redmon, redmonge@etsu.edu
 * Course: CSCI 1250-941
 * Date Created: 11/13/2020
 * -------------------------------------------------------------
 */

 import javax.swing.JOptionPane;    //Imports the JOptionPane class.

import java.util.ArrayList; //Imports the ArrayList class.

/**
 * Implements a Division class to take in numbers and 
 * divide them. Returns a output of the answers to the user.
 * 
 * Date created: 11/13/2020
 * 
 * @author Garrett Redmon
 */
public class Division
{
    ArrayList<Double> divisors; //ArrayList to hold the divisors.
    double dividend;    //Double to hold the dividend.
    double quotient;    //Double to hold the quotient.

    /**
     * Implements a Division constructor to instantiate the ArrayList.
     * 
     * Date created: 11/13/2020
     */
    public Division()
    {
        divisors = new ArrayList<>();   //Instantiates an ArrayList to hold the divisors.
    }   //End Division method.

    /**
     * Implements a calculate method to promt the user for numbers,
     * add them to an arrayList, and calculate the answer. Returns the calculation
     * to the user as a message.
     * 
     * Date created: 11/13/2020
     */
    public void calculate()
    {
        //String input is set to the prompt for a dividend.
        String input = JOptionPane.showInputDialog("What do you want to divide?");

        //Dividend is set to the parsed input.
        dividend = Double.parseDouble(input);

        //Input is set to the prompt for a divisor.
        input = JOptionPane.showInputDialog("What is the number you would like to divide by?");

        //Double divisor is set to the parsed input.
        double divisor = Double.parseDouble(input);
    
        //Adds the divisor to the divsors array list.
        divisors.add(divisor);

        //Integer selected state is instantiated.
        int selectedState = 0;

        //Object to hold the possible choices for the Option Dialog box.
        Object[] possibleStates = { "Yes", "No"};

        //Selected state is set equal to the user's selection of dividing by an additional number.
        selectedState = JOptionPane.showOptionDialog(null, "Would you like to divide by another number?", "Division Calculator", +
                        JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
    
        //If the selectedState equals 0 (user chose 'yes').
        if(selectedState == 0)
        {
            //Then prompt for another divisor over and over until they select 'No'.
            do
            {
                //Prompts for an input of a divisor.
                input = JOptionPane.showInputDialog("What is the next number you would like to divide by? ");

                //Sets the divisor equal to the parsed input.
                divisor = Double.parseDouble(input);
                
                //Adds the divisor to the divisors ArrayList.
                divisors.add(divisor);

                //Asks the user if they wish to divide by another number.
                selectedState = JOptionPane.showOptionDialog(null, "Would you like to divide by another number?", "Division Calculator", +
                        JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
        }   //End if.
        
        quotient = dividend;    //Sets the quotient equal to the dividend.

        //Loops for each divisor in the ArrayList and divides the quotient by the divisor.
        for(int i = 0; i < divisors.size(); i++)
        {
            quotient = quotient / divisors.get(i);
        }   //End for loop.

        JOptionPane.showMessageDialog(null, toString());    //Calls the toString method and displays it inside a message dialog box.
    }   //End calculate method.

    /**
     * Implements a toString method to return a string containing the 
     * information for the previous calculation.
     * 
     * Date created: 11/13/2020
     */
    public String toString()
    {
        //Instantiates a string msg to hold the string, adds a header to the string.
        String msg = "***** Division Calculation *****";

        //Adds the dividend to msg.
        msg += "\nDividend: " + dividend;

        //Adds the divisor(s) caption to the msg.
        msg += "\nDivisor(s): ";

        //For each divisor in the divisors array list, add it to msg.
        for(int i =0; i < divisors.size(); i++)
        {
            msg += divisors.get(i) + ", ";  //Formats each divisor to have a comma and space between themselves.
        }   //End for loop.

        //Adds the quotient to msg.
        msg += "\nQuotient: " + quotient;

        return msg; //Returns the string msg.
    }   //End toString method.
}   //End Division class.

