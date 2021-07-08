package org.acme.domain;

public class Person {

    private String name;
    private int age;
    private boolean adult;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   public void setName(String name) {
       this.name = name;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public boolean isAdult() {
       return adult;
   }

   public void setAdult(boolean adult) {
       this.adult = adult;
   }
}