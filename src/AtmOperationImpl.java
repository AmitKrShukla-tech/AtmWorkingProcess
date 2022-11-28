import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl  implements AtmOperation{

   Atm atm=new Atm();
   Map<Double,String> ministmnt = new HashMap<>();
      @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " +atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
    if (withdrawAmount<= atm.getBalance()){
     ministmnt.put(withdrawAmount,"Amount Withdraw");
     System.out.println(withdrawAmount+ " Collect the cash");
     atm.setBalance(atm.getBalance()-withdrawAmount);
     viewBalance();
    }else {
     System.out.println("Insufficient Balance !!");
    }
    }

    @Override
    public void deposteAmount(double depositeAmount) {
       ministmnt.put(depositeAmount,"Amount Deposited");
     System.out.println(depositeAmount+ " Deposited  sucessfull !!");
     atm.setBalance(atm.getBalance()+depositeAmount);
     viewBalance();
    }

    @Override
    public void viewMiniStatement() {
       for (Map.Entry<Double,String> m:ministmnt.entrySet()){
        System.out.println(m.getKey()+ " " + m.getValue());
       }
      }
   }
