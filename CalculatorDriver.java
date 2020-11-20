import javax.swing.JOptionPane;


public class CalculatorDriver
{
    static Addition add = new Addition();
    static Subtraction minus = new Subtraction();
    static Multiplication multi = new Multiplication();
    static Division divide = new Division();
    static SalesTax tax = new SalesTax();
    static Exponential exponent = new Exponential();
    static History history = new History();

    public static void main(String[] args) 
    {
        int choice; //Int to hold the choice from the user.

        do
        {
            choice = displayMenu();
            menuSelection(choice);
        } while(choice != 0);

        System.exit(0); //Stops scanning for user input.
    }   //End main method.

    public static int displayMenu()
    {
        String input = JOptionPane.showInputDialog("***** Main Menu ***** \nWelcome to Calculator, select an option to continue:" +
                    "\n \n 1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Exponents \n6. Find Sales Tax" + 
                    "\n7. View History \n0. Exit");

        int choice = Integer.parseInt(input);

        return choice;
    }

    public static void menuSelection(int choice)
    {
        switch(choice)
        {
            case 1:
                add.calculate();
                break;
            case 2:
                minus.calculate();
                history.add(minus.toString());
                break;
            case 3:
                multi.calculate();
                break;
            case 4:
                divide.calculate();
                break;
            case 5:
                exponent.calculate();
                history.add(exponent.toString());
                break;
            case 6:
                tax.calculate();
                history.add(tax.toString());
                break;
            case 7:

                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Thank you for using our Calculator!");
            default:
                JOptionPane.showMessageDialog(null, "Invalid menu selection, please enter a valid input.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}