package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.LinkedList;
import java.util.Random;

public class StrongPasswordGenerator {
    private int length=8;
    private boolean isLowercase=true, isUppercase=true, isDigits=true, isSpecialCharacters=true;
    private String allowedSpecialCharacters="@#$%^";

    public static String generate(int length, boolean isLowercase, boolean isUppercase, boolean isDigits, boolean isSpecialCharacters, String allowedSpecialCharacters)
    {
        char[] charArr = new char[length];
        Random r = new Random();
        int Lowercase,Uppercase,Digits;

        LinkedList<Integer> password = new LinkedList<Integer>();
        int drawn=r.nextInt(6);

        for(int i=0;i<length;i++)
        {
            if(drawn==0)
            {
                Lowercase=r.nextInt(31)+97;
                password.add(Lowercase);
                Uppercase=r.nextInt(27)+65;
                password.add(Uppercase);
                Digits=r.nextInt(11)+48;
                password.add(Digits);
            }
            else if(drawn==1)
            {
                Lowercase=r.nextInt(31)+97;
                password.add(Lowercase);
                Digits=r.nextInt(11)+48;
                password.add(Digits);
                Uppercase=r.nextInt(27)+65;
                password.add(Uppercase);

            }
            else if(drawn==2)
            {
                Uppercase=r.nextInt(27)+65;
                password.add(Uppercase);
                Lowercase=r.nextInt(31)+97;
                password.add(Lowercase);
                Digits=r.nextInt(11)+48;
                password.add(Digits);
            }
            else if(drawn==3)
            {
                Uppercase=r.nextInt(27)+65;
                password.add(Uppercase);
                Digits=r.nextInt(11)+48;
                password.add(Digits);
                Lowercase=r.nextInt(31)+97;
                password.add(Lowercase);

            }
            else if(drawn==4)
            {
                Digits=r.nextInt(11)+48;
                password.add(Digits);
                Lowercase=r.nextInt(31)+97;
                password.add(Lowercase);
                Uppercase=r.nextInt(27)+65;
                password.add(Uppercase);

            }
            else if(drawn==5)
            {
                Digits=r.nextInt(11)+48;
                password.add(Digits);
                Uppercase=r.nextInt(27)+65;
                password.add(Uppercase);
                Lowercase=r.nextInt(31)+97;
                password.add(Lowercase);
            }

        }
        System.out.println("Twoje haslo w ASCII :");
        System.out.println(password);

        System.out.println("Twoje haslo :");
        String passwordString = null;
        for (int i: password) {
            passwordString = Character.toString((char) i);
            System.out.print(passwordString);
        }

        String text="";

        return text;
    }

    public StrongPasswordGenerator() {

    }

    public StrongPasswordGenerator(int length)
    {
        this.length = length;
    }

    public StrongPasswordGenerator(int length, boolean isLowercase, boolean isUppercase, boolean isDigits, boolean isSpecialCharacters, String allowedSpecialCharacters) {
        this.length = length;
        this.isLowercase = isLowercase;
        this.isUppercase = isUppercase;
        this.isDigits = isDigits;
        this.isSpecialCharacters = isSpecialCharacters;
        this.allowedSpecialCharacters = allowedSpecialCharacters;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isIsLowercase() {
        return isLowercase;
    }

    public void setIsLowercase(boolean isLowercase) {
        this.isLowercase = isLowercase;
    }

    public boolean isIsUppercase() {
        return isUppercase;
    }

    public void setIsUppercase(boolean isUppercase) {
        this.isUppercase = isUppercase;
    }

    public boolean isIsDigits() {
        return isDigits;
    }

    public void setIsDigits(boolean isDigits) {
        this.isDigits = isDigits;
    }

    public boolean isIsSpecialCharacters() {
        return isSpecialCharacters;
    }

    public void setIsSpecialCharacters(boolean isSpecialCharacters) {
        this.isSpecialCharacters = isSpecialCharacters;
    }

    public String getAllowedSpecialCharacters() {
        return allowedSpecialCharacters;
    }

    public void setAllowedSpecialCharacters(String allowedSpecialCharacters) {
        this.allowedSpecialCharacters = allowedSpecialCharacters;
    }


}