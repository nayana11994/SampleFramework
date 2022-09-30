package githubPackage;
import org.testng.annotations.Test;
public class UpdateTest {
@Test(groups = "smokeTest")
public void update()
{
	System.out.println("----updated----");
	System.out.println("Hello! It's Me");
}
@Test(groups = "regressionTest")
public void delete()
{
	System.out.println("----deleted----");
	System.out.println("Hello! It's Me");
}
}
