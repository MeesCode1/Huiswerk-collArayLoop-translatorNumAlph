import nlNoviLes3NumToAlph.Translator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);

        int[] numerics = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] alphabetical = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine"};

        Translator numTranslator = new Translator(numerics, alphabetical);

        boolean keepTranslate = true;
        // werkt ook niet bij normaals vertalen.
        while (keepTranslate) {
            System.out.println("Welkom, geef me een (enkel) nummer om te vertalen naar tekst");
            if (input.hasNextInt(0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9)) {
                numTranslator.translateNum(input.nextInt());
            } else {
                System.out.println("onjuist getal, probeer het nogmaals");
            }

            System.out.println("\nnog een getal vertalen naar tekst?:  \"y\" / \"n\"");
            if (input.hasNext("n")) {
                keepTranslate = false;
            //break;
            }
        }
        /* // werkt niet correct, blijft bij nogmaals vertalen printen.
        do{
            System.out.println("Welkom, geef me een (enkel) nummer om te vertalen naar tekst");
        if (input.hasNextInt(0|1|2|3|4|5|6|7|8|9)) {
            numTranslator.translateNum(input.nextInt());
        }
        else{
            System.out.println("onjuist getal, probeer het nogmaals");
        }

            System.out.println("\nnog een getal vertalen naar tekst?:  \"y\" / \"n\"");
        if (input.hasNext("n")){
            keepTranslate = false;
        }
        }
        while(keepTranslate);
         */
    }
}