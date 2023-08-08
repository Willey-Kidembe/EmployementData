import java.util.Scanner;
public class Main {
    Employee employee=new Employee();
    static boolean ordering;
    public static void menu(){
        System.out.println("How can we Help you!");
        System.out.println("***Welcome to Our Employment Service***"
                + "\n1. Add Employee "
                + "\n2.View Employee"
                + "\n3.Update Employee"
                + "\n4. Delete Employee"
                + "\n5.View All Employee"
                + "\n6. Exit "
        );
    }
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        Employee employee=new Employee();
        do{
            menu();
            int choice=key.nextInt();
            switch (choice){
                case 1:
                    employee.AddEmployee();
                    break;
                case 2:
                    employee.viewEmpl();
                    break;
                case 3:
                    employee.Update();
                    break;
                case 4:
                    employee.deleteEmpl();
                    break;
                case 5:
                    employee.viewAll();
                    break;
                case 6:
                    employee.Exit();
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        } while (!ordering);
            key.close();
            };
    }
