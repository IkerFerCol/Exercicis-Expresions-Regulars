import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        String frasse = "Eres un datil i un abobat.";
        String regex = "datil|abobat";
        String reemplazo = "ALVARO";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(frasse);

        while (matcher.find()) {
            System.out.println(matcher.replaceAll(reemplazo));
        }

    }
}