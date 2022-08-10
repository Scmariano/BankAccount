public class BankAccountTest {
    public static void main (String[] args) {
        BankAccount bPI = new BankAccount();
        System.out.println("New Account No. - " + bPI.getAccountNumber());
        bPI.depositMoney(500, "savings");
        bPI.depositMoney(200, "checking");
        bPI.displayBalance();
        bPI.withdrawMoney(600, "checking");
        System.out.println(bPI.getCheckingBalance());
        System.out.println(bPI.getSavingBalance());


        BankAccount bDO = new BankAccount();
        System.out.println("New Account No. - " + bDO.getAccountNumber());
        bDO.depositMoney(1000, "checking");
        bDO.depositMoney(600, "savings");
        bDO.displayBalance();
        bDO.withdrawMoney(150, "checking");

        System.out.println(bDO.getCheckingBalance());
        System.out.println(bDO.getSavingBalance());

        System.out.println(BankAccount.totalMoney);
    }

}
