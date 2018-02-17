import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
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
    public Concesionario(String txt)
    {
        // initialise instance variables
        listaDeCoches = new ArrayList<Coche>();
        introducirDatos(txt);
        bastidor = 0;
    }

    private void introducirDatos(String datos)
    {
        try {
            File archivo = new File(datos + ".txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] arrayStrings = sc.nextLine().split(" #");
                addCoche(arrayStrings[0],arrayStrings[1],Integer.parseInt(arrayStrings[2]),Integer.parseInt(arrayStrings[3]));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

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

    /**
     * Metodo para agrupar los coches por año de fabricacion
     */
    public void imprimirAgrupadosPorFecha()
    {
        ArrayList<Coche> coches = new ArrayList<>();
        ArrayList<Integer> fechas = new ArrayList<>();
        coches.addAll(listaDeCoches);
        // Bucles para encontrar la distintas fechas y ordenarlas
        for(int j = 0; j < listaDeCoches.size(); j++){
            int fechaMaxima = 0;
            for(int i=0; i < coches.size(); i++) {
                if(coches.get(i).getAnoFabricacion() >= fechaMaxima){
                    fechaMaxima = coches.get(i).getAnoFabricacion();
                }
                fechas.add(fechaMaxima);
                for(int k=0; k < coches.size(); k++){
                    if(coches.get(k).getAnoFabricacion() == fechaMaxima){
                        coches.remove(k);
                        k--;
                    }
                }
            }
        }
        //Bucles para agrupar e imprimir ordenados por marca
        for(int i=0; i < fechas.size(); i++){
            System.out.println(fechas.get(i));
            for(int k = 0; k < listaDeCoches.size(); k++){
                if(listaDeCoches.get(k).getAnoFabricacion() == fechas.get(i)){
                    coches.add(listaDeCoches.get(k));
                }
            }
            Collections.sort(coches, new Comparator<Coche>(){

                    @Override
                    public int compare(Coche o1, Coche o2) {
                        return o1.getMarca().compareTo(o2.getMarca());
                    }

                });
            for(Coche coche : coches){
                System.out.println(coche.devolverCaracteristicas());
            }
            coches.clear();
        }
    }
}
