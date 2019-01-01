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
        String strQuery=" Update Sheet1 Set Country='Niiue' where ID='7' ";
        connection.executeUpdate(strQuery);

        Recordset recordset=connection.executeQuery("Select Country From Sheet1");
        for (int i=0; i<7; i++)
        {
            recordset.next();
        }
        System.out.println(recordset.getField(0).value());
        recordset.close();

        connection.close();
    }

    @Test
    public void  test_UpdateQuery2() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/UpdateExample.xlsx");
        String strQuery=" Update Sheet1 Set Country='Niue' where ID='7' ";
        connection.executeUpdate(strQuery);

        Recordset recordset=connection.executeQuery("Select Country From Sheet1");
        for (int i=0; i<7; i++)
        {
            recordset.next();
        }
        System.out.println(recordset.getField(0).value());
        recordset.close();

        connection.close();
    }
}
