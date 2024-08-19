package myAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> result  = new ArrayList<>();
		
		for(int i=0;i <n;i++) {
			list.add(scan.next());
		}
		
		for(int i=0;i<m;i++) {
			String name = scan.next();
			if(list.contains(name)) {
				result.add(name);
			}
		}
		Collections.sort(result);
		
		System.out.println(result.size());
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
		scan.close();
	}
	// 바꿔보기

}
