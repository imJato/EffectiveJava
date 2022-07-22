package models;

import java.util.List;
import java.util.UUID;

/**
 * 
 * Clase encargada del manejo de los ingresos de la aplicacion
 * 
 * @author Pedro Jairo Mateo
 * @since 19/07/2022
 * @version 1.0.0
 * 
 */
public class Ingresos {
    
    private UUID id;
    private int mes;
    private double monto;

    public Ingresos(UUID id, int mes, double monto) {
        this.id = id;
        this.mes = mes;
        this.monto = monto;
    }

    public static CharSequence sacarPrespuesto(List<Gastos> lGastos, List<Divisiones> lDivisiones, Ingresos ingresos){
        
        double neto = ingresos.monto - Gastos.sumaGastos(lGastos);
        if(neto<=0)
        return "No hay queda dinero para presupuestar.";

        return Divisiones.getPresupuesto(lDivisiones, neto);
    }
    @Override
    public String toString() {
        return "Ingresos [id=" + id + ", mes=" + mes + ", monto=" + monto + "]";
    }

}
