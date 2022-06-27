package client;

import java.util.Locale;

public class CapitalClient {

    public static String capitalLetter(String word){
        //Trim letter before capitalizing the whole word
        return word.trim().toUpperCase();
    }

    public static String lowerLetter(String word){
        // Trim the letter before decapitalizing the word
        return word.trim().toLowerCase();
    }

}
