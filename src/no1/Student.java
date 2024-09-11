package no1;

import java.io.Serializable;

public class Student extends Person implements Serializable {

    private double markAvg;
    public Student(String personID, String personName, int dateOfBirth, double markAvg) {
        super(personID, personName, dateOfBirth);
        this.markAvg = markAvg;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + getName() + '\'' +
                ", studentName='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() + '\'' +
                ", markAvg=" + markAvg +
                '}';
    }
}
