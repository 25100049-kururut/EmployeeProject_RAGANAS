package version1;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0;
    }

    public PieceWorkerEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
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

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        double basePay = totalPiecesFinished * ratePerPiece;
        int bonusBlocks = totalPiecesFinished / 100;
        double bonusPay = bonusBlocks * (10.0 * ratePerPiece);
        return basePay + bonusPay;
    }

    public void displayPieceWorkerEmployee() {
        System.out.println("PieceWorkerEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", totalPiecesFinished = " + totalPiecesFinished +
                ", ratePerPiece = " + ratePerPiece +
                '}');
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{" +
                "empID = " + empID +
                ", empName = " + empName +
                ", totalPiecesFinished = " + totalPiecesFinished +
                ", ratePerPiece = " + ratePerPiece + ", salary = " + computeSalary() +
                '}';
    }
}