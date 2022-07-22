package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
/**
 * 
 * Clase encargada del manejo de los gastos de la aplicacion
 * 
 * @author Pedro Jairo Mateo
 * @since 19/07/2022
 * @version 1.0.0
 * 
 */
public class Gastos{
    
    private UUID id;
    private String nombre;
    private double monto;
    
    public Gastos( UUID id, String nombre, double monto){
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
    };

    public static double sumaGastos(List<Gastos> listaGastos){
        if(listaGastos.isEmpty())
        return 0.00;

        return listaGastos.stream().map(e -> e.monto).collect(Collectors.summingDouble(Double::doubleValue));
    }
    
    public static List<Gastos> getGastos() {
        List<Gastos> listaGastos = new ArrayList<Gastos>();
        listaGastos.add(new Gastos(UUID.randomUUID(), "Gym",1500));
        listaGastos.add(new Gastos(UUID.randomUUID(), "Telefono",2600));
        listaGastos.add(new Gastos(UUID.randomUUID(), "Luz",5000));
        listaGastos.add(new Gastos(UUID.randomUUID(), "Barberia",1600));
        listaGastos.add(new Gastos(UUID.randomUUID(), "Prestamo",7900));
        return listaGastos;
    }

    @Override
    public String toString() {
        return "Gastos [id=" + id + ", monto=" + monto + ", nombre=" + nombre + "]";
    }
}