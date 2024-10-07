import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introudeix un correu electrònic");
        String email = sc.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("L'adreça de correu és vàlida.");
        } else {
            System.out.println("L'adreça de correu NO és vàlida.");
        }
    }
}