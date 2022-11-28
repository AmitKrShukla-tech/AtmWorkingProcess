import javax.swing.text.html.Option;
import java.util.Scanner;

public class MainAtmHandler {
    public static void main(String[] args) {
        //valodate user based on atm no and atm pin

        AtmOperationImpl op=new AtmOperationImpl();

        int atmNumber=123456;
        int atmPin=1234;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Atm Number");
        int atmCardNumber=sc.nextInt();
        System.out.println("Enter the Atm Pin");
        int atmSecurePin=sc.nextInt();

        if ((atmNumber==atmCardNumber) && (atmPin==atmSecurePin)) {
            System.out.println("Validating sucessful");

            while(true){
                System.out.println("1.View Available Balance");
                System.out.println("2.Withdraw Amount");
                System.out.println("3.Deposite Amount");
                System.out.println("4.Mini Statement");
                System.out.println("5.Exit");

//                System.out.println("1.View Available Balance \n 2.Withdraw Amount \n 3.Deposite Amount \n 4.Mini Statement \n 5.Exit" );

                System.out.println("Enter the Option");
                int SELECT=sc.nextInt();
                if (SELECT==1){
                  op.viewBalance();
                } else if (SELECT==2) {
                    System.out.println("Enter Amount to Withdraw : ");
                    double withdrawAmount =sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (SELECT==3) {
                    System.out.println("Enter Amount to Deposite : ");
                    double deposteAmount=sc.nextDouble();
                    op.deposteAmount(deposteAmount);

                } else if (SELECT==4) {
                op.viewMiniStatement();

                } else if (SELECT==5) {
                    System.out.println("Collect Your Atm Card \n Thank you ! visit Again");
                    System.exit(0);
                }
                else {
                    System.out.println("please Enter correct choice");
                }
            }

        }else {
            System.out.println("Incorrect atmnumber or pin..check onces");
            System.exit(0);
        }
    }

}
