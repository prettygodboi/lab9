import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Department implements University{
    private String name;
    List<University> childDepartments = new ArrayList<>();

    public Department(){

    }

    public Department(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<University> getChildDepartments(){
        return this.childDepartments;
    }

    public void setChildDepartments(List<University> childDepartments){
        this.childDepartments = childDepartments;
    }

    public void addChildDepartment(University university){
        this.childDepartments.add(university);
    }

    @Override
    public void salaryDecrease(int sum) {
        childDepartments.forEach(university -> university.salaryDecrease(sum));
    }

    @Override
    public void salaryIncrease(int sum) {
        childDepartments.forEach(university -> university.salaryIncrease(sum));
    }

    @Override
    public int getPayslip() {
        return childDepartments.stream().mapToInt(University::getPayslip).sum();
    }

    @Override
    public void getInformation() {
        System.out.println(name);
        childDepartments.forEach(University::getInformation);
    }
}
