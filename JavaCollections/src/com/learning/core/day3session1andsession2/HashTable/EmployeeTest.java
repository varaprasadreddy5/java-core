package com.learning.core.day3session1andsession2.HashTable;

import java.util.Hashtable;

public class EmployeeTest {
    public static void main(String[] args){
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();
        Employee employee1 = new Employee(1001,"Daniel","L&D","Analyst");
        Employee employee2 = new Employee(1002,"Thomas","Testing","Tester");
        Employee employee3 = new Employee(1003,"Robert","Developer","Product Manager");
        Employee employee4 = new Employee(1004,"Grace","HR","Tech Support");

        employeeHashtable.put(employee1.getId(), employee1);
        employeeHashtable.put(employee2.getId(), employee2);
        employeeHashtable.put(employee3.getId(), employee3);
        employeeHashtable.put(employee4.getId(), employee4);

        if(employeeHashtable.isEmpty()){
            System.out.println("True");
        }
        else
            System.out.println("False");

        int searchId = 1003;
        if(employeeHashtable.containsKey(searchId)){
            Employee employeeFound = employeeHashtable.get(searchId);
            System.out.println(searchId + " " + employeeFound.getAnme() + " " + employeeFound.getDepartrment() + " " + employeeFound.getDesignaton());
        }

        int newAdd = 1005;
        Employee employee5 = new Employee(1005,"Charles","Testing","QA Lead");
        if(!employeeHashtable.containsKey(newAdd)){
            employeeHashtable.put(employee5.getId(),employee5);
        }

        for (Employee employee : employeeHashtable.values()) {
            System.out.println(employee);
        }
    }
}
