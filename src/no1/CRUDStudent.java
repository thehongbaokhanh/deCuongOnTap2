package no1;

import java.io.*;
import java.util.ArrayList;

public class CRUDStudent {
    private Student[] students;
    private static int numberOfStudent;

    public CRUDStudent() {
        students = new Student[100];
        numberOfStudent = 0;
    }

    public boolean addStudent(Student student) {
        if (numberOfStudent != 100) {
            students[numberOfStudent++] = student;
            numberOfStudent++;
            return true;
        } else {
            return false;
        }
    }

    public boolean addStudentToFile(Student student, String filename) {
        filename = student.getName() + ".dat";
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student getStudentFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addStudentListToFile(Student [] listStudent, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Student student : listStudent) {
                if (student != null) {
                    oos.writeObject(student);
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student[] getAllStudentFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Student> studentList = new ArrayList<>();
            try {
                while (true) {
                    Student student = (Student) ois.readObject();
                    studentList.add(student);
                }
            } catch (EOFException eof) {

            }
            return studentList.toArray(new Student[0]);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}