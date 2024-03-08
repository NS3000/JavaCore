package Encapsulation;

public class Account {
    private long accNo;
    private float balance;
    private String name;
    public long getAcc() { return this.accNo; }
    public float getBalance(){
        return this.balance;
    }
    public String getName() {
        return name;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
}
