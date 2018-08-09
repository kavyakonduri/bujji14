/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0,r;
        int temp=n;
        while(n>0)
        {
          r=n%10;
          sum=(sum*10)+r;
          n=n/10;
        }
       if(temp==sum)
       {
          System.out.println("yes it is palindrom");
       }
       else
       {
         System.out.println("no it is not a palindrom");
	}
}
