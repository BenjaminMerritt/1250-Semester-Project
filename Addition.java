/**
 * -------------------------------------------------------------
 * File Name: Addition.java
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
 * Prompts the user to input 2 or more numbers which are then added together
 * and then display the total amount
 * 
 * * Date Created: 11/13/2020
 * 
 * @author Andrew Parker
 * */

public class Addition 
{
        ArrayList<Double> additives;    //ArrayList to hold the input values
        double choice;  //Double to prompt for the numbers stored in additives
        double sum; // Double used to add the numbers in additives together

        /**
         * implements an ArrayList object to hold variables to added
         * 
         * * Date Created: 11/13/2020
         * 
         * @author Andrew Parker
         */

        public Addition()
        {
            // Creates an ArrayList
            additives = new ArrayList<>();
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
            choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 1st number you wish to add?"));

            //adds the number to the ArrayList

            additives.add(choice);
            
            // Prompts the user to input a number

            choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 2nd number you wish to add?"));

            //adds the number to the ArrayList
    
            additives.add(choice);
    
            int selectedState = 0;

            Object[] possibleStates = { "Yes", "No"};

            // Prompts the user to input a number or decline inputting 3 or more total numbers with a YES/NO option

            selectedState = JOptionPane.showOptionDialog(null, "Would you like to add another number?", "Addition Calculator", +
                             JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
            
            // if the input is equal to 0 which is displayed as yes, prompt the user to add an extra number
            if(selectedState == 0)
            {
                do
                {
                    //promts for an extra number to be added
                    choice = Double.parseDouble(JOptionPane.showInputDialog("What is the next number you would like to add? "));
                    //adds number to the ArrayList
                    additives.add(choice);
    
                    //asks the user if they want to add an additional number with a YES/NO prompt
                    selectedState = JOptionPane.showOptionDialog(null, "Would you like to add another number?", "Addition Calculator", +
                             JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
                } while(selectedState == 0);
            }
           
            sum = 0;

            for(int i = 0; i < additives.size(); i++)
            {
                sum = sum + additives.get(i);
            }
        
            //displays the total of the inputed numbers
            JOptionPane.showMessageDialog(null, "The sum of the numbers you have entered is " + sum);

            //bruh it does something
            JOptionPane.showMessageDialog(null, toString());
        }
        
        public String toString()
        {
            String msg = "***** Addition Calculation *****";

            msg += "\nAddends: ";

            for(int i =0; i < additives.size(); i++)
            {
                msg += additives.get(i);

                if(additives.size() > (i + 1))
                {
                    msg += " + ";
                }
            }

            msg += "\nSum: " + sum;

            return msg;
        }
        
}
