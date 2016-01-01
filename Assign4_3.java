
public class Assign4_3 {

	private String name;
	private char grade;
	private long salary;	
	private int id;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	
	public static void main(String[] args) {

		Assign4_3 obj1 = new Assign4_3();
		obj1.setName("Amit");
		obj1.setid(31);
		obj1.setGrade('B');
		obj1.setSalary(100000);
		
		System.out.println("Emp Name  : "+ obj1.getName());
		System.out.println("Emp ID    : "+ obj1.getid());
		System.out.println("Emp Grade : "+ obj1.getGrade());
		System.out.println("Emp Salary: "+ obj1.getSalary());
		System.out.println("==========");
		
		obj1.setName("Devendra");
		obj1.setid(91);
		obj1.setGrade('C');
		obj1.setSalary(450443);

		System.out.println("Emp Name  : "+ obj1.getName());
		System.out.println("Emp ID    : "+ obj1.getid());
		System.out.println("Emp Grade : "+ obj1.getGrade());
		System.out.println("Emp Salary: "+ obj1.getSalary());
		System.out.println("==========");

		obj1.setName("Rajeev");
		obj1.setid(136);
		obj1.setGrade('D');
		obj1.setSalary(736466);
		
		System.out.println("Emp Name  : "+ obj1.getName());
		System.out.println("Emp ID    : "+ obj1.getid());
		System.out.println("Emp Grade : "+ obj1.getGrade());
		System.out.println("Emp Salary: "+ obj1.getSalary());
		System.out.println("==========");
		
		obj1.setName("Sanjeev");
		obj1.setid(200);	
		obj1.setGrade('A');
		obj1.setSalary(838749);

		System.out.println("Emp Name  : "+ obj1.getName());
		System.out.println("Emp ID    : "+ obj1.getid());
		System.out.println("Emp Grade : "+ obj1.getGrade());
		System.out.println("Emp Salary: "+ obj1.getSalary());
		System.out.println("==========");
		
	}

}
