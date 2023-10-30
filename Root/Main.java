import java.io.Console;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Chceš si zahrát kámen, nůžky, papír (1), nebo sudá - lichá (2)?");
        Scanner sc = new Scanner(System.in);
        int volba = sc.nextInt();

        if (volba == 1){
            Hra kamenNuzky = new Hra();
            int vyberUzivatele = kamenNuzky.nactiVolbuUzivatele();
            // Načti volbu pc
            // Vyhodnocení
        }
        else if (volba == 2){
            // TODO: Add this thing
        }
        else{
            System.out.println("To není možnost!");
        }
    }
}