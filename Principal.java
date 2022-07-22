import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import models.Divisiones;
import models.Gastos;
import models.Ingresos;

public class Principal {
    public static void main(String... args) {
        List<Divisiones> listaDivisiones = Divisiones.getDivisiones();
        List<Gastos> listaGastos = Gastos.getGastos();
        String salida= "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el ingreso a presupuestar: ");
        Integer ingreso = sc.hasNextInt() ? Integer.valueOf(sc.next()) : 0;
        if (ingreso instanceof Integer && !ingreso.equals(0)) {
            if (!(listaDivisiones.isEmpty() || listaGastos.isEmpty()))
            salida = Ingresos.sacarPrespuesto(listaGastos, listaDivisiones,
            new Ingresos(UUID.randomUUID(), LocalDate.now().getMonthValue(), ingreso)).toString();
                System.out.println(salida);
        } else {
            System.err.println("El valor introducido no es valido");
        }
        sc.close();
    }
}
