package examples;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.testng.annotations.Test;

public class Test3_InsertExample
{
    public static String ProjectWorkingDirectory = System.getProperty("user.dir");

    @Test
    public void test_InsertQuery1() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/InsertExample.xlsx");
        String strQuery="INSERT INTO sheet1(Name,Country) VALUES('Peter','UK')";
        connection.executeUpdate(strQuery);

        Recordset recordset=connection.executeQuery("Select * From Sheet1");
        for (int i=0; i<7; i++)
        {
            recordset.next();
        }
        System.out.println(recordset.getField(0).value());
        recordset.close();
        connection.close();
    }
}
