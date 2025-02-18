public abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public void displayEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("-------------------------------");
    }
}

interface Payable {
    double getPaymentAmount();
}

class FullTimeEmployee extends Employee implements Payable {
    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

class ContractEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

class Main1 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice Johnson", 101, 5000);
        ContractEmployee contractEmployee = new ContractEmployee("Bob Smith", 102, 50, 80);

        fullTimeEmployee.displayEmployeeInfo();
        contractEmployee.displayEmployeeInfo();
    }
}





