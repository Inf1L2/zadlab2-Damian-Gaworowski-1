package pl.edu.ur.main;

import static java.time.Clock.system;
import java.util.Scanner;
 
public class zad3{
  public static void main(String[] args){
      
      Scanner odczyt = new Scanner(System.in);
 
      System.out.println("Podaj nr funcjolaności ");
       System.out.println("1.•	Wyświetlanie tablicy od pierwszego do ostatniego indeksu. ");
      System.out.println("2. •	Wyświetlanie tablicy od ostatniego do pierwszego indeksu ");
      System.out.println("3  •	Wyświetlanie elementów o nieparzystych indeksach. ");
      System.out.println("4  •	Wyświetlanie elementów o parzystych indeksach. ");
      
      int wybor = odczyt.nextInt();
      
      if(wybor == 1)
      {
          System.out.println("Podaj 10 liczb");
          int[] tab = new int[10];
        
      for(int i=0; i<10; i++)
      
          tab[i] = odczyt.nextInt();
  
        
      for(int i=0; i<10; i++)
         System.out.println(+tab[i]);
      }
      else if(wybor== 2){
          System.out.println("Podaj 10 liczb");
          int[] tab1 = new int[10];
        
      for(int i=0; i<10; i++)
      
          tab1[i] = odczyt.nextInt();
      for(int i=9;i<10;i--)
          System.out.println(+tab1[i]);
      }
       else if(wybor== 3){
          System.out.println("Podaj 10 liczb");
          int[] tab1 = new int[10];
        
      for(int i=0; i<10; i++)
      
          tab1[i] = odczyt.nextInt();
      for(int i=0;i<10;i++)
          if(i%2==0){
          System.out.println(+tab1[i]);
          if(i==10)
              break;
    
          }
       }
       else{
           System.out.println("Podaj 10 liczb");
          int[] tab1 = new int[10];
        
      for(int i=0; i<10; i++)
      
          tab1[i] = odczyt.nextInt();
      for(int i=0;i<10;i++)
          if(i%2==0){
          System.out.println(+tab1[i]);
          if(i==10)
              break;
          }
          
  }}}