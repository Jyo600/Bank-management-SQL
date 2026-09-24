import java.sql.Connection;
import java.util.*;
public class Main {
    public static void main(String[]args){
         Connection con=DBConnection.getConnection();
         AccountDAO dao=new AccountDAO();
         while(true){
    
       System.out.println("Bank management System ");
       System.out.println("1.Create Account");
       System.out.println("2.View Account");
       System.out.println("3.update Account");
       System.out.println("Delete Account");
       System.out.println("5.Exit");
       System.out.println("Enter your choice");
       Scanner sc=new Scanner(System.in);
       int choice=sc.nextInt();
       switch(choice){
              case 1:
                 System.out.println("enter numers to create account");
             // Scanner sc=new Scanner(System.in);
                int number =sc.nextInt();
                for(int i=0;i<number;i++){
                    System.out.println("enter deatails for accountnumber"+(i+1));
                    int accountNumber=sc.nextInt();
                    System.out.println("enter name");
                    String name=sc.next();
                    System.out.println("enter phone number");
                    String phoneNumber=sc.next();
                    System.out.println("enter email");
                    String email=sc.next();
                    System.out.println("enter balance");
                    double balance=sc.nextDouble();
                
            //AccountDAO dao=new AccountDAO();
            Account account =new Account(accountNumber, name, phoneNumber, email, balance);
            dao.createAccount(account);
                }
            break;
            case 2:
                System.out.println("enter account number to view account details");
                int accountNumber=sc.nextInt();
                dao.viewAccount(accountNumber);
                 break;
                 case 3:
                    System.out.println("Enter account number o upadate account Derails");
                     accountNumber=sc.nextInt();
                    System.out.println("enter new name");
                    String name=sc.next();
                    System.out.println(name);
                    System.out.println("enter new phone number");
                    String phoneNumber=sc.next();
                    System.out.println(phoneNumber);
                    System.out.println("enter new mail");
                    String email=sc.next();
                    System.out.println(email);
                    System.out.println("enter new balance");
                    double balance=sc.nextDouble();
                    System.out.println(balance);
                    Account account=new Account(accountNumber,name,phoneNumber,email,balance);
                    dao.updateAccount(account);
                    break;
                    case 4:
                        System.out.println("Enter account number to delete account");
                         accountNumber=sc.nextInt();
                        dao.deleteAccount(accountNumber);
                        break;
                        case 5:
                            System.out.println("exiting the code ");
                            System.exit(0);
                            default:
                                System.out.println("invalid choice");
                                break;

       }
    }
}
}

