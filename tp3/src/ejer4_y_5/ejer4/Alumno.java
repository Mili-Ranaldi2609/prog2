package ejer4_y_5.ejer4;

public class Alumno {
    private String name;
    private int age;
    private double note;

    public Alumno(String name,int age,double note) {
        this.name=name;
        this.age = age;
        this.note=note;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return getName().toLowerCase().equals(alumno.getName().toLowerCase());
    }
}
