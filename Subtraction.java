/**
 * -------------------------------------------------------------
 * File Name: Subtraction.java
 * Project Name: 1250-Semester-Project
 * -------------------------------------------------------------
 * Creator's name and email: Garrett Redmon, redmonge@etsu.edu
 * Course: CSCI 1250-941
 * Date Created: 11/13/2020
 * -------------------------------------------------------------
 */

import javax.swing.JOptionPane; //Imports JOptionPane class.

import java.util.ArrayList; //Imports ArrayList class.

/**
 * Implements a Subtraction class to prompt the user for numbers
 * and then calculate the answer.
 * 
 * Date created: 11/13/2020
 * 
 * @author Garrett Redmon
 */
public class Subtraction 
{
    double minuend; //Double to hold the minuend.
    double difference;  //Double to hold the difference.
    double subtrahend;  //Double to hold the subtrahend.
       
    ArrayList<Double> subtrahends;  //ArrayList to hold the subtrahends entered by the user.

    /**
     * Implements a Subtraction constructor to instantiate the ArrayList.
     * 
     * Date created: 11/13/2020
     */
    public Subtraction()
    {
        //Instantiates the ArrayList that holds the subtrahends.
        subtrahends = new ArrayList<>();
    }   //End Subtraction constructor.

    /**
     * Implements a calculate method to prompt the user for numbers and 
     * calculate the difference.
     * 
     * Date created: 11/13/2020
     */
    public void calculate()
    {
        //String to hold the input, set equal to the prompt for a minuend.
        String input = JOptionPane.showInputDialog("What do you want to subtract from?");

        //Sets the minuend field to the parsed input.
        minuend = Double.parseDouble(input);

        //Input is set equal to the prompt for a subtrahend.
        input = JOptionPane.showInputDialog("What value would you like to subtract from the first?");

        //Sets the subtrahend field equal to the parsed input.
        subtrahend = Double.parseDouble(input);
    
        //Adds the subtrahend to the subtrahends ArrayList.
        subtrahends.add(subtrahend);

        int selectedState = 0;  //Int to hold the selection from the user.

        Object[] possibleStates = { "Yes", "No"};   //The possible selections from the user.

        //Sets the selected state equal to the selection by the user. The user is asked if they would like to subtract another number.
        selectedState = JOptionPane.showOptionDialog(null, "Would you like to subtract another number?", "Subtraction Calculator", +
                        JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
    
        //If the selected state is 0.
        if(selectedState == 0)
        {
            //Then continue prompting for more subtrahends until the user selected state changes.
            do
            {
                //Asks for the next subtrahend and sets it to input.
                input = JOptionPane.showInputDialog("What is the next number you would like to Subtract? ");

                //Sets the subtrahend field equal to the parsed input.
                subtrahend = Double.parseDouble(input);
                
                //Adds the subtrahend to the subtrahends ArrayList.
                subtrahends.add(subtrahend);

                //Sets the selected state equal to the selection by the user. The user is asked if they would like to subtract another number.
                selectedState = JOptionPane.showOptionDialog(null, "Would you like to Subtract another number?", "Subtraction Calculator", +
                        JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
        }   //End if.
        
        //Difference field is set to the value of the minuend.
        difference = minuend;

        //For each subtrahend, subtract the value of the subtrahend from the difference.
        for(int i = 0; i < subtrahends.size(); i++)
        {
            difference = difference - subtrahends.get(i);
        }   //End for loop.

        JOptionPane.showMessageDialog(null, toString());    //Displays the toString method.
    }   //End calculate method.

    /**
     * Implements a toString method to return a string
     * containing all of the numbers involved with the calculation.
     * 
     * Date created: 11/13/2020
     */
    public String toString()
    {
        //Instantiates a string msg to hold the message. Adds a header to the string.
        String msg = "***** Subtraction Calculation *****";

        msg += "\nMinuend: " + minuend; //Adds the minuend to msg.

        msg += "\nSubtrahend(s): "; //Adds the subtrahend(s) caption to the msg.

        //For each subtrahend, add it to the msg.
        for(int i =0; i < subtrahends.size(); i++)
        {
            msg += subtrahends.get(i) + ", ";   //Formats the subtrahends with a comma and a space between each one.
        }   //End for loop.

        //Adds the difference to msg.
        msg += "\nDifference: " + difference;

        return msg; //Returns the string msg.
    }   //End toString method.
}   //End Subtraction class.