import javax.swing.*;

public class YesOrNo {
    public static void main(String[] args) {

        int pris = 0;
        int knappNr = JOptionPane.showConfirmDialog(null, "är du under 12 år?");
        if (knappNr == 0) pris = 1337;
        else if (knappNr == 1) pris = 6911;
        else {
            JOptionPane.showMessageDialog(null, "Wei ju dent gif me moanei");

        }
        while (knappNr == 1) {JOptionPane.showMessageDialog(null, "Retard");

        JOptionPane.showMessageDialog(null, "pris: " + pris + "^5 kr");

        JOptionPane.showMessageDialog(null, "Abdios");

            JOptionPane.showMessageDialog(null, "You're stuck");
            while (knappNr == 0) break;
            }
        }
}
