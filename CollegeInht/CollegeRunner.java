public class CollegeRunner {
    public static void main(String[] args) {
        Hods hod1 = new Hods("Vikram", 50, 75000.00f, "Computer Science");
        Hods hod2 = new Hods("Meera", 48, 73000.00f, "Electronics");
        Hods[] zgcHods = {hod1, hod2};
    
        Principal zgcPrincipal = new Principal("Dr. Arun Kumar", 60, 120000.00f, "PhD in Education");
    
        Professors professor1 = new Professors("Dr. Pooja Singh", 42, 55000.00f, "Data Structures");
        Professors professor2 = new Professors("Dr. Ravi Menon", 45, 57000.00f, "Machine Learning");
        Professors professor3 = new Professors("Dr. Lata Sharma", 40, 54000.00f, "Operating Systems");
        Professors professor4 = new Professors("Dr. Amit Roy", 38, 50000.00f, "Networks");
        Professors[] zgcProfessors = {professor1, professor2, professor3, professor4};
    
        Students student1 = new Students("Rahul Sharma", 22, "Computer Science");
        Students student2 = new Students("Priya Nair", 21, "Electronics");
        Students student3 = new Students("Karan Patel", 23, "Mechanical Engineering");
        Students student4 = new Students("Sneha Rao", 20, "Civil Engineering");
        Students student5 = new Students("Ananya Das", 22, "Electrical Engineering");
        Students[] zgcStudents = {student1, student2, student3, student4, student5};
    
        ZgcCollege zgcCollege = new ZgcCollege(zgcPrincipal, zgcHods, zgcProfessors, zgcStudents, 5, 20);
        
        zgcCollege.printDetails();
    
        Hods hod3 = new Hods("Priya", 45, 78000.00f, "Computer Science");
        Hods hod4 = new Hods("Ramesh", 50, 82000.00f, "Mechanical Engineering");
        Hods[] stJosephHods = {hod3, hod4};
    
        Principal stJosephPrincipal = new Principal("Dr. John Smith", 55, 130000.00f, "PhD in Education");
    
        Professors professor5 = new Professors("Dr. Emily White", 40, 60000.00f, "Artificial Intelligence");
        Professors professor6 = new Professors("Dr. Michael Brown", 42, 62000.00f, "Data Science");
        Professors professor7 = new Professors("Dr. Sarah Green", 38, 58000.00f, "Networking");
        Professors[] stJosephProfessors = {professor5, professor6, professor7};
    
        Students student6 = new Students("Aditi", 20, "Computer Science");
        Students student7 = new Students("Rahul", 21, "Mechanical Engineering");
        Students student8 = new Students("Sneha", 22, "Electrical Engineering");
        Students student9 = new Students("Vikram", 23, "Civil Engineering");
        Students student10 = new Students("Ananya", 20, "Chemical Engineering");
        Students[] stJosephStudents = {student6, student7, student8, student9, student10};
    
        StJosephCollege stJosephCollege = new StJosephCollege(stJosephPrincipal, stJosephHods, stJosephProfessors, stJosephStudents, 5, 20);
        
        stJosephCollege.printDetails();
    }
    
}
