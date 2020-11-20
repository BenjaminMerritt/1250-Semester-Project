import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Subtraction {
       
        ArrayList<Double> subtrahends = new ArrayList<Double>();

        public Subtraction(){   

        }

        public void calculate()

        {       
    
        String input = JOptionPane.showInputDialog("What do you want to subtract from?");
    
        input = Double.parseDouble(JOptionPane.showInputDialog("What do you want to subtract by?"));
    
        subtrahends.add(input);

        int selectedState = 0;

        Object[] possibleStates = { "Yes", "No"};

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to subtract another number?", "Subtraction Calculator", +
                     JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
    
        if(selectedState == 0){
            do{
                input = Double.parseDouble(JOptionPane.showInputDialog("What is the next number you would like to Subtract? "));
                
                subtrahends.add(input);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to Subtract another number?", "Subtraction Calculator", +
                        JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
            }

            int difference = 0;

            for(int i = 0; i < )

        } 
}