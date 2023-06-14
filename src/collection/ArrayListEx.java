package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(list.contains(1)); //list에 1이 있는지 검색 , true
        System.out.println(list.indexOf(1)); // 1이 있는 index반환 없으면 -1  , 0

    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}