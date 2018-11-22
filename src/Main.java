import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        String name =   JOptionPane.showInputDialog("Geben Sie Ihen Namen ein: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: "));

        if (age>=18)
        {
            JOptionPane.showMessageDialog(null,"Glückwunsch " + name +" du bist Volljährig.");
        }else
        {
            JOptionPane.showMessageDialog(null,name +" du bist erst " + age + " Jahre alt und darfst deshalb noch keine Zigaretten kaufen!");
        }
    }
}
