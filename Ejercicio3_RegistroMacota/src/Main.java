import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Dueño dueño1 = new Dueño("Camila Zúñiga");
                Mascota mascota1 = new Mascota("Laika", "Perro", 10, dueño1);
                Date crearCita1 = new Date();

                mascota1.agendarCita("2024-12-7", crearCita1);

                // Mostrar detalles de las citas
                System.out.println(mascota1.getCitas().get(0).detallesCita());
    }
}