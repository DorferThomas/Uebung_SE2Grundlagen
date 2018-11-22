package Package_1;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[] args)
    {
        int min = 1;
        int max = 10;

        Random rnd = new Random();


        int zufallszahl = rnd.nextInt(max - min + 1) + min;                                                      // die Methode Random Erstellt immer eine Zufällige Zahl von 1-10. Welche dabei auch gerade sein kann.

                                                                                                                        // hier wird mit dem % geprüft ob die zufällig berechnete Zahl gerade oder ungerade ist.
        if (zufallszahl%2==0)                                                                                           // Wenn die Zahl gerade ist wird das unten stehente in die Konsole ausgegeben.
        {
            System.out.println("Die Zahl " +
                    "ist gerade.");
        }else                                                                                                           //falls die Zahl nicht gerade ist wird das unten stehente in die Konsole ausgegeben.
        {
            System.out.println("Die Zahl ist nicht gerade.");
        }
        System.out.println(zufallszahl);                                                                                //es wird vom Benutzer verlangt eine Zahl von 1-10 einzugeben



        int versuche = 3;                                                                                               //Aufgabe 5: Mit der While Schleife werden gleich wie bei der FOR schleife die 3 Durchgänge bestimmt.
                while (versuche!=0)                                                                                     //Die Schleife wird so lange durchgelaufen, bis die Durchgänge auf 0 sind. also max. 3 mal
        {
            int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Ganzzahl von 1-10 ein."));
            if (eingabe==zufallszahl)
            {
                System.out.println("Glückwunsch sie haben die Zahl erraten.");                                          //Wird die Zahl auf das erste Mal erraten, bricht alles ab und diese sout. Meldung wird ausgegeben.
                break;
            }else
            {
                if (eingabe>=10)                                                                                        //Mit der IF Schleife wird nochmal geprüft, ob die eingegebene Zahl im richtigen Wertebereich ist.
                {                                                                                                       //Falls das nicht der Fall ist, wird die sout. ausgegeben und es wird als kein Versuch gerechnet und beginnt von vorne.
                    System.out.println("Sie haben eine zu hohe Zahl eingegeben.");
                }else
                {
                    --versuche;
                    System.out.println("Leider nicht gewonnen, sie haben noch " + versuche + " versuche!");             //hier wird die Anzahl der Versuche noch inkrementiert --1 und danach zusätzlich noch die anzahl der Versuche ausgegeben.

                }
            }
        }




            /*Dies war Aufgabe 2 - 3 welche durch 4 ersetzt wurde.

            if (eingabe==zufallszahl) //die eingegebene Zahl wird nun mit der Zufallszahl verglichen.
            {
                System.out.println("Glückwunsch sie haben die gleiche Zahl wie der Zufallsgenerator getroffen. Trotzdem bekommen sie keinen Preis. Die Zahl war: " + zufallszahl);
            }else
            {
                if (eingabe==zufallszahl)
                {

                }
            }

            Dies war Aufgabe 3 welche durch 4 ersetzt wurde.

            {
               if ((eingabe-zufallszahl) <= 2 && (eingabe-zufallszahl) >=-2) //Hier wird verglichen ob die Eingabe gleich groß wie die Zufahlszahl ist.
               {
                   System.out.println("Knapp daneben ist auch vorbei, die Zahl war: " + zufallszahl);
               }else
                   {
                       System.out.println("Leider nicht Gewonnen°! Die Zahl war: " + zufallszahl);
                   }
            }*/




        /*                                                                                                              // int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Ganzzahl von 1-10 ein."));
        //mit den FOR Schleifenkopf() gibt man an wie oft die Schleife durchlaufen soll. In diesem Fall von 0-2 also 3 mal.
        //in der For Schleife wird dann geprüft, ob die eingegebene Zahl mit der Zufallszahl übereinstimmt.
        for (int i=0;i<3;++i ){

            int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Ganzzahl von 1-10 ein."));
            if (eingabe==zufallszahl)
            {
                System.out.println("Glückwunsch sie haben die Zahl erraten.");
                break;
            }else
            {
                System.out.println("Leider nicht gewonnen, versuchen sie es nochmal!");
            }
        };
        */






    }
}

