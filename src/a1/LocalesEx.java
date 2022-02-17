package a1;
import java.util.*;
import java.util.stream.*;
public class LocalesEx {
    static long numOfLocales() {
        return Stream.of(Locale.getAvailableLocales()).count();
    }

   static List<String> distinctLanguageCodeInReverseOrder() {
//        // (a)
    return Stream.of(Locale.getAvailableLocales())
            .map( x -> x.getLanguage() )			// getLanguage
            .distinct().sorted(Comparator.reverseOrder()).toList();
//
//
   }
//
 static List<String> countryWithEnglishLanguage() {
//        // (b)
    return Stream.of(Locale.getAvailableLocales()).filter(x->x.getLanguage()=="en").map(x->x.getDisplayCountry()).toList();
 }

    public static void main(String[] args) {
        System.out.println("Number of locales: " + numOfLocales());


        System.out.println("Distinct language codes in reverse order: " + distinctLanguageCodeInReverseOrder());


        System.out.println("Country names with English language: " + countryWithEnglishLanguage());
   }
}

