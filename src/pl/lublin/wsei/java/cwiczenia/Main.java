package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

//        System.out.print("Ala\n");// wypisuje tekst na konsoli i nie przechodzi do następnej lini
//        System.out.print("ma");
//        System.out.print("kota");
//
//        System.out.print("\n\n");
//
//        System.out.print("Ala\n");// wypisuje tekst na konsoli i przechodzi do następnej lini za pomocą \n
//        System.out.print("ma\n");
//        System.out.print("kota\n");
//
//        System.out.print("\n\n"); // \n przechodzi do następnej lini"
//
//        System.out.println("Ala");// wypisuje tekst na konsoli i przechodzi do następnej lini
//        System.out.println("ma");
//        System.out.println("kota");
//
//        System.out.print("\n\n");
//
//        System.out.printf("Ala");// wypisuje tekst na konsoli i nie przechodzi do następnej lini
//        System.out.printf("ma");
//        System.out.printf("kota");
//
//
//        int a =3;
//        double b=4.21;
//        String s = "Jakiś tekst";
//
//        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);
//        System.out.printf("Nazywaliśmy to \"witaminą B3\"");
//
//        System.out.printf("alfa/tsin(alfa)\n");
//        for(int i=0;i<370;i+=10)
//        {
//            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
//        }
//
//
//        Scanner input = new Scanner(System.in);
//        int num1=0, num2=0;
//        do {
//
//            System.out.print("Podaj dwie liczby, które mam dodać: ");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//            if(num1 == 0 || num2 == 0) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n ",num1,num2,num1+num2);
//        }while(true);
//
//
//        System.out.printf("Program do wypisywania postaci dwójkowej i szesnastkowej podanej przez użytkownika liczby.\n Podaj liczbe: ");
//        Scanner input = new Scanner(System.in);
//        int EnteredNumber=0;
//        EnteredNumber = input.nextInt();
//        String BIN,HEX;
//        BIN = Integer.toBinaryString(EnteredNumber);
//        HEX = Integer.toHexString(EnteredNumber);
//        String numberBIN,numberHEX;
//        numberBIN = leftPad(BIN,'0',8);
//        numberHEX = leftPad(HEX,'0',4);
//        System.out.println("Podana liczba : "+EnteredNumber+"\nPostać dwójkowa: "+numberBIN+"\nPostać szesnastkowa: %"+numberHEX.toUpperCase());
//
//        int[] liczby = new int[30];
//        Random rnd = new Random();
//         for(int i=0;i<30;i++)
//             liczby[i] = rnd.nextInt();
//
//         int mx = Integer.MIN_VALUE;
//         int mn = Integer.MAX_VALUE;
//         long avg =0;
//         for(int l : liczby)
//        {
//            if(1 < mn) mn = 1;
//            if(1 > mx) mx = 1;
//            avg += 1;
//        }
//         System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn,mx,(float)avg/liczby.length);
//
//        Account acc = new Account();
//        acc.setName("łukasz florek");
//        System.out.println(acc.getName());




//          Account acc = new Account();
//        acc.setName("piotr Gołabek");
//        System.out.println(acc.getName());

//        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
//        System.out.printf("%s%n",Account.translit("лукасз флорек"));
//        System.out.printf("%s%n",Account.translit("пиотр голомбек"));
//        System.out.printf("%s%n",Account.translit("барбара мазурек"));







    }

//    private static String leftPad(String aText, char aChar, int aWidth) {
//        String res = aText;
//        for (int i = 0; i < aWidth - aText.length(); i++)
//            res = aChar + res;
//        return res;
//    }
//
//    public static int log2(int x)
//    {
//        return (int) (Math.log(x) / Math.log(2));
//    }
}