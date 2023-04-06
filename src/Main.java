import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2d tömb létrehozássa(maga az alap)
        String kocka[][] = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        //
        kiir kiobj = new kiir();

        System.out.println("Üdvözöllek a Kör-X játékunkban!");

        System.out.println();

        //Oldal választás

        System.out.println("A körrel vagy X-szel szeretnél lenni? Nyomj 0-át ha a körrel és 1-est ha az X-szel");

        int oldalvalasztas = sc.nextInt();
        while (oldalvalasztas != 1) {
            if (oldalvalasztas > 1) {
                System.out.println("Rossz érték kérem válasszon a 0 és 1 érték között!");
                oldalvalasztas = sc.nextInt();
            }
            if (oldalvalasztas == 0) {

                System.out.println("Ön a kört választotta!");
                break;
            }

        }
        if (oldalvalasztas == 1) {

            System.out.println("Ön az X-et választotta!");
        }

        System.out.println();

        //kordináta bekérések

        System.out.println("Kérem a sor kordinátáját 0 és 2 között: ");
        int kor1 = sc.nextInt();
        System.out.println("Kérem az oszlop kordinátáját 0 és 2 között: ");
        int kor2 = sc.nextInt();

        kocka[kor1][kor2] = "x";
        kiobj.kiiras(kocka);
    }
}

