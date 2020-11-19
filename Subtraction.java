import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Subtraction {
    ArrayList<Double> subtrahends = new ArrayList<Double>();
public Subtraction()
{}
public void calculate(){
    double choice = Double.parsedouble(JOptionPane.showInputDialog("What do you want to subtract from?"));
    subtrahends.add(choice);
    choice = Double.parsedouble(JOptionPane.showInputDialog("What do you want to subtract by?"));
}
}