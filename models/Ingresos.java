package models;

import java.util.List;
import java.util.UUID;

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
        return "No hay a que presupuestar mi rey, estas en 0";

        return Divisiones.getPresupuesto(lDivisiones, neto);
    }
    @Override
    public String toString() {
        return "Ingresos [id=" + id + ", mes=" + mes + ", monto=" + monto + "]";
    }

}
