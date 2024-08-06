
package com.login;

import com.database.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Bal {
    public void insertDataSignup(Bean beanObj){
        try{
            String query ="insert into signup(FullName,Email,Password) values(?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,beanObj.getFullname());
            ps.setString(2,beanObj.getEmail());
            ps.setString(3,beanObj.getPass());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "You havesucessfully signedup.Go to login");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    
    public boolean checkLogin(String email,String pass){
        boolean b = false;
        try{
            String query = "select Email, Password from signup where Email ='"+email+"'AND Password='"+pass+"'";
            Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                b=true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid email or password ,try again.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return b;
    }
}



