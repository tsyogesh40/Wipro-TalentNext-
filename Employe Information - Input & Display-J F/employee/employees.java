package employee;

public class employees {
	public static void main(String[] args)
	{
		int[] Emp_No={1001,1002,1003,1004,1005,1006,1007};
		String[] Emp_Name={"Anish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	//	String[] Join_Date={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		char[] Design_Code={'e','c','k','r','m','e','c'};
		String[] Dept={"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
		long[] Basic={20000,30000,10000,12000,50000,23000,29000};
		long[] HRA={8000,12000,8000,6000,20000,9000,12000};
		long[] IT={3000,9000,1000,2000,20000,4400,10000};
			
		//int id=Integer.parseInt(args[0]);
		int i,flag=0;
		long sal=0;
		String des="";
		for(i=0;i<7;i++)
		{
			if(Integer.parseInt(args[0])==Emp_No[i])
			{
				switch(Design_Code[i]){
				case 'e': des="Engineer";
						sal=Basic[i]+HRA[i]+20000-IT[i];break;
				case 'c': des="Consultant";
				       sal=Basic[i]+HRA[i]+32000-IT[i];break;
				case 'k': des="Clerk";
			           sal=Basic[i]+HRA[i]+12000-IT[i];break;
				case 'r': des="Receptionist";
			       sal=Basic[i]+HRA[i]+15000-IT[i];break;
				case 'm': des="Manager";
			       sal=Basic[i]+HRA[i]+32000-IT[i];break;
				
				}
			
				System.out.println("Emp No.\t\tEmpName\t\tDepartment\t\tDesignation\t\tSalary");
				System.out.print(Emp_No[i]+"\t\t"+Emp_Name[i]+"\t\t"+Dept[i]+"\t\t"+des+"\t\t"+sal);
				
			}
			else
					flag++;
		}
		if(flag==7)
			System.out.print("There is no employee with empid:"+Integer.parseInt(args[0]));
}

}