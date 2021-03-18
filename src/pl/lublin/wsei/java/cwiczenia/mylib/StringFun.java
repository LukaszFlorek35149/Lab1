package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;

public class StringFun {

    public static boolean isStringUpperCase(String str){

        //convert String to char array
        char[] charArray = str.toCharArray();
        //if any character is not in upper case, return false
        if( !Character.isUpperCase( charArray[0] ))
        {
            return false;
        }else {
            return true;}

    }

    public static String anarchize(String text)
    {
        boolean czyJest = StringFun.isStringUpperCase(text);
        char[] tabChar = text.toCharArray();
        int bol = czyJest ? 1 : 0;
        text = text.toLowerCase();
        for (int i=bol;i<tabChar.length;i+=2)
        {
            tabChar[i]=Character.toUpperCase(tabChar[i]);
        }
        if(czyJest)
            tabChar[0]=Character.toLowerCase(tabChar[0]);
        text=new String(tabChar);
        return text;
    }



    public static String camelize(String text){
        text=StringUtils.normalizeSpace(text);
        String []stringArray = StringUtils.split(text);
        char tmpCharArray[] = stringArray[0].toCharArray();
        for (int i = 0; i < tmpCharArray.length; i++) {
            tmpCharArray[i] = Character.toLowerCase(tmpCharArray[i]);
        }
        stringArray[0] = new String(tmpCharArray);
        if(stringArray.length>0){
            for (int i = 1; i < stringArray.length; i++) {
                tmpCharArray=stringArray[i].toCharArray();
                for (int j = 0; j < tmpCharArray.length; j++) {
                    if(j==0) tmpCharArray[j] = Character.toUpperCase(tmpCharArray[j]);
                    else tmpCharArray[j] = Character.toLowerCase(tmpCharArray[j]);
                }
                stringArray[i] = new String(tmpCharArray);
            }
        }
        text=StringUtils.join(stringArray);
        return text;
    }


    public static String decamelize(String text){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(0);
        boolean isEOS = false;
        int i=1;
        while(!isEOS){
            if(i==text.length()){
                arrList.add(i);
                isEOS = true;
            }
            else if(Character.isUpperCase(text.charAt(i))){
                arrList.add(i);
            }
            i++;
        }
        String []stringArray = new String [arrList.size()-1];
        for (int j = 0; j < stringArray.length; j++) {
            stringArray[j]=text.substring(arrList.get(j), arrList.get(j+1));
        }
        char firstLetter;
        StringBuilder sb = new StringBuilder();
        sb.append(stringArray[0]);
        sb.append(' ');
        stringArray[0]=sb.toString();
        sb.delete(0, sb.length());
        for (int j = 1; j < stringArray.length; j++) {
            firstLetter=stringArray[j].charAt(0);
            firstLetter=Character.toLowerCase(firstLetter);
            sb.append(firstLetter);
            sb.append(stringArray[j].substring(1));
            sb.append(' ');
            stringArray[j]=sb.toString();
            sb.delete(0, sb.length());
        }
        text = StringUtils.join(stringArray);
        return text;
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z]","");
        text = text.toLowerCase();

        char ArrayChar[] = text.toCharArray();
        char ArrayCharBackwards[] = text.toCharArray();
        int zmienna =0;
        for (int i = ArrayCharBackwards.length-1; i>=0; i--)
        {
            ArrayChar[i]=ArrayCharBackwards[zmienna++];
        }
        for(int i=0;i<ArrayCharBackwards.length;i++)
        {
            if(ArrayCharBackwards[i] != ArrayChar[i]) return false;
        }
        return true;
    }







    public static String shuffle(String text){
        LinkedList<Character> charList = new LinkedList<>();
        for (char c : text.toCharArray()) {
            charList.add(c);
        }
        int randInt;
        ArrayList<Character> charRandomWordList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            randInt= RandomUtils.nextInt(0, charList.size());
            charRandomWordList.add(charList.get(randInt));
            charList.remove(randInt);
        }
        text=StringUtils.join(charRandomWordList,"");
        return text;
    }





}
