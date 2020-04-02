package com.demo.consumer;
public class Employee {
 
   private long empId;
   private String name;
   private int age;
   private String designation;
 
   public Employee(long empId, String name, int age, String designation) {
     super();
     this.empId = empId;
     this.name = name;
     this.age = age;
     this.designation = designation;
   }
 
   public long getEmpId() {
     return empId;
   }
   public void setEmpId(long empId) {
     this.empId = empId;
   }
   public String getName() {
     return name;
   }
   public void setName(String name) {
     this.name = name;
   }
   public int getAge() {
     return age;
   }
   public void setAge(int age) {
     this.age = age;
   }
   public String getDesignation() {
     return designation;
   }
   public void setDesignation(String designation) {
     this.designation = designation;
   }
 
}