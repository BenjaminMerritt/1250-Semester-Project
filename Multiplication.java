import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Multiplication 
{
    public static void main(String[] args)
    {

        ArrayList<Integer> multiplicatives = new ArrayList<Integer>();

        int message1;
        int message2;
        String message3;
        int message4;
        int multiplicative;

        message1 = Integer.parseInt(JOptionPane.showInputDialog("What's the 1st variable you wish to multiply? "));
        
        message2 = Integer.parseInt(JOptionPane.showInputDialog("What's the 2nd variable you wish to multiply? "));

        message3 = JOptionPane.showInputDialog("Would you like to multiply another number? y/n ");

        if(message3 == "y")
        {
            message4 = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to add? "));
            multiplicatives.add(message4);
            multiplicative = message1 * message2 * message4;
            JOptionPane.showMessageDialog(null, "The multiplicative of the numbers you have chosen is " + multiplicative);
        }
        else
        {
            multiplicative = message1 * message2;
        
            JOptionPane.showMessageDialog(null, "The multiplicative of the numbers you have chosen is " + multiplicative);
        }
     


    }
}
