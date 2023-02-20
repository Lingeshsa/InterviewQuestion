package com.utility;


import java.util.Scanner;

import com.service.CreationInterfaceImpl;

public class StudentUtility {
	public static void main(String[] args) {
		
		
		CreationInterfaceImpl creationInterface = new CreationInterfaceImpl();
		
		Scanner scanner=new Scanner(System.in);
		
		boolean flag = true;
		while(flag ) {
			System.out.println("Enter the choice....\n 1.create Student \n 2.Display \n 3.update \n 4.Delete \n 5.Exit");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				creationInterface.AddStudent();
				break;
				
			case 2:
				creationInterface.Display();
				break;
				
			case 3:
				
				creationInterface.Update();
				break;
			case 4:
				creationInterface.Delete();
				break;
			case 5:
				creationInterface.Exit();
				break;
				
			default :
				break;
	
			}
		}
		
		
		
	}

}
