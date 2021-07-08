package co.edu.utp.misiontic2022.reto1;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       RenProyec Analisis1 = new RenProyec(5, 1000000.0, 7.5);
        System.out.println(Analisis1.calcularInteresSimple());
        System.out.println(Analisis1.calcularInteresCompuesto());
        System.out.println(Analisis1.analisisInversion());

        RenProyec Analisis2 = new RenProyec(0, 20000000.0, 10.0);
        System.out.println(Analisis2.calcularInteresSimple());
        System.out.println(Analisis2.calcularInteresCompuesto());
        System.out.println(Analisis2.analisisInversion());

        RenProyec Analisis3 = new RenProyec(3, 15000000.0, 0.0);
        System.out.println(Analisis3.calcularInteresSimple());
        System.out.println(Analisis3.calcularInteresCompuesto());
        System.out.println(Analisis3.analisisInversion());

        RenProyec Analisis4 = new RenProyec();
        System.out.println(Analisis4.calcularInteresSimple());
        System.out.println(Analisis4.calcularInteresCompuesto());
        System.out.println(Analisis4.analisisInversion(2, 50000000.0, 6.2));

        RenProyec Analisis5 = new RenProyec(2, 50000000.0, 6.2);
        System.out.println(Analisis5.calcularInteresSimple());
        System.out.println(Analisis5.calcularInteresCompuesto());
        System.out.println(Analisis5.analisisInversion());

    }
    
}

