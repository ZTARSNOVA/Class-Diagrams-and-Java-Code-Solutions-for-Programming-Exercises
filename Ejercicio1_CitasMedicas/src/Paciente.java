import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {
    public String nombrePaciente;

    List<Cita> citas = new ArrayList<>();

    public Paciente(String nombrePaciente){
        this.nombrePaciente = nombrePaciente;
    }

    public void agendarCita(String fechaDeCita, Date crearCita, Medico medico) {
        Cita cita = new Cita(fechaDeCita,crearCita, this, medico);
        citas.add(cita);
    }

    public List<Cita> getCitas() {
        return citas;
    }

}
