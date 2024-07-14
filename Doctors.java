
import java.util.Scanner;

class Doctors extends Person {
    // creacion del constructos y atributos de los doctores
    private String name;
    private int age;
    private String specialty;
    private String rol;
    
    
    //Scanner para obtener los datos
    private Scanner input;

    // constructor
    public Doctors(String name, int age, String specialty){
        super(name, age);
        this.specialty = specialty;
        this.input = new Scanner(System.in);
        this.rol = "Medico";
    };
    // metodo abstracto de la clase Person
    @Override
    public void showInfo(){
        System.out.println("Nombre: "+ this.name);
        System.out.println("Edad: "+ this.age);
        System.out.println("Specialty: "+ this.specialty);
    };



    //getter especiales para  doctores
    @Override
    public String getRol(){
        return this.rol;
    };
    
    public String getSpecialty(){
        return this.specialty;
    };

    //metodo para cambiar los valores de los atributos

    public void setName(String newName){
        this.name = newName;
    };

    public void setAge(int newAge){
        this.age = newAge;
    };

    public void setSpecialty(String newspecialty){
        this.specialty = newspecialty;
    };


    //metodo para obligar al nuevo usuario a cambiar las credenciales
    public void mensegeWelcome(){
        System.out.println("Bienvenido," + name + "debes de cambiar sus credenciales.");
        changeCredential();
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