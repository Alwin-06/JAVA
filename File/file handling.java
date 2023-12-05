import java.io.*;
class file
{
    public static void main(String[] args) throws IOException
    {
        String line;
        FileWriter wr=new FileWriter("a.txt");
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the data to be written into file");
        line=rd.readLine();
        wr.write(line);
        wr.close();
        FileReader reader=new FileReader("a.txt");
        int i;
        System.out.println("Data stored in file is:");
        while((i=reader.read())!=-1)
        {
            System.out.print((char)i);
        }
        reader.close();
    }
}
