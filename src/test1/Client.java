package test1;

import java.util.Scanner;

public class Client {
	private static Scanner input=new Scanner(System.in);
	private static Manager mm=new Manager();
	public static void main(String[] args) {
		seek();
		seek2();
	}
	private static void seek() {
		System.out.println("请输入一个年份");
		String year=input.next();
		worldCup a=mm.Seek(year);
		if(a!=null) {
			System.out.println("夺冠的队伍是："+a.getChampionship());
		}else {
			System.out.println("没有举办世界杯");
		}
	}
	
	private static void seek2() {
		System.out.println("请输入一个球队名");
		String championship=input.next();
		String str=mm.Seek2(championship);
		if(str.equals("")) {
			System.out.println("这个球队没有拿过冠军");
		}else{
			System.out.println(championship+"那冠军的年份为：\n"+str);
		}
	}
}
