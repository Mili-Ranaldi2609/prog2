public abstract class Account {
    protected float balance;
    protected  int numberConsignments = 0;
    protected int numberWithdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission;

    public Account(float balance,float annualRate) {
        this.annualRate = annualRate;
        this.balance=balance;
    }

    public float getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(float annualRate) {
        this.annualRate = annualRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getMonthlyCommission() {
        return monthlyCommission;
    }

    public void setMonthlyCommission(float monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }

    public int getNumberConsignments() {
        return numberConsignments;
    }

    public void setNumberConsignments(int numberConsignments) {
        this.numberConsignments = numberConsignments;
    }

    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }
    public void record(float amount){
        balance+=amount;
        numberConsignments++;

    }
    public void withdraw(float amount){
        if(amount<=balance){
            balance-=amount;
            numberWithdrawals++;
        }else{
            System.out.println("El monto a retirar supera el saldo, por favor reinicie el programa e intentelo nuevamente.");
        }
    }
    public void calculateInterest(){
        float monthlyInterest = balance*(annualRate/12)/100;
        balance+=monthlyInterest;
    }
    public void monthlyStatement(){
        balance-=monthlyCommission;
        calculateInterest();
    }


}
