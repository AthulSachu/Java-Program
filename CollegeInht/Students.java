public class Students extends StudentInfo {
    String departmentName;

    public Students(String sdtName, int sdtAge, String departmentName){

		this.sdtName = sdtName;
		this.sdtAge = sdtAge;
		this.departmentName = departmentName;
	}

	public void printDetails(){
		System.out.println("Name is:"+sdtName);
		System.out.println("Age is:"+sdtAge);
		System.out.println("Department Name is:"+departmentName);
	}
}
