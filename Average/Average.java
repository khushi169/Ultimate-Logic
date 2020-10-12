public class Average
{
   public static void main(String args[])
   {
      int i,count;
      int a[] = {1,2,3,4,5,6};
      int n = 6;
      count = 0;

      for(i=0; i<n; i++) 
      {
         count = count +a[i]; 
      }
      System.out.println("Average is:"+ count/n);
   }
}
