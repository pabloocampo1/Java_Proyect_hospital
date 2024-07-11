import java.util.ArrayList;

public class Patients {
    private ArrayList<Citas> historialMedico;
    private String name;
    private int age;
    private int identification;
    private static int id = 100000;

    //constructor for patients
    public Patients(String name, int age, int identification){
        this.name = name;
        this.age = age;
        this.identification =identification;
        this.historialMedico = new ArrayList<>();
        id++;
    }
    //getter para los datos principales
    public String getName(){
        return this.name;
    }

    public int getId(){
        return id;
    };
    //setter para los datos
    public void setName(String name){
        this.name = name;
    };

    public void setAge(int age){
        this.age = age;
    };

    public void setIdentification(int identification){
        this.identification = identification;
    };

    public void HisoryAppointments(){
        System.out.println("show clinical history");
    }
};