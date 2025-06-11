package Sistema; 
import java.util.List;
public class PersonalAcademico extends Usuario {
    protected List<Indicente> indicentes;
    public void reportarError(String email, String contenido) {}
    public void solicitarAsesoramientoDelSistema(String email, String contenido) {}
    public void comentarEnForo(Foro foro, String comentario) {}
}