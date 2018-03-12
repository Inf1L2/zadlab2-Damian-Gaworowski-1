package pl.edu.ur.main;


import java.util.Scanner;

public class Zad4 {

    public static int a[];

    public static void main(String[] args) {
        int wynik;
        double w;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj 10 liczb");
        int[] tab1 = new int[10];

        for (int i = 0; i < 10; i++) {
            tab1[i] = odczyt.nextInt();
        }

        System.out.println("Co chcesz zrobić z tymi liczbami ?");
        System.out.println("1---sumÄ™ elementĂłw tablicy,");
        System.out.println("2---iloczyn elementĂłw tablicy");
        System.out.println("3---Wartosć średniÄ…");
        System.out.println("4---wartoĹ›Ä‡ maksymalna");
        System.out.println("5---wartoĹ›Ä‡ minimalna");
        int x = odczyt.nextInt();

        switch (x) {
            case 1:
                wynik = 0;
                for (int i = 0; i < 10; i++) {
                    wynik += tab1[i];
                }

                System.out.println("Suma elementow tablicy to " + wynik);
                break;
            case 2:

                int wynik1 = 1;
                for (int i = 0; i < 10; i++) {
                    wynik1 *= tab1[i];
                }
                System.out.println("iloczyn elementow tablicy to " + wynik1);
                break;
            case 3:

                w = 0;

                for (int i = 0; i < 10; i++) {

                    w += tab1[i];

                }

                System.out.println(w / 10);
                break;
            case 4:
                int max = tab1[0];

                for (int i = 0; i < 10; i++) {

                    if (tab1[i] > max) {
                        max = tab1[i];
                    }

                }

                System.out.println("maksymalna wartoĹ›Ä‡ to" + max);
                break;
            case 5:
                int min = tab1[0];

                for (int i = 0; i < 10; i++) {

                    if (tab1[i] < min) {
                        min = tab1[i];
                    }

                }

                System.out.println("minimalna wartoĹ›c to" + min);
                break;
        }
    }
}
