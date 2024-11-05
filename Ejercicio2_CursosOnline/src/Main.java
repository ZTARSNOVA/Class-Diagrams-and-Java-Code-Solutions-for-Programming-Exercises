public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Roberto Josué Rodríguez Urquiaga");
        Curso curso1 = instructor1.crearCurso("Programación orientada a objetos I", 128, 200.0);

        Estudiante estudiante1 = new Estudiante("Camila Zúñiga");
        estudiante1.inscribirse(curso1);


        // Mostrar detalles de las inscripciones
        for (Inscripcion inscripcion : estudiante1.getInscripciones()) {
            System.out.println(inscripcion.detallesInscripcion());
        }
    }
}