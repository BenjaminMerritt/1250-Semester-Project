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

import javax.swing.JOptionPane;
import java.util.ArrayList;

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
    ArrayList<Double> multiplicatives = new ArrayList<Double>(); //creates an ArrayList to store input variables
    Double choice;  //Double to prompt for the numbers stored in multiplicatives
    Double multiply;    // Double used to add the numbers in multiplicatives together

    /**
     * implements an ArrayList object to hold variables to added
    * 
    * * Date Created: 11/13/2020
    * 
    * @author Andrew Parker
    */

    public Multiplication()
    {
        
    } 

    public void calculate()
    {
        double choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 1st number you wish to multiply?"));

        multiplicatives.add(choice);
        
        choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 2nd number you wish to multiply?"));

        multiplicatives.add(choice);

        int selectedState = 0;

        Object[] possibleStates = { "Yes", "No"};

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                            JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
        
        if(selectedState == 0)
        {
            do
            {
                choice = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to multiply? "));
                multiplicatives.add(choice);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                            JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
        }
        
        Double multiply = 1.0;

        for(int i = 0; i < multiplicatives.size(); i++)
        {
            multiply = multiply * multiplicatives.get(i);
        }
    
        JOptionPane.showMessageDialog(null, "The product of the numbers you have entered is " + multiply);

        multiply = 1.0;

        multiplicatives.clear();
    }
    public String toString()
    {
        String msg = "***** Multiplication Calculation *****";

        msg += "\nMultiplicitives: " + choice;

        for(int i =0; i < multiplicatives.size(); i++)
        {
            msg += " + " + multiplicatives.get(i);
        }

        msg += "\nProduct: " + multiplicatives;

        return msg;
    }
}
