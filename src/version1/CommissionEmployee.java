package version1;

public class CommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;

    public CommissionEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0.0;
    }

    public CommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0.0;
    }

    public CommissionEmployee(int empID, String empName, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        setTotalSale(totalSale);
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double computeSalary() {
        double rate = 0;

        if (totalSale < 50000) {
            rate = 0.05;
        } else if (totalSale < 100000) {
            rate = 0.10;
        } else if (totalSale < 500000) {
            rate = 0.15;
        } else {
            rate = 0.20;
        }

        return totalSale * rate;
    }

    public void displayCommissionEmployee() {
        System.out.println("CommissionEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", totalSale = " + totalSale +
                '}');
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", totalSale = " + totalSale + ", salary = " + computeSalary() +
                '}';
    }
}
