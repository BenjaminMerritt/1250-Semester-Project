/**
 * -------------------------------------------------------------
 * File Name: Exponential.java
 * Project Name: 1250-Semester-Project
 * -------------------------------------------------------------
 * Creator's name and email: Benjamin Merritt, merrittb@etsu.edu
 * Course: CSCI 1250-941
 * Date Created: 11/13/2020
 * -------------------------------------------------------------
 */

import javax.swing.JOptionPane; //Import JOptionPane class.

import java.text.DecimalFormat; //Import DecimalFormat class.

/**
 * Implements a Exponential class to prompt the user for a base and
 * an exponent. Then the class will store those values, and calculate the answer.
 * The base, power, and the answer are all displayed. The class can return a string 
 * containing all of the information relating to the calculation.
 * 
 * Date Created: 11/13/2020
 * 
 * @author Benjamin Merritt
 */
public class Exponential 
{
    int base;   //Integer to store the base of the equation.
    int power;  //Integer to store the power used in the equation.
    private int answer; //Integer to hold the answer of the equation.
    
    DecimalFormat formatter;    //DecimalFormat object to format the number of decimal places for a number.

    /**
     * Implements a constructor to set the decimal format to the correct format.
     * 
     * Date created: 11/13/2020
     */
    public Exponential()
    {
        formatter = new DecimalFormat("##,###,##0.0#######");
    }   //End Exponential constructor.

    /**
     * Implements a setBase method to pass an int to the base
     * variable.
     * 
     * Date Created: 11/13/2020
     * 
     * @param base
     */
    public void setBase(int base) 
    {
        this.base = base;   //Sets the parameter to the variable.
    }   //End setBase method.

    /**
     * Implements a setPower method to take in an integer and
     * set it equal to the power variable.
     * 
     * Date created: 11/13/2020
     * 
     * @param power
     */
    public void setPower(int power) 
    {
        this.power = power; //Sets the variable equal to the parameter.
    }   //End setPower method.

    /**
     * Implements a getBase method to return the base
     * variable.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public int getBase() 
    {
        return base;    //Returns the base.
    }   //End getBase method.

    /**
     * Implements a getPower method to return
     * the power variable.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public int getPower() 
    {
        return power;   //Returns the power.
    }   //End getPower method.

    /**
     * Implements a getAnswer method to display the 
     * answer variable.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public int getAnswer() 
    {
        return answer;  //Returns the answer.
    }   //End getAnswer method.

    /**
     * Implements a calculate method to take the base and power
     * for the equation and find the answer. It starts by asking for the base and then
     * the power. It parses the string inputs into an integer. Determines if they are positive, negative, or 
     * equal to 0 and calculates accordingly. Displays the final result using the toString method.
     * 
     * Date created: 11/13/2020 
     */
    public void calculate()
    {
        //Prompts the user for a base.
        String input = JOptionPane.showInputDialog("***** Exponents Calculator *****" +
                        "\n \nEnter the base number of the equation.");

        base = Integer.parseInt(input); //Parses the base into an int.

        //Prompts the user for a power.
        input = JOptionPane.showInputDialog("Enter the power (index) for the equation.");

        power = Integer.parseInt(input);    //Parses the power into an int.

        //If the power is less than 0.
        if(power < 0)
        {
            int denominator = base; //Sets an int equal to the base.

            //Loops through and multiplies the denominator by the base as many times as the power specifies.
            for(int i = power; i > 1; i--)
            {
                denominator = denominator * base;
            }   //End for loop.

            answer = 1 / denominator;   //Sets the answer equal to 1 over the denominator.
        }   //End if.
        //If the power equals 0.
        if(power == 0)
        {
            answer = 1; //Easy, the answer will be 1 if the power is equal to 0.
        }   //End if.
        //Else it is positive.
        else
        {
            answer = base;  //Sets the answer equal to the base.

            //Multiplies the base times the answer for each time the power specifies.
            for(int i = power; i > 1; i--)
            {
                answer = answer * base;
            }   //End for loop.
        }   //End else.

        //Displays the toString method which contains all the information about the calculation.
        JOptionPane.showMessageDialog(null, toString());
    }   //End calculate method.

    /**
     * Implements a toString method to display the information about the 
     * calculation.
     * 
     * Date created: 11/13/2020
     */
    public String toString()
    {
        String msg = "***** Exponential Calculation *****"; //New string msg holds the type of calculation.

        msg += "\nBase: " + base;   //Adds the base to msg.
        msg += "\nPower: " + power; //Adds the power to msg.
        msg += "\nAnswer: " + answer;   //Adds the answer to msg.

        return msg; //Returns the string msg.
    }   //End toString method.
}   //End Exponential class.
