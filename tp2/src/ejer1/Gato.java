package ejer1;

public class Gato extends Animal{
    private String race;
    private boolean sterilized=false;
    public Gato(int age, String animalType, String name, double price, String race, boolean sterilized) {
        super(age, animalType, name, price);
        this.race=race;
        this.sterilized=sterilized;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }
    @Override
    public String toString(){
        return "Presentacion del animal: "+" "+
                "Tipo de animal: "+this.getAnimalType()+" "+
                "Nombre: "+this.getName()+" "+
                "Edad: "+this.getAge()+" "+
                "Precio: "+this.getPrice()+" "+
                "Esta esterilizado? "+sterilized;
    }
    @Override
    public String feed(String name){

        return name + "comiendo";
    }
}
