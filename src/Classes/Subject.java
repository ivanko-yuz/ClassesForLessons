package Classes;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Created by john_ on 05.10.2016.
 */
public class Subject implements Comparable<Subject> {

    private String name;
    private int hours;
    private Teacher teacher;

    public Subject(String name, int hours, Teacher teacher) {
        this.name = name;
        this.hours = hours;
        this.teacher = teacher;
    }

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    public Subject(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        String s="";
        s+=name+"   "+hours+"   "+teacher;
        return s;
    }

    @Override
    public int compareTo(@NotNull Subject o) {
        return getName().compareTo(o.getName());
    }
}
