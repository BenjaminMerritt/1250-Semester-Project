import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Multiplication 
{
        ArrayList<Integer> multiplicatives = new ArrayList<Integer>();

        public Multiplication()
        {
            
        } 

        public void calculate()
        {
            int choice = Integer.parseInt(JOptionPane.showInputDialog("What's the 1st number you wish to multiply?"));

            multiplicatives.add(choice);
            
            choice = Integer.parseInt(JOptionPane.showInputDialog("What's the 2nd number you wish to multiply?"));
    
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
           
            int multiply = 0;

            for(int i = 0; i < multiplicatives.size(); i++)
            {
                multiply += multiplicatives.get(i);
            }
        
            JOptionPane.showMessageDialog(null, "The product of the numbers you have entered is " + multiply);
        }
}
