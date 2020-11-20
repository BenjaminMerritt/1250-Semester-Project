import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Multiplication 
{
        ArrayList<Double> multiplicatives = new ArrayList<Double>();
        Double choice;
        Double multiply;

        public Multiplication()
        {
            
        } 

        public void calculate()
        {
            double choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 1st number you wish to multiply?"));

            multiplicatives.add(choice);
            
            choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 2nd number you wish to multiply?"));
    
            multiplicatives.add(choice);
    
            int selectedState = 0;

            Object[] possibleStates = { "Yes", "No"};

            selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                             JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
            
            if(selectedState == 0)
            {
                do
                {
                    choice = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to multiply? "));
                    multiplicatives.add(choice);
    
                    selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                             JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
                } while(selectedState == 0);
            }
           
            Double multiply = 1.0;

            for(int i = 0; i < multiplicatives.size(); i++)
            {
                multiply = multiply * multiplicatives.get(i);
            }
        
            JOptionPane.showMessageDialog(null, "The product of the numbers you have entered is " + multiply);

            multiply = 1.0;

            multiplicatives.clear();
        }
        public String toString()
    {
        String msg = "***** Multiplication Calculation *****";

        msg += "\nMultiplicitives: " + choice;

        for(int i =0; i < multiplicatives.size(); i++)
        {
            msg += " + " + multiplicatives.get(i);
        }

        msg += "\nProduct: " + multiplicatives;

        return msg;
    }
}
