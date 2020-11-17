import javax.swing.*;

public class garanga
{
    public static void main (String[] args) {
        while (true) {
            String s = JOptionPane.showInputDialog("n?");
            if (s == null)
                break;
            int n = Integer.parseInt(s);
            int summa=0;
            int k=1;
            while (k<=n) {
                summa = summa + k;
                k = k + 1;
            }
            JOptionPane.showMessageDialog(null, "Summan blir " + summa);
        }
    }









}
