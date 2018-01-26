import java.util.ArrayList;
import java.util.Iterator;
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
            ArrayList<Coche> coches = new ArrayList<>();
            coches.addAll(listaDeCoches);
            Coche cochePrioridadMaxima = coches.get(0);
            for(int j = 0; j < listaDeCoches.size(); j++){
                int prioridadMaxima = 0;
                int posicion = 0;
                for(int i=0; i < coches.size(); i++) {
                    if(coches.get(i).getVelocidadMaxima() >= prioridadMaxima){
                        cochePrioridadMaxima = coches.get(i);
                        prioridadMaxima = coches.get(i).getVelocidadMaxima();
                        posicion = i;
                    }
                }
                System.out.println(cochePrioridadMaxima.devolverCaracteristicas());
                coches.remove(posicion);
            }
        }
    }

    /**
     * Mostrar coches ordenados por velocidad maxima
     */
    public void mostrarPorFechaDeFabricacion()
    {
        if(listaDeCoches.size()>0) {
            ArrayList<Coche> coches = new ArrayList<>();
            coches.addAll(listaDeCoches);
            Coche cochePrioridadMaxima = coches.get(0);
            for(int j = 0; j < listaDeCoches.size(); j++){
                int fechaMaxima = 0;
                int posicion = 0;
                for(int i=0; i < coches.size(); i++) {
                    if(coches.get(i).getAnoFabricacion() >= fechaMaxima){
                        cochePrioridadMaxima = coches.get(i);
                        fechaMaxima = coches.get(i).getAnoFabricacion();
                        posicion = i;
                    }
                }
                System.out.println(cochePrioridadMaxima.devolverCaracteristicas());
                coches.remove(posicion);
            }
        }
    }

    /**
     * Permita modificar al menos una de las características del objeto con el número 
     * identificativo indicado por el usuario.
     */
    public void cambiarVelocidad(int bastidor, int nuevaVelocidad)
    {
        if(bastidor >= 0 && bastidor < listaDeCoches.size()){
            Coche car = listaDeCoches.get(bastidor);
            car.setVelocidadMaxima(nuevaVelocidad);
        }
    }

    /**
     * Eliminar objetos por modelo
     */
    public void eliminarPorModelo(String modelos)
    {
        Iterator <Coche> it = listaDeCoches.iterator();
        while(it.hasNext()){
            if(it.next().getModelo().toLowerCase().equals(modelos.toLowerCase())){
                it.remove();
            }
        }
    }
}
