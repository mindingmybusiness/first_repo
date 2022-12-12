package dev.autoboxing;

import java.util.ArrayList;

public class AutoAndUnboxing {
	
	public static void main(String[] args) {
		System.out.println("Array list");
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//autoboxing
		for(int i=0;i<=10;i++) {
			arrayList.add(Integer.valueOf(i));
		}
		//unboxing
		for(int i=0;i<=10;i++) {
			System.out.println(arrayList.get(i).intValue());
		}
		
		ArrayList<Double> arrayList1 = new ArrayList<Double>();
		for(double i=0.0;i<=10.0;i+=0.5) {
			arrayList1.add(Double.valueOf(i));
		}
		
		for(int i=0;i<arrayList1.size();i++) {
			double doubleValue = arrayList1.get(i).doubleValue();
			System.out.println(doubleValue);
		}
	}

}
