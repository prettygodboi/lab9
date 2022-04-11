import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee extends IOException implements University{
    private String surname;
    private int salary;

    public Employee(String surname, int salary){
        this.surname = surname;
        this.salary = salary;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getSalary(){return salary;}

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public void salaryDecrease(int sum) {
        salary -= sum;
    }

    @Override
    public void getInformation() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Зарплата: " + salary);
    }

    @Override
    public int getPayslip() {
        return salary;
    }

    @Override
    public void salaryIncrease(int sum) {
        salary += sum;
    }
}
