package Sistema;

public class Usuario{
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