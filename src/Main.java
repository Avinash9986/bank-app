public class Main {
    public static void main(String[] args) {


        HDFCAccount VivekAcc = new HDFCAccount("Vivek","Vivek@123",2000) ;

        System.out.println(VivekAcc);

        //fetchBalance
        System.out.println(VivekAcc.fetchBalance("Vivek@123"));
        System.out.println(VivekAcc.fetchBalance("vivek@123"));

        // add money
        System.out.println(VivekAcc.addMoney(10000));

        //withdra
        System.out.println(VivekAcc.withdrawMoney(200000.0,"Vivek@123"));
        System.out.println(VivekAcc.withdrawMoney(5000.0,"Vivek@123"));

        //change password
        System.out.println(VivekAcc.changePassword("Vivek@123","Vivek@321"));

        //
        System.out.println(VivekAcc.calculateInterest( 5));

    }
}