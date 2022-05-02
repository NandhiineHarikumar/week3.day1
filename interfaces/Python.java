package interfaces;

public class Python 
{
	private String version;
	public final String language="python";
	public Python(String version)
	{
		System.out.println("This is constructor of Python");
		this.version = version;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	

}
