package pl.edu.ur.main;

import java.util.Scanner;
 public class Zad7 {
 
private static void b_sort(int tab[]){
int t;
int zmiana = 1;
while(zmiana > 0){
zmiana = 0;
for(int i=0; i<tab.length-1; i++){
if(tab[i]>tab[i+1]){
t = tab[i+1];
tab[i+1] = tab[i];
tab[i] = t;
zmiana++;
}
}
}
for(int i=0; i<tab.length; i++){
System.out.print(tab[i]+" ");
}
}
 
public static void main(String[] args) {
int ilosc;
Scanner odczyt = new Scanner(System.in);
System.out.println("Wpisz ilosc elemntów tablicy");
ilosc = odczyt.nextInt();
 
int[] tab = new int[ilosc];
for(int i=0; i<tab.length; i++){
System.out.println("Wpisz kolejny element tablicy:");
tab[i] = odczyt.nextInt();
}
b_sort(tab);
}
}