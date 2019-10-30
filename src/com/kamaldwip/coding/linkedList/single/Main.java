package com.kamaldwip.coding.linkedList.single;

public class Main {

    public static void main(String[] args) {
	    Employee emp1 = new Employee("Kamaldwip","Choudhury","585199");
	    Employee emp2 = new Employee("Abhinav","Borgohain","585162");
	    Employee emp3 = new Employee("Prateek","Sahu","585196");

	    EmployeeLinkedList empList = new EmployeeLinkedList();

		System.out.println(empList.isEmpty());

	    empList.addToFront(emp1);
	    empList.addToFront(emp2);
	    empList.addToFront(emp3);

		System.out.println(empList.isEmpty());
	    empList.printList();
		System.out.println(empList.getSize());

		empList.removeFromFront();
		empList.printList();
		System.out.println(empList.getSize());

    }
}
