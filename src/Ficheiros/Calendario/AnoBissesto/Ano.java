package Ficheiros.Calendario.AnoBissesto;

import java.util.Calendar;

public class Ano {
    public static void main(String[] args) {
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        int dia = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
        int diasQueFaltam = (ano % 400 == 0 || ano % 100 == 0 || ano % 4 == 0) ? (366 - dia) : (365 - dia);
        System.out.println(diasQueFaltam);
    }
}
