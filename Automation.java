package assingment5;

public class Automation extends MultipleLangauge{
	public void Java() {
		System.out.println("This is JAVA course");
	}
	public void Selenium() {
		System.out.println("This is Selenium course");
	}
	public void python() {
		System.out.println("This is Python course");
	}
	public static void main(String[] args) {
		Automation automationObject = new Automation();
		automationObject.Java();
		automationObject.Selenium();
		automationObject.python();
		 
	}
	
	
}
