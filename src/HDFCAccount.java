import java.util.UUID;

public class HDFCAccount implements BankAcountInterface{

    private String name ;

    private  String accountNo ;

    final String IFSCcode = "HDFC123" ;

    private  String password ;

    private double balance ;

    final double rateofInterest = 7.1  ;

    public HDFCAccount() {
    }

    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID()) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofInterest() {
        return rateofInterest;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your Balance is : " + this.balance ;
        }
        return "Incorrect Password" ;
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount ;
        return "amount addes Succesfully to youre account" ;
    }

    @Override
    public String withdrawMoney(Double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance <  amount){
                return "Insuuficint Balance" ;
            }
            this.balance -= amount ;
            return "Amount dedctured succedfluuy, new balance " + this.balance ;
        }
        return "Incorrect Password" ;
     }

    @Override
    public String changePassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword)){
            this.password = newpassword ;
            return "Passowrd changed Succesfully" ;
        }
        return "Incorrect old Password" ;
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*year*rateofInterest) / 100.0 ;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", IFSCcode='" + IFSCcode + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateofInterest=" + rateofInterest +
                '}';
    }
}

