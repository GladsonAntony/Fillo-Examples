package examples;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.testng.annotations.Test;

public class Test1_SelectExample
{
   public static String ProjectWorkingDirectory = System.getProperty("user.dir");

    @Test
    public void  test_SelectQuery1() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/SelectExample.xlsx");
        String strQuery="Select * from Sheet1 where Country='India'";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next())
        {
            System.out.println("Country:        "+recordset.getField("Country"));
            System.out.println("Capital City:   "+recordset.getField("Capital City"));
        }
        recordset.close();
        connection.close();
    }

    @Test
    public void  test_SelectQuery2() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/SelectExample.xlsx");
        String strQuery="Select * from Sheet1 where ID BETWEEN '25' AND '40'";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next())
        {
            System.out.println("Country:        "+recordset.getField("Country"));
            System.out.println("Capital City:   "+recordset.getField("Capital City"));
            System.out.println();
        }
        recordset.close();
        connection.close();
    }

    @Test
    public void  test_SelectQuery3() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/SelectExample.xlsx");
        String strQuery="Select * from Sheet1 where country like 'IN%'";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next())
        {
            System.out.println("Country:        "+recordset.getField("Country"));
            System.out.println("Capital City:   "+recordset.getField("Capital City"));
            System.out.println();
        }
        recordset.close();
        connection.close();
    }

    @Test
    public void  test_SelectQuery4() throws Exception
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection(ProjectWorkingDirectory+"/src/test/resources/SelectExample.xlsx");
        String strQuery="Select * from Sheet1 where country=\"Capital City\" ";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next())
        {
            System.out.println("Country:        "+recordset.getField("Country"));
            System.out.println("Capital City:   "+recordset.getField("Capital City"));
            System.out.println();
        }
        recordset.close();
        connection.close();
    }
}
