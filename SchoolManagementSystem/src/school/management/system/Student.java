package school.management.system;

public class Student {

    private int id;     //Unique Id for student
    private String name;  // Name of the student
    private int grade;  // Grade of the Student
    private int feesPaid; // Amount of fees paid by the student
    private int feesTotal; // Amount of fees due by the student

    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=50000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void payFees(int payment){
        feesPaid+=payment;
        School.updateTotalMoneyEarned(payment);
    }

    public int getRemainingFees(){
        return (feesTotal-feesPaid);
    }
}
