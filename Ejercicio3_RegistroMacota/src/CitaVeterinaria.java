import java.util.Date;

public class CitaVeterinaria {
    public String fechaDeCita;
    public Date crearCita;
    public Mascota mascota;

    public CitaVeterinaria(String fechaDeCita, Date crearCita, Mascota mascota) {
        this.fechaDeCita = fechaDeCita;
        this.crearCita = new Date();
        this.mascota = mascota;
    }

    public String detallesCita() {
        return "Cita creada el " + crearCita + " para la mascota " + mascota.nombre + " (propietario: " + mascota.dueño.nombreDueño + ") el día " + fechaDeCita;
    }
}
