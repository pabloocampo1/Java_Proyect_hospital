import java.util.InputMismatchException;
import java.util.Scanner;

public class Doctors {
    // creacion del constructos y atributos de los doctores
    private String name;
    private int age;
    private String especialidad;
    private static int id = 0;
    private String rol;
    private String userName = this.name;
    private String password = Integer.toString(id);

    //Scanner para obtener los datos
    private Scanner input;

    // constructor
    public Doctors(String name, int age, String especialidad, String userName){
        this.name =name;
        this.age = age;
        this.especialidad = especialidad;
        this.input = new Scanner(System.in);
        this.rol = "Medico";
        id++; // id unico para cada Doctor
    };

    // metodo para obtener el nombre y la edad
    public String getName(){
        return this.name;
    };

    public int getAge(){
        return this.age;
    };

    public String getEspecialidad(){
        return this.especialidad;
    };

    //metodo para cambiar los valores de los atributos

    public void setName(String newName){
        this.name = newName;
    };

    public void setAge(int newAge){
        this.age = newAge;
    };

    public void setEspecialidad(String newEspecialidad){
        this.especialidad = newEspecialidad;
    };
    
    //metodo para obtener toda la informacion.
    public void getInfo(){
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("id: " + id);
    };

    //metodo para obligar al nuevo usuario a cambiar las credenciales
    public void mensegeWelcome(){
        System.out.println("Bienvenido," + name + "debes de cambiar sus credenciales.");
        changeCredential();
    };

    //metodo para cambiar las credenciales del objecto doctor
    public void changeCredential(){
        while (true) {
            try {
                System.out.println("1. Cambiar nombre de usuario -- 2.Cambiar contraseña -- 3.cambiar nombre de usuario y contraseña -- 4. salir");
                int opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese su nuevo nombre.");
                        String newUserName = input.next();
                        this.userName = newUserName;
                        break;

                    case 2:
                        System.out.println("Ingrese la nueva contraseña.");
                        String newPassword = input.next();
                        this.password = newPassword;
                        System.out.println("Se edito la contraseña correctamente.");
                        break;
                    case 3:
                        System.out.println("Ingrese su nuevo nombre.");
                        String newUserName1 = input.next();
                        this.userName = newUserName1;

                        System.out.println("Ingrese la nueva contraseña.");
                        String newPassword1 = input.next();
                        this.password = newPassword1;
                        System.out.println("Se edito la contraseña correctamente.");
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Opcion incorrecta, intentalo nuevamente");
                };
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                input.next();
            };
        }
    };

    // Método para cerrar el Scanner
    public void closeScanner() {
        if (input != null) {
            input.close();
        };
    };

    //metodo para listar todos los pacientes de cada doctor.

    public void allPatients(){
        //sin asignar
    };
};