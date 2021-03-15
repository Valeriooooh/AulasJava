package Ficheiros.Atividade3;

import java.io.IOException;
import java.util.Scanner;

public class Ler {
    public static String umaString() {
        String s = "";
        try {
            s = new Scanner(System.in).nextLine();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return s;
    }

    public static int umInteiro() {
        while (true) {
            try {
                return Integer.valueOf(umaString().trim()).intValue();

            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
