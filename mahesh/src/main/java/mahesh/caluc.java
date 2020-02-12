package mahesh;
import java.util.*;
public class caluc {
	
	public static void main(String[] args)
	{
	Scanner s= new Scanner(System.in);
	int m1,m2;
	m1=s.nextInt();
	m2=s.nextInt();
	String ca;
	ca=s.next();
	if (ca.equals("+"))
	{
	System.out.println(m1+m2);
	}
	else if(ca.equals("-"))
	{
	System.out.println(m1-m2);
	}
	else if(ca.equals("*"))
	{
	System.out.println(m1*m2);
	}
	else if(ca.equals("/"))
	{
	System.out.println(m1/m2);
	}

	}

	}


