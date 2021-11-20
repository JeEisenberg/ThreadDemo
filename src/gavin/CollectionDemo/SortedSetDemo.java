package gavin.CollectionDemo;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable {
    int S_id;
    String S_name;
    int S_age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "S_id=" + S_id +
                ", S_name='" + S_name + '\'' +
                ", S_age=" + S_age +
                '}';
    }

    public Student(int s_id, String s_name, int s_age) {
        S_id = s_id;
        S_name = s_name;
        S_age = s_age;
    }
    @Override
    public int compareTo(Object o) {
        //这里要检查o的类型的,省略了
       Student s= (Student)o;
        return this.S_id-s.S_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return S_id == student.S_id &&
                S_age == student.S_age &&
                S_name.equals(student.S_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(S_id, S_name, S_age);
    }
}

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Student>sortedSet=new TreeSet<>();
        sortedSet.add(new Student(1001,"扎根三",20));
        sortedSet.add(new Student(1008,"李四",20));
        sortedSet.add(new Student(1004,"王五",20));
        sortedSet.add(new Student(1007,"赵六",20));
        sortedSet.add(new Student(1009,"乾七",20));
        sortedSet.add(new Student(1012,"六八",20));
        for (Student s :
                sortedSet) {
            System.out.println(s);
        }

    }
}
