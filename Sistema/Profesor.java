package Sistema;
import java.util.List;
// comentario
public class Profesor extends PersonalAcademico {
    private List<Curso> cursosACargo;
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividad) {}
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividad) {}
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {}
    public void crearNuevoForo(Foro foro) {}
}