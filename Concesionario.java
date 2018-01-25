
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

    /**
     * Mostrar coches con sus caracteristicas
     */
    public void mostrarCoches()
    {
        int posicion = 0;
        while (posicion < listaDeCoches.size()) {
            System.out.println(listaDeCoches.get(posicion).devolverCaracteristicas());
            posicion++;
        }
    }

    /**
     * Mostrar coches ordenados por velocidad maxima
     */
    public void mostrarPorVelocidad()
    {
        if(listaDeCoches.size()>0) {
            ArrayList<Coche> Coches = new ArrayList<>();
            Coches.addAll(listaDeCoches);
            Coche cochePrioridadMaxima = Coches.get(0);
            for(int j = 0; j < listaDeCoches.size(); j++){
                int prioridadMaxima = 0;
                int posicion = 0;
                for(int i=0; i < Coches.size(); i++) {
                    if(Coches.get(i).getVelocidadMaxima() >= prioridadMaxima){
                        cochePrioridadMaxima = Coches.get(i);
                        prioridadMaxima = listaDeCoches.get(i).getVelocidadMaxima();
                        posicion = i;
                    }
                }
                System.out.println(cochePrioridadMaxima.devolverCaracteristicas());
                Coches.remove(posicion);
            }
        }
    }

    /**
     * Mostrar coches ordenados por velocidad maxima
     */
    public void mostrarPorFechaDeFabricacion()
    {
        if(listaDeCoches.size()>0) {
            ArrayList<Coche> Coches = new ArrayList<>();
            Coches.addAll(listaDeCoches);
            Coche cochePrioridadMaxima = Coches.get(0);
            for(int j = 0; j < listaDeCoches.size(); j++){
                int fechaMaxima = 0;
                int posicion = 0;
                for(int i=0; i < Coches.size(); i++) {
                    if(Coches.get(i).getAnoFabricacion() >= fechaMaxima){
                        cochePrioridadMaxima = Coches.get(i);
                        fechaMaxima = listaDeCoches.get(i).getAnoFabricacion();
                        posicion = i;
                    }
                }
                System.out.println(cochePrioridadMaxima.devolverCaracteristicas());
                Coches.remove(posicion);
            }
        }
    }
    
    /**
     * Permita modificar al menos una de las características del objeto con el número 
     * identificativo indicado por el usuario.
     */
    public void cambiarVelocidad(int bastidor, int nuevaVelocidad)
    {
        Coche car = listaDeCoches.get(bastidor);
        car.setVelocidadMaxima(nuevaVelocidad);
    }
}
