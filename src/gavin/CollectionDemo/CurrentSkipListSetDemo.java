package gavin.CollectionDemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

class PersonP implements Comparable {
    int P_ID;
    String name;
    int age;
    String gender;

    public PersonP() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonP personP = (PersonP) o;
        return P_ID == personP.P_ID &&
                age == personP.age &&
                Objects.equals(name, personP.name) &&
                Objects.equals(gender, personP.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(P_ID, name, age, gender);
    }

    public PersonP(int p_ID, String name, int age, String gender) {
        P_ID = p_ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Object o) {
        PersonP p = (PersonP) o;
        return this.P_ID - p.P_ID;
    }

    @Override
    public String toString() {
        return "PersonP{" +
                "P_ID=" + P_ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class CurrentSkipListSetDemo {
    public static void main(String[] args) {

        ConcurrentSkipListSet<Integer> concurrentSkipListSet_1 = new ConcurrentSkipListSet();
        concurrentSkipListSet_1.add(1);


        //无参构造
        ConcurrentSkipListSet<PersonP> concurrentSkipListSet = new ConcurrentSkipListSet();

        concurrentSkipListSet.add(new PersonP(1001, "李四", 20, "男"));
        concurrentSkipListSet.add(new PersonP(1006, "王四", 22, "男"));
        concurrentSkipListSet.add(new PersonP(1004, "赵四", 21, "男"));
//取出数据
        for (PersonP p :
                concurrentSkipListSet) {
            System.out.println(p);
        }

        //        有参构造
        Set<Integer> set = new HashSet<>();
        ConcurrentSkipListSet cSL = new ConcurrentSkipListSet(set);
        Comparator comparator = cSL.comparator();
        System.out.println("comparator = " + comparator);
        ConcurrentSkipListSet cSL2 = new ConcurrentSkipListSet((o1, o2) -> {
            if(o1 instanceof PersonP&&o2 instanceof PersonP){
                PersonP  per= (PersonP)o1;
                PersonP  per2= (PersonP)o1;
                return per.P_ID-per2.P_ID;
            }
          return  0;
        });
    }
}
