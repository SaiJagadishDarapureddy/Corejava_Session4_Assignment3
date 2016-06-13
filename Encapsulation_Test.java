
public class Encapsulation_Test {

	public static void main(String[] args) {
		
		Employee_data e1= new Employee_data();
		
		e1.setEmp_name("VIJAY");
		System.out.print("NAME:  ");
		System.out.println(e1.getEmp_name());
		
		e1.setEmp_Id(414);
		System.out.print("EMPLOYEE-ID:  ");
		System.out.println(e1.getEmp_Id());
		
		e1.setDesignation("SENIOR JAVA DEVELOPER");
		System.out.print("DESIGNATION:  ");
		System.out.println(e1.getDesignation());
		
		e1.setEmp_salary(1200000);
		System.out.print("SALARY P. A. :  ");
		System.out.println(e1.getEmp_salary());
		
		System.out.println("*****************************");
		
Employee_data e2= new Employee_data();
		
		e2.setEmp_name("SAI JAGADISH");
		System.out.print("NAME:  ");
		System.out.println(e2.getEmp_name());
		
		e2.setEmp_Id(408);
		System.out.print("EMPLOYEE-ID:  ");
		System.out.println(e2.getEmp_Id());
		
		e2.setDesignation("SENIOR ANDROID APP DEVELOPER");
		System.out.print("DESIGNATION:  ");
		System.out.println(e2.getDesignation());
		
		e2.setEmp_salary(1200000);
		System.out.print("SALARY P. A. :  ");
		System.out.println(e2.getEmp_salary());	
	}
}
