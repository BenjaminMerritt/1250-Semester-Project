import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class SalesTax 
{
    double subtotal;
    double taxRate;
    private double taxAmount;
    private double grandTotal;

    public SalesTax(double subtotal, double taxRate)
    {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");

        this.subtotal = subtotal;
        this.taxRate = Double.parseDouble(formatter.format(taxRate));
        taxAmount = subtotal * taxRate * 0.001;
        grandTotal =subtotal + taxAmount;
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

    public String toString()
    {
        String msg = "";

        msg += "Subtotal: $" + subtotal;
        msg += "\nTax: $" + taxAmount + "(" + taxRate + "%)";
        msg += "\n----------------------";
        msg += "\nGrand Total: $" + grandTotal;

        return msg;
    }
}
