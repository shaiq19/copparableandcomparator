package comparableAndComparator;
import java.util.*;

public class MainClass {

    public void mainfun() {

            List<Student> students = new ArrayList<>();

            students.add(new Student(2, "sameer"));
            students.add(new Student(23, "ali"));
            students.add(new Student(24, "shahaque"));
            students.add(new Student(2, "tanveer"));
            students.add(new Student(5, "ali"));
            students.add(new Student(7, "asif"));
            students.add(new Student(9, "ahsen"));
/////////////////////1ts method
            /*Collections.sort(students, new Comparator<Student>() {// anonmous class
                    @Override
                    public int compare(Student o1, Student o2) {
                            if(o1.name.equals(o2.name)) return o1.marks - o2.marks;//if marks equals sort by names
                        else return o1.name.compareTo(o2.name);
                    }
            });*/
//////////////////2nd method
            /*Collections.sort(students,(Student o1, Student o2) -> { // anonmous class with lamdafun
                            if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
                            else return o1.name.compareTo(o2.name);
                    });
*/
//////////////////3rd method
            /*Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));*/

/////////////////////4th time
            Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());//by reversed

            students.forEach(System.out::println);
    }
       /*public  Class SortByNameThenMarks implements Comparator<Student>{

               @Override
               public int compare(Student o1, Student o2){
                      if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
                      else return o1.name.compareTo(o2.name);
                }


        }*/
}




