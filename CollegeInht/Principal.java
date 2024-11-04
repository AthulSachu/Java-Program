public class Principal extends Staff {
	String qualification;

    public Principal(String name, int age, float salary, String qualification){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.qualification = qualification;
	}

    public void printDetails(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Salary is:"+salary);
		System.out.println("Qualification is:"+qualification);
	}
}