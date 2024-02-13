import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class NumbersAllocate
{
	public static void main(String[] args)
	{
		try
		{

			// File from which numbers are read
			String numfile = "Numbers.txt";

			//Files into which the numbers must be stored
			String file_even = "EvenNumbers.txt";
			String file_odd = "OddNumbers.txt";
			String file_prime = "PrimeNumbers.txt";

			Scanner sc = new Scanner(System.in);

			BufferedReader br = new BufferedReader(new FileReader(numfile));

			// Creating FileWriter objects for the required files
			FileWriter fw_even = new FileWriter(file_even);
			FileWriter fw_odd = new FileWriter(file_odd);
			FileWriter fw_prime = new FileWriter(file_prime);


			String line;

			line = br.readLine();
			StringTokenizer tokens = new StringTokenizer(line);

			int num1 = Integer.parseInt(tokens.nextToken());
			int num2 = Integer.parseInt(tokens.nextToken());

			System.out.println("num1 = " + num1 + "\tnum2 = " + num2);

			boolean ifprime;
			for(int i=num1; i<=num2; i++)
			{

				if(i%2==0)		//Checking if even
					fw_even.write(String.valueOf(i)+"\n");

				else			//Checking if odd
					fw_odd.write(String.valueOf(i)+"\n");

					//write() function writes only strings, integers must be converted to strings


				//Odd numbers can also be prime,so prime checking should not come inside another 'else' block

				//Prime checking must be skipped for 1 (Starting number can be 1)


				ifprime = true;
				if(i==1)
					continue;				

				for(int j=2; j<=(int)(Math.sqrt(i)); j++)	//Checking if prime
					if(i%j == 0)
					{
						ifprime = false;
						break;
					}

				if(ifprime)
					fw_prime.write(String.valueOf(i)+"\n");				
			}

			//Closing all file objects
			br.close();
			fw_even.close();
			fw_odd.close();
			fw_prime.close();


			//Opening the three files as FileWriter objects to display the content
			BufferedReader br_even = new BufferedReader(new FileReader(file_even));
			BufferedReader br_odd = new BufferedReader(new FileReader(file_odd));
			BufferedReader br_prime = new BufferedReader(new FileReader(file_prime));
			

			//Displaying contents of 'EvenNumbers.txt'
			System.out.println("\n----------Contents of : "+ file_even);

			while((line = br_even.readLine())!= null)	//Each line has a different number
				System.out.println(line + " ");
			System.out.println();


			//Displaying contents of 'OddNumbers.txt'
			System.out.println("\n----------Contents of : "+ file_odd);

			while((line = br_odd.readLine()) != null)	//Each line has a different number
				System.out.println(line + " ");

			System.out.println();



			//Displaying contents of 'PrimeNumbers.txt'
			System.out.println("\n----------Contents of : "+ file_prime);

			while((line = br_prime.readLine())!= null)	//Each line has a different number
				System.out.println(line + " ");

			System.out.println();

			br_even.close();
			br_odd.close();
			br_prime.close();
		}

		catch(Exception e)
		{

			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();

		}
	}
}
