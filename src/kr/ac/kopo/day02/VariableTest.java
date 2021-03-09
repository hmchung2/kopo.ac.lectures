package kr.ac.kopo.day02;

public class VariableTest {

	static int global_variable = 5;
	
	private static int private_variable = 3;
	
	public String member_variable;

	public VariableTest (String empName) {
		member_variable = empName;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------------------------");
		System.out.println(global_variable);
		VariableTest testing2 = new VariableTest("testing2");
		System.out.println(testing2.member_variable);
		System.out.println(testing2.global_variable);
		
		System.out.println("------------------------------------");
		global_variable = 10;
		System.out.println(global_variable);
		System.out.println(testing2.global_variable);
		
		
		System.out.println("------------------------------------");
		String member_variable ;
		member_variable = "differ";
		System.out.println(member_variable);
		System.out.println(testing2.member_variable);
		
		System.out.println("------------------------------------");
		System.out.println(private_variable);
		private_variable = 12;
		System.out.println(private_variable);
		
		System.out.println("------------------------------------");
		sub_variables_test sub_class = new sub_variables_test();
		System.out.println(sub_class.sub_public_variable);
		
		// error due to private variabel
		//System.out.println(sub_class.sub_private_variable);
	}

}


class sub_variables_test {
	private String sub_private_variable = "private";
	public String sub_public_variable = "public";
}