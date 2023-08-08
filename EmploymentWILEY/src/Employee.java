import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Employee {
    Scanner sc=new Scanner(System.in);
    HashSet<EmployeePersona> empSet =new HashSet<EmployeePersona>();

    EmployeePersona emp1=new EmployeePersona("Bren", "Neti", 100,
            "American", "Las Vegas", "Engineering", 120);
    EmployeePersona emp2=new EmployeePersona("Lindrass", "Riri", 200,
                "American", "Las Vegas", "Engineering", 100);
    EmployeePersona emp3=new EmployeePersona("Donnie", "Hillary", 300,
                "British", "UK", "HR", 130);
    EmployeePersona emp4=new EmployeePersona("John", "Brett", 400,
                "American", "Georgia", "FilmMaker", 110);
    EmployeePersona emp5=new EmployeePersona("Mercy", "Cheet", 500,
            "British", "Monterey", "Software", 90);
    public Employee(){
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        empSet.add(emp5);
    };
    int id;
    String firstname;
    String lastname;
    String department;
    String nationality;
    String designation;
    int salary;
    public void viewAll(){
        for(EmployeePersona empg: empSet){
            System.out.println(empg);
        };
        System.out.println("All Seen!");
    };
    public void AddEmployee(){
        System.out.println("Enter ID");
        id=sc.nextInt();
        System.out.println("Enter FirstName");
        firstname=sc.next();
        System.out.println("Enter LastName");
        lastname=sc.next();
        System.out.println("Enter Department");
        department=sc.next();
        System.out.println("Enter Nationality");
        nationality=sc.next();
        System.out.println("Enter Designation");
        designation=sc.next();
        System.out.println("Enter Salary");
        salary= (int) sc.nextDouble();
        System.out.println("Added Successfully");
        EmployeePersona emp=new EmployeePersona(firstname, lastname, id, nationality,
                designation, department, salary);
        empSet.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");
    }
    public void viewEmpl(){
        System.out.println("Enter ID");
        id= sc.nextInt();
        for(EmployeePersona empf: empSet){
            if(id==empf.getId()){
                System.out.println(empf);
                System.out.println("Viewed Successfully");
            }
        }
    }
    public void deleteEmpl(){
        System.out.println("Enter ID");
        id= sc.nextInt();
        boolean found=false;
        for (EmployeePersona em:empSet){
            if(id==em.getId()){
                empSet.remove(em);
                System.out.println("Employee "+em.getFirstname()+ " "+em.getLastname()+" was Deleted.");
            };
        }
    }
    public void Update() {
        System.out.println("Enter id: ");
        id=sc.nextInt();
        for(EmployeePersona empg:empSet) {
            if(empg.getId()==id) {
                System.out.println("Which Fields You Wish to Update? ");
                System.out.println("1. FirstName\n" +
                        "2. LastName\n" +
                        "3. Salary\n" +
                        "4. Designation\n" +
                        "5. Nationality\n" +
                        "6. Department\n" +
                        "7. Quit Updates!");
                while (sc.hasNextInt()) {
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter FirstName");
                            firstname = sc.next();
                            empg.setFirstname(firstname);
                            System.out.println("Which Above Fields You Wish to continue Update? ");
                            break;
                        case 2:
                            System.out.println("Enter LastName");
                            lastname = sc.next();
                            empg.setLastname(lastname);
                            System.out.println("Which Above Fields You Wish to continue Update? ");
                            break;
                        case 3:
                            System.out.println("Enter Salary");
                            salary = (int) sc.nextDouble();
                            empg.setSalary(salary);
                            System.out.println("Which Above Fields You Wish to continue Update? ");
                            break;
                        case 4:
                            System.out.println("Enter Designation");
                            designation = sc.next();
                            empg.setDesignation(designation);
                            System.out.println("Which Above Fields You Wish to continue Update? ");
                            break;
                        case 5:
                            System.out.println("Enter Nationality");
                            nationality = sc.next();
                            empg.setNationality(nationality);
                            System.out.println("Which Above Fields You Wish to continue Update? ");
                            break;
                        case 6:
                            System.out.println("Enter Department");
                            department = sc.next();
                            empg.setDepartment(department);
                            System.out.println("Which Above Fields You Wish to continue Update? ");
                            break;
                        case 7:
                            System.out.println(empg);
                            System.exit(0);
                        default:
                            System.out.println("Check Update Values!");
                    }
                }
            };
        }
            System.out.println("Employee details updated successfully !!");
    }
    public void Exit(){
        System.exit(0);
    }
}
