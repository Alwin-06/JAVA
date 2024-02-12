class EvenNumber extends Thread
{
   private EvenOddNumber ob;
   public EvenNumber(EvenOddNumber ob)
   {
      this.ob=ob;
   }
   public void run()
   {
      ob.generateEvenNumbers();
   }
}

class OddNumber extends Thread
{
   private EvenOddNumber ob;
   public OddNumber(EvenOddNumber ob)
   {
      this.ob=ob;
   }
   public void run()
   {
      ob.generateOddNumbers();
   }
}

class EvenOddNumber
{
   public static int N=100;
   int count=1;
   public void generateEvenNumbers()
   {
      synchronized(this)
      {
         while(count<N)
         {
            while(count%2==1)
            {
                try
                {
                    wait();
                }
                catch(Exception e)
                {
                }
            }
            System.out.println(count);
            count++;
            notify();
         }
      }
   }
   public void generateOddNumbers()
   {
       synchronized(this)
       {
          while(count<N)
          {
             while(count%2==0)
             {
                try
                {
                    wait();
                }
                catch(Exception ex)
                {
                }
             }
             System.out.println(count);
             count++;
             notify();
          }
       }
   }
   public static void main(String[] args)
   {
      EvenOddNumber ob=new EvenOddNumber();
      EvenNumber t1=new EvenNumber(ob);
      OddNumber t2=new OddNumber(ob);
      t1.start();
      t2.start();
      try
      {
         t1.join();
         t2.join();
      }
      catch(Exception ex)
      {
      }
   }
}
