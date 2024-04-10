package ej8;

public class Main {
    public static void main(String[] args) {
        Manager m1=new Manager("Pablo",35,35000,true,"Las heras");
        Worker w1=new Worker("Ignacio",25,10000,true,3);
        w1.producir();
        m1.organizarActividades(w1,1);
        w1.producir();

    }
}
