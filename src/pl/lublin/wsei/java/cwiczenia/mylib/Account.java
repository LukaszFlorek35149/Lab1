package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;



public class Account
{
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    private String name;

    public static String capitalize(String aStr)
    {
        String LowerL = aStr.toLowerCase();
        String[] tokens = StringUtils.split(LowerL);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }


    public static String translit(String arg)
    {
        String Lower = arg.toLowerCase();
        StringBuilder translitRep = new StringBuilder(Lower.length());
        for (int i=0; i < Lower.length(); i++)
        {
            char letter = Lower.charAt(i);
            int position = ukrAlphabet.indexOf(letter);

            if (position == -1)
            {
                translitRep.insert(i,letter);
            }else
            {
                translitRep.insert(i,translitRepl[position]);
            }
        }
        return translitRep.toString();
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }

}
