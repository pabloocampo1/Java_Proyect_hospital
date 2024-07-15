import java.util.ArrayList;
import java.util.Scanner;

public class managementHospital {
    static ArrayList<Doctors> Listadoctores = new ArrayList<>();
    private ArrayList<Patients> listaPacientes = new ArrayList<>();
    private ArrayList<Administrador> listAdmin = new ArrayList<>();
    boolean stateLogIn = true;
    private Scanner input;


    public managementHospital(){
        this.input = new Scanner(System.in);
    }

    public void logIn(){
        //varibale para validar el estado del login
        ArrayList<Person> listMergeAdmins = new ArrayList<>(listAdmin);
        listMergeAdmins.addAll(Listadoctores);

        while (stateLogIn) {
            System.out.println("_______LOGIN_________");
            boolean credencialesValid = false;
            System.out.println("ingrese su nombre de usuario: ");
            String userName = input.nextLine();

            System.out.println("Ingrese su contraseña: ");
            String password = input.nextLine();

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
        System.out.println("Bienvenido, "+ user.getName());;
        while (true) {
            System.out.println(" 1. Ver  ");
            break;
        }
    };


    public void menuAdmin (Administrador user) {
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println(" 1. Gestion de Doctores\n 2. Gestion de pacientes\n 3. gestion de citas\n 4. Cerrar sesion");
            try {
                System.out.println("Elige una opcion: ");
                int option = input.nextInt();
                input.nextLine();
                switch (option) {
                    case 1:
                        doctorsManagement(user);
                        break;
                    case 2:
                        patientsManagement();
                        isMenuActive = false;
                        break;
                    case 3:
                        appointmentsManagement();
                        isMenuActive = false;
                        break;
                    case 4:
                        isMenuActive = false;
                        break;
                
                    default:
                        System.out.println("tu opcion no valida");
                };
            } catch (Exception e) {
                System.out.println("agregaste una opcion no valida");
                input.nextLine();
            }
            
        }
    };


    public void doctorsManagement(Administrador user) {
        boolean isMenuActiveDoctor = true;
        while (isMenuActiveDoctor) {
            System.out.println("____________-Menu - Doctors Management____________");
            System.out.println(" 1. Agregar doctores\n 2.Editar datos\n 3. Eliminar doctor\n 4. Buscar doctor\n 5. Listar todos los doctores\n 6. salir al menu");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    user.addDoctor();
                    break;
                case 5:
                    user.AllDoctor();
                    break;
                case 6:
                    isMenuActiveDoctor = false;
                    break;
            
                default:
                    System.out.println("Opcion no validad");
                    break;
            }
        }

    };

    public void patientsManagement() {
        while (true) {
            System.out.println("1. Agregar doctores");
        }
    }
    public void appointmentsManagement() {
        while (true) {
            System.out.println("1. Agregar doctores");
        }
    }

    public static void main(String[] args) {
        managementHospital superAdmin = new managementHospital();
        Administrador admin = new Administrador("j", 23, 333);
        superAdmin.listAdmin.add(admin);
        superAdmin.logIn();
    }
}


