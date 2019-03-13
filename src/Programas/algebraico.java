package Programas;

import javax.swing.*;
import java.io.*;

public class algebraico {

    public static void main(String[] args)
            throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String sopcion;
        int opcion;
        do {
            sopcion = JOptionPane.showInputDialog("                           MENU\n\n  1.PROGRAMA SUMA\n 2.PROGRAMA RESTA\n 3.PROGRAMA DIVISIÓN\n 4.PROGRAMA MULTIPLICACION\n 5.PROGRAMA TRIGONOMETRICA\n");
            opcion = Integer.parseInt(sopcion);

            switch (opcion) {
                case 1:
                    Suma.main(args);
                    break;
                case 2:
                    Resta.main(args);
                    break;
                case 3:
                    División.main(args);
                    break;
                case 4:
                    multiplicacion.main(args);
                    break;

            }
        } while (opcion != 4);
    }
}
