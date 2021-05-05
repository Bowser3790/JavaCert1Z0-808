package mdc.learningjava;

import java.util.*;

/**
 * Author Bowser3790 05/02/2021
 */

public class ConflictExample {
    public static void main(String[] args) {
        java.util.Date date;
        java.sql.Date sqlDate;
    }

    public void checkEmpty(List list) {
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}

class lineNumber{
    public void checkEmpty(List list){
        if(list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}
