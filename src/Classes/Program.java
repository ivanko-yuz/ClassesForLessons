package Classes;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by john_ on 05.10.2016.
 */
public class Program {

    public static void main(String[] args)
    {
        ArrayList<Teacher> teachers = makeTeachersBase();
        ArrayList<Subject> subjects = makeSubjectBase(teachers);
        ArrayList<Student> students = makeStudentBase(subjects);
        //print(teachers);
        //print(subjects);
        //print(students);
        //System.out.println(getTheMostPopularTeacher(students)+"\n\n");

        ArrayList<ArrayList<Student>> groups = getGroups(students);
        printGoups(groups);

        ArrayList<Student> someStudents = new ArrayList<Student>();
        for(int i=0; i<students.size(); i+=2)
        {
            someStudents.add(students.get(i));
        }
        System.out.println("\n\n");
        ArrayList<String> teacherForStudents = getSurnamesOfTeachers(someStudents);
      //  print(teacherForStudents);

        System.out.println(getTeacherThatHasTheMostStudent(groups.get(0)));
    }



    static Teacher getTeacherThatHasTheMostStudent(ArrayList<Student> group)
    {
        return getTheMostPopularTeacher(group);
    }

    static ArrayList<ArrayList<Student>> getGroups(ArrayList<Student> students)
    {
        ArrayList<ArrayList<Student>> groups = new ArrayList<>();
        for (Student stdn:students)
        {
            ArrayList<Subject> subjects = stdn.getSubjects();
            int index=-1;
            for(int i=0; i<groups.size(); i++)
            {
                    if(groups.get(i).get(0).getSubjects()==subjects)
                        index=i;
            }
            if(index!=-1)
                groups.get(index).add(stdn);
            else
            {
                groups.add(new ArrayList<Student>());
                groups.get(groups.size()-1).add(stdn);
            }
        }
        return groups;
    }

    public static <T> void print(ArrayList<T> elements)
    {
        for (T el:elements)
        {
            System.out.println(el);
        }
    }

    static <T> int getIndex(ArrayList<T> elements, T element)
    {
        for(int i=0; i<elements.size(); i++)
        {
            if(elements.get(i)==element)
                return i;
        }
        return -1;
    }

    static <T> boolean isContain(ArrayList<T> elements, T element)
    {
        for(int i=0; i<elements.size(); i++)
        {
            if(elements.get(i)==element)
                return true;
        }
        return false;
    }

    static ArrayList<String> getSurnamesOfTeachers(ArrayList<Student> students)
    {
        ArrayList<String> teachers = new ArrayList<>();
        for(Student stdnt:students)
        {
            ArrayList<Subject> subjects = stdnt.getSubjects();
            for (Subject sbjct:subjects)
            {
                String surname = sbjct.getTeacher().getSurname();
                if(!isContain(teachers,surname))teachers.add(surname);
            }
        }
        return teachers;
    }

    static void printGoups( ArrayList<ArrayList<Student>> groups)
    {
        for(ArrayList<Student> stdnts:groups)
        {
            for(Student s:stdnts)
            {
                System.out.println(s);
            }
            System.out.println("\n\n");
        }
    }

    static void printTeachers(ArrayList<Teacher> teachers)
    {
        for (Teacher t:teachers) {
            System.out.println(t);
        }
        System.out.println("\n\n");
    }

    static void printSubjects(ArrayList<Subject> subjects)
    {
        for (Subject s:subjects) {
            System.out.println(s);
        }
        System.out.println("\n\n");
    }

    static void printStudents(ArrayList<Student> students)
    {
        for (Student s:students) {
            System.out.println(s);
        }
        System.out.println("\n\n");
    }

    static Teacher getTheMostPopularTeacher(ArrayList<Student> students)
    {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        ArrayList<Integer> counts = new ArrayList<>();
        for (Student stdn: students)
        {
            for(Subject sbjct: stdn.getSubjects())
            {
                if(teachers.lastIndexOf(sbjct.getTeacher())==-1)
                {
                    teachers.add(sbjct.getTeacher());
                    counts.add(1);
                }
                else
                {
                    for(int i=0; i<teachers.size(); i++)
                    {
                        if(teachers.get(i)==sbjct.getTeacher())
                        {
                            counts.set(i,counts.get(i)+1);
                        }
                    }
                }
            }
        }
        int maxIndex=0;
        for(int i=1; i<counts.size(); i++)
        {
            if(counts.get(i)>counts.get(maxIndex))maxIndex=i;
        }
        return teachers.get(maxIndex);
    }

