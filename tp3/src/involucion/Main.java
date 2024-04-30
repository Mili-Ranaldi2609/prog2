package involucion;

public class Main {
    public static void main(String[] args) {
        Country argentina = new Country("Argentina");
        Country chile = new Country("Chile");
        Country brazil = new Country("Brazil");


        argentina.addNeighboringCountry(chile);
        argentina.addNeighboringCountry(brazil);
        chile.addNeighboringCountry(argentina);
        brazil.addNeighboringCountry(argentina);


        // Show neighboring countries of Argentina
        argentina.getNeighboringCountries();
    }

}
