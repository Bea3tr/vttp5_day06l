package demo;

import java.util.Date;

public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private double salary;
    private Date dob;
    
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    
    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}
    
    public Date getDate() {return dob;}
    public void setDate(Date date) {this.dob = date;}

    public Person(long id, String first, String last, double salary, Date date) {
        this.id = id;
        this.firstName = first;
        this.lastName = last;
        this.salary = salary;
        this.dob = date;
    }

    @Override 
    public String toString() {
        return "Person -> [id: %d, firstname: %s, lastname: %s, salary: %.2f, dob: %1$te/%1$tm/%1$tY]".formatted(id, firstName, lastName, salary, dob);
    }


    
    
}
