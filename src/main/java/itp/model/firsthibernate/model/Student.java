package itp.model.firsthibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "allStudent")
//@AllArgsConstructor
//@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    @Column(name = "rollno")
    private int rollno;

    @Column(name = "name")
    private String name;

    @Column(name = "per")
    private double per;
    @Transient
    int temp;

    public Student() {}

    public Student(String name, double per) {  // removed rollno from constructor
        this.name = name;
        this.per = per;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPer() {
        return per;
    }
    public void setPer(double per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
    }
}
