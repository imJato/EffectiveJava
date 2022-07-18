package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Divisiones{

    private UUID id;
    private String nombre;
    private double porcentaje;

    public Divisiones(){}

    public Divisiones(UUID id, String nombre, double porcentaje) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    };

    public static CharSequence getPresupuesto(List<Divisiones> lDivisiones, double valor){
        StringBuilder result = new StringBuilder(100);
        for(int i=0; i<lDivisiones.size(); i++){
            result.append(lDivisiones.get(i).nombre)
                    .append(" = ")
                    .append((valor * (lDivisiones.get(i).porcentaje/100)))
                    .append("\n");
        }
        return result;
    }
    
    
    public static List<Divisiones> getDivisiones() {
        List<Divisiones> listaDivisiones = new ArrayList<Divisiones>();
        listaDivisiones.add(new Divisiones(UUID.randomUUID(), "Ahorro",50.00));
        listaDivisiones.add(new Divisiones(UUID.randomUUID(), "Gastos",20.00));
        listaDivisiones.add(new Divisiones(UUID.randomUUID(), "Inversion",15.00));
        listaDivisiones.add(new Divisiones(UUID.randomUUID(), "Gustos",15.00));

        return listaDivisiones;
    }

    @Override
    public String toString() {
        return "Divisiones [id=" + id + ", nombre=" + nombre + ", porcentaje=" + porcentaje + "]";
    }

}