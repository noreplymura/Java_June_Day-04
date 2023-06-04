 class Account {
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n, float amt){
        acc_no=a;
        name=n;
        amount=amt;
    } 
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+"\tdeposited");
    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("insufficient Balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+"\twithdrawn");
        }
    }
    void checkBalance(){System.out.println("Balance is:\t"+amount);}
    void display(){System.out.println(acc_no+"\t"+name+"\t"+amount);}
}
class TestAccount{
    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert(832345,"Ankit",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}
