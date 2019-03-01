public class Hourly extends Employee{

    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(int empId, double hourlyWage, double hoursPerWeek){
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double calcGrossPay(int month, int year){
        return this.hourlyWage * this.hoursPerWeek;
    }

    /**
     * @return the hourlyWage
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * @return the hoursPerWeek
     */
    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    /**
     * @param hoursPerWeek the hoursPerWeek to set
     */
    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

}