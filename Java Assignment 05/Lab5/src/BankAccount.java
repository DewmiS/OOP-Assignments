public class BankAccount {
    private int balance = 0;

    public BankAccount(int initialValue){
        this.balance = initialValue;
    }

    public void deposit(int depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println(depositAmount + " has been deposited from the account.");
    }

    public void withdraw(int withdrawAmount){
        if(withdrawAmount <= balance){
            this.balance = this.balance - withdrawAmount;
            System.out.println(withdrawAmount + " has been debited from the account.");
        }else {
            System.out.println("Insufficient account balance");
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
