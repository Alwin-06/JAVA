class EvenException extends Exception
{
    public String toString()
    {
        return "Even Number";
    }
}

class OddException extends Exception
{
    public String toString()
    {
        return "Odd Number";
    }
}
public class Pgm10 
{
    public static void checknum(int n) throws EvenException,OddException
    {
        if (n%2==0)
        {
            throw new EvenException();
        }
        else
        {
            throw new OddException();
        }
    }
    public static void main(String[] args)
    {
        int num=2;
        try
        {
            Pgm10.checknum(num);
        }
        catch(EvenException even)
        {
            System.out.println("Exception : "+even);
        }
        catch (OddException odd)
        {
            System.out.println("Exception : "+odd);
        }
        catch(Exception e)
        {
            System.out.println("Exception!!");
        }
        
    }    
}