    public static ArrayList<Teacher> makeTeachersBase()
    {
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Хапко","Роман","Степанович","Професор","Обчислювальної математики"));
        teachers.add(new Teacher("Савула","Ярема","Григорович","Професор","Прикладної математики"));
        teachers.add(new Teacher("Дяконюк","Лілія","Миколаївна","Доцент","Прикладної математики"));
        teachers.add(new Teacher("Турчин","Юлія","Ігорівна","Асистент","Прикладної математики"));
        teachers.add(new Teacher("Вавричук","Василь","Григорович","Асистент","Обчислювальної математики"));
        teachers.add(new Teacher("Муха","Ігор","Степанович","Доцент","Прикладної математики"));
        teachers.add(new Teacher("Коссак","Ольга","Святославівна","Доцент","Прикладної математики"));
        teachers.add(new Teacher("Ящук","Юрій","Олександрович","Доцент","Прикладної математики"));
        teachers.add(new Teacher("Стягар","Андрій","Орестович","Асистент","Прикладної математики"));
        teachers.add(new Teacher("Бартіш","Михайло","Ярославович","Професор","Теорії оптимальних процесів"));
        teachers.add(new Teacher("Гнатишин","Олександра","Павлівна","Старший викладач","Теорії оптимальних процесів"));
        teachers.add(new Teacher("Гарасим","Ярослав","Степанович","Старший викладач","Обчислювальної математики"));
        return teachers;
    }

    public static ArrayList<Subject> makeSubjectBase(ArrayList<Teacher> teachers)
    {
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        subjects.add(new Subject("Чисельні методи",150,teachers.get(0)));
        subjects.add(new Subject("Лінійні інтегральні рівняння",150,teachers.get(0)));
        subjects.add(new Subject("Чисельні методи матфізики",150,teachers.get(1)));
        subjects.add(new Subject("Програмування",216,teachers.get(2)));
        subjects.add(new Subject("Джава",216,teachers.get(2)));
        subjects.add(new Subject("Чисельні методи матфізики",150,teachers.get(3)));
        subjects.add(new Subject("Функан",150,teachers.get(4)));
        subjects.add(new Subject("МСС",120,teachers.get(5)));
        subjects.add(new Subject("Машинна графіка",180,teachers.get(6)));
        subjects.add(new Subject(".Нет",150,teachers.get(7)));
        subjects.add(new Subject("Матлаб",150,teachers.get(8)));
        subjects.add(new Subject("C++",216,teachers.get(2)));
        subjects.add(new Subject("МО",90,teachers.get(9)));
        subjects.add(new Subject("ТІМС",150,teachers.get(10)));
        subjects.add(new Subject("Латех",150,teachers.get(11)));
        return subjects;
    }

