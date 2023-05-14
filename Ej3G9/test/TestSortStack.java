import java.util.Arrays;
import java.util.Collections;
class sortdesc{
public static void main(String[] args){
       // int Array
       int[] intArray=new int[]{15,9,16,2,30};

       // Sorting int Array in descending order
       Arrays.sort(intArray,Collections.reverseOrder());

       // Displaying elements of int Array
       System.out.println("Int Array Elements in reverse order:");
       for(int i=0;i<intArray.length;i++)
          System.out.println(intArray[i]);

       // String Array
       String[] stringArray=new String[]{"FF","PP","AA","OO","DD"};

       // Sorting String Array in descending order
       Arrays.sort(stringArray,Collections.reverseOrder());

       // Displaying elements of String Array
       System.out.println("String Array Elements in reverse order:");
       for(int i=0;i<stringArray.length;i++)
          System.out.println(stringArray[i]);}}