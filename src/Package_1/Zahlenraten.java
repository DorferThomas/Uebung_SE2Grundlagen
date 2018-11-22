package Package_1;

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
        if (zufallszahl%2==0)
        {
            System.out.println("Die Zahl " + zufallszahl + " ist gerade.");
        }else
        {
            System.out.println("Die Zahl " + zufallszahl + " ist nicht gerade.");
        }




    }
}
