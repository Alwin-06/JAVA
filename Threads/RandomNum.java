import java.util.Random;
class Data
{
   static int num;
   static boolean done;
}

class RandomNumberGenerator extends Thread
{
   private Random random=new Random();
   public void run()
   {
      while(true)
      {
         while(Data.done)
         {
            try
            {
              Thread.sleep(10);
            }
            catch(Exception e)
            {
            }

         }
         int randomnum=random.nextInt(100);
         Data.num=randomnum;
         System.out.println("Number generated: "+randomnum);
         Data.done=true;
         try
         {
            Thread.sleep(1000);
         }
         catch(InterruptedException e)
         {
         }
      }
   }
}

class Square extends Thread
{
   public void run()
   {
      while(true)
      {
          while(Data.done==false)
          {
             try
             {
                Thread.sleep(10);
             }
             catch (InterruptedException e)
             {
             }
          }
          int number=Data.num;
          if(number%2==0)
          {
            int square=number*number;
            System.out.println("Square= "+square);
            Data.done=false;
          }

      }
   }
}
class Cube extends Thread
{
   public void run()
   {
      while(true)
      {
        while(Data.done==false)
        {
            try
           {
               Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
            }
        }
          int number=Data.num;
          if(number%2!=0)
          {
             int cube=number*number*number;
             System.out.println("Cube= "+cube);
             Data.done=false;
          }
      }
   }
}

class Main
{
   public static void main(String[] args)
   {
      RandomNumberGenerator t1=new RandomNumberGenerator();
      Square t2=new Square();
      Cube t3=new Cube();
      Data.done=false;
      t1.start();
      t2.start();
      t3.start();
      try
      {
         t1.join();
         t2.join();
         t3.join();
      }
      catch(Exception exe)
      {
      }
   }
}
