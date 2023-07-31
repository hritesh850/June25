package com.nestedClass;

public class CheckPhoneNo {
	
	private static String phonerex="[^0-9]";
	public static void validate(String orignalNumber) 
	{
		int pLength = 12;
		
		class PhoneNoFormater
		{
			private String formatedNo;
			public PhoneNoFormater(String orignalNumber) 
			{
				this.formatedNo=orignalNumber.replaceAll(phonerex, "");
				System.out.println(formatedNo);
			}
			
			public boolean validate() 
			{
				if(formatedNo.length()==pLength) 
				{
					return true;
				}
				return false;
			}
		}
		
		PhoneNoFormater pf=new PhoneNoFormater(orignalNumber);
		boolean result=pf.validate();
		if(result) 
		{
			System.out.println("Valide Number");
		}
		else
		{
			System.out.println("Invalide Number");
		}
	}

}
