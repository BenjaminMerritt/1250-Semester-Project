import javax.swing.JOptionPane;


public class CalculatorDriver
{
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
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid menu selection, please enter a valid input.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}