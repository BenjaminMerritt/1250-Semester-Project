import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Exponential 
{
    int base;
    int power;
    int answer;

    public Exponential()
    {
        calculate();
    }

    public void calculate()
    {
        String input = JOptionPane.showInputDialog("***** Exponents Calculator *****" +
                        "\n \nEnter the base number of the equation.");

        int inputInt = Integer.parseInt(input);

        
    }
}
