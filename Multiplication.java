/**
 * -------------------------------------------------------------
 * File Name: Multiplication.java
 * Project Name: 1250-Semester-Project
 * -------------------------------------------------------------
 * Creator's name and email: Andrew Parker, parkera4@etsu.edu
 * Course: CSCI 1250-941
 * Date Created: 11/13/2020
 * -------------------------------------------------------------
 */

import javax.swing.JOptionPane; //Import JOptionPane class.
import java.util.ArrayList;  //Import ArrayList class

/**
 * Prompts the user to input 2 or more numbers which are then multiplied together
 * and then display the total amount
 * 
 * * Date Created: 11/13/2020
 * 
 * @author Andrew Parker
 * */

public class Multiplication 
{
    ArrayList<Double> multiplicatives; //creates an ArrayList to store input variables
    Double choice;  //Double to prompt for the numbers stored in multiplicatives
    Double multiply;    // Double used to add the numbers in multiplicatives together

    /**
     * Implements a Multiplication constructor to instantiate the array list.
     * 
     * Date created: 11/13/2020
     */
    public Multiplication()
    {
        multiplicatives = new ArrayList<Double>();  //Instantiates the array list.
    } 

    /**
     * Implements a calculate method to promt and display the added numbers from the user
     * 
     * * Date Created: 11/13/2020
     * 
     * @author Andrew Parker
     */

    public void calculate()
    {
        // Prompts the user to input a number
        double choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 1st number you wish to multiply?"));

        //adds the number to the ArrayList
        multiplicatives.add(choice);
        
        // Prompts the user to input a number
        choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 2nd number you wish to multiply?"));

        //adds the number to the ArrayList
        multiplicatives.add(choice);

        int selectedState = 0;

        Object[] possibleStates = { "Yes", "No"};

        // Prompts the user to input a number or decline inputting 3 or more total numbers with a YES/NO option
        selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                            JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
        
        // if the input is equal to 0 which is displayed as yes, prompt the user to multiply an extra number
        if(selectedState == 0)
        {
            do
            {
                //promts for an extra number to be multiplied
                choice = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to multiply? "));
                //adds number to the ArrayList
                multiplicatives.add(choice);

                // Prompts the user to input a number or decline inputting 3 or more total numbers with a YES/NO option
                selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                            JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
        }
        
        Double multiply = 1.0; //creates a double that causes the numbers to not be 0

        for(int i = 0; i < multiplicatives.size(); i++)
        {
            multiply = multiply * multiplicatives.get(i);
        }
    
        //displays the total of the inputed numbers
        JOptionPane.showMessageDialog(null, "The product of the numbers you have entered is " + multiply);
    }

    /**
     * Returns a string containing all of the components for
     * the equation.
     * 
     * Date created: 11/13/2020
     */
    public String toString()
    {
        //String msg to hold the message, adds header.
        String msg = "***** Multiplication Calculation *****";

        //Adds the choice;
        msg += "\nMultiplicitives: " + choice;

        //Adds each multiplicative.
        for(int i =0; i < multiplicatives.size(); i++)
        {
            msg += " + " + multiplicatives.get(i);
        }

        //Adds the product.
        msg += "\nProduct: " + multiplicatives;

        return msg; //Returns msg.
    }
}
