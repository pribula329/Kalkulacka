import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ahoj");
        System.out.println("Zadaj 1 cislo: ");
        Scanner vstup1 = new Scanner(System.in);
        double cislo1 = vstup1.nextDouble();
        System.out.println("Zadaj 2 cislo: ");
        Scanner vstup2 = new Scanner(System.in);
        double cislo2 = vstup2.nextDouble();
        System.out.println("Zadaj typ: ");
        Scanner vstup3 = new Scanner(System.in);
        int typ = vstup3.nextInt();
        if (typ<1 || typ>4)
        {
            throw new ArithmeticException("Chyba");
        }

        System.out.println("Vysledok je: " );
        kalkulacka(cislo1,cislo2,typ);

    }


    public static void kalkulacka(double cislo1, double cislo2, int typ)
    {
        switch (typ) {
            case 1:
                System.out.println(scitanie(cislo1,cislo2));
                break;
            case 2:
                System.out.println(odcitanie(cislo1,cislo2));
                break;
            case 3:
                System.out.println(nasobenie(cislo1,cislo2));
                break;
            case 4:
                System.out.println(delenie(cislo1,cislo2));
                break;
        }
    }

    private static double scitanie(double a, double b)
    {
        return a+b;
    }

    private static double odcitanie(double a, double b)
    {
        return a-b;
    }

    private static double nasobenie(double a, double b)
    {
        return a*b;
    }

    private static double delenie(double a, double b)
    {
        if (b==0)
        {
            throw new ArithmeticException("0 sa neda delit!!");
        }
        else
        {
            return a/b;
        }
    }
}
