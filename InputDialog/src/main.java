
//javax.swing.JOptionPane permette la creazione di finestre di dialogo che restituiscono una stringa

import javax.swing.JOptionPane;

public class main {
    public static void main (String [] args) {
        Purse ogg = new Purse();
        String insert = JOptionPane.showInputDialog("how many nickels do you have?");
        double countN = Double.parseDouble(insert);
        ogg.addNickels(countN);

        insert = JOptionPane.showInputDialog("how many dimes do you have?");
        double countD = Double.parseDouble(insert);
        ogg.addNickels(countD);

        insert = JOptionPane.showInputDialog("how many quarters do you have?");
        double countQ = Double.parseDouble(insert);
        ogg.addNickels(countQ);

        JOptionPane.showMessageDialog(null, "The total of Purse is:  " + ogg.getTotal());

    }
}
