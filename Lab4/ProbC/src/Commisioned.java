import java.util.*;

public class Commisioned extends Employee{

    private double commision;
    private double baseSalary;
    private List<Order> orders = new ArrayList<>();

    public Commisioned(int empId, double commision, double baseSalary){
        super(empId);
        this.commision = commision;
        this.baseSalary = baseSalary;
    }

    public double calcGrossPay(int month, int year){
        long numOfOrders = orders.stream().filter(order -> order.getOrderDate().getMonth() == month 
        && order.getOrderDate().getYear() == year).count();
        return baseSalary + (commision * numOfOrders);
    }

    /**
     * @return the commision
     */
    public double getCommision() {
        return commision;
    }

    /**
     * @param commision the commision to set
     */
    public void setCommision(double commision) {
        this.commision = commision;
    }

    /**
     * @return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * @return the orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}