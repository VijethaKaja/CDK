import java.util.Arrays;
import java.util.Scanner;
public class Demo6{
   public static void main(String args[]){
   String str[]=new String[5];
	 Scanner scanner = new Scanner(System.in);
   for(int i=0;i<5;i++)
	 str[i] = scanner.next();
   System.out.println(Arrays.sort(str));
 }
