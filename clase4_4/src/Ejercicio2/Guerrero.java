package Ejercicio2;

public class Guerrero extends PersonajeBase{
    private int daño;
    private int defensa;

    public Guerrero(String nombre, int nivel,int rpg,int daño,int defensa) {
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
        int  d= (daño+getNivel())/2;
        int dañoTotal = daño -d;
        // Aplicar defensa adicional
        dañoTotal -= this.defensa;

        if (dañoTotal > 0) {
            int r=this.getRpg();
            r -= dañoTotal;
            this.setRpg(r);
            System.out.println(getNombre() + " ha recibido " + dañoTotal + " puntos de daño.");
        } else {
            System.out.println(getNombre() + " ha bloqueado todo el daño.");
        }
        return dañoTotal;
    }

    @Override
    public int atacar() {
        int ataque = (daño * this.getNivel())/2;
        return ataque;
    }
}
