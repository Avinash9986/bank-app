public interface BankAcountInterface {

    String fetchBalance(String password) ;

    String  addMoney(double amount) ;

    String withdrawMoney(Double amount, String password ) ;

    String changePassword(String oldpassword, String newpassword) ;

    double calculateInterest(int year) ;



}
