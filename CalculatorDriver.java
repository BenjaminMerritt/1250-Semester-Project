/**
 * --------------------------------------------------------------
 * File Name: CalculatorDriver.java
 * Project Name: 1250-Semester-Project
 * --------------------------------------------------------------
 * Creator's name and email: Benjamin Merritt, merrittb@etsu.edu;
 *                           Andrew Parker, parkera4@etsu.edu;
 *                           Garrett Redmon, redmonge@etsu.edu
 * Course: CSCI 1250-941
 * Date Created: 11/13/2020
 * --------------------------------------------------------------
 */

import javax.swing.JOptionPane; //Imports JOptionPane class.

/**
 * Implements a CalculatorDriver class to run a calculator program 
 * that is able to add, subtract, multiply, divide, exponents, and find sales tax.
 * The calculator stores previous calculations in a history class that can display the last 5 
 * calculations. The heart of the calculator is a menu and switch which can direct the user to
 * the correct function.
 * 
 * Date Created: 11/13/2020
 * 
 * @author Benjamin Merritt
 * @author Andrew Parker
 * @author Garrett Redmon
 */
public class CalculatorDriver
{
    static History history; //History object to store each calculation performed.

    /**
     * Implements a main method to run the calculator program. Uses a menu
     * and a switch as the heart to direct the user to the correct 
     * function.
     * 
     * Date created: 11/13/2020
     * 
     * @param args
     */
    public static void main(String[] args) 
    {
        int choice; //Int to hold the choice from the user.

        history = new History();    //Instantiates the history object to store calculations.

        //Will continue to display the menu until the user chooses exit (0).
        do
        {
            choice = displayMenu(); //Choice is equal to the returned value of displayMenu.
            menuSelection(choice);  //Choice is passed into the switch method (aka menuSelection).
        } while(choice != 0);

        System.exit(0); //Stops scanning for user input.
    }   //End main method.

    /**
     * Implements a displayMenu method to display menu options for the calculator to the user.
     * The user is prompted to select an option, and their selection is then returned.
     * 
     * Date created: 11/13/2020
     * 
     * @return
     */
    public static int displayMenu()
    {
        //Displays the menu and prompts for a selection. The input is stored as a String.
        String input = JOptionPane.showInputDialog("***** Main Menu ***** \nWelcome to Calculator, select an option to continue:" +
                    "\n \n 1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Exponents \n6. Find Sales Tax" + 
                    "\n7. View History \n0. Exit");

        int choice = Integer.parseInt(input);   //The input is parsed into an integer, which is stored as choice.

        return choice;  //Choice is then returned.
    }   //End displayMenu method.

    /**
     * Implements a menuSelection method to take in a choice and relay 
     * the choice to the correct function.
     * 
     * Date created: 11/13/2020
     * 
     * @param choice
     */
    public static void menuSelection(int choice)
    {
        //Switch that takes in the parameter and routes it to the cooresponding case.
        switch(choice)
        {
            //Case 1 routes the user to an addition function.
            case 1:
                Addition add = new Addition();  //Creates a new Addition object.
                add.calculate();    //Calls the calculate method.
                history.add(add.toString());    //Adds the toString method to the history.
                break;
            //Case 2 routes the user to a subtraction function.
            case 2:
                Subtraction minus = new Subtraction();  //Creates a new subtraction object.
                minus.calculate();  //Calls the calculate method.
                history.add(minus.toString());  //Adds the toString method to the history.
                break;
            //Case 3 routes the user to a multiplication function.
            case 3:
                Multiplication multi = new Multiplication();    //Creates a new multiplication object.
                multi.calculate();  //Calls the calculate method.
                history.add(multi.toString());  //Adds the toString method to the history.
                break;
            //Case 4 routes the user to a division function.
            case 4:
                Division divide = new Division();   //Creates a new division object.
                divide.calculate(); //Calls the calculate method.
                history.add(divide.toString()); //Adds the toString method to the history.
                break;
            //Case 5 routes the user to an exponential function.
            case 5:
                Exponential exponent = new Exponential();   //Creates a new exponential object.
                exponent.calculate();   //Calls the calculate method.
                history.add(exponent.toString());   //Adds the toString method to the history.
                break;
            //Case 6 routes the user to a sales tax function.
            case 6:
                SalesTax tax = new SalesTax();  //Creates a new sales tax object.
                tax.calculate();    //Calls the calculate method.
                history.add(tax.toString());    //Adds the toString method to the history.
                break;
            //Case 7 routes the user to a history function.
            case 7:
                history.getHistory();   //Calls the getHistory method of the history object.
                break;
            //Case 0 allows the user to exit the program.
            case 0:
                JOptionPane.showMessageDialog(null, "Thank you for using our Calculator!"); //Thanks the user in a message.
                break;
            //Default displays an error message prompting the user to re-enter a correct selection.
            default:
                //Informs the user of an invalid input.
                JOptionPane.showMessageDialog(null, "Invalid menu selection, please enter a valid input.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                break;
        }   //End switch.
    }   //End menuSelection method.
}   //End CalculatorDriver class.