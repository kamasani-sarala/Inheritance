package s1;

public class MainClass {
 
public static void main(String args[]) {

	System.out.println("\n================\n");
	Accountant accountant=new Accountant("sai", 80000, "TaxFile");
	accountant.worksOnTaxFile();
	System.out.println("\n========================\n");
	Project instagram=new Project("Instagram Advertisents", 90);
	Developer developer=new Developer(instagram, "Meta", "sai",2000);
	developer.worksOnProject();
	System.out.println("\n=================\n");
	Marketing m=new Marketing("rani",500000,"rani@gmail.com");
	m.worksOnTaxFile();
}
}
