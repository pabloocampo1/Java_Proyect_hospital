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
    private Scanner input;
    boolean stateLogIn = true;
    

    // Constructor
    public Administrador(String name, int age){
        super(name, age);
        this.rol = "Admin";
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

        //varibale para validar el estado del login
        ArrayList<Person> listMergeAdmins = new ArrayList<>(listAdmin);
        listMergeAdmins.addAll(Listadoctores);

        
        while (stateLogIn) {
            boolean credencialesValid = false;
            System.out.println("ingrese su nombre de usuario: ");
            String userName = input.nextLine();

            System.out.println("Ingrese su contraseña: ");
            String password = input.nextLine();

            for (Person user : listMergeAdmins) {
                System.out.println(user.getPassword());
            }

            for (Person user : listMergeAdmins) {
                if (user.getPassword().equals(password) && user.getUserName().equals(userName)) {
                    credencialesValid = true;
                    if(user instanceof Doctors){
                        Doctors doctor = (Doctors) user;
                        menuDoctor(doctor);
                    }else if(user instanceof Administrador){
                        Administrador administrador = (Administrador) user;
                        menuAdmin(administrador);
                    }
                }
            }


            if (!credencialesValid){
                System.out.println("Credenciales incorrectas");
            }
        }
    };


    public void menuDoctor(Doctors user){
        System.out.println("Bienvenido, "+ user.getName());
        
    };


    public void menuAdmin (Administrador user) {
        while (true) {
            System.out.println(" 1. Agregar doctor\n 2. Editar datos del doctor\n 3. Eliminar doctor\n 4. Buscar Doctor\n 5. Ver todos los doctores\n 6. Agregar un paciente\n 7.ggf");
            break;
        }
    };


    public static void main(String[] args) {
        Administrador admin = new Administrador("jaun", 23);
        
        admin.menuAdmin(admin);
    };
};
