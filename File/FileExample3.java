import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public class file1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Enter the numbers: ");
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();

            FileWriter file=new FileWriter("Number.txt");
            file.write(str);
            file.close(); 
            
            FileReader rd=new FileReader("Number.txt");
            Scanner scanner = new Scanner(rd);
            String S=scanner.nextLine();
            StringTokenizer st=new StringTokenizer(S," ");

            FileWriter f=new FileWriter("Even num.txt");
            FileWriter f1=new FileWriter("Odd num.txt");
            FileWriter f2=new FileWriter("Prime num.txt");
            while(st.hasMoreTokens())
            {
                int a=Integer.parseInt(st.nextToken());
                if(a%2==0)
                {
                    f.write(a+"\n");
                }
                else
                {
                    f1.write(a+"\n"); 
                }
                int flag=0;
                if(a==1)
                {
                    flag=1;
                }
                for(int i=2;i<a;i++)
                {
                    if(a%i==0)
                    {
                        flag=1;
                    }
                }
                if(flag==0)
                {
                    f2.write(a+"\n");
                }
            }
            
            rd.close();
            f.close();
            f1.close();
            f2.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
