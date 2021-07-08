package co.edu.utp.misiontic2022.reto1;
/**
 *  Universidad Tecnológica de Pereira <br> 
 *  (Pereira, Risaralda - Colombia) 
 *  */

public class RenProyec {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    private int tiempo;
    private double capital;
    private double interes;
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye el proyecto. <br>
     * <b>post: </b> Se creó un nuevo proyecto con los siguientes valores: <br>
     * Proyecto: UTP.
     */
	public RenProyec( ) 
    {
		this.tiempo = 0;
        this.capital = 0.0;
        this.interes = 0.0;
    }

    public RenProyec(Integer Tiempo, Double Capital, Double Interes) 
    {
        this.tiempo = Tiempo;
        this.capital = Capital;
        this.interes = Interes;
    }

	/**
     * Retorna el interes simple, monto, capital en una cadena de texto.
     * @return El total de interes simples generados en número.
     */
    public double calcularInteresSimple()
    {
        double interesSimple= this.capital * (this.interes / 100) * this.tiempo;

        return Math.round(interesSimple);
    }
    
    
    /**
     * Retorna el interes compuesto, monto, capital en una cadena de texto.
     * @return El total de interes compuestos generados en número.
     */
    public double calcularInteresCompuesto( )
    {
        double interesCompuesto= this.capital * ( Math.pow( 1 + ( this.interes / 100 ), this.tiempo ) - 1 );

        return Math.round(interesCompuesto);
    }
    
    /**
     * Método para Analizar entre el tipo de interes generados para el proyecto.
     * @return Respuesta al Reto.
     */
     	
    public String analisisInversion(int Tiempo, double Capital, double Interes)
    {
        this.tiempo = Tiempo;
        this.capital = Capital;
        this.interes = Interes;
        
        /* Cálculo de la diferencia entre tipos de tasas */
    	double diferencia = calcularInteresCompuesto( ) - calcularInteresSimple( );
        if ( diferencia>0)
        {    		
        	return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;  
        }
    	else 
	    {    		        	
        	return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
	    }
    }
    public String analisisInversion()
    {
        double diferencia = calcularInteresCompuesto( ) - calcularInteresSimple( );
        if ( diferencia>0)
        {    		
        	return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;  
        }
    	else 
	    {    		        	
        	return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
	    }

    }
}
