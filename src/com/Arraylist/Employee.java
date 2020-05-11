package com.Arraylist;

public class Employee {

    private String firstname;
    private String lastname;
    private  int id;

    //Boiler Plate code
    public Employee(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", id=" + id + '}';
        //If we won't do this we will only  get refrence for these
    }
}
