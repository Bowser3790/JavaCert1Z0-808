package mdc.learningjava;

/*
 * @author Bowser 5/1/2021
 * Class Structure
 */


public class Person {
   private String firstName; // firstName Person's attribute
   private String lastName; // lastName Person's attribute
   private int age;

   public String getFirstName(){
      return firstName;
   }

   public void setFirstName(String firstName){
      this.firstName=firstName;
   }

   public String getLastName(){
      return lastName;
   }

   public void setLastName(String lastName){
      this.lastName=lastName;
   }
   public int getAge(){
      return age;
   }

   public void setAge(int age){
      this.age=age;
   }
}



