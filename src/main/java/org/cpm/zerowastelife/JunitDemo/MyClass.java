package org.cpm.zerowastelife.JunitDemo;

public class MyClass {
	
	public int add(int m, int n) {
		return m + n;
	}
	
	public boolean pass(int score) {
		if(score >= 60) return true;
		else return false;
	}
	
	public String isWeekend(String weekday) {
		if(weekday == "Sun" || weekday =="Sat") return "yes";
		else return "no";
	}

}
