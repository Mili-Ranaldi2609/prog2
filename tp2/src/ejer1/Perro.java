package ejer1;

public class Perro extends Animal{
    private String race;
    private boolean vaccinated=false;
    public Perro(int age, String animalType, String name, double price,String race, boolean vaccinated) {
        super(age, animalType, name, price);
        this.race=race;
        this.vaccinated=vaccinated;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    @Override
    public String toString(){
        return "Presentacion del animal: "+" "+
                "Tipo de animal: "+this.getAnimalType()+" "+
                "Nombre: "+this.getName()+" "+
                "Edad: "+this.getAge()+" "+
                "Precio: "+this.getPrice()+" "+
                "Esta vacunado? "+vaccinated;
    }
    @Override
    public String feed(String name){

        return name+" comiendo";
    }
}
