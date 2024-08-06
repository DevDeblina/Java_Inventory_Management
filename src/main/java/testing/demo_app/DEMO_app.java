package testing.demo_app;
import com.database.DB;
import com.login.LoginFrame;
import java.sql.SQLException;
public class DEMO_app {

    public static void main(String[] args) throws SQLException {        
        DB.loadConnection();
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
        
    }
}
