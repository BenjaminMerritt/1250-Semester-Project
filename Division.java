import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Division{
    
    ArrayList<Double> divisors = new ArrayList<Double>();
    double dividend;
    double quotient;


    public Division()
    {
        
    } 

    public void calculate()
    {

        String input = JOptionPane.showInputDialog("What do you want to subtract from?");

        dividend = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What value would you like to subtract from the first?");

        double divisor = Double.parseDouble(input);
    
        divisors.add(divisor);

        int selectedState = 0;

        Object[] possibleStates = { "Yes", "No"};

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to subtract another number?", "Subtraction Calculator", +
                        JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
    
        if(selectedState == 0)
        {
            do
            {
                input = JOptionPane.showInputDialog("What is the next number you would like to Subtract? ");

                divisor = Double.parseDouble(input);
                
                divisors.add(divisor);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to Subtract another number?", "Subtraction Calculator", +
                        JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);

            
        } 
        
        quotient = dividend;

        for(int i = 0; i < divisors.size(); i++)
        {
            quotient = quotient / divisors.get(i);
        }

        JOptionPane.showMessageDialog(null, toString());

        divisors.clear();
    }
    public String toString()
    {
        String msg = "***** Division Calculation *****";

        msg += "\nDividend: " + dividend;

        msg += "\nDivisor(s): ";

        for(int i = 0; i < divisors.size(); i++)
        {
            msg += divisors.get(i) + " ";
        }

        msg += "\nQuotient: " + quotient;

        return msg;
    }
}
