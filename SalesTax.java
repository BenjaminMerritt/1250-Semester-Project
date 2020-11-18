import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class SalesTax 
{
    double subtotal;
    double taxRate;
    private double taxAmount;
    private double grandTotal;

    DecimalFormat formatter = new DecimalFormat("###,###,##0.00");

    public SalesTax()
    {
        calculate();
    }

    public void setSubtotal(double subtotal) 
    {
        this.subtotal = subtotal;
    }

    public void setTaxRate(double taxRate) 
    {
        this.taxRate = taxRate;
    }

    public double getSubtotal() 
    {
        return subtotal;
    }

    public double getTaxRate() 
    {
        return taxRate;
    }

    public double getTaxAmount() 
    {
        return taxAmount;
    }

    public double getGrandTotal() 
    {
        return grandTotal;
    }

    public void calculate()
    {
        String input = JOptionPane.showInputDialog("***** Sales Tax Calculator *****" +
                            "\n \nEnter the subtotal amount.");

        double inputDouble = Double.parseDouble(input);

        if(inputDouble > 0)
        {
            subtotal = inputDouble;
        }
        else
        {
            do
            {
                input = JOptionPane.showInputDialog("Invalid input, please enter a positive number." +
                            "\n \nEnter the subtotal amount.");

                inputDouble = Double.parseDouble(input);
            } while(inputDouble < 0);

            subtotal = inputDouble;
        }

        input = JOptionPane.showInputDialog("Enter the tax rate (percentage). \n \nEx. 9.75");

        inputDouble = Double.parseDouble(input);

        if(inputDouble > 0)
        {
            taxRate = inputDouble;
        }
        else
        {
            do
            {
                input = JOptionPane.showInputDialog("Invalid input, please enter a positive number." +
                            "\n \nEnter the tax rate (percentage). \n \nEx. 9.75");

                inputDouble = Double.parseDouble(input);
            } while(inputDouble < 0);

            taxRate = inputDouble;
        }

        taxAmount = taxRate * subtotal * 0.01;

        grandTotal = subtotal + taxAmount;

        JOptionPane.showMessageDialog(null, "Here's the breakdown...\n \n" + toString());

        History.add(toString());
    }

    public String toString()
    {
        String msg = "***** Sales Tax Calculation *****";

        msg += "Subtotal: $" + formatter.format(subtotal);
        msg += "\nTax: $" + formatter.format(taxAmount) + "(" + formatter.format(taxRate) + "%)";
        msg += "\n----------------------";
        msg += "\nGrand Total: $" + formatter.format(grandTotal);

        return msg;
    }
}
