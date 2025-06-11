package Sistema;
import java.util.List;

public class Curso {
    private List<ActividadSumativa> actividadSumativas;
    private List<Foro> foros;
    private Profesor responsable;
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    private String id;
    private String nombre;
    private boolean estadoDisponible;
}
