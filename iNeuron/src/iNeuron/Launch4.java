package iNeuron;

	public class Launch4 {

		public static void main(String[] args) {
	System.out.println("Hiiii");
	System.out.println("CDAC");
			
			int n=10;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					
					if((i==0 && j<n-1) || j==0 ||(i==n-1 && j<n-1)|| (j==n-1 &&i>0 &&i<n-1) )
					{
					System.out.print("*");
					}
					else
					{
					System.out.print(" ");
					}
					
				}
				System.out.println();
			}

		}

	}


