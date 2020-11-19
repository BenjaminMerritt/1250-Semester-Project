import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Addition 
{
    public static void main(String[] args)
    {

        ArrayList<Integer> additives = new ArrayList<Integer>();

        int choice;
        String message3;
        int message4;
        int sum = 0;
        int selectedState = 0;
        Object[] possibleStates = { "Yes", "No"};

        choice = Integer.parseInt(JOptionPane.showInputDialog("What's the 1st number you wish to add?"));

        additives.add(choice);
        
        choice = Integer.parseInt(JOptionPane.showInputDialog("What's the 2nd number you wish to add?"));

        additives.add(choice);

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to add another numeber?", "Addition Calculator", +
                         JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
        
        if(selectedState == 0)
        {
            do
            {
                message4 = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to add? "));
                additives.add(message4);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to add another numeber?", "Addition Calculator", +
                         JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
        }
       
        for(int i = 0; i < additives.size(); i++)
        {
            sum += additives.get(i);
        }
    
        JOptionPane.showMessageDialog(null, "The sum of the numbers you have entered is " + sum);
    }
}
