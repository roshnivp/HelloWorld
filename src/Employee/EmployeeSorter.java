package Employee; /**
 * Created by roshni on 6/8/16.
 */
import java.util.Arrays;

public class EmployeeSorter {

private  Employee[] employees;
    public EmployeeSorter(int size)
    {
        this.employees= new Employee[size];
    }

    public void sort(){
        for (int i=0; i<employees.length; i++){
            Employee current=employees[i];
            int j=i-1;
            while (j>=0 && employees[i].employeeNumber>=current.employeeNumber){
                employees[j+1]= employees[i];
                j--;
            }
            employees[j+1]=current;
        }
    }
    public static void main(String[] args){
        EmployeeSorter sorter=new EmployeeSorter(4);
        Employee emp1=new Employee(1009,"john","issac","john.gmail.com");
        sorter.employees[0]=emp1;
        Employee emp2=new Employee(1008,"jose","mark","jose.gmail.com");
        sorter.employees[1]=emp2;
        Employee emp3=new Employee(1002,"joen","issac","joen.gmail.com");
        sorter.employees[2]=emp3;
        Employee emp4=new Employee(1011,"jojen","jose","jojen.gmail.com");
        sorter.employees[3]=emp4;
        sorter.sort();
        System.out.println(Arrays.deepToString(sorter.employees));

    }
}

class Employee{
    public int employeeNumber;
    public String firstName;
    public String lastName;
    public String email;

    public Employee(int employeeNumber,String firstName,String lastName,String email){
        this.email=email;
        this.employeeNumber=employeeNumber;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    @Override
	public String toString(){
       return this.employeeNumber +":"+this.email;
    }
}