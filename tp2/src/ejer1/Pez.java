package ejer1;

public class Pez extends Animal{
    private boolean salt_water=false;
    private String type;

    public Pez(int age, String animalType, String name, double price,boolean salt_water,String type) {
        super(age, animalType, name, price);
        this.salt_water=salt_water;
        this.type=type;
    }

    public boolean isFresh_or_salt_water() {
        return salt_water;
    }

    public void setFresh_or_salt_water(boolean fresh_or_salt_water) {
        this.salt_water = fresh_or_salt_water;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return "Presentacion del animal: "+
                "Tipo de animal: "+this.getAnimalType()+" "+
                "Nombre: "+this.getName()+" "+
                "Edad: "+this.getAge()+" "+
                "Precio: "+this.getPrice()+" "+
                "Es de agua salada?: "+salt_water;
    }
    @Override
    public String feed(String name){
        return name+" comiendo ";
    }
}
