public class EmployeePersona {
    private String firstname;
    private String lastname;
    private int id;
    private String nationality;
    private String designation;
    private String department;
    private int salary;
//   Getters and Setters

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstname() {return firstname;}

    public String getLastname() {return lastname;}

    public int getId() {return id;}
    public String getNationality() {return nationality;}

    public String getDesignation() {return designation;}

    public String getDepartment() {return department;}
    public double getSalary() {return this.salary;}


    public String toString(){
        return "Employee name is "+firstname+" "+lastname+" with ID "+id+" " +
                "nationality "+nationality+ " designated "+designation+ " under "+department+ " " +
                        "department having salary of "+salary;
    }
    public EmployeePersona(String firstname, String lastname, int id, String nationality,
                           String designation, String department, int salary){
        this.firstname=firstname;
        this.lastname=lastname;
        this.id=id;
        this.nationality=nationality;
        this.designation=designation;
        this.department=department;
        this.salary=salary;
    }
}

