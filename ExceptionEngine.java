//Madalyn Botkin
//ExceptionEngine.java
//

public class ExceptionEngine
{
	public static void main (String [] args)
	{
		int input = 0;
		
		while (input != 4)
		{
			System.out.print("1) Null Pointer Exception\n2) Array Index Out Of Bounds Exception\n3) Arithmetic Exception\n4) Quit");
			
			/*switch (input)
			{
				case 1:
					
			}*/
		}
	}//end of main
	
	//determines whether the JVM should abort or handle the exception
		public static boolean abortOrHandle(String exceptionDescription)
		{
			if (!(exceptionDescription.equals(“NullPointer”) && exceptionDescription.equals(“ArrayIndex”)))
			{
				System.out.print("");
				return false;
			}
		}
}
