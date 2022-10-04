import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Schaltjahrberechnung");

        System.out.println("Bitte geben Sie eine Jahreszahl ein:");
        int zahl = 0;
        Scanner scanner = new Scanner(System.in);
        zahl = scanner.nextInt();

        System.out.println("Ihr Wert lautet: " + zahl);

        // durch 4 teilbar = Schaltjahr
        // durch 4 + 100 teilbar = KEIN Schaltjahr;
        // durch 400 teilbar = Schaltjahr;
        // mit Modulo % Berechnen

        if (zahl % 4 == 0 && zahl % 400 == 0) {
            System.out.println(zahl + " ist ein Schaltjahr!");
        } else if (zahl % 4 == 0 && zahl % 100 != 0) {
            System.out.println(zahl + " ist ein Schaltjahr!");
        } else {
            System.out.println(zahl + " ist kein Schaltjahr!");

            System.out.println("Diese Jahreszahl ist ein Schaltjahr: " + isLeafYear(zahl));
        }

    }


    public static boolean isLeafYear(int zahl) {
        // true wenn Schaltjahr
        // false wenn kein Schaltjahr

        if (zahl % 4 == 0 && zahl % 400 == 0) {
            return true; }
        else if (zahl % 4 == 0 && zahl % 100 != 0) {
            return true; }
        else {return false; }
        }
    }


