import javax.swing.*;

public class WhileSatsen {

public static void main (String[] args) {
    String s = JOptionPane.showInputDialog("n?");
    int n = Integer.parseInt(s);
    int summa=0;
    int k=1;
    while (k <= n) {
        summa = summa +k;
        k = k + 1;
    }
    JOptionPane.showMessageDialog(null, "Summan blir " + summa);

 }
}