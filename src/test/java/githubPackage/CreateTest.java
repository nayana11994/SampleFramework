package githubPackage;
import org.testng.annotations.Test;
public class CreateTest 
{
	@Test(groups = "smokeTest")
	public void create()
	{
		System.out.println("----created----");
		System.out.println("Its Me Sowmiya");
	}
	@Test(groups = "smokeTest")
	public void modify()
	{
		System.out.println("----modified----");
	}
}
