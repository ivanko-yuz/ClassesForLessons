package Classes;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by john_ on 05.10.2016.
 */
public class Teacher implements Comparable<Teacher>{

    private String surname,firstName, lastName;
    private String position;
    private String department;
    private List<Student> students;

    @Override
    public String toString() {
        return surname+"   "+firstName+"   "+lastName+"   "+position+"   "+department;
    }

    public Teacher(String surname, String firstName, String lastName, String position, String department, List<Student> students) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
        this.students = students;
    }
    public Teacher(String surname, String firstName, String lastName, String position, String department) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
    }


   /* @Override
    public int hashCode() {
        return
    }*/

    public Teacher() {
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

    public List<Student> getStudents() {
        return students;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getChair() {
        return department;
    }

    public void setChair(String department) {
        this.department = department;
    }


    @Override
    public int compareTo(@NotNull Teacher o) {
        return  this.getFirstName().length() > o.getFirstName().length() ?  1 : this.getFirstName()  == o.getFirstName() ?  0 : -1;
    }

    @Override
    public int hashCode() {
        return this.getFirstName().hashCode();
    }
}
