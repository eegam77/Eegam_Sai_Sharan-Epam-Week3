import java.lang.Exception;
public class Calculator {
	public double Add(double a,double b)
	{
		return a+b;
	}
	
		public double Division(double a, double b)
		{
			try {
			return a/b;
			}
			catch(Exception ex)
			{
				System.out.println("denominator must not be zero");
			}
			return 0;
		}
		public double Substract(double a,double b)
		{
			return a-b;
		}
		public double Multiply(double a,double b)
		{
			return a*b;
		}
	
	
}
