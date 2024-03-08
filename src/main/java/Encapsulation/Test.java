package Encapsulation;

public class Test {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAccNo(1001);
        acc.setName("Ayush");
        acc.setBalance(1000.0f);

        System.out.println(acc.getName() + " has Amount "+acc.getBalance()+" in Account No. "+ acc.getAcc());
    }
}
