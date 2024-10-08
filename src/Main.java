import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj rozmiar tablicy: ");
        int rozmiar = sc.nextInt();
        if (rozmiar < 50){
            System.out.println("podaj więcej niż 50" );

        }
            int[] tab = losuj(rozmiar);
        System.out.println("wylosowane");
        wypiszLosowaTab(tab);
        System.out.println("podaj wartosc");
        int wartosc = sc.nextInt();
        if(wartosc > 100 || wartosc < 1){
            System.out.println("nie moze byc wienksa od 100 lub mniejsza od 1");
            return;
        }
        int wynik = znajdzWartosc(wartosc, tab);
        if (wynik == -1){
            System.out.println("brak elementu");
        }
        else {
            System.out.println("pierwzsze wystąpienie elmentu po pod indexem: " + wynik );
        }
    }
    public static int[] losuj(int rozmiar ){
        int[] tab = new int[rozmiar + 1];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++){
            tab[i] = r.nextInt(100)+1;
        }
        return tab;
    }

    public static void wypiszLosowaTab(int[] tab){
        for (int i = 0; i < tab.length - 1; i++){
            System.out.print(tab[i] + " {" + 1 + "} ");
        }
        System.out.print(tab[tab.length-2] + "{" + (tab.length - 2) + "}");
        System.out.println();
    }
    public static int znajdzWartosc(int wartosc,int[] tab){
        tab[tab.length - 1] = wartosc;
        int i = 0;
        while (tab[i] != wartosc){
            i++;
        }
        if (i == tab.length - 1){
            return  - 1;
        }
        return i;
    }
}