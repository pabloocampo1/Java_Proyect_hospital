import java.util.ArrayList;
import java.util.Scanner;
public class Administrador {
    private ArrayList<Doctors> Listadoctores;
    private ArrayList<Patients> listaPacientes;
    private String rol;
    private String userName;
    private String password;
    private static int id = 233242;
    private Scanner input;
    

    // Constructor
    public Administrador(){
        this.rol = "Admin";
        this.userName = "Admin"+Integer.toString(id);
        this.password = Integer.toString(id);
        this.Listadoctores = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
        id++; // id unico para cada administrador

        this.input = new Scanner(System.in);
    };

    public void getInformation(){
        System.out.println(this.userName+" - "+this.password );
    }
    //metodo para cambiar las credenciales
    public void changeCredentials(){
        Boolean state = true;
        while (state) {
            System.out.println("que quieres cambiar? 1. nombre de usuario -- 2. contraseña");
            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    String copyUserName = this.userName;
                    while (true) {

                        System.out.println("Ingrese el nuevo nombre de usuario");
                        String newUserName = input.nextLine();
                        
                        if (newUserName.equals(copyUserName)){
                            System.out.println("agregaste el mismo nombre de usuario, intenta otro nombre");
                        }else{
                            this.userName = newUserName;
                            System.out.println("se cambio el nombre correctamente");
                            state = false;
                            break;
                        }
                        
                    }
                    break;
                case 2:
                    String copyPassword = this.password;
                    while (true) {
                        System.out.println("Ingrese la nueva contraseña.");
                        String newPassword = input.nextLine();
                        if (newPassword.equals(copyPassword)){
                            System.out.println("agregaste la misma contraseña, intenta otra.");
                        }else{
                            this.password = newPassword;
                            System.out.println("se cambio la contraseña correctamente");
                            state = false;
                            break;
                        }
                    }
                    break;
            
                default:
                    break;
            }
            
        }
    };


    public void closeScanner() {
        if (input != null) {
            input.close();
        };
    };


    public static void main(String[] args) {
        Administrador admin = new Administrador();

        admin.getInformation();
        admin.changeCredentials();
        admin.getInformation();
    }
};
