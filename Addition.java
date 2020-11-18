import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Addition 
{
    public static void main(String[] args)
    {

        ArrayList<Integer> additives = new ArrayList<Integer>();

        int message1;
        int message2;
        String message3;
        int message4;
        int sum;

        message1 = Integer.parseInt(JOptionPane.showInputDialog("What's the 1st variable you wish to add? "));
        
        message2 = Integer.parseInt(JOptionPane.showInputDialog("What's the 2nd variable you wish to add? "));

        message3 = JOptionPane.showInputDialog("Would you like to add another number? ");

        if(message3 == "y")
        {
            message4 = Integer.parseInt(JOptionPane.showInputDialog("What is the next number you would like to add? "));
            additives.add(message4);
            sum = message1 + message2 + message4;
            JOptionPane.showMessageDialog(null, "The sum of the numbers you have chosen is " + sum);
        }
        else
        {
            sum = message1 + message2;
        
            JOptionPane.showMessageDialog(null, "The sum of the numbers you have chosen is " + sum);
        }
     


    }
}
