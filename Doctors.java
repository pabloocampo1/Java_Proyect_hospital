
import java.util.Scanner;

class Doctors extends Person {
    // creacion del constructos y atributos de los doctores
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
        System.out.println("Nombre: "+ getName());
        System.out.println("Edad: "+ getAge());
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


    public void setSpecialty(String newspecialty){
        this.specialty = newspecialty;
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