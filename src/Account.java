public class Account {

    private String id;
    private String name;
    private int balance=0;

    Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance<0){
            balance=0;
        }
        this.balance = balance;
    }

    public int credit(int amount){
        setBalance(balance+amount);
        return balance;
    }
    public int debit(int amount)throws ArithmeticException{

        if (balance<amount)
            throw new ArithmeticException("You can't take more than you have");

        setBalance(balance-amount);
        return balance;
    }
    public String transferTo(Account another, int amount){
        String result;
        if (amount>balance)
            result = "You can't transfer more than you have";
        else{
            debit(amount);
            another.credit(amount);
            result = "Transfer complete. Your new balance is: " + getBalance();
        }
        return result;
    }

    public String toString(){
        return "id: " + getId() + "\nname: " + getName()+"\nbalance: " + getBalance();
    }
}
