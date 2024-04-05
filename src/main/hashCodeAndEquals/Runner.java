package hashCodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        set.add("Hello");
        set.add("Hello");

        Integer x = 1;  
        x.equals(x);

      Person person1 = new Person(1,"Mike");
      person1.equals(x);
      person1.hashCode();

//      Person person2 = new Person(1,"Mike");
//
//      map.put(person1, "123");
//      map.put(person2, "123");
//
//      set.add(person1);
//      set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}
class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

