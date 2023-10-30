class Main{
    public static void main(String[] args) {
        Hra kamenNuzky = new Hra();
        String vyberUzivatele = kamenNuzky.nactiVolbuUzivatele();
        int vyberPC = 1;
        System.out.println(vyberUzivatele);
    }
}