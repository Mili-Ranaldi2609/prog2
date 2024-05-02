public class Atleta extends Persona implements Contrato{
    private int age;
    private double height;
    private double weight;

    public Atleta(int dni, String name, int age, double height, double weight) {
        super(dni, name);
        this.age = age;
        this.height=height;
        this.weight=weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateIMC() {
        double imc = weight / Math.pow(height, 2);
        return Math.round(imc * 100.0) / 100.0; // Redondear a dos decimales
    }

    @Override
    public boolean thereIsExtraWeight(double imc) {
        if (imc < 18.5) {
            System.out.println("Peso insuficiente");
            return false;
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal o saludable");
            return false;
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
            return true;
        } else {
            System.out.println("Obesidad");
            return true;
        }
    }

    @Override
    public double takeKeystrokes() {
        double k = (double) (Math.random() * 100) + 60;
        return k;
    }
    public void athleteData(){
        System.out.println("Nombre:  "+getName()+", Altura: "+getHeight()+", Peso: "+getWeight());
        thereIsExtraWeight(calculateIMC());
    }
}
