package decorator;

public class Main {
    public static void main(String[] args) {
        Kaffee kaffee = new Espresso();

        Kaffee kaffeeMitSahne = new Sahne(kaffee);

        Kaffee kaffeeMitSahneMitEis = new Eis(kaffeeMitSahne);

        System.out.println(kaffeeMitSahneMitEis.getDescription());
    }
}
