
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n;
    int m;
    char[] ch=s.toCharArray();
    for (int i=0;i<ch.length;i++)
    {
        if (ch[i]>='a' && ch[i]<='z')
        {
            n=((int)ch[i]);
            ch[i]=((char)(n-32));
        }
        else if (ch[i]>='A' && ch[i]<='Z')
        {
            m=((int)ch[i]);
            ch[i]=((char)(m+32));
        }
    }
    for (int i=0;i<ch.length;i++)
    {
        System.out.print(ch[i]);
    }
    
	}
}
