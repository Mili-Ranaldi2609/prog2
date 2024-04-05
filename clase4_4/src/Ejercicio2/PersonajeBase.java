package Ejercicio2;

public abstract class PersonajeBase implements Personaje{
    private String nombre;
    private int nivel;
    private int rpg;

    public PersonajeBase(String nombre,int nivel,int rpg) {
        this.nivel = nivel;
        this.nombre= nombre;
        this.rpg=rpg;
    }

    public int getRpg() {
        return rpg;
    }

    public void setRpg(int rpg) {
        this.rpg = rpg;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean estaVivo() {
        return rpg > 0;
    }
}
