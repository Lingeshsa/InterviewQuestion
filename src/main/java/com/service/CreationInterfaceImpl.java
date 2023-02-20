package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.entity.Student;

public class CreationInterfaceImpl implements CreationInterface {
	
	ArrayList<Student> student = new ArrayList<>();
	Scanner scanner =new Scanner(System.in);

	@Override
	public void AddStudent() {
		System.out.println("Enter the RollNo:");
		int rollno = 0;
		rollno=scanner.nextInt();
		
		System.out.println("Enter the Student Name:");
		String name;
		name = scanner.next();
		
		System.out.println("Enter the Student ContactNo:");
		String contact;
		contact = scanner.next();
		
		System.out.println("Enter the Student Std:");
	    int Std;
	    Std = scanner.nextInt();
	    
	    student.add(new Student(rollno,name,contact,Std));
		
		
		
	}

	@Override
	public void Display() {
		for(Student t : student) {
			System.out.println(t);
		}
		
		
	}

	@Override
	public void Update() 
	{	
			System.out.println("Enter the Student Index:");
			int Srollno =scanner.nextInt();
			boolean flag = true;
			while(flag ) {
				  System.out.println("Which one you want to update.... \n 1.rollno \n 2.name \n 3.contact \n 4.Std \n 5.Exit");
			      int updateIndexChoice = scanner.nextInt();
			      if (updateIndexChoice == 1) {
			    	  System.out.println("Enter the rollno");
			    	  int updatavalue = scanner.nextInt();
					  student.get(0).setRollno(updatavalue);
			    	  
			      }else if(updateIndexChoice == 2){
			    	  System.out.println("Enter the Name:");
			    	  String updatavalue = scanner.next();
			    	  student.get(1).setName(updatavalue);  
			      }else if(updateIndexChoice == 3) {
			    	  System.out.println("Enter the new contact:");
			    	  String updatavalue = scanner.next();
			    	  student.get(2).setContact(updatavalue);
			      }else if(updateIndexChoice ==4) {
			    	  System.out.println("Enter the Standard:");
			    	  int updatavalue = scanner.nextInt();
			    	  student.get(3).setStd(updatavalue);
			    	  
			      }
			      else if(updateIndexChoice == 5){
			    	  System.exit(0);
			    	
			      }else {
			    	  System.out.println("Invaild Entry");
			      }
				
			  }
	}

	@Override
	public void Delete() {

				System.out.println("Enter the Student Index:");
				int indexNumberForRemove =scanner.nextInt();
				System.out.println("are you sure want to delete(y/n)");
				String deleteString = scanner.next();
				if(deleteString == "Y" || deleteString == "y") {
					student.remove(indexNumberForRemove);
					
				}
				
	}

	@Override
	public void Exit() {
		
			System.out.println("Exited Successfully");
		
	}

	
		
		
	}


