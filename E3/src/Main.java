import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String frase = "Això és un exercici senzill de Java.";

        Pattern patró = Pattern.compile("[A-Za-zÀ-ÿ]+");
        Matcher coinc = patró.matcher(frase);

        int con = 0;

        while (coinc.find()) {
            con++;
        }

        System.out.println("La frase té " + con + " paraules.");
    }
}
