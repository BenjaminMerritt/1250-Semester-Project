import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Exponential 
{
    int base;
    int power;
    private int answer;
    
    DecimalFormat formatter = new DecimalFormat("##,###,##0.0#######");

    public Exponential()
    {
        calculate();
    }

    public void setBase(int base) 
    {
        this.base = base;
    }

    public void setPower(int power) 
    {
        this.power = power;
    }

    public int getBase() 
    {
        return base;
    }

    public int getPower() 
    {
        return power;
    }

    public int getAnswer() 
    {
        return answer;
    }

    public void calculate()
    {
        String input = JOptionPane.showInputDialog("***** Exponents Calculator *****" +
                        "\n \nEnter the base number of the equation.");

        base = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the power (index) for the equation.");

        power = Integer.parseInt(input);

        if(power < 0)
        {
            int denominator = base;

            for(int i = power; i > 0; i--)
            {
                denominator = denominator * base;
            }

            answer = 1 / denominator;
        }
        if(power == 0)
        {
            answer = 1;
        }
        else
        {
            answer = base;

            for(int i = power; i > 0; i--)
            {
                answer = answer * base;
            }
        }

        JOptionPane.showMessageDialog(null, toString());
    }

    public String toString()
    {
        String msg = "***** Exponential Calculation *****";

        msg += "\n \nBase: " + base;
        msg += "\nPower: " + power;
        msg += "\n----------------------";
        msg += "Answer: " + answer;

        return msg;
    }
}
