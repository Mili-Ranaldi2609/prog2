public class Main {
    public static void main(String[] args) {
        Oficial of1= new Oficial("Matias Jofre",10,44437603,"Recursos humanos",234000);
        Tecnico tec1= new Tecnico("Mauricio Fernandez",6,2345678,"Datos",150000);
        Directivo di1= new Directivo("Lucas Rodriguez",56,"Director de Marketing");
        Operario op1= new Operario("Jose Martines",9,443567776);

        System.out.println(of1.toString());
        of1.sueldoEmpl();
        System.out.println("---------------------------------------------------");
        System.out.println(tec1.toString());
        tec1.antgSdo();
        System.out.println("---------------------------------------------------");
        System.out.println(di1.toString());
        di1.seJubila();
        System.out.println("---------------------------------------------------");
        System.out.println(op1.toString());
        op1.tiempoAnt();

    }
}