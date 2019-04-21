package TP2.Ejercicio_4;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


        Student student1 = new Student("Juan", "Pérez", 123);

    @org.junit.jupiter.api.Test
    void register() {
        student1.register();
    assertEquals(student1.isRegistered(), true);
    }

    @org.junit.jupiter.api.Test
    void unregister() {
        student1.unregister();
        assertEquals(student1.isRegistered(), false);
    }

    @org.junit.jupiter.api.Test
    void addStudentSectionNoError() {
        student1.register();
        student1.addStudentSection("Comisión 1");
        assertEquals(student1.getStudentSection(), "Comisión 1");

    }

    @org.junit.jupiter.api.Test
    void addStudentSectionError() {
        assertThrows(IllegalArgumentException.class,
                ()-> {
                    student1.unregister();
                    student1.addStudentSection("Comisión A");
                });
    }

    @org.junit.jupiter.api.Test
    void deleteStudentSection() {
        student1.deleteStudentSection();
        assertEquals(student1.getStudentSection(), "");
    }
}
