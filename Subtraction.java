import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Subtraction {
    
        ArrayList<Double> subtrahends = new ArrayList<Double>();

        public Subtraction(){   

        }

        public void calculate()

        {       
    
        Double choice = Double.parseDouble(JOptionPane.showInputDialog("What do you want to subtract from?"));
    
        subtrahends.add(choice);
    
        choice = Double.parseDouble(JOptionPane.showInputDialog("What do you want to subtract by?"));
    
        subtrahends.add(choice);

        int selectedState = 0;

        Object[] possibleStates = { "Yes", "No"};

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to subtract another number?", "Subtraction Calculator", +
                     JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
    
        if(selectedState == 0){
            do{
                choice = Double.parseDouble(JOptionPane.showInputDialog("What is the next number you would like to Subtract? "));
                
                subtrahends.add(choice);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to Subtract another number?", "Subtraction Calculator", +
                        JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
            }
   
            int difference = 0;

            for(int i = 0; i < subtrahends.size(); i++){
                
                difference += difference - subtrahends.get(i);
            }

            JOptionPane.showMessageDialog(null, "The difference of the numbers you have entered is " + difference);
        } 
}