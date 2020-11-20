import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Subtraction 
{

    double minuend;
    double difference;
       
    ArrayList<Double> subtrahends = new ArrayList<Double>();

    public Subtraction()
    {

    }

    public void calculate()
    {
        String input = JOptionPane.showInputDialog("What do you want to subtract from?");

        minuend = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What value would you like to subtract from the first?");

        double subtrahend = Double.parseDouble(input);
    
        subtrahends.add(subtrahend);

        int selectedState = 0;

        Object[] possibleStates = { "Yes", "No"};

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to subtract another number?", "Subtraction Calculator", +
                        JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
    
        if(selectedState == 0)
        {
            do
            {
                input = JOptionPane.showInputDialog("What is the next number you would like to Subtract? ");

                subtrahend = Double.parseDouble(input);
                
                subtrahends.add(subtrahend);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to Subtract another number?", "Subtraction Calculator", +
                        JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);

            
        } 
        
        difference = minuend;

        for(int i = 0; i < subtrahends.size(); i++)
        {
            minuend = minuend - subtrahends.get(i);
        }

        JOptionPane.showMessageDialog(null, toString());
    }

    public String toString()
    {
        String msg = "***** Subtraction Calculation *****";

        msg += "\nMinuend: " + minuend;

        msg += "\nSubtrahend(s): ";

        for(int i =0; i < subtrahends.size(); i++)
        {
            msg += subtrahends.get(i) + ", ";
        }

        msg += "\nDifference: " + difference;

        return msg;
    }
}