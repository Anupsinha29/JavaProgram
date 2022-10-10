package ArrayProgram;

public class Sumof2Arrays {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,45};
		int[] b= {4,5,3,2};
		int length = a.length;
		if(a.length<b.length)//5
		{
			length = b.length;
			
		}
		for(int i=0;i<length;i++) {
			
			try {
				System.out.println(a[i]+b[i]);
				
			}catch(Exception e)
			{
				if(a.length<b.length) {
					System.out.println(b[i]);
				}
				else {
					System.out.println(a[i]);
					
				}
			}
		}

	}

}
