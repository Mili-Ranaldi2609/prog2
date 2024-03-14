package vehiculos;
public class Main {
    public static void main(String[] args) {
        //instancias de camion y auto y mostrar datos
        Auto ao1= new Auto("Manuel",4, 4,true);
        ao1.caracteristicas();

        Camion cn1= new Camion("Lucas",2,4,1001);
        cn1.caracteristicas();
    }
}