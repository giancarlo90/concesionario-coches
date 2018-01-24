
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Coche
     */
    public Coche(String marca, String modelo, int velocidadMaxima, int anoFabricacion)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * Metodo para establecer la marca.
     */
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    /**
     * Metodo que devuelve la marca.
     */
    public String getMarca()
    {
        return marca;
    }
    
    /**
     * Metodo para establecer la marca.
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    /**
     * Metodo que devuelve la modelo.
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * Metodo para establecer la marca.
     */
    public void setVelocidadMaxima(int velocidadMaxima)
    {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    /**
     * Metodo que devuelve la marca.
     */
    public int getVelocidadMaxima()
    {
        return velocidadMaxima;
    }
     
    /**
     * Metodo para establecer la marca.
     */
    public void setAnoFabricacion(int anoFabricacion)
    {
        this.anoFabricacion = anoFabricacion;
    }
    
    /**
     * Metodo que devuelve la marca.
     */
    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }
    
    /**
     * Imprimir por pantalla las caracteristicas.
     */
    public void caracteristicasCoche()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima + "km/h");
        System.out.println("Año de fabricacion: " + anoFabricacion);
    }
    
}
