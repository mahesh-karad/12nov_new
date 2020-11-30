package com.pk;
import java.util.*;

public class API858 {

		public void age() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Birth year");
			int year = sc.nextInt();
			int age = 2020 - year;
			System.out.println(" Your age is: " + age);
		}
	public static void main(String[] args) {
		API858 a  = new API858() ; 
		a.age();
	}

}
