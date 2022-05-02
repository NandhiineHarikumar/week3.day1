package interfaces;

public class Automation extends Python implements Language,TestTool{

	public Automation()
	{
		super("v1.2");
		System.out.println("This is the constructor of sub class - Automation");
	}
	public static void main(String[] args) 
	{
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		System.out.println(auto.getVersion());
		System.out.println(auto.language);
	}

	@Override
	public void Selenium()
	{
		System.out.println("Interface method implemented- Selenium");
	}

	@Override
	public void Java()
	{
		System.out.println("Interface method implemented- Java");
	}

}
