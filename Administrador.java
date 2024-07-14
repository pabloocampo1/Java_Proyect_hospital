import java.util.ArrayList;
import java.util.Scanner;
class Administrador extends Person {
    private ArrayList<Doctors> Listadoctores = new ArrayList<>();
    private ArrayList<Patients> listaPacientes = new ArrayList<>();
    private ArrayList<Administrador> listAdmin = new ArrayList<>();
    private String rol;
    private String name;
    private int age;
    private String userName;
    private String password;
    private static int id = 233242;
    private Scanner input;
    

    // Constructor
    public Administrador(String name, int age){
        super(name, age);
        this.rol = "Admin";
        this.userName = "Admin"+Integer.toString(id);
        this.password = Integer.toString(id);
        id++; // id unico para cada administrador
        this.input = new Scanner(System.in);
    };

    public void showInfo(){
        System.out.println(this.userName+" - "+this.password + " - " + this.age + "- "+ this.name);
    }

    //metodo para unir los arrayList de los administradores que se pueden loguear
    @Override
    public void closeScanner() {
        if (input != null) {
            input.close();
        };
    };

    @Override
    public String getRol(){
        return this.rol;
    };

    //simulacion de login para tener diferentes funcionalidades.
    public void logIn(){

        boolean stateLogIn = true; //varibale para validar el estado del login
        ArrayList<Person> listMergeAdmins = new ArrayList<>(listAdmin);
        listMergeAdmins.addAll(Listadoctores);
        
        while (stateLogIn) {
            boolean credencialesValid = false;
            System.out.println("ingrese su nombre de usuario: ");
            String userName = input.nextLine();

            System.out.println("Ingrese su contraseña: ");
            String password = input.nextLine();

            for (Person user : listMergeAdmins) {
                if (user.getPassword().equals(password) && user.getUserName().equals(userName)) {
                    credencialesValid = true;
                    if(user.getRol().equals("Medico")){
                        menuDoctor(user);
                    }else if(user.getRol().equals("Admin")){
                        menuAdmin();
                    }
                }
            }


            if (!credencialesValid){
                System.out.println("Credenciales incorrectas");
            }
        }
    };


    public void menuDoctor(Person user){
        user.changeCredential();
    };


    public void menuAdmin () {

    };


    public static void main(String[] args) {
        Administrador admin = new Administrador("jaun", 23);
        Doctors doctors1 = new Doctors("juan carlos", 22, "carnicero");
        Doctors doctors2 = new Doctors("juan medina", 22, "perro");
        admin.Listadoctores.add(doctors1);
        admin.Listadoctores.add(doctors2);
        admin.listAdmin.add(admin);
        System.out.println(admin.x);
        admin.logIn();
    }
};
