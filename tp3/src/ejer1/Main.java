package ejer1;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de todas las clases
        Profesor profesor = new Profesor(12345678, "Juan Pérez", "Departamento de Matemáticas");
        Asignatura asignatura1 = new Asignatura("Matemáticas", 101, "8:00-10:00");
        Asignatura asignatura2 = new Asignatura("Física", 102, "10:00-12:00");
        Asignatura asignatura3 = new Asignatura("Química", 103, "12:00-14:00");
        Alumno alumno = new Alumno(98765432, "María García");
        Grupo grupo = new Grupo("A", 'A',asignatura3);

        // Asociar asignaturas al profesor
        profesor.addAsignatura(asignatura1);
        profesor.addAsignatura(asignatura2);
        profesor.addAsignatura(asignatura3);

        // Asociar grupo a asignatura
        asignatura3.m_Grupo = grupo;
        // Asociar alumno al grupo
        grupo.m_Alumno = alumno;
        // Operaciones sobre el modelo
        // a. Mostrar el aula de la 3ra. asignatura del profesor
        System.out.println("Aula de la 3ra. asignatura: " + profesor.m_Asignaturas.get(2).getM_Grupo().getM_Asignatura().getAula());
        // b. Mostrar todos los nombres de las asignaturas que imparte el profesor
        System.out.println("Asignaturas impartidas por el profesor:");
        for (Asignatura asignatura : profesor.m_Asignaturas) {
            System.out.println(asignatura.nombre);
        }

        // c. Mostrar nombre y dni de los alumnos del grupo que recibe la asignatura
        System.out.println("Alumnos del grupo de la asignatura:");
        System.out.println("Nombre: " + grupo.m_Alumno.nombre + ", DNI: " + grupo.m_Alumno.dni);
        // d. Mostrar todas las asignaturas recibidas por el primer grupo al que pertenece el alumno
        if (!alumno.getGrupos().isEmpty()) {
            System.out.println("Asignaturas recibidas por el primer grupo:");
            System.out.println(alumno.getGrupos().get(0).getM_Asignatura().getNombre());
        } else {
            System.out.println("El alumno no está inscrito en ningún grupo.");
        }
        // e. Mostrar el profesor que imparte una asignatura dada
        // Suponiendo que el usuario ingresa el nombre de la asignatura por consola
        String nombreAsignaturaBuscada = "Matemáticas"; // Este valor se obtendría desde la entrada del usuario
        for (Asignatura asignatura : profesor.m_Asignaturas) {
            if (asignatura.nombre.equals(nombreAsignaturaBuscada)) {
                System.out.println("Profesor que imparte " + nombreAsignaturaBuscada + ": " + profesor.nombre);
                break;
            }
        }
        // f. Mostrar los nombres de todos los alumnos inscriptos en el Grupo de la 2da. Asignatura
        if (asignatura2.m_Grupo != null) {
            System.out.println("Alumnos inscriptos en el grupo de la segunda asignatura:");
            System.out.println(asignatura2.m_Grupo.m_Alumno.nombre);
        } else {
            System.out.println("El grupo de la segunda asignatura no tiene alumnos inscritos.");
        }
        // g. Diferencia entre asociación, composición y agregación
        System.out.println("Una asociación es una relación entre dos clases donde cada una puede existir independientemente de la otra.");
        System.out.println("Una composición es una relación donde la clase 'todo' es responsable de la creación y destrucción de las partes (clase 'parte').");
        System.out.println("Una agregación es una relación donde la clase 'todo' es responsable de la creación de las partes (clase 'parte'), pero estas pueden existir independientemente de la clase 'todo'.");
    }
}