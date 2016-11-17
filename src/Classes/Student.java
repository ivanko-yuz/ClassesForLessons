package Classes;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by john_ on 05.10.2016.
 */
public class Student implements Comparable<Student>
{

    public Student()  {
    }

    public Student(String surname, String firstName, String lastName) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String surname, String firstName, String lastName, ArrayList<Subject> subjects) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    private String surname,firstName, lastName;
    private ArrayList<Subject> subjects;

    @Override
    public String toString() {
        String s="";
        s+=surname+"   "+firstName+"   "+lastName;

        return s;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return getSurname().compareTo(o.getSurname());
    }
}
