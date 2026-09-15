package version2;

public class PieceWorkerEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0;
    }

    public PieceWorkerEmployee(int empID, Name empName) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0;
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getEmpID() {
        return empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        return computeSalary(-1);
    }

    public double computeSalary(int currentMonth) {
        double basePay = totalPiecesFinished * ratePerPiece;
        int bonusBlocks = totalPiecesFinished / 100;
        double bonusPay = bonusBlocks * (10.0 * ratePerPiece);
        double salary = basePay + bonusPay;
        if (birthDate.getMonth() == currentMonth) {
            salary += 5000.0;
        }
        return salary;
    }

    public void displayPieceWorkerEmployee() {
        System.out.println("PieceWorkerEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", birthDate = " + birthDate +
                ", dateHired = " + dateHired +
                ", totalPiecesFinished = " + totalPiecesFinished +
                ", ratePerPiece = " + ratePerPiece +
                '}');
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", birthDate = " + birthDate +
                ", dateHired = " + dateHired +
                ", totalPiecesFinished = " + totalPiecesFinished +
                ", ratePerPiece = " + ratePerPiece + ", salary = " + computeSalary(6) +
                '}';
    }
}