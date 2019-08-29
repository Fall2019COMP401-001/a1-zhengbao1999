package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//Initialize arrays for items and their price
		int numItem = scan.nextInt();
		String[] item = new String[numItem];
		double[] price = new double[numItem];
		for(int i = 0; i < numItem; i ++)
		{
			item[i] = scan.next();
			//System.out.print(item[i]);
			price[i] = scan.nextDouble();
			//System.out.println(price[i]);
		}
		//initialize temporary variables
		String biggest = "";
		double max = 0.0;
		String smallest = "";
		double min = Double.MAX_VALUE;
		String tempCus = "";
		double cusTotal = 0.0;
		double grandTotal = 0.0;
		//start reading
		int numCus = scan.nextInt();
		for(int i = 0; i < numCus; i ++)
		{
			cusTotal = 0.0;
			tempCus = scan.next();
			while(!scan.hasNextDouble())
			{
				tempCus = tempCus + " " + scan.next();
			}
			int t = scan.nextInt();//number of items to buy
			for(int x = 0; x < t; x++)
			{
				int n = scan.nextInt();
				String thing = scan.next();
				//search for "thing" in arrays
				for(int index = 0; index < numItem; index ++)
				{
					if(item[index].equals(thing))
					{
						cusTotal += n*price[index];
					}
				}
			}
			if(cusTotal > max)
			{
				max = cusTotal;
				biggest = tempCus;
			}
			if(cusTotal < min)
			{
				min = cusTotal;
				smallest = tempCus;
			}
			grandTotal += cusTotal;
		}
		System.out.println("Biggest: " + biggest + " (" + String.format("%.2f", max) + ")" );
		System.out.println("Smallest: " + smallest + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", grandTotal/numCus));
	}
}
