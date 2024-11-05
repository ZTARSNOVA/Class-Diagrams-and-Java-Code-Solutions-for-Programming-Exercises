import java.util.Date;

public class Main {
    public static void main(String [] args){
        Paciente paciente1 = new Paciente("Camila Zúñiga");
        Medico medico1 = new Medico("Dr. Rodríguez");
        Date crearCita1 = new Date();

        paciente1.agendarCita("2024-12-7",crearCita1, medico1);

        System.out.println(paciente1.getCitas().get(0).detallesCita());
    }
}
