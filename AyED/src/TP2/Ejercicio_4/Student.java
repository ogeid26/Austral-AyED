package TP2.Ejercicio_4;

public class Student {

    private String name, lastName, studentSection;
    private boolean isRegistered;
    private int id;

    // Builders
    public Student(String name, String lastName, int id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    // Modifiers
    public void register(){
        isRegistered = true;
    }
    public void unregister(){
        isRegistered = false;
    }

    public void addStudentSection(String section){
        if (isRegistered){
            studentSection = section;
        }
        else{throw new IllegalArgumentException("El estudiante no está registrado");}
    }
    public void deleteStudentSection(){
        studentSection = "";
    }

    //Analyzers
    public String getStudentSection() {
        return studentSection;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public boolean isRegistered() {
        return isRegistered;
    }
}
