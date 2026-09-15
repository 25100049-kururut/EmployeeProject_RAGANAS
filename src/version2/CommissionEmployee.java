package version2;

public class CommissionEmployee {
    private int empID;
    private Name empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSale;

    public CommissionEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.empDateHired = new MyDate();
        this.empBirthDate = new MyDate();
        this.totalSale = 0.0;
    }

    public CommissionEmployee(int empID, Name empName) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = new MyDate();
        this.empBirthDate = new MyDate();
        this.totalSale = 0.0;
    }

    public CommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSale = 0.0;
    }

    public CommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        setTotalSale(totalSale);
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
            return (totalSale * rate) + 5000.0;
        } else {
            return totalSale * rate;
        }
    }

    public void displayCommissionEmployee() {
        System.out.println("CommissionEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", empDateHired = " + empDateHired +
                ", empBirthDate = " + empBirthDate +
                ", totalSale = " + totalSale +
                '}');
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", empDateHired = " + empDateHired +
                ", empBirthDate = " + empBirthDate +
                ", totalSale = " + totalSale +
                ", salary = " + computeSalary(6) +
                '}';
    }
}

