import java.util.ArrayList;

import javax.swing.JOptionPane;

public class History 
{
    ArrayList<String> history = new ArrayList<>();

    public History()
    {
        String msg = "";

        history.add(msg);
        history.add(msg);
        history.add(msg);
        history.add(msg);
        history.add(msg);
    }

    public void add(String calculation)
    {
        history.add(calculation);
    }

    public void getHistory()
    {
        String msg = "======== Calculator History ========\n";

        for(int i = (history.size() - 5); i < history.size(); i++)
        {
            msg += "\n" + history.get(i).toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
