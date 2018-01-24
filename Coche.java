
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

    /**
     * Constructor for objects of class Coche
     */
    public Coche()
    {
        marca = "";
        modelo = "";
        velocidadMaxima = 0;
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
}
