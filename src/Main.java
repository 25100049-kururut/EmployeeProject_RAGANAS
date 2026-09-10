import version1.BasePlusCommissionEmployee;
import version1.CommissionEmployee;
import version1.HourlyEmployee;
import version1.PieceWorkerEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---HourlyEmployee---");

        HourlyEmployee h1 = new HourlyEmployee();
        HourlyEmployee h2 = new HourlyEmployee();
        h2.setEmpID(1);
        h2.setEmpName("kyum");
        HourlyEmployee h3 = new HourlyEmployee(1, "meri", 1, 1);

        h1.displayHourlyEmployee();
        h2.displayHourlyEmployee();
        h3.displayHourlyEmployee();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println("\n---PieceWorkerEmployee---");

        PieceWorkerEmployee p1 = new PieceWorkerEmployee();
        PieceWorkerEmployee p2 = new PieceWorkerEmployee();
        p2.setEmpID(1);
        p2.setEmpName("kyum");
        PieceWorkerEmployee p3 = new PieceWorkerEmployee(1, "meri", 1, 1);


        p1.displayPieceWorkerEmployee();
        p2.displayPieceWorkerEmployee();
        p3.displayPieceWorkerEmployee();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n---CommissionEmployee---");

        CommissionEmployee c1 = new CommissionEmployee();
        CommissionEmployee c2 = new CommissionEmployee();
        c2.setEmpID(1);
        c2.setEmpName("kyum");
        CommissionEmployee c3 = new CommissionEmployee(1, "meri", 1);

        c1.displayCommissionEmployee();
        c2.displayCommissionEmployee();
        c3.displayCommissionEmployee();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n---BasePlusCommissionEmployee---");

        BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee b2 = new BasePlusCommissionEmployee();
        b2.setEmpID(1);
        b2.setEmpName("kyum");
        BasePlusCommissionEmployee b3 = new BasePlusCommissionEmployee(1, "meri", 1, 1);

        b1.displayBasePlusCommissionEmployee();
        b2.displayBasePlusCommissionEmployee();
        b3.displayBasePlusCommissionEmployee();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}