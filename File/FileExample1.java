// Creating a file and inserting numbers.Then creating another file to get even numbers from first file and store it into this file

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
            while(st.hasMoreTokens())
            {
                int a=Integer.parseInt(st.nextToken());
                if(a%2==0)
                {
                    f.write(a+"\n");
                }
            }
            rd.close();
            f.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
