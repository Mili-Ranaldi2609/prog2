package ejer1;

public abstract class Animal {
    private int age;
    private String animalType;
    private String name;
    private double price;

    public Animal(int age, String animalType, String name, double price) {
        this.age = age;
        this.animalType=animalType;
        this.name=name;
        this.price=price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String feed(String name){
        return name+"comiendo";
    }
    @Override
    public String toString(){
        return "Presentacion del animal: "+
                "Tipo de animal: "+animalType+
                "Nombre: "+name+
                "Edad: "+age+
                "Precio: "+price;
    }
}

