package no1;

public class AppStudents {
    public static void main(String[] args) {
        Student student1 = new Student("1", "khanh", 5, 10);
        Student student2 = new Student("2", "nhan", 2, 10);
        Student student3 = new Student("3", "tammy", 4, 10);
        CRUDStudent crudStudent = new CRUDStudent();

        crudStudent.addStudent(student1);
        crudStudent.addStudent(student2);
        crudStudent.addStudent(student3);

        String filename = "student.dat";
        crudStudent.addStudentToFile(student1,filename);
        crudStudent.addStudentToFile(student2,filename);
        crudStudent.addStudentToFile(student3,filename);

        System.out.println(crudStudent.getStudentFromFile(filename));

        crudStudent.getStudentFromFile(filename);

        crudStudent.addStudentListToFile(new Student[]{student1, student2, student3}, filename);

        Student[] allStudents = crudStudent.getAllStudentFromFile(filename);
        for (Student student : allStudents) {
            System.out.println(student);
        }

    }
}
