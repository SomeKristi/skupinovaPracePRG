import java.util.Scanner;

public class Hra {
    void vypisVyteze(){
        // Logika zde
    }
    public String nactiVolbuUzivatele(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("kamen (1), nuzky (2) nebo papir? (3)");
            String volba = sc.nextLine();
            if (volba == "1" || volba == "2" || volba == "3"){
                return volba;
            }
        }
        return "Scanner does not work";
    }
}
