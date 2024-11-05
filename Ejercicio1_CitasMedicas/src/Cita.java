import java.util.Date;

public class Cita {
    public String fechaDeCita;
    public Date crearCita;
    public Paciente paciente;
    public Medico medico;


    public Cita(String fechaDeCita, Date crearCita, Paciente paciente, Medico medico) {
        this.fechaDeCita = fechaDeCita;
        this.crearCita = new Date();
        this.paciente = paciente;
        this.medico = medico;

    }
    public String detallesCita() {
        return "Cita creada el " + crearCita + " con " + medico.getNombre() + " para " + paciente.nombrePaciente + " el dia " + fechaDeCita;
    }

}
