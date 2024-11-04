public class ZgcCollege extends College {
    int numberOfDepartments;
    int numberOfFaculty;

    public ZgcCollege(Principal principal, Hods[] hods, Professors[] professors, Students[] students,int numberOfFaculty, int numberOfDepartments){
		super(principal, hods, professors, students);
		this.numberOfFaculty = numberOfFaculty;
		this.numberOfDepartments = numberOfDepartments;
	}

    public void printDetails(){

		System.out.println("\nPrincipal\n");
		principal.printDetails();

        for(int i = 0; i<hods.length; i++){
			hods[i].printDetails();
		}

        System.out.println("\nProfessors\n");
		for(int i = 0; i<professors.length; i++){
			professors[i].printDetails();
		}

        System.out.println("\nStudents\n");
		for(int i = 0; i<students.length; i++){
			students[i].printDetails();
		}

		System.out.println("\nNumber of Department is:"+numberOfDepartments);
		System.out.println("Number of Faculty:"+numberOfFaculty);
	}
}
