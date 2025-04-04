package excelrepo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class excelpractice {
	
WebDriver driver;
	
	Properties prop;
	@BeforeMethod
	public void setup() throws IOException
	{
		prop = new Properties();
		String Path = System.getProperty("user.dir")+"//src//test//resources//proprtiesfile//config.properties";
		FileInputStream fs = new FileInputStream(Path);
		prop.load(fs);
		
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		
		}
		
	}
	
	
	@Test(dataProvider="get")
	public void Logincred(String struser, String strpass) throws IOException
	{
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(exceldata("Loginuser"))).sendKeys(struser);
		driver.findElement(By.id(exceldata("LoginPwd"))).sendKeys(strpass);
		driver.findElement(By.className(exceldata("Button"))).submit();
		
	}
	
	
@DataProvider(name="get")	
	public Object[][]getdata() throws CsvValidationException, IOException
	{
		String path = System.getProperty("user.dir")+"//src//test//resources//testdata//Login.csv";
		CSVReader csv = new CSVReader(new FileReader(path));
		String clos[];
		ArrayList<Object> al = new ArrayList<Object>();
		while((clos =csv.readNext())!=null)
		{
			Object record[]= {clos[0],clos[1]};
			al.add(record);
			
		}
		
		csv.close();
		return al.toArray(new Object[al.size()][]);
		
		
	}


   public String exceldata(String ObjName) throws IOException
   {
	   String path = System.getProperty("user.dir")+"//src//test//resources//testdata//logindta.xlsx";
	   FileInputStream fi = null;
	   XSSFWorkbook book =null;
	   String ObjPath="";
	   
	   fi= new FileInputStream(path);
	   book= new XSSFWorkbook(fi);
	   
	   XSSFSheet sheet = book.getSheet("LoginPage");
	   int rownum=sheet.getLastRowNum();
	   for(int i=1;i<=rownum;i++)
	   {
		   XSSFRow row = sheet.getRow(i);
		   if(row.getCell(0).getStringCellValue().equalsIgnoreCase(ObjName))
		   {
			  ObjPath=row.getCell(1).getStringCellValue();
		   }
	   }
	   return ObjPath;
	   
   }


}
