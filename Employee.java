package com.org.dto;

public class Employee {
	private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private long salary;
    
    public void setId(int id)
    {
   	 this.id=id;
    }
    public int getId()
    {
   	 return id;
    }
    public void setName(String name)
    {
   	 this.name=name;
    }
    public String getName()
    {
   	 return name;
    }
    public void setAge(int age)
    {
   	 this.age=age;
    }
    public int getAge()
    {
   	 return age;
    }
    public void setEmail(String email)
    {
   	 this.email=email;
    }
    public String getEmail()
    {
   	 return email;
    }
    public void setPassword(String password)
    {
   	 this.password=password;
    }
    public String getPassword()
    {
   	 return password;
    }
    public void setSalary(long salary)
    {
   	 this.salary=salary;
    }
    public long getSalary()
    {
   	 return salary;
    }
}
