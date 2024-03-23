public class Main {
    public static void main(String[] args) {
        SavingsAccount sa1= new SavingsAccount(12000,2.5f);
        sa1.record(5000);
        sa1.withdraw(200);
        sa1.withdraw(100);
        sa1.withdraw(120);
        sa1.withdraw(12);
        sa1.withdraw(234);
        sa1.monthlyStatement();
        sa1.print();

    }
}