/**
 * --------------------------------------------------------------
 * File Name: History.java
 * Project Name: 1250-Semester-Project
 * --------------------------------------------------------------
 * Creator's name and email: Benjamin Merritt, merrittb@etsu.edu;
 *                           Andrew Parker, parkera4@etsu.edu;
 *                           Garrett Redmon, redmonge@etsu.edu
 * Course: CSCI 1250-941
 * Date Created: 11/13/2020
 * --------------------------------------------------------------
 */

import java.util.ArrayList; //Imports ArrayList class.

import javax.swing.JOptionPane; //Imports JOptionPane class.

/**
 * Implements a History class to take in, store, and return 
 * string objects that contain previous calculations. 
 * The class will return a message with up to the past 5 
 * calculations.
 * 
 * Date created: 11/13/2020
 * 
 * @author Benjamin Merritt
 * @author Andrew Parker
 * @author Garrett Redmon
 */
public class History 
{
    //Instantiates a new ArrayList to store strings.
    ArrayList<String> history = new ArrayList<>();

    /**
     * Implements a History constructor to create a string which
     * will eventually contain previous calculations.
     * 
     * Date created: 11/13/2020
     */
    public History()
    {
        String msg = "";    //New string msg to hold the calculations.
    }   //End History constructor.

    /**
     * Implements an add method to take in a string and add it
     * to the ArrayList.
     * 
     * Date created: 11/13/2020
     * 
     * @param calculation
     */
    public void add(String calculation)
    {
        history.add(calculation);   //Adds the string to the ArrayList.
    }   //End add method.

    /**
     * Implements a getHistory method to display the 5 most-recent 
     * calculations made on the calculator.
     * 
     * Date created: 11/13/2020
     */
    public void getHistory()
    {
        //Instantiates a string to hold the history, adds a title to the msg.
        String msg = "======== Calculator History ========\n";

        //If the size of the ArrayList is larger than 5.
        if(history.size() > 5)
        {
            //Then for the 'highest' 5 calculations in the list, add them to the msg.
            for(int i = history.size(); i < (history.size() + 5); i++)
            {
                msg += "\n" + history.get(i - 5).toString() + "\n"; //Adds the top 5 to the string.
            }
        }   //End if.
        //Else, add each calculation to the string.
        else
        {
            for(String calculations : history)
            {
                msg += "\n" + calculations.toString() + "\n";   //Formats and adds each calculation.
            }
        }   //End else.

        JOptionPane.showMessageDialog(null, msg);   //Displays the string msg to the user.
    }   //End getHistory method.
}   //End History class.
