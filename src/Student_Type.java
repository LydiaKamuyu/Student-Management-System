
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student_Type {

    static ResultSet getData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int search;
    private String name;
    private String admno;
    private String gender;
    private String dateofbirth;
    private String major;
    private String phone;
    private String address;
   
    
    public Integer getSearch()
    {
    return search;
    }
    public void setId(Integer SEARCH)
    {
    this.search=SEARCH;
}
public String getName()
    {
    return name;
}
public void setName(String NAME)
    {
    this.name=NAME;
    
}
public String getAdmno()
    {
    return admno;
}
public void setAdmno(String ADMNO)
    {
    this.admno=ADMNO;
    
}
public String getGender()
    {
    return gender;
}
public void setGender(String GENDER)
    {
    this.gender=GENDER;
    
}
public String getDateofbirth()
    {
    return dateofbirth;
}
public void setDateofbirth(String DATEOFBIRTH)
    {
    this.dateofbirth=DATEOFBIRTH;
    
}
public String getMajor()
    {
    return major;
}
public void setMajor(String MAJOR)
    {
    this.major=MAJOR;
    
}
public String getPhone()
    {
    return phone;
}
public void setPhone(String PHONE)
    {
    this.phone=PHONE;
    
}
public String getAddress()
    {
    return address;
}
public void setSet(String ADDRESS)
    {
    this.address=ADDRESS;
    
}


public Student_Type(){}
public Student_Type(Integer SEARCH,String NAME,String ADMNO,String GENDER,String DATEOFBIRTH,String MAJOR,String PHONE,String ADDRESS)
{
    this.search=SEARCH;
    this.name=NAME;
    this.admno=ADMNO;
    this.gender=GENDER;
    this.dateofbirth=DATEOFBIRTH;
    this.major=MAJOR;
    this.phone=PHONE;
    this.phone=PHONE;
    this.address=ADDRESS;
}

public boolean execTypeQuery(String queryType,Student_Type type)
{
    PreparedStatement ps;
    
    
    if(queryType.equals("add"))
    {
        try {
            
            ps = The_Connection.getTheConnection().prepareStatement("INSERT INTO `student`(`name`, `admno`, `gender`, `dateofbirth`, `major`, `phone`, `address`) VALUES (?,?,?,?,?,?,?)");
            
            
            ps.setString(1, type.getName());
            ps.setString(2, type.getAdmno()); 
            ps.setString(3, type.getGender()); 
            ps.setString(4, type.getDateofbirth()); 
            ps.setString(5, type.getMajor()); 
            ps.setString(6, type.getPhone()); 
            ps.setString(7, type.getAddress()); 
         
            return (ps.executeUpdate() > 0);
         
         
        } catch (SQLException ex) {
            Logger.getLogger(Student_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
   else if(queryType.equals("edit"))
    {
        try {
            
            ps = The_Connection.getTheConnection().prepareStatement("UPDATE `student` SET `name`=?,`admno`=?,`gender`=?,`dateofbirth`=?,`major`=?,`phone`=?,`address`=? WHERE `search`=?");
            
            ps.setString(1, type.getName());
           ps.setString(2, type.getAdmno()); 
            ps.setString(3, type.getGender()); 
            ps.setString(4, type.getDateofbirth()); 
            ps.setString(5, type.getMajor()); 
            ps.setString(6, type.getPhone()); 
            ps.setString(7, type.getAddress()); 
            ps.setInt(8, type.getSearch());
         
            return (ps.executeUpdate() > 0);
         
         
        } catch (SQLException ex) {
            Logger.getLogger(Student_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    else if(queryType.equals("remove"))
    {
        try {
            
            ps = The_Connection.getTheConnection().prepareStatement("DELETE FROM `student` WHERE `search`= ?");
            
            ps.setInt(1, type.getSearch());
         
            return (ps.executeUpdate() > 0);
         
         
        } catch (SQLException ex) {
            Logger.getLogger(Student_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    else{
        return false;
    }
}}


