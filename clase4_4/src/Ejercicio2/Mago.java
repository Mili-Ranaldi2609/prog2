package Ejercicio2;

public class Mago extends PersonajeBase {
    private int daño;
    private int defensa;

    public Mago(String nombre, int nivel,int rpg,int daño,int defensa) {
        super(nombre, nivel,rpg);
        this.daño=daño;
        this.defensa=defensa;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public int defender(int daño) {
        int  uncuarto= daño/4;
        int dañoReduccido = daño -uncuarto;
        // Aplicar defensa adicional
        dañoReduccido -= this.defensa;

        if (dañoReduccido > 0) {
            int r=this.getRpg();
            r-= dañoReduccido;
            this.setRpg(r);
            System.out.println(getNombre() + " ha recibido " + dañoReduccido + " puntos de daño.");
        } else {
            System.out.println(getNombre() + " ha bloqueado todo el daño.");
        }
        return dañoReduccido;
    }

    @Override
    public int atacar() {
        int ataque = daño * this.getNivel();
        return ataque;
    }
}
