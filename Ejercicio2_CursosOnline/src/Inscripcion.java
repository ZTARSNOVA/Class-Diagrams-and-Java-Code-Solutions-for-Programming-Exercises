public class Inscripcion {
    public Estudiante estudiante;
    public Curso curso;

    public Inscripcion(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }
    public String detallesInscripcion() {
        return "Estudiante: " + estudiante.nombre + ", Curso: " + curso.nombre + ", Instructor: " + curso.instructor.nombre;
    }
}
