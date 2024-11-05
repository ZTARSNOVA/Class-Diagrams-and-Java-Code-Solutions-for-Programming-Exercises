import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    public List<Inscripcion> inscripciones = new ArrayList<>();

    public Estudiante(String nombre) {
        super(nombre);
    }

    public void inscribirse(Curso curso) {
        Inscripcion inscripcion = new Inscripcion(this, curso);
        inscripciones.add(inscripcion);
    }
    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}
