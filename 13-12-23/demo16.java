class Demo16
{
	public static void main(String[]arg)
	{
	int x=10; 
	int y=20;
    int z=30;
	
	String s1=x+y+z+""+x-y+z;
	
	System.out.println(s1);
    
}
}

/*output error: bad operand types for binary operator '-'
        String s1=x+y+z+""+x-y+z;
*/