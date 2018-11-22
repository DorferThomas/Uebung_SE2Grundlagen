package Package_1;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[] args)
    {
        int min = 1;
        int max = 10;

        Random rnd = new Random();

        // die Methode Random Erstellt immer eine Zufällige Zahl von 1-10. Welche dabei auch gerade sein kann.
        int zufallszahl = rnd.nextInt(max - min + 1) + min;

        // hier wird mit dem % geprüft ob die zufällig berechnete Zahl gerade oder ungerade ist.
        if (zufallszahl%2==0) // Wenn die Zahl gerade ist wird das unten stehente in die Konsole ausgegeben.
        {
            System.out.println("Die Zahl " +
                    "ist gerade.");
        }else //falls die Zahl nicht gerade ist wird das unten stehente in die Konsole ausgegeben.
        {
            System.out.println("Die Zahl ist nicht gerade.");
        }

        //es wird vom Benutzer verlangt eine Zahl von 1-10 einzugeben
        int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Ganzzahl von 1-10 ein."));

        //die eingegebene Zahl wird nun mit der Zufallszahl verglichen.
        if (eingabe==zufallszahl)
        {
            System.out.println("Glückwunsch sie haben die gleiche Zahl wie der Zufallsgenerator getroffen. Trotzdem bekommen sie keinen Preis. Die Zahl war: " + zufallszahl);
        }else
        {
            System.out.println("Leider nicht Gewonnen°! Die Zahl war: " + zufallszahl);
        }



    }
}