    public static ArrayList<Student> makeStudentBase(ArrayList<Subject> subjects)
    {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Subject> subjects1 = new ArrayList<>();
        subjects1.add(subjects.get(0));
        subjects1.add(subjects.get(1));
        subjects1.add(subjects.get(2));
        subjects1.add(subjects.get(3));
        subjects1.add(subjects.get(4));
        ArrayList<Subject> subjects2 = new ArrayList<>();
        subjects2.add(subjects.get(5));
        subjects2.add(subjects.get(6));
        subjects2.add(subjects.get(7));
        subjects2.add(subjects.get(8));
        subjects2.add(subjects.get(9));
        ArrayList<Subject> subjects3 = new ArrayList<>();
        subjects3.add(subjects.get(10));
        subjects3.add(subjects.get(11));
        subjects3.add(subjects.get(12));
        ArrayList<Subject> subjects4 = new ArrayList<>();
        subjects4.add(subjects.get(0));
        subjects4.add(subjects.get(4));
        subjects4.add(subjects.get(3));
        subjects4.add(subjects.get(6));
        subjects4.add(subjects.get(9));
        ArrayList<Subject> subjects5 = new ArrayList<>();
        subjects5.add(subjects.get(3));
        subjects5.add(subjects.get(1));
        subjects5.add(subjects.get(7));
        subjects5.add(subjects.get(4));
        subjects5.add(subjects.get(2));
        ArrayList<Subject> subjects6 = new ArrayList<>();
        subjects6.add(subjects.get(10));
        subjects6.add(subjects.get(2));
        subjects6.add(subjects.get(11));
        subjects6.add(subjects.get(0));
        subjects6.add(subjects.get(4));
        ArrayList<Subject> subjects7 = new ArrayList<>();
        subjects7.add(subjects.get(5));
        subjects7.add(subjects.get(6));
        subjects7.add(subjects.get(7));
        subjects7.add(subjects.get(1));
        subjects7.add(subjects.get(12));
        ArrayList<Subject> subjects8 = new ArrayList<>();
        subjects8.add(subjects.get(11));
        subjects8.add(subjects.get(8));
        subjects8.add(subjects.get(3));
        subjects8.add(subjects.get(6));
        subjects8.add(subjects.get(10));
        students.add(new Student("Прусак","Іван","Романович",subjects1));
        students.add(new Student("Мицук","Анна","Романівна",subjects2));
        students.add(new Student("Марухно","Орися","Ігорівна",subjects3));
        students.add(new Student("Козбур","Юлія","Ігорівна",subjects1));
        students.add(new Student("Піжанська","Уляна","Віталіївна",subjects5));
        students.add(new Student("Перепічка","Назарій","Васильович",subjects6));
        students.add(new Student("Здирко","Ярослав","Адрійович",subjects7));
        students.add(new Student("Тарасюк","Ганна","Святославівна",subjects8));
        students.add(new Student("Стефанишин","Ростислав","Віталійович",subjects1));
        students.add(new Student("Семчишин","Андрій","Романович",subjects2));
        students.add(new Student("Ковлига","Ірина","Олегівна",subjects3));
        students.add(new Student("Онишкевич","Софія","Володимирівна",subjects1));
        return students;
    }

    static void Sorting()
    {
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Хапко","Роман","Степанович","Associative prof","applied math"));
        teachers.add(new Teacher("Савула","Ярема","Григорович","Aspirant","computation math"));
        teachers.add(new Teacher("Дяконюк","B3","C3","prof","computation math"));
        teachers.add(new Teacher("Ковлига","B4","C4","prof prof","applied math"));
        teachers.add(new Teacher("тміолфтвлд","B5","C5","Associative prof","computation math"));
        teachers.add(new Teacher("млівтджібважрівшг","B6","C6","Aspirant","applied math"));
        teachers.add(new Teacher("ййцкдцуоажцує","B7","C7","Associative prof","applied math"));

        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("numerical methods",120,teachers.get(0)));
        subjects.add(new Subject("linear integral equations",90,teachers.get(0)));
        subjects.add(new Subject("numerical methods math physics",150,teachers.get(1)));
        subjects.add(new Subject("numerical methods1",120,teachers.get(5)));
        subjects.add(new Subject("numerical methods2",120,teachers.get(3)));
        subjects.add(new Subject("numerical methods3",120,teachers.get(5)));


        ArrayList<Subject> subjects1 = new ArrayList<>();
        subjects1.add(new Subject("numerical methods",120,teachers.get(3)));
        subjects1.add(new Subject("linear integral equations",90,teachers.get(6)));
        subjects1.add(new Subject("numerical methods math physics",150,teachers.get(2)));
        subjects1.add(new Subject("numerical methods1",120,teachers.get(2)));
        subjects1.add(new Subject("numerical methods2",120,teachers.get(4)));
        subjects1.add(new Subject("numerical methods3",120,teachers.get(5)));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Prusak", "Ivan","R",subjects));
        students.add(new Student("A1", "B1","C1",subjects1));
        students.add(new Student("D10", "B10","C10",subjects));

        for(Teacher s:teachers)
        {
            System.out.println(s);
        }

        //Collections.sort(students);
        SortByName sorting = new SortByName();
        Collections.sort(teachers,sorting);
        System.out.println("\n");

        for(Teacher s:teachers)
        {
            System.out.println(s);
        }

        Collections.sort(teachers, SortByName.reverseOrder());

        System.out.println("\n");


        for(Teacher s:teachers)
        {
            System.out.println(s);
        }
    }


}
