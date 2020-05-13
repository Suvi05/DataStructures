package com.LinkedList.SinglyLinkedList;

public class EmployeeNode {
    private Employee employee;
    private Employee next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }
    //So constructor only takes employee because when we are constucting instance, we dont know yet what the next node will be.
    //We will use that in insert method

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getNext() {
        return next;
    }

    public void setNext(Employee next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "EmployeeNode{" + "employee=" + employee + ", next=" + next + '}';
    }

    public void setNext(EmployeeNode head) {
    }
}
