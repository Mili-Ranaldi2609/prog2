package ej8;

public class Worker extends Employee{
    private int area;

    public Worker() {
    }

    public Worker(String name, int age, double salary, boolean capacityToWork, int area) {
        super(name, age, salary, capacityToWork);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public void producir(){
        System.out.println("El trabajador "+getName()+" esta trabajando en el area "+getArea());
    }
}
