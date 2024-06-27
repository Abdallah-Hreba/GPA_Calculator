import java.lang.*;
import java.util.*;
public class gpacalc {
    public static void main (String[] argv)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of courses u completed : ");
        int size = input.nextInt();
        float credithours[] = new float[size];
        float assesments[] = new float[size];
        for (int i = 0; i < size; i++) 
        {
            System.out.println("enter the credit hours for course "+(i+1)+":");
            credithours[i]= input.nextFloat();
            System.out.println("enter the assesment for course "+(i+1)+":");   
            assesments[i] = input.nextFloat();
        }
        float GPA = 0,ch=0,as=0;
        
        for (int i = 0; i < size; i++) 
        {   
            ch += credithours[i];
            as += assesments[i]*credithours[i];
        }
        GPA = as/ch;
        System.out.println("Your GPA = "+ GPA); 
    }
}
