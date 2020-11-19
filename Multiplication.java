import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Multiplication 
{
        ArrayList<Double> multiplicatives = new ArrayList<Double>();

        public Multiplication()
        {
            
        } 

        public void calculate()
        {
            double choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 1st number you wish to multiply?"));

            multiplicatives.add(choice);
            
            choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 2nd number you wish to multiply?"));
    
            multiplicatives.add(choice);
    
            Double selectedState = 0.0;

            Object[] possibleStates = { "Yes", "No"};

            selectedState = Double.parseDouble(JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                             JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]));
            
            if(selectedState == 0)
            {
                do
                {
                    choice = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to multiply? "));
                    multiplicatives.add(choice);
    
                    selectedState = Double.parseDouble(JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                             JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]));
                } while(selectedState == 0);
            }
           
            Double multiply = 1.0;

            for(int i = 0; i < multiplicatives.size(); i++)
            {
                multiply = multiply * multiplicatives.get(i);
            }
        
            JOptionPane.showMessageDialog(null, "The product of the numbers you have entered is " + multiply);

            multiply = 1.0;
        }
}
