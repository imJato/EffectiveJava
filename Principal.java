import java.util.List;
import java.util.UUID;

import models.Divisiones;
import models.Gastos;
import models.Ingresos;

public class Principal {
    public static void main(String... args) {
        List<Divisiones> listaDivisiones = Divisiones.getDivisiones();
        List<Gastos> listaGastos = Gastos.getGastos();
        if(!(listaDivisiones.isEmpty() || listaGastos.isEmpty()))
        System.out.println(Ingresos.sacarPrespuesto(listaGastos, listaDivisiones, new Ingresos(UUID.randomUUID(), 7, 36000)));
        
    }
}
