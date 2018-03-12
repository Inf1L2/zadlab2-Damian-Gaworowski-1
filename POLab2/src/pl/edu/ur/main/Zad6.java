package pl.edu.ur.main;

import java.util.Scanner;


public class Zad6 {
  public static void main(String[] args) {
Scanner odczyt = new Scanner(System.in);
for (;;) 
{
   int index=odczyt.nextInt();
    if (index >= 0) {
        System.out.println(index);
        index++;
    } 
    else 
    {
        break;
    }
}
    
}}
