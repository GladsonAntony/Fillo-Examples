package examples;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.testng.annotations.Test;

public class Test2_UpdateExample
{
    public static String ProjectWorkingDirectory = System.getProperty("user.dir");

    @Test
    public void  test_UpdateQuery1() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/UpdateExample.xlsx");
        String strQuery="UPDATE SHEET1 SET COUNTRY = 'Niiue' where ID='7'";
        connection.executeUpdate(strQuery);
        connection.close();
    }

    @Test
    public void  test_UpdateQuery2() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/UpdateExample.xlsx");
        String strQuery="UPDATE SHEET1 SET COUNTRY = 'Niue' where ID='7'";
        connection.executeUpdate(strQuery);
        connection.close();
    }
}
