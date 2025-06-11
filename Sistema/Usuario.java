package Sistema;
import java.util.List;

public class Usuario{
    protected List<Indicente> incidentes;
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    protected boolean login(){
        return true;
    }

    protected boolean logOut(){
        return false;
    }
}