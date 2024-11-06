import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;
    public Dueño dueño;

    List<CitaVeterinaria> citas = new ArrayList<>();

    public Mascota(String nombre, String especie, int edad, Dueño dueño) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.dueño = dueño;
    }

    public void agendarCita(String fechaDeCita, Date crearCita) {
        CitaVeterinaria cita = new CitaVeterinaria(fechaDeCita, crearCita, this);
        citas.add(cita);
    }

    public List<CitaVeterinaria> getCitas() {
        return citas;
    }
}