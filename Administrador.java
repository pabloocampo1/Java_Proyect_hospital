import java.util.ArrayList;;
public class Administrador {
    private ArrayList<Doctors> Listadoctores;
    private ArrayList<Patients> listaPacientes;
    private String rol;
    private String userName;
    private String password;
    private static int id = 233242;
    

    // Constructor
    public Administrador(){
        this.rol = "Admin";
        this.userName = "Admin"+Integer.toString(id);
        this.password = Integer.toString(id);
        this.Listadoctores = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
        id++; // id unico para cada administrador
    };
};
