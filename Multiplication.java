import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Multiplication 
{
    ArrayList<Double> multiplicatives;
    Double choice;
    Double product;
    int selectedState;
    Object[] possibleStates = { "Yes", "No"};;

    public Multiplication()
    {
        multiplicatives = new ArrayList<>();

        selectedState = 0;

        product = 1.0;
    }

    public void calculate()
    {
        choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 1st number you wish to multiply?"));

        multiplicatives.add(choice);
        
        choice = Double.parseDouble(JOptionPane.showInputDialog("What's the 2nd number you wish to multiply?"));

        multiplicatives.add(choice);

        selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                            JOptionPane.INFORMATION_MESSAGE, selectedState, null, possibleStates, possibleStates[0]);
        
        if(selectedState == 0)
        {
            do
            {
                choice = Double.parseDouble(JOptionPane.showInputDialog("What is the next number you would like to multiply?"));
                multiplicatives.add(choice);

                selectedState = JOptionPane.showOptionDialog(null, "Would you like to multiply another number?", "Multiplication Calculator", +
                            JOptionPane.DEFAULT_OPTION, selectedState, null, possibleStates, possibleStates[0]);
            } while(selectedState == 0);
        }

        for(int i = 0; i < multiplicatives.size(); i++)
        {
            product = product * multiplicatives.get(i);
        }
    
        JOptionPane.showMessageDialog(null, "The product of the numbers you have entered is " + product);

        JOptionPane.showMessageDialog(null, toString());
    }

    public String toString()
    {
        String msg = "***** Multiplication Calculation *****";

        msg += "\nMultiplicatives: ";

        for(int i =0; i < multiplicatives.size(); i++)
        {
            msg += multiplicatives.get(i);

            if(multiplicatives.size() > (i + 1))
            {
                msg += " + ";
            }
        }

        msg += "\nSum: " + product;

        return msg;
    }
}
