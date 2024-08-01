public class p8 
{ static int arrayCount9(int arr[],int n)
 {
 int i;
 int count =0;

 for(i=0;i<n;i++)
{
 if(arr[i] == 9)
 {
count ++;
}
 }
return count; 
}

 public static void main(String[] args) 
{
 int[] array1 = {1, 2, 9};
int[] array2 = {1, 9, 9,5};
 int[] array3 = {1, 9, 9, 3, 9};

 System.out.println(arrayCount9(array1,array1.length)); // Output: 1
 System.out.println(arrayCount9(array2,array2.length)); // Output: 2
 System.out.println(arrayCount9(array3,array3.length)); // Output: 3
 }
}