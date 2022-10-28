import java.util.Scanner;

public class CollegeList{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Faculty fac = new Faculty();
		Student stu = new Student();

		System.out.print("Press E for Employee, F for Faculty, S for Student: ");
		String choice = sc.nextLine();

		if(choice.equalsIgnoreCase("E")){
			System.out.println("Type employee's name, contact number, salary, and department.");
			System.out.println("Press Enter after every input.");

			fac.setName(sc.nextLine());
			fac.setContactNum(sc.nextLine());
			fac.setSalary(sc.nextDouble());
			fac.setDepartment(sc.next());
			System.out.println("==========================================================");

			System.out.println("Name: "+fac.getName());
			System.out.println("Contact Number: "+fac.getContactNum());
			System.out.println("Salary: "+fac.getSalary());
			System.out.println("Department: "+fac.getDepartment());

		}

		else if(choice.equalsIgnoreCase("F")){
			System.out.println("Type faculty's name, contact number, salary, and department.");
			System.out.println("Press Enter after every input.");

			fac.setName(sc.nextLine());
			fac.setContactNum(sc.nextLine());
			fac.setSalary(sc.nextDouble());
			fac.setDepartment(sc.next());
			System.out.print("Press Y if regular/tenured, N if not: ");
			String choice2 = sc.next();

			if(choice2.equalsIgnoreCase("Y")){
			System.out.println("==========================================================");
			System.out.println("Name: "+fac.getName());
			System.out.println("Contact Number: "+fac.getContactNum());
			System.out.println("Salary: "+fac.getSalary());
			System.out.println("Department: "+fac.getDepartment());
			System.out.println("Tenured: "+!fac.isRegular());

			}

			else if(choice2.equalsIgnoreCase("N")){
			System.out.println("==========================================================");
			System.out.println("Name: "+fac.getName());
			System.out.println("Contact Number: "+fac.getContactNum());
			System.out.println("Salary: "+fac.getSalary());
			System.out.println("Department: "+fac.getDepartment());
			System.out.println("Tenured: "+fac.isRegular());

			}

			else{
				System.out.println("Invalid Input.");
			}
		}

		else if(choice.equalsIgnoreCase("S")){
			System.out.println("Type student's name, contact number, program, year level.");
			System.out.println("Press Enter after every input.");

			stu.setName(sc.nextLine());
			stu.setContactNum(sc.nextLine());
			stu.setProgram(sc.nextLine());
			stu.setYearLevel(sc.nextInt());

			System.out.println("==========================================================");
			System.out.println("Name: "+stu.getName());
			System.out.println("Contact Number: "+stu.getContactNum());
			System.out.println("Program: "+stu.getProgram());
			System.out.println("Year Level: "+stu.getYearLevel());
		}

		else{
			System.out.println("Invalid Input.");
		}
	}
}
