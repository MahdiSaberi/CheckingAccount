public class CheckingAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public CheckingAccount(int initialBalance) {
        balance = initialBalance;
    }

    public boolean withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}
