import java.util.Scanner;

public class Hra {
    void vypisViteze(){
        // Logika zde
    }
    public int nactiVolbuUzivatele(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("kamen (1), nuzky (2) nebo papir? (3)");
            int volba = sc.nextInt();
            if (volba == 1 || volba == 2 || volba == 3){
                return volba;
            }
        }
        return 0;
    }
}