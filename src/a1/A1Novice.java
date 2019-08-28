package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		// Some debugging lines are commented
		int numCus = scan.nextInt();
		//System.out.println();
		//System.out.println("Number of customer is " + numCus);
		for(int i = numCus; i > 0; i --)
		{
			//print name
			System.out.print(scan.next().substring(0,1)+ ". ");
			System.out.print(scan.next() + ": ");
			//
			int numItem = scan.nextInt();
			//System.out.println("Number of items is " + numItem);
			double sum = 0.0;
			//System.out.println("sum is now " + sum);
			for(int x = numItem; x > 0; x --)
			{
				//System.out.println("Now processing");
				int num = scan.nextInt(); 
				while(!scan.hasNextDouble())
				{
					scan.next();
				}
				double price = scan.nextDouble();
		        //System.out.println(num + " " + item + " each costs " + price);
		        sum += num*price;
			}
			System.out.println(String.format("%.2f",sum));
		}
	}
}
