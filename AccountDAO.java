import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class AccountDAO {
    //create Account 
    public void createAccount(Account account){
       Connection con=DBConnection.getConnection();
       String sql="insert into accounts(account_number,name,phoneNumber,email,balance) values(?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement=con.prepareStatement(sql);
            preparedStatement.setInt(1,account.getAccountNumber());
            preparedStatement.setString(2,account.getName());
            preparedStatement.setString(3,account.getPhoneNumber());
            preparedStatement.setString(4,account.getEmail());
            preparedStatement.setDouble(5,account.getBalance());
             
            int rows=preparedStatement.executeUpdate();
            if(rows>0){
                System.out.println("Account created Susecsfully");
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
        //view Account
        public void viewAccount(int accountNumber){
            Connection con=DBConnection.getConnection();
            String sql="SELECT*FROM accounts WHERE account_number=?";
            try{
                PreparedStatement preparedStatement=con.prepareStatement(sql);
                preparedStatement.setInt(1,accountNumber);
                // Execute the query and process results
                ResultSet resultSet=preparedStatement.executeQuery();
                if(resultSet.next()){
                    System.out.println("Account number:"+resultSet.getInt("account_number"));
                    System.out.println("name:"+resultSet.getString("name"));
                    System.out.println("Phone number:"+resultSet.getString("phoneNumber"));
                    System.out.println("Email:"+resultSet.getString("email"));
                    System.out.println("balance:"+resultSet.getDouble("balance"));
                }else{
                    System.out.println("Account not found");
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            }
         
         //update Account
         public void updateAccount(Account account){
            Connection con=DBConnection.getConnection();
            String sql="UPDATE accounts SET name=?,phoneNumber=?,email=?,balance=? WHERE account_number=?";
            try{
                PreparedStatement preparedStatement=con.prepareStatement(sql);
                    preparedStatement.setString(1,account.getName());
                    preparedStatement.setString(2,account.getPhoneNumber());
                    preparedStatement.setString(3,account.getEmail());
                    preparedStatement.setDouble(4,account.getBalance());
                    preparedStatement.setInt(5,account.getAccountNumber());

                    int rows=preparedStatement.executeUpdate();
                    if(rows>0){
                        System.out.println("Account updated successfully");
                    }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
         }
           //delete accout
           public void deleteAccount(int accountNumber){
            Connection con=DBConnection.getConnection();
            String sql="DELETE FROM accounts WHERE account_number=?";
            try{
                 PreparedStatement preparedStatement=con.prepareStatement(sql);
                 preparedStatement.setInt(1,accountNumber);
                 int rows=preparedStatement.executeUpdate();
                 if(rows>0){
                    System.out.println("Account deleted Succesfully");
                 }
                }catch(SQLException e){
                    e.printStackTrace();
                }

            
           }
            }
        
    
    
          
