package Programas;

import javax.swing.*;
import java.io.*;

public class trigonometrica {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String sopcion;
        int opcion;
        do {
            sopcion = JOptionPane.showInputDialog("                           MENU\n\n  1.SENO\n 2.COSENO\n 3.TANGENTE\n 4.COTANGENTE\n");
            opcion = Integer.parseInt(sopcion);
            switch (opcion) {
                case 1:
                    seno.main(args);
                    break;
                case 2:
                    coseno.main(args);
                    break;
                case 3:
                    tangente.main(args);
                    break;
                case 4:
                    cotangente.main(args);
                    break;
            }
        } while (opcion != 4);

    }

}
