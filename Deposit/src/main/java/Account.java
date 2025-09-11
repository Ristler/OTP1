public class Account {
    private double member;

    public Account() {
        this.member = 0;
    }

    public void deposit(double amount) {
        this.member += amount;
    }

    public double withdraw(double amount) {
        if(amount <= member) {
            member -= amount;
            return amount;
        } else {
            return 0.0;
        }
    }
    public double getBalance() {
        return member;
    }
}
