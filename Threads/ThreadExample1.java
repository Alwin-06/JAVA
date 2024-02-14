import java.util.Scanner;

class thread extends Thread
{
	int data;
	void printamount(int item)
	{
		synchronized(this)
		{
			data=item;
			System.out.print("Rupees Amount "+data);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.print(" /- only");
            System.out.println();
		}
	}
	private void synchornized(thread thread) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'synchornized'");
	}
}
class threadexample
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the amount: ");
		int b=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the amount: ");
		int c=sc.nextInt();
		sc.nextLine();

		thread t1=new thread();
		thread t2=new thread();
		thread t3=new thread();

		t1.start();
		t2.start();
		t3.start();

		t1.printamount(a);
		t2.printamount(b);
		t3.printamount(c);

		converter con=new converter();
		con.convert(a);
        System.out.print(" only");
        System.out.println();
		con.convert(b);
        System.out.print(" only");
        System.out.println();
		con.convert(c);
        System.out.print(" only");
        System.out.println();
	}
}

class converter
{
	int data;
	void convert(int num)
	{
		data=num;
        System.out.print("Rupees  ");
		if(data>10 && data<20)
		{
			switch(data)
			{
				case 11:System.out.print("Eleven");
						break;
				case 12:System.out.print("Twelve");
						break;
				case 13:System.out.print("Thriteen");
						break;
				case 14:System.out.print("Fourteen");
						break;
				case 15:System.out.print("Fifteen");
						break;
				case 16:System.out.print("Sixteen");
						break;
				case 17:System.out.print("Seventeen");
						break;
				case 18:System.out.print("Eighteen");
						break;
				case 19:System.out.print("Nineteen");
						break;
			}
		}
		else
		{
			int anum=data%100;
			int bnum=data-anum;
			int cnum=anum%10;
			int dnum=anum-cnum;

			switch(bnum)
			{
				case 100:System.out.print("One Hundred");
						break;
				case 200:System.out.print("Two Hundred");
						break;
				case 300:System.out.print("Three Hundred");
						break;
				case 400:System.out.print("Four Hundred");
						break;
				case 500:System.out.print("Five Hundred");
						break;
				case 600:System.out.print("Six Hundred");
						break;
				case 700:System.out.print("Seven Hundred");
						break;
				case 800:System.out.print("Eight Hundred");
						break;
				case 900:System.out.print("Nine Hundred");
						break;
			}

			switch(dnum)
			{
				case 10:System.out.print("Ten");
						break;
				case 20:System.out.print(" Twenty");
						break;
				case 30:System.out.print(" Thrity");
						break;
				case 40:System.out.print(" Forty");
						break;
				case 50:System.out.print(" Fifty");
						break;
				case 60:System.out.print(" Sixty");
						break;
				case 70:System.out.print(" Seventy");
						break;
				case 80:System.out.print(" Eighty");
						break;
				case 90:System.out.print(" Ninty");
						break;
			}

			switch(cnum)
			{
				case 1:System.out.print(" One");
						break;
				case 2:System.out.print(" Two");
						break;
				case 3:System.out.print(" Three");
						break;
				case 4:System.out.print(" Four");
						break;
				case 5:System.out.print(" Five");
						break;
				case 6:System.out.print(" Six");
						break;
				case 7:System.out.print(" Seven");
						break;
				case 8:System.out.print(" Eight");
						break;
				case 9:System.out.print(" Nine");
						break;
			}
		}
	}
}
