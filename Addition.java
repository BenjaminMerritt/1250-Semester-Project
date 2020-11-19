import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Addition 
{
        ArrayList<Double> additives = new ArrayList<Double>();

        public Addition()
        {
            
        } 

        public void calculate()
        {
            Double choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 1st number you wish to add?"));

            additives.add(choice);
            
            choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 2nd number you wish to add?"));
    
            additives.add(choice);
    
            int selectedState = 0;

            Object[] possibleStates = { "Yes", "No"};

            selectedState = JOptionPane.showOptionDialog(null, "Would you like to add another number?", "Addition Calculator", +
                             JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
            
            if(selectedState == 0)
            {
                do
                {
                    choice = Double.parseDouble(JOptionPane.showInputDialog("What is the next number you would like to add? "));
                    additives.add(choice);
    
                    selectedState = JOptionPane.showOptionDialog(null, "Would you like to add another number?", "Addition Calculator", +
                             JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
                } while(selectedState == 0);
            }
           
            int sum = 0;

            for(int i = 0; i < additives.size(); i++)
            {
                sum += additives.get(i);
            }
        
            JOptionPane.showMessageDialog(null, "The sum of the numbers you have entered is " + sum);
        }
}
