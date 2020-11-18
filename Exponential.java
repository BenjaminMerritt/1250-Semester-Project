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

        
    }
}
