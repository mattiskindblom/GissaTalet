import javax.swing.*;

public class Gissatalet {
    public static void main(String[] args) {

        int n = (int) (Math.random()*100)+1;

        String k = JOptionPane.showInputDialog(null,"Gissa ett tal mellan 1 och 100");



        if (k > 100) JOptionPane.showMessageDialog(null, "talet var för högt");

        if (k < n) {
            JOptionPane.showMessageDialog(null, "talet du gissade var för lågt");
        } else {if (n < k) JOptionPane.showMessageDialog(null, "talet du gissade var för högt")}

        if (n == k) {
            JOptionPane.showMessageDialog(null, "talet du gissade var rätt");
        } else {JOptionPane.showInputDialog(null, "Gissa igen");}



    }
}
