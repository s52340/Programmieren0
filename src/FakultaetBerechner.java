import java.util.Scanner;

public class FakultaetBerechner {

    public static void main(String[] args) {

        System.out.println( "Fakultätberechner");
         // 5! = 1*2*3*4*5 =120

        System.out.println( "Bitte geben Sie eine Zahl ein ");
        Scanner scanner = new Scanner(System.in);
        int fakultaetZahl = scanner.nextInt();

        System.out.println("Das Ergebnis von der Fakultät" + fakultaetZahl + " = " + fakulktaetBerechnung(fakultaetZahl));
    }

    public static long fakulktaetBerechnung (int value) {

        long result = 1;

            for (int zahl = 1; zahl <= value; zahl++) {

            result = result * zahl;
                System.out.println( zahl + "! = " + result );
        }
        return result;
    }
}

