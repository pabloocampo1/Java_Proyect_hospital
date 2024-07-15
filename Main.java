import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Doctors> Listadoctores = new ArrayList<>();
    private ArrayList<Patients> listaPacientes = new ArrayList<>();
    private ArrayList<Administrador> listAdmin = new ArrayList<>();
    boolean stateLogIn = true;
    private Scanner input;


    public Main(){
        this.input = new Scanner(System.in);
    }

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
        System.out.println("Bienvenido, "+ user.getName());;
        user.showInfo();
    };


    public void menuAdmin (Administrador user) {
        while (true) {
            System.out.println("hellooo");
            user.changeCredential();
            break;
        }
    };

    public static void main(String[] args) {
        Main superAdmin = new Main();
        superAdmin.logIn();
    }
}
