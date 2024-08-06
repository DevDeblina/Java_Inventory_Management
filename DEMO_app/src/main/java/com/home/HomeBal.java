
package com.home;

import com.database.DB;
import java.util.List;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HomeBal {
    public List<HomeBean> loadData() throws SQLException {
        
    List<HomeBean> list = new ArrayList<>();
        try{
            String query ="select * from details";
            PreparedStatement ps =DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String medicine = rs.getString("Medicine");
                int medicine_id = rs.getInt("MedicineId");
                int quantity = rs.getInt("Quantity");
                Date expiry_date = rs.getDate("ExpiryDate");
                float price = rs.getFloat("Price");
                HomeBean bean = new HomeBean(medicine,medicine_id,quantity,expiry_date,price);
                    list.add(bean);
                }
            }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
     return list;
    }

    
    public void insert(HomeBean homeBean ){
        try{
            
            String query="insert into details(Medicine, MedicineId, Quantity, ExpiryDate, Price) values(?,?,?,?,?)";
            PreparedStatement ps;
            ps = DB.con.prepareStatement(query);
             ps.setString(1,homeBean.getMedicine());
             int medicineId = homeBean.getMedicine_id();
             ps.setInt(2, medicineId);
             int quantity = homeBean.getQuantity();
             ps.setInt(3, quantity);
             Date expiryDate = (Date) homeBean.getexpiry_date(); // Assuming getexpiry_date() returns a Date object.

// Format the Date as a String in "yyyy-MM-dd" format.
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String expiryDateString = sdf.format(expiryDate);

// Convert the formatted String back to a java.sql.Date.
java.sql.Date sqlExpiryDate = java.sql.Date.valueOf(expiryDateString);

// Set the java.sql.Date in the PreparedStatement.
ps.setObject(4, sqlExpiryDate);

             float price = homeBean.getPrice();
             ps.setFloat(5, price);
             
             ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "A record has been inserted");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    public HomeBean returnAllDataToTextFields(int medicine_id){
        HomeBean bean = null;
        try{
            String query ="select * from details where MedicineId = "+medicine_id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                medicine_id = rs.getInt("MedicineId");
                String medicine = rs.getString("Medicine");
                int quantity = rs.getInt("Quantity");
                Date expiry_date = rs.getDate("ExpiryDate");
                float price = rs.getFloat("Price");
                bean = new HomeBean (medicine,medicine_id,quantity,expiry_date,price);
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return (bean);
    }
    public void UpdateData(HomeBean bean){
        try{
            
            String query = "update details set Medicine=?,Quantity=?,ExpiryDate=?,Price=? where MedicineId=?";
            PreparedStatement ps;
            ps = DB.con.prepareStatement(query);
             ps.setString(1,bean.getMedicine());
             int quantity = bean.getQuantity();
             ps.setInt(2, quantity);
             Date expiryDate = (Date) bean.getexpiry_date(); // Assuming getexpiry_date() returns a Date object.

// Format the Date as a String in "yyyy-MM-dd" format.
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String expiryDateString = sdf.format(expiryDate);

// Convert the formatted String back to a java.sql.Date.
java.sql.Date sqlExpiryDate = java.sql.Date.valueOf(expiryDateString);
// Set the java.sql.Date in the PreparedStatement.
ps.setObject(3, sqlExpiryDate);

             float price = bean.getPrice();
             ps.setFloat(4, price);
             
             int medicineId = bean.getMedicine_id();
             ps.setInt(5, medicineId);
             ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "A record has been updated");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        }
    
    public void deleteRecord(int medicine_id){
        try{
            String query = "delete from details where MedicineId=?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, medicine_id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been deleted");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
}

