public class CurrentAccount extends Account {
    protected float overdraft=0;
    protected int countConsignments = 0;
    protected int countWithdrawals = 0;
    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }
    @Override
    public void withdraw(float amount){
        if (amount > balance) {
            overdraft += (amount - balance);
            balance = 0;
        } else {
            balance -= amount;
        }
        countWithdrawals++;

    }
    @Override
    public void record(float amount){
        if (overdraft>0){
            if(amount<=overdraft){
                overdraft-=amount;
            }else{
                balance+=(amount-overdraft);
                overdraft=0;
            }
        }else{
            balance+=amount;
        }
        countConsignments++;
    }
    @Override
    public void monthlyStatement(){
        super.monthlyStatement();
    }
    public void print(){
        System.out.println("Saldo de la cuenta: "+balance);
        System.out.println("Comision mensual: "+monthlyCommission);
        System.out.println("Nro de transacciones: "+(countWithdrawals+countConsignments));
        System.out.println("Total del sobregiro: "+overdraft);
    }

}
