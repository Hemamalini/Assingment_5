package assingment5;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id information given : "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student id and name information given : "+id+", "+name);
	}
	public void getStudentInfo(String email,int phNumber) {
		System.out.println("Student email and phone Number information given : "+email+", "+phNumber);
	}
	public static void main(String[] args) {
		Students studentObject = new Students();
		studentObject.getStudentInfo(101);
		studentObject.getStudentInfo(101,"Hema");
		studentObject.getStudentInfo("hema@gmail.com",8976);
	}
}
