package Programas;

import javax.swing.*;
import java.io.*;

public class Menu {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String sopcion;
        int opcion;
        do {
            sopcion = JOptionPane.showInputDialog("                           MENU\n\n  1.ALGEBRÁICA\n 2.TRIGONOMÉTRICA\n");
            opcion = Integer.parseInt(sopcion);
            switch (opcion) {
                case 1:
                    algebraico.main(args);
                    break;
                case 2:
                    trigonometrica.main(args);
                    break;

            }
        } while (opcion != 2);

    }

}
