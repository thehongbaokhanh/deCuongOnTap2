package no1;

import java.io.Serializable;

public class Person implements Serializable {
    private String personID;
    private String personName;
    private int dateOfBirth;

    private Person() {

    }

    public Person(String personID, String personName, int dateOfBirth) {
        this.personID = personID;
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getID() {
        return personID;
    }

    public void setID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return personName;
    }

    public void setName(String personName) {
        this.personName = personName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", personName='" + personName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
