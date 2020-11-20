import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Division{
    
    ArrayList<Double> divisors = new ArrayList<Double>();

    public Division()
    {
        
    } 

    public void calculate()
    {
        double choice = Double.parseDouble(JOptionPane.showInputDialog("What is the number you would like to divide?"));

        divisors.add(choice);
        
        choice = Double.parseDouble(JOptionPane.showInputDialog("What is the number you would like to divide by?"));

        divisors.add(choice);

        int selectedState = 0;

        Object[] possibleStates = { "Yes", "No"};

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to divide by another number?", "Division Calculator", +
                         JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
        
        if(selectedState == 0)
        {
            do
            {
                choice = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to divide by? "));
                
                divisors.add(choice);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to divide by another number?", "Division Calculator", +
                         JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            
                        } while(selectedState == 0);
        }


        
    }
}
