package com.Arraylist;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Employee> employeeList =new ArrayList<>();
        //List is the parent class of ArrayList
        //Default size of Arraylist is 10

        employeeList.add(new Employee("Sumit", "Verma", 101));
        employeeList.add(new Employee("Krati", "Taneja", 102));
        employeeList.add(new Employee("Akanksha", "Ranawat", 103));
        employeeList.add(new Employee("Tanuja", "Sharma", 104));

        employeeList.forEach(employee -> System.out.println(employee));
        // -> lambda... and that is a part of java8

        System.out.println(employeeList.get(1));

        //employeeList.clear();

        System.out.println(employeeList.isEmpty());
        employeeList.set(2,new Employee("Ananta", "Sharma",103));
        System.out.println(employeeList);
        System.out.println(employeeList.size());//capa
    }
}
