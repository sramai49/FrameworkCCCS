package dataProvider;
import org.testng.annotations.DataProvider;
import com.clearcode.utils.ExcelUtils;


public class LoginData {
	int a=2;
	@DataProvider (name="RealEstateLoginData")
	public Object[][] RealEstate(){
		return ExcelUtils.getData("TestData.xls", "RealEstateLogin");
	}
	
	@DataProvider
	public Object[][] ContactUS(){
		return new Object[][] { 
			new Object[] {
			ExcelUtils.data("SuiteData.xls", "Sheet1", "ContactUS").toArray() }
			};
	}
	
	@DataProvider
	public Object[][] SearchPatient(){
		return new Object[][] { ExcelUtils.data("SuiteData.xls", "Sheet1", "searchPatient").toArray() };
	}
}
