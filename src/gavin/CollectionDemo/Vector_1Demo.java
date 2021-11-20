package gavin.CollectionDemo;


import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Vector_1Demo {
    public static void main(String[] args) {
        Vector vector=new Vector();
      /*  如果没有指定容量则默认为10,增长因子为0*/
        Collection<Person>c=new Vector<>(1,2);
        c.add(new Person("张三"));
        c.add(new Person("李四"));
        System.out.println(c.size());
      /* Vector 支持迭代器,不支持下标式的访问;*/
        for (Person per:
           c  ) {
            System.out.println(per);
        }
        Iterator<Person> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //流式操做 stream,感兴趣可以查一下API
        Stream<Person> personStream1 = c.parallelStream();
        personStream1.forEach(person -> System.out.println(person));

        Stream<Person> personStream = c.parallelStream();
        personStream.forEach(person -> System.out.println(person));
    }
}
