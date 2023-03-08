public class BudzDemo 
{

	public static void main(String[] args) 
	{
		int grossSalary = 50000;
		int C = Cuttings();
		int netSalary = grossSalary - C;
		System.out.println("netSalary :"+netSalary);
		HouseCharges(3000,4000);
		IsRentInclude(true);
		
		BudzDemo bd = new BudzDemo();
		
		bd.FamExp();
		IsChildFee();
		bd.IsPersonalExp();
		bd.PersonalExp(2000.123456700);
		bd.IsSavings(true);
	}
	

	static int Cuttings()    //static-zeroparam-return
	{
		System.out.println("Cuttings is invoking");
		int Pf = 2000;
		int PTax = 1000;
		int Totalcuttings = Pf + PTax;
		System.out.println("Totalcuttings :"+ Totalcuttings);
		return Totalcuttings;
	}
	
	static long HouseCharges(long rent, long maintainance)   //static-param- return
	{
		long TotalHouseCharges = rent + maintainance;
		System.out.println("TotalHouseCharges :"+ TotalHouseCharges);
		return TotalHouseCharges;
	}
	
	static void IsRentInclude(boolean a)  //static-param-nonreturn
	{
		//System.out.println("House Charges is ivoking");
		System.out.println("IsRenInclude :"+a);
	}
	
	static void IsChildFee()   // static- zeroparam-nonreturn
	{
		//System.out.println("House Charges is ivoking");
		char a = 'Y';
		System.out.println("IsChildFee Include :"+a);
	}
	
	void IsPersonalExp() //nonstatic-zeroparam-nonreturn
	{
		//System.out.println("House Charges is ivoking");
		boolean PE = true;
		System.out.println("PersonalExpence :"+PE);
	}
	
	float FamExp()  //nonstatic-zeroparam-return
	{
		//System.out.println("House Charges is ivoking");
		float FM = (float)5000.00;
		float CF = (float)2000.00;
		float FE = FM + CF;
		System.out.println("Family Expenses :"+FE);
		return FE;
	}
	
	double PersonalExp(double PE) //nonstatic-param-return
	{
		System.out.println("Personal Expences :"+PE);
		return PE;
	}
	
	void IsSavings(boolean a)   //nonstatic-param-nonreturn
	{
		System.out.println("Savings:"+a);
	}
	
	
}
