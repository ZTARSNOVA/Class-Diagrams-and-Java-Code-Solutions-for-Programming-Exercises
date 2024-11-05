import java.util.ArrayList;
import java.util.List;

public class Instructor extends Persona {
    public List<Curso> cursos = new ArrayList<>();

    public Instructor(String nombre) {
        super(nombre);
    }

    public Curso crearCurso(String nombreCurso, int duracion, double costo) {
        Curso curso = new Curso(nombreCurso, duracion, costo, this);
        cursos.add(curso);
        return curso;
    }
}
