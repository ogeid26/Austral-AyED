package TP2.Ejercicio_4;

public class Student {

    private String name, lastName, id, studentSection;
    private boolean isRegistered;

    // Builders
    public Student(String name, String lastName, String id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    // Modifiers
    private void register(){
        isRegistered = true;
    }
    private void unregister(){
        isRegistered = false;
    }

    public void addStudentSection(String section){
        if (isRegistered){
            studentSection = section;
        }
    }
    public void deleteStudentSection(){
        if (!studentSection.isEmpty()){
            studentSection = "";
        }
    }

    //Analyzers
    private String getStudentSection() {
        return studentSection;
    }

    private String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }
}
