import java.util.ArrayList;
/**
 * Write a description of class Concesionario here.
 * 
 * @author (Gian Carlo) 
 * @version (24/01/2018)
 */
public class Concesionario
{
    // instance variables
    private ArrayList <Coche> listaDeCoches;
    int bastidor;

    /**
     * Constructor for objects of class Concesionario
     */
    public Concesionario()
    {
        // initialise instance variables
        listaDeCoches = new ArrayList<Coche>();
        bastidor = 0;
    }

    /**
     * Añade un coche
     */
    public void addCoche(String marca, String modelo, int velocidadMaxima, int anoFabricacion)
    {
        Coche nuevoCoche = new Coche(marca, modelo, velocidadMaxima, anoFabricacion, bastidor);
        listaDeCoches.add(nuevoCoche);
        bastidor ++;
    }
}
