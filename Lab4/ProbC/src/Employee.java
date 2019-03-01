import java.util.*;

public abstract class Employee{
    public int empId;

    public Employee(int empId){
        this.empId = empId;
    }

    //uses a default date object for simplicity
    public void print(){
        System.out.println("Salary of " + empId);
        Date date = new Date();
        calcCompensation(date.getMonth(), date.getYear()).print();
    }
    public Paycheck calcCompensation(int month, int year){
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay);
    }
    public abstract double calcGrossPay(int month, int year);

    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }


}