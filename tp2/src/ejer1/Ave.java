package ejer1;

public class Ave extends Animal{
    private boolean speaks=false;
    private String specie;
    public Ave(int age, String animalType, String name, double price,String specie, boolean speaks) {
        super(age, animalType, name, price);
        this.specie=specie;
        this.speaks=speaks;
    }

    public boolean isSpeaks() {
        return speaks;
    }

    public void setSpeaks(boolean speaks) {
        this.speaks = speaks;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
    @Override
    public String toString(){
        return "Presentacion del animal: "+" "+
                "Tipo de animal: "+this.getAnimalType()+" "+
                "Nombre: "+this.getName()+" "+
                "Edad: "+this.getAge()+" "+
                "Precio: "+this.getPrice()+" "+
                "Habla? "+speaks;
    }
    @Override
    public String feed(String name){

        return name +" comiendo";
    }


}
