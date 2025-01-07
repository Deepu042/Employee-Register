package com.org.controller;

import java.util.List;
import java.util.Scanner;

import com.org.dao.EmployeeDao;
import com.org.dto.Employee;

public class EmpController {
	public static void main(String[] args) {
 	   Scanner os = new Scanner(System.in);
 	   
 	   System.out.println("-------HOMEPAGE-------");
 	   System.out.println("PLEASE SELECT OPERATION");
 	   System.out.println("1.SAVE");
 	   System.out.println("2.LOGIN");
 	   System.out.println("3.FETCH_ALL");
 	   System.out.println("4.FETCH_BY_ID");
 	   System.out.println("5.DELETE_BY_ID");
 	   System.out.println("6.UPDATE_BY_ID");
 	   System.out.println("7.EXIT");
 	   
 	   Employee emp = new Employee();
 	   EmployeeDao dao = new EmployeeDao();
 	   
 	   int select=os.nextInt();
 	   switch(select) 
 	   {
 	   case 1:
 		      System.out.println("Enter Your ID");
 		      int id=os.nextInt();
 		      System.out.println("Enter Your Name");
 		      String name=os.next();
 		      System.out.println("Enter Your Age");
 		      int age=os.nextInt();
 		      System.out.println("Enter Your Email");
 		      String email=os.next();
 		      System.out.println("Enter Your Password");
 		      String password=os.next();
 		      System.out.println("Enter Your Salary");
 		      long salary=os.nextLong();
 		      
 		      emp.setId(id);
 		      emp.setName(name);
 		      emp.setAge(age);
 		      emp.setEmail(email);
 		      emp.setPassword(password);
 		      emp.setSalary(salary);
 		      
 		      String save=dao.save(emp);
 		      System.out.println("save");
 		      break;
 	   case 2:
 		      System.out.println("Enter Your Email");
 		      String email1=os.next();
 		      System.out.println("Enter Your Password");
 		      String password1=os.next();
 		      emp.setEmail(email1);
 		      emp.setPassword(password1);
 		      boolean credentials=dao.fetchByEmailAndPassword(email1,password1);
 		      if(credentials)
 		      {
 		    	  System.out.println("-------WELCOME TO HOMEPAGE-------");
 		      }
 		      break;
 	   case 3:
 		      List list=dao.fetchAll(emp);
 		      System.out.println("list");
 		      break;
 	   case 4:
 		      System.out.println("Enter ID whose data you want to fetch");
 		      int userid=os.nextInt();
 		      Employee emp1=dao.fetchById(userid);
 		      System.out.println(emp1);
 		      break;
 	   case 5:
 		      System.out.println("Enter ID whose data you want to delete");
 		      int deleteid=os.nextInt();
 		      boolean deleteByid=dao.deleteById(deleteid);
 		      System.out.println(deleteByid);
 		      System.out.println("Id "+ deleteid + " has been deleted");
 		      break;
 	   case 6:
 		      System.out.println("Enter ID whose data you want to update");
 		      int updateId=os.nextInt();
 		      int UpdateByID=dao.updateById(updateId,emp);
 		      if(UpdateByID==updateId)
 		      {
 		    	  System.out.println(UpdateByID);
 		      }
 		      break;
 	   case 7:
 		      os.close();
 		      System.out.println("EXITED");
 		      System.exit(0);
 		      break;
 	   }
	}
}
