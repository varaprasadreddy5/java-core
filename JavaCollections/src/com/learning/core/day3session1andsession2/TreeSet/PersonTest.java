package com.learning.core.day3session1andsession2.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        TreeSet <Person> person = new TreeSet<>();
        person.add(new Person(1,"Jerry",22,999));
        person.add(new Person(2,"Smith",20,2999));
        person.add(new Person(3,"Popeye",24,5999));
        person.add(new Person(4,"jones",21,6999));
        person.add(new Person(5,"John",32,1999));
        person.add(new Person(6,"Tom",42,3999));

         long sumOfSal = 0;

        Iterator<Person> personIterator = person.iterator();
        while (personIterator.hasNext()){
            Person person1 = personIterator.next();
            if(person1.getAge() > 25){
                System.out.println("ID: " + person1.getId() + ", Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Salary: " + person1.getSalary());
            }
        }
        System.out.println();

        for (Person persons : person) {
            System.out.println("ID: " + persons.getId() + ", Name: " + persons.getName() +  ", Salary: " + persons.getSalary());
            System.out.println();
            System.out.println(persons.getName().toUpperCase());
            sumOfSal += persons.getSalary();
        }
        for(Person persons : person){
            if(persons.getName().startsWith("J")){
                System.out.println("ID: " + persons.getId() + ", Name: " + persons.getName() +  ", Salary: " + persons.getSalary());
                break;
            }
        }

        System.out.println(sumOfSal);
     }
}
