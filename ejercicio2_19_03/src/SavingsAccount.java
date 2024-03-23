public class SavingsAccount extends Account{

        protected boolean isAcctive = (balance>=10000);
        protected int countConsignments = 0;
        protected int countWithdrawals = 0;

        public SavingsAccount(float balance, float annualRate) {
                super(balance, annualRate);

        }

        public boolean isAcctive() {
                return isAcctive;
        }

        public void setAcctive(boolean acctive) {
                isAcctive = acctive;
        }

        public int getCountConsignments() {
                return countConsignments;
        }

        public void setCountConsignments(int countConsignments) {
                this.countConsignments = countConsignments;
        }

        public int getCountWithdrawals() {
                return countWithdrawals;
        }

        public void setCountWithdrawals(int countWithdrawals) {
                this.countWithdrawals = countWithdrawals;
        }

        @Override
        public void record(float amount){
                if(isAcctive== true){
                     balance+=amount;
                     countConsignments++;
                }else{
                        System.out.println("No se puede hacer la operacion la cuenta esta inactiva");
                }}
        @Override
        public void withdraw(float amount){
                if(isAcctive==true){
                     if(amount<=balance){
                        balance-=amount;
                        countWithdrawals++;
                     }else{
                        System.out.println("El monto a retirar supera el saldo, por favor reinicie el programa e intentelo nuevamente.");}
                }else{
                        System.out.println("No se puede hacer la operacion la cuenta esta inactiva");
                }
        }
        @Override
        public void monthlyStatement(){
                if(countWithdrawals>4){
                      monthlyCommission+=(countWithdrawals-4)*1000;
                }
                balance-=monthlyCommission;
                isAcctive=balance>=10000;
        }
        public void print(){
                System.out.println("Saldo de la cuenta: "+balance);
                System.out.println("Comision mensual: "+monthlyCommission);
                System.out.println("Transacciones realizadas: "+(countWithdrawals+countConsignments));
        }

}
