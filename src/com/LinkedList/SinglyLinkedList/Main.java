package com.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        Employee sumitVerma = new Employee("Sumit", "Verma", 101);
        Employee kratiTaneja = new Employee("Krati", "Taneja", 101);
        Employee akankshaRanawat = new Employee("Akanksha", "Ranawat", 101);
        Employee tanujaSharma = new Employee("Tanuja", "Sharma", 101);

        EmployeeLinkedList list =new EmployeeLinkedList();
        list.addToFront("Ananta Sharma");
        list.addToFront("Ashmita Dhaiya");
    }
}
