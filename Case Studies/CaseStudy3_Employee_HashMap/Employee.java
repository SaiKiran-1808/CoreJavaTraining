package com.evergent.corejava.collection.task5;

import java.util.HashMap;
import java.util.Scanner;

public class Employee {

	private int employee_id;
	private String name;
	private String department;

	HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	public Employee() {

	}

	public Employee(int employee_id, String name, String department) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.department = department;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void add(int id, Employee employee) {
		employeeMap.put(id, employee);
		System.out.println("Successfully added employee with id : " + id);
	}

	public void getById(int id) {
		System.out.println(employeeMap.get(id));
	}

	public void update(int id2, int option, String value) {
		for (int i = 0; i < employeeMap.size(); i++) {
			if (employeeMap.containsKey(id2)) {
				if (option == 1)
					employeeMap.get(id2).setName(name);
				else if (option == 2)
					employeeMap.get(id2).setDepartment(value);
			} else
				System.out.println("Employee with " + id2 + " does not exist");
		}
	}

	public void remove(int id) {
		System.out.println("Employee removed : " + employeeMap.remove(id));
	}

	public void displayAll() {
		employeeMap.values().forEach(x -> System.out.println(x));
		;
	}

	@Override
	public String toString() {
		return "EmployeeManagementSystem [employee_id=" + employee_id + ", name=" + name + ", department=" + department
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Employee emp = new Employee();
		int input;

		while (true) {
			System.out.println("1. Add employee");
			System.out.println("2. Get by Id");
			System.out.println("3. Update employee");
			System.out.println("4. Remove employee");
			System.out.println("5. List all employees");

			input = in.nextInt();
			in.nextLine();
			switch (input) {
			case 1:
				System.out.println("Enter id : ");
				int id = in.nextInt();
				in.nextLine();
				System.out.println("Enter name : ");
				String name = in.nextLine();
				System.out.println("Enter department : ");
				String department = in.nextLine();
				emp.add(id, new Employee(id, name, department));
				break;
			case 2:
				System.out.println("Enter id to get employee details : ");
				int id1 = in.nextInt();
				in.nextLine();
				emp.getById(id1);
				break;
			case 3:
				System.out.println("Enter id to get employee details : ");
				int id2 = in.nextInt();
				System.out.println("Would you like to update? 1.Name 2. Department");
				input = in.nextInt();
				in.nextLine();
				switch (input) {
				case 1:
					System.out.println("Enter new name : ");
					String name1 = in.nextLine();
					emp.update(id2, input, name1);
					break;
				case 2:
					System.out.println("Enter new department : ");
					String department1 = in.nextLine();
					emp.update(id2, input, department1);
					break;
				default:
					System.out.println("Choose a valid option");
					break;
				}
				break;
			case 4:
				System.out.println("Enter id to remove employee : ");
				int id3 = in.nextInt();
				emp.remove(id3);
				break;

			case 5:
				emp.displayAll();
				break;

			}

		}

	}

}
