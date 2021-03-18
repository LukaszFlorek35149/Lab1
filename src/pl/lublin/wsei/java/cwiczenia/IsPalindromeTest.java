package pl.lublin.wsei.java.cwiczenia;
import org.apache.commons.lang3.StringUtils;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsPalindromeTest {

    public static void main(String[] args)
    {
//        String test2 = StringFun.anarchize("dawid kowalski");
//        System.out.println(test2);

//        String test3 = StringFun.camelize("Dawid kowalski ma kota i psa");
//        System.out.println(test3);
//
//        test3 = StringFun.decamelize("Dawid kowalski ma kota i psa");
//        System.out.println(test3);

//        String dane = "Dawid kowalski ma kota i psa";
//        System.out.println("Podany tekst: \""+dane+"\"");
//        String test4 = StringFun.shuffle(dane);
//        System.out.println("Tekst po obróbce: \""+test4+"\"");

//        Scanner scn = new Scanner(System.in);
//        do
//        {
//            System.out.print("\nPodaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
//            String tekst = scn.nextLine();
//            if(tekst.equals("0")) break;
//
//            System.out.print("Tekst: \"" +tekst+ "\""+
//                    (StringFun.isPalindrome(tekst) ?"":" nie ")+" jest palindromem");
//
//        }while(true);

        String haslo = StrongPasswordGenerator.generate(4,true,true,true,true,"#");
        System.out.println(haslo);

    }
}
