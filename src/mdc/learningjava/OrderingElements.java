package mdc.learningjava;

import java.util.ArrayList;
import java.util.List;

public class OrderingElements {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        // list.add("Bowser");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for(int number : list){
            System.out.println(number);
        }
    }
}
// PIC - package, import, class