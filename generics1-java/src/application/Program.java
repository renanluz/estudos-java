package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> p = new PrintService<>();
		
		System.out.print("How many values?" );
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			Integer value = sc.nextInt();
			p.addValue(value);
		}
		
		p.print();
		
		int x = p.first();
		
		System.out.println("First: " + x );
		
		PrintService<String> s = new PrintService<>();
		
		System.out.print("How many names? ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			String name = sc.next();
			s.addValue(name);
		}
		
		s.print();
		
		String y = s.first();
		System.out.println("First: " + y);
		
		
		sc.close();
	}

}
