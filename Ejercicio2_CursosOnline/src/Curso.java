public class Curso {
    public String nombre;
    public int duracion;
    public double costo;
    public Instructor instructor;

    public Curso(String nombre, int duracion, double costo, Instructor instructor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.costo = costo;
        this.instructor = instructor;
    }
}
