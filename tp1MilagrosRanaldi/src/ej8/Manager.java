package ej8;

public class Manager extends Employee {
    private String deparment;

    public Manager() {
    }

    public Manager(String name, int age, double salary, boolean capacityToWork, String deparment) {
        super(name, age, salary, capacityToWork);
        this.deparment = deparment;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
    public void organizarActividades(Worker w1,int area){
        System.out.println("El gerente "+getName()+" asigna al trabajor "+w1.getName()+" al area numero "+area);
        w1.setArea(area);
    }
}
