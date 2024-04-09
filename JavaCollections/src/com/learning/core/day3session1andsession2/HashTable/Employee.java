package com.learning.core.day3session1andsession2.HashTable;

import java.util.Hashtable;
import java.util.Objects;

public class Employee {
    private int id;
    private String anme;
    private String departrment;
    private String designaton;

    public Employee() {
    }

    public Employee(int id, String anme, String departrment, String designaton) {
        this.id = id;
        this.anme = anme;
        this.departrment = departrment;
        this.designaton = designaton;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnme() {
        return anme;
    }

    public void setAnme(String anme) {
        this.anme = anme;
    }

    public String getDepartrment() {
        return departrment;
    }

    public void setDepartrment(String departrment) {
        this.departrment = departrment;
    }

    public String getDesignaton() {
        return designaton;
    }

    public void setDesignaton(String designaton) {
        this.designaton = designaton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(anme, employee.anme) && Objects.equals(departrment, employee.departrment) && Objects.equals(designaton, employee.designaton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, anme, departrment, designaton);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", anme='" + anme + '\'' +
                ", departrment='" + departrment + '\'' +
                ", designaton='" + designaton + '\'' +
                '}';
    }
}
