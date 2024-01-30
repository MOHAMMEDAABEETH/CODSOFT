import java.util.Scanner;
import static java.lang.Character.*;

public class WordCounter
{
    public static void main (String[] args) {
        System.out.println("Enter the text:");
        Scanner s = new Scanner(System.in);
        
        String S = s.nextLine();
        String[] a = S.split(" ");
        String str = S.replace(" ","");
        
        System.out.println("\n\nWord counter");
        System.out.println("--------------------------");
        System.out.println("No of words: "+a.length);
        System.out.println("Total Frequency: "+str.length());
        
        int count[] = new int[256];
        for(int i=0;i<256;i++)
        {
            count[i] = 0;
        }
        
        for(int i=0;i<str.length();i++)
        {
            if(isLetter(str.charAt(i)))
            {
                count[str.charAt(i)]++;
            }
        }
        
        for(int i=0;i<256;i++)
        {
            if(count[i]>0)
            {
                System.out.println(Character.toString((char)i)+":"+count[i]);
            }
        }
        
        System.out.println("--------------------------");
    }
}
