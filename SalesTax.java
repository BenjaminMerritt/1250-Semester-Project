/**
 * -------------------------------------------------------------
 * File Name: SalesTax.java
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
 * Implements a SalesTax class to promt the user for a subtotal and tax rate. The class
 * then will calculate the taxable amount and display the grand total.
 * 
 * Date Created: 11/13/2020
 * 
 * @author Benjamin Merritt
 */
public class SalesTax 
{
    double subtotal;    //Double to hold the subtotal.
    double taxRate; //Double to hold the tax percentage rate.
    private double taxAmount;   //Double to hold the amount of tax.
    private double grandTotal;  //Double to hold the grand total.

    DecimalFormat formatter;    //DecimalFormat object to format decimals to the 2nd place.

    /**
     * Implements a constructor to set the formatter for dollar amounts.
     * 
     * Date created: 11/13/2020
     */
    public SalesTax()
    {
        //Sets the formatter to the 2nd decimal place.
        formatter = new DecimalFormat("###,###,##0.00");
    }   //End SalesTax constructor.

    /**
     * Implements a setSubtotal method to take in a double
     * and pass it to the subtotal variable.
     * 
     * Date created: 11/13/2020
     * 
     * @param subtotal
     */
    public void setSubtotal(double subtotal) 
    {
        this.subtotal = subtotal;   //Sets the subtotal variable to the parameter.
    }   //End setSubtotal method.

    /**
     * Implements a setTaxRate method to take in a double and
     * pass it to the taxRate variable.
     * 
     * Date created: 11/13/2020
     * 
     * @param taxRate
     */
    public void setTaxRate(double taxRate) 
    {
        this.taxRate = taxRate; //Sets the subtotal variable to the parameter.
    }   //End setTaxRate method.

    /**
     * Implements a getSubtotal method to return the subtotal variable.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public double getSubtotal() 
    {
        return subtotal;    //Returns the subtotal variable.
    }   //End getSubtotal method.

    /**
     * Implements a getTaxRate method to return the taxRate variable.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public double getTaxRate() 
    {
        return taxRate; //Returns the taxRate variable.
    }   //End getTaxRate method.

    /**
     * Implements a getTaxAmount method to return the value
     * of the taxAmount variable.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public double getTaxAmount() 
    {
        return taxAmount;   //Returns the taxAmount variable.
    }   //End getTaxAmount method.

    /**
     * Implements a getGrandTotal method to return
     * the value for the grandTotal.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public double getGrandTotal() 
    {
        return grandTotal;  //Returns the grandTotal.
    }   //End getGrandTotal method.

    /**
     * Implements a calculate method to prompt the user for the subtotal and tax rate
     * and displays the grand total in return.
     * 
     * Date Created: 11/13/2020
     */
    public void calculate()
    {
        //Displays a prompt for the subtotal. Sets it to a string which will hold the user's input.
        String input = JOptionPane.showInputDialog("***** Sales Tax Calculator *****" +
                            "\n \nEnter the subtotal amount.");

        double inputDouble = Double.parseDouble(input); //Parses the input into a double which is set as the inputDouble.

        //If the input is greater than 0, then set the subtotal equal to the inputDouble.
        if(inputDouble > 0)
        {
            subtotal = inputDouble;
        }   //End  if.
        //Else, prompt the user for a positive number.
        else
        {
            //Prompt the user as long as their input is not a positive number.
            do
            {
                //Prompts the user for a positive subtotal.
                input = JOptionPane.showInputDialog("Invalid input, please enter a positive number." +
                            "\n \nEnter the subtotal amount.");

                inputDouble = Double.parseDouble(input);    //Parses the input into a double.
            } while(inputDouble < 0);

            subtotal = inputDouble; //Set the subtotal equal to the inputDouble once the double is positive.
        }   //End else.

        //Prompts the user for a tax percentage rate.
        input = JOptionPane.showInputDialog("Enter the tax rate (percentage). \n \nEx. 9.75");

        inputDouble = Double.parseDouble(input);    //Parses the input and sets it to the inputDouble.

        //If the input double is positive, then set it to the taxRate field.
        if(inputDouble > 0)
        {
            taxRate = inputDouble;  //Sets taxRate equal to the inputDouble.
        }   //End if.
        //Else, prompt the user for a positive tax rate.
        else
        {
            //Continue to prompt the user while the number they enter is negative.
            do
            {
                //Prompts the user for another tax rate.
                input = JOptionPane.showInputDialog("Invalid input, please enter a positive number." +
                            "\n \nEnter the tax rate (percentage). \n \nEx. 9.75");

                inputDouble = Double.parseDouble(input);    //Parses input as a double and sets it to the inputDouble.
            } while(inputDouble < 0);

            taxRate = inputDouble;  //If the inputDouble is positive then it will be set to the taxRate.
        }   //End else.

        //Finds the taxAmount by multiplying the taxRate and subtotal by one-onethousandth. Sets the product to the taxAmount.
        taxAmount = taxRate * subtotal * 0.01;  

        //grandTotal is equal to the subtotal plus the taxAmount.
        grandTotal = subtotal + taxAmount;

        //Displays the toString method showing the breakdown.
        JOptionPane.showMessageDialog(null, "Here's the breakdown...\n \n" + toString());
    }   //End calculate method.

    /**
     * Implements a toString method to return a string containing the
     * breakdown of the purchase. Includes the entered subtotal, the tax percentage
     * rate, and the grand total. Uses the formatter to ensure returned values are formatted
     * for US currency (2 decimal places).
     * 
     * Date created: 11/13/2020
     */
    public String toString()
    {
        //New string msg holds the type of calculation.
        String msg = "***** Sales Tax Calculation *****";

        msg += "\nSubtotal: $" + formatter.format(subtotal);    //Added to msg is the subtotal in the correct formatting.
        msg += "\nTax: $" + formatter.format(taxAmount) + " (" + formatter.format(taxRate) + "%)";  //The tax rate is added to msg with the correct formatting.
        msg += "\nGrand Total: $" + formatter.format(grandTotal);   //The grand total is added to msg with the correct formatting.

        return msg; //String msg is then returned.
    }   //End toString method.
}   //End SalesTax method.
