package s1;

public class Marketing extends Employee{
	String email;
 
	public Marketing() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Marketing(String name, int salary, String email) {
		super(name,salary);
		this.email=email;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email= email;
	}
	
	
	public void worksOnTaxFile()
	{
		System.out.println(name); 
		System.out.println(email);	
		System.out.println(salary);
	
		
	}
	@Override
	public String toString() {
		return "Accountant [email=" + email + "]";
	}
	
}

