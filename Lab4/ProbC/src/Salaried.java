public class Salaried extends Employee{

    private double salary;

    public Salaried(int empId, double salary){
        super(empId);
        this.salary = salary;
    }
    public double calcGrossPay(int month, int year){
        return this.salary;
    }
    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }



}
