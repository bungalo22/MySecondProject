package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();// если знаешь размер массива можно его указать сразу в скобка ()

        for (int i = 0; i < 50; i++) {
            arrayList.add(i);
        }
        /*System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));

        System.out.println(arrayList.size());*/

       /* for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }*/


        for (Integer x : arrayList)
            System.out.println(x);

//        list.remove(5);
//        list.add(10);
        System.out.println(arrayList);

        //Мы проводим много удалений из нашего листа
        arrayList = new LinkedList<Integer>();
    }
}
