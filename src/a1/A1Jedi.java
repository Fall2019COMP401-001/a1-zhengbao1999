package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		//Initialize arrays for items and their price
		int numItem = scan.nextInt();
		String[] item = new String[numItem];
		int[] itemBought = new int[numItem];
		int[] cus = new int[numItem];
		for(int i = 0; i < numItem; i ++)
		{
			item[i] = scan.next();
			scan.nextDouble();
		}		
		int numCus = scan.nextInt();
		for(int i = numCus; i > 0; i --)
		{
			boolean[] isAdded = new boolean[6]; 
			while(!scan.hasNextDouble())
			{
				scan.next();
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
						if(!isAdded[index])
						{
							cus[index] ++;
							isAdded[index] = true;
						}
						itemBought[index] += n;
					}
				}
			}
		}
		for(int i = 0; i < numItem; i ++)
		{
			if(cus[i] == 0)
			{
				System.out.println("No customers bought " + item[i]);
			}
			else 
				System.out.println(cus[i] + " customers bought " + itemBought[i] + " " + item[i]);
		}
	}
}
