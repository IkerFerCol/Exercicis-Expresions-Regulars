import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        String texto = "El meu numero de telefon és 123-456-789. El de casa és 964-123-456";
        String regex = "\\d{3}-\\d{3}-\\d{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println("Numero: " + matcher.group());
            System.out.println("inicio: " + matcher.start() + ", final: " + matcher.end());
        }
    }
}