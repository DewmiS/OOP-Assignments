public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000);
        account.deposit(50000);
        account.withdraw(25000);
        System.out.println("Account balance is " + account.getBalance());
    }
}
