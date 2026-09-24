public class Account{
    private int accountNumber;
    private String name;
    private String phoneNumber;
    private String email;
    private double balance;
    //private Connection con;

//Account account1= new Account();
public Account(int accountNumber, String name,String phoneNumber,String email,double balance){
        this.accountNumber=accountNumber;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.balance=balance;
}

   public int getAccountNumber(){
    return accountNumber;
   }   
   public String getName(){
    return name;
   }
   public String getPhoneNumber(){
    return phoneNumber;
    
   }
   public String getEmail(){
    return email;
   }
   public double getBalance(){
    return balance;
   }
   public void setAccountNumber(int accountNumber){
    this.accountNumber=accountNumber;
   }
   public void setname(String name){
    this.name=name;
   }
   public void setPhonenumber(String phoneNumber){
    this.phoneNumber=phoneNumber;
   }
   public void setEmail(String mail){
    this.email=email;
   }
   public void setBalance(double balance){
    this.balance=balance;
   }
}