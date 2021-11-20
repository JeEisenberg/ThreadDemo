package gavin.CollectionDemo;


import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

class Animal implements Comparator {
    int A_id;
    String name;

    public Animal(int a_id, String name) {
        A_id = a_id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "A_id=" + A_id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compare(Object o1, Object o2) {
        int result = ((Animal) o1).A_id - ((Animal) o2).A_id;
        return result;
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
//        一个空的构造
        TreeSet<Integer> treeSet = new TreeSet<>();
        //构建包含指定集合中元素的新树集，根据其元素的自然顺序进行排序。
        TreeSet<Integer> treeSet1 = new TreeSet<>(treeSet);

        Animal [] animal= new Animal[10];

        //实现Comparator接口

        TreeSet<Animal> treeSet2 = new TreeSet<>((o1, o2) -> o1.A_id-o2.A_id);
        TreeSet<Animal> treeSet3 = new TreeSet<>(Comparator.comparingInt(o -> o.A_id));
        for (int i = 0; i < animal.length; i++) {
            animal[i]=new Animal(i,"狗");
            treeSet3.add(animal[i]);
        }

        for (Animal a :
                treeSet3) {
            System.out.println(a);
        }

        CopyOnWriteArraySet copyOnWriteArraySet= new CopyOnWriteArraySet(treeSet2);
        copyOnWriteArraySet.add(new Animal(999,"猫猫"));
    }
}
