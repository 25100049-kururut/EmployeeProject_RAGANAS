package version2;

public class BasePlusCommissionEmployee {
    private int empID;
    private Name empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.empDateHired = new MyDate();
        this.empBirthDate = new MyDate();
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = new MyDate();
        this.empBirthDate = new MyDate();
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public MyDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(MyDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(MyDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        return computeSalary(-1);
    }

    public double computeSalary(int currentMonth) {
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

        if (empBirthDate.getMonth() == currentMonth) {
            return (baseSalary + (totalSale * rate)) + 5000.0;
        } else {
            return baseSalary + (totalSale * rate);
        }
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.println("BasePlusCommissionEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", empDateHired = " + empDateHired +
                ", empBirthDate = " + empBirthDate +
                ", totalSale = " + totalSale +
                ", baseSalary = " + baseSalary +
                '}');
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", empDateHired = " + empDateHired +
                ", empBirthDate = " + empBirthDate +
                ", totalSale = " + totalSale +
                ", baseSalary = " + baseSalary +
                ", salary = " + computeSalary(6) +
                '}';
    }
}