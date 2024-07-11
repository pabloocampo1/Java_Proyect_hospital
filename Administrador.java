
public class Administrador {
    private String rol;
    private String userName;
    private String password;
    private static int id = 233242;
    

    // constructor
    public Administrador(){
        this.rol = "Admin";
        this.userName = "Admin"+Integer.toString(id);
        this.password = Integer.toString(id);
        id++; // id unico para cada administrador
    };
}
