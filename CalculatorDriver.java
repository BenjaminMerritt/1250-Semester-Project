import javax.swing.JOptionPane;


public class CalculatorDriver
{
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
                Addition add = new Addition();
                add.calculate();
                history.add(add.toString());
                break;
            case 2:
                Subtraction minus = new Subtraction();
                minus.calculate();
                history.add(minus.toString());
                break;
            case 3:
                Multiplication multi = new Multiplication();
                multi.calculate();
                history.add(multi.toString());
                break;
            case 4:
                Division divide = new Division();
                divide.calculate();
                history.add(divide.toString());
                break;
            case 5:
                Exponential exponent = new Exponential();
                exponent.calculate();
                history.add(exponent.toString());
                break;
            case 6:
                SalesTax tax = new SalesTax();
                tax.calculate();
                history.add(tax.toString());
                break;
            case 7:
                history.getHistory();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Thank you for using our Calculator!");
            default:
                JOptionPane.showMessageDialog(null, "Invalid menu selection, please enter a valid input.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}