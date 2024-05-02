import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear una instalación
        Instalacion f = new Instalacion("Natacion", "Pileta", "Mendoza _ Argentina", "Talleres");

        // Crear algunas pruebas y añadir atletas a las pruebas
        Prueba p1 = new Prueba(12345, "Nadador Experto");
        Prueba p2 = new Prueba(2654, "Nadador Juvenil");

        //sede creada y recibe como parametro la instalacion y las pruebas
        Sede c= new Sede(1,"2/5/24","12:00",f,p1);
        Sede c1= new Sede(2,"29/05/24","14:30",f,p2);
        //agregando atletas a las pruebas
        //prueba 1
        p1.addAtleta( new Atleta(44437603, "Manuel Gonzales", 25, 1.75, 70));
        p1.addAtleta( new Atleta(503456788, "Julian Cordoba", 21, 1.70, 80));
        p1.addAtleta(new Atleta(34322333, "Marcos Cataldo", 27, 1.80, 100));

        //prueba 2
        p2.addAtleta( new Atleta(443245566, "Santiago Benegas", 17, 1.85, 80));
        p2.addAtleta( new Atleta(534522222, "Paulo Lara", 18, 1.78, 72));
        p2.addAtleta( new Atleta(619087654, "Matias Muñoz", 16, 1.68, 65));

        // Agregar las pruebas a la instalación
        f.addP(p1);
        f.addP(p2);
        // Mostrar el nombre del 3er atleta de la 2da prueba
        System.out.println("Nombre del 3er atleta de la 2da prueba: " +f.getPruebas().get(1).getAtletas().get(2).getName());
        // Mostrar el código de la 2da prueba
        System.out.println("Código de la 2da prueba: " + f.getPruebas().get(1).getCode());

        // Crear un equipo nacional y añadir los atletas de las pruebas
        EquipoNacional equipo = new EquipoNacional("Celeste", "Argentina");
        //para los atletas de cada prueba se itera sobre las pulsaciones y si las pulsaciones no estan dentro del rango aceptable no pueden estar
        //dentro del equipo nacional
        for (Atleta atleta : p1.getAtletas()) {
                double k = atleta.takeKeystrokes();
                if (k >= 60 && k <= 100) {
                    equipo.addA(atleta);
                } else {
                    System.out.println("El atleta " + atleta.getName() + " no está apto para entrenar y no se ha agregado al equipo.");
                }
        }
        for (Atleta atleta : p2.getAtletas()) {
            double k = atleta.takeKeystrokes();
            if (k >= 60 && k <= 100) {
                equipo.addA(atleta);
            } else {
                System.out.println("El atleta " + atleta.getName() + " no está apto para entrenar y no se ha agregado al equipo.");
            }
        }

        System.out.println("Datos de los atletas del equipo nacional: ");
        // Mostrar los datos de los atletas en el equipo nacional
        int i=0;
        for(Atleta atleta: equipo.getA()){
            equipo.getA().get(i).athleteData();
            i++;
        }

    }
}
