package mdc.learningjava;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setFirstName("William");
        person1.setLastName("Bradford");
        person1.setAge(37);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());

        person2.setFirstName("Lady");
        person2.setLastName("Bradford");
        person2.setAge(36);

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());

    }
}
