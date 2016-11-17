package Itearatorrr;

import Classes.Subject;
import Classes.Teacher;

import java.util.*;

/**
 * Created by john_ on 12.10.2016.
 */
public class Program {



    public static void main(String[] smas)
    {
        //LinkedListWithIterator();
       // DeleteSubjectWithSomeTeacher();
       // RemoveTeacherWhickHaveSubject();
        WorkWithSets();
    }



    static void LinkedListWithIterator()
    {
        LinkedList<Integer> elem = new LinkedList<>();
        elem.addFirst(1);
        elem.addFirst(4);
        elem.addFirst(5);
        elem.addFirst(3);
        elem.addFirst(2);
        elem.addFirst(5);
        elem.addFirst(5);
        elem.addFirst(6);
        elem.addFirst(3);
        elem.addFirst(5);
        elem.addFirst(2);
        elem.addFirst(4);
        elem.addFirst(1);
        // Iterator<Integer> iter = elem.descendingIterator();
        ListIterator<Integer> iter = elem.listIterator();
        Integer a=0;

        for(Integer q:elem)
        {
            System.out.println(q);
        }
        while(iter.hasNext())
    {
       // a=iter.next();
        if(iter.next().compareTo(5)==0)
        {
            iter.remove();
        }

    }
        System.out.println("\n\n");
        for(Integer q:elem)
        {
            System.out.println(q);
        }
        System.out.println("\n\n");
        iter = elem.listIterator();
        while(iter.hasNext())
        {
           // a=iter.next();
            if(iter.next().compareTo(2)==0)
            {
                if(iter.hasPrevious()) {
                    iter.previous();
                    iter.add(5);
                    iter.next();
                }
            }

        }
        System.out.println("\n\n");
        for(Integer q:elem)
        {
            System.out.println(q);
        }

    }

    static void DeleteSubjectWithSomeTeacher()
    {
        ArrayList<Teacher> teachers = Classes.Program.makeTeachersBase();
        ArrayList<Subject> subjects = Classes.Program.makeSubjectBase(teachers);
        Classes.Program.print(subjects);
        System.out.println("\n");
        Iterator<Subject> iterator = subjects.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next().getTeacher().getSurname()=="Дяконюк")
            {
                iterator.remove();
            }
        }
        Classes.Program.print(subjects);
        System.out.println("\n");
    }

    static void RemoveTeacherWhickHaveSubject()
    {
        ArrayList<Teacher> teachers = Classes.Program.makeTeachersBase();
        ArrayList<Subject> subjects = Classes.Program.makeSubjectBase(teachers);
        Classes.Program.print(teachers);
        System.out.println("\n");
        Iterator<Subject> iter = subjects.iterator();
        while(iter.hasNext())
        {
            Subject s=iter.next();
            if(s.getName()=="Чисельні методи матфізики")
            {
                teachers.remove(s.getTeacher());
            }
        }
        Classes.Program.print(teachers);
        System.out.println("\n");

    }

    static void WorkWithSets()
    {
        ArrayList<Subject> subjects = Classes.Program.makeSubjectBase(Classes.Program.makeTeachersBase());
        HashSet<Subject> subjSet = new HashSet<>();
        for(Subject s:subjects)
        {
            if(s.getName().toLowerCase().contains("мат") || s.getName().toLowerCase().contains("фун") || s.getName().toLowerCase().contains("мет") || s.getName().toLowerCase().contains("тімс") || s.getName().toLowerCase().contains("інт") || s.getName().toLowerCase().contains("мсс"))
            {
                subjSet.add(s);
            }
        }
        Classes.Program.print(subjects);
        System.out.println("\n");
        System.out.println("HashSet");
        for (Subject s:subjSet)
        {
            System.out.println(s);
        }
        System.out.println("\n");
        TreeSet<Subject> subjSetSOrted = new TreeSet<>();
        for(Subject s:subjects)
        {
            if(s.getName().toLowerCase().contains("мат") || s.getName().toLowerCase().contains("фун") || s.getName().toLowerCase().contains("мет") || s.getName().toLowerCase().contains("тімс") || s.getName().toLowerCase().contains("інт") || s.getName().toLowerCase().contains("мсс"))
            {
                subjSetSOrted.add(s);
            }
        }
        for (Subject s:subjSetSOrted)
        {
            System.out.println(s);
        }
        System.out.println("\n");
    }
}
