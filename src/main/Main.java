package main;

import java.util.Scanner;
import java.util.Vector;
import kemampuan.*;
import karakter.*;
public class Main {

	public static void enter (){
		for (int i=0; i<30; i++){
			System.out.println();
		}
	}
	
	public static void main (String  args []){
		Scanner scan = new Scanner (System.in);
		String kemampuan;
		String job = null;
		Vector <BaseCharacter> Char = new Vector <>();
		Char.add(new Chef());
		Char.add(new Driver ());
		Char.add(new Artist ());
		Char.add(new Worker());
		Char.add(new Sailor ());
		Char.add(new Beggar ());
		boolean flag = true;
		do{
			enter ();
			do{	
				System.out.println("Simulasi Kelompok kemampuan");
				for (int i=0; i<Char.size(); i++){
					System.out.println(i+" "+Char.get(i).getName());
				}
				System.out.println(6 +" exit");
				System.out.print("input : ");
				kemampuan = scan.next();
				
				job = scan.nextLine();
//			scan.nextLine();
				
			}while (!kemampuan.equals("Info") && !kemampuan.equals("Cook") && !kemampuan.equals("Work") && !kemampuan.equals("Paint") && !kemampuan.equals("exit"));
//		int idx =0;
//		for (String string : kemampuan.split(" ")) {
//			if (idx ==1){
//				System.out.println(string);
//				job = string;
//				break;
//			}
//			idx++;
//		}
			Vector <Integer> jobs = new Vector <>();
			for (int i=1; i<job.length(); i+=2){
				int index = (int) job.charAt(i)-'0';
				if (index>= 0 && index <=5){
					jobs.add(index);
				}
				else {
					System.out.println(index+" tidak masuk kedalam range");
				}
			}
			for (int i =0; i<jobs.size(); i++){
				switch (kemampuan.toLowerCase()){
				case "info":
					Char.get(jobs.get(i)).getInfo();
//					scan.nextLine();
					break;
				case "cook":
//					if (!Char.get(jobs.get(i)).getCheck()){
//						System.out.println(Char.get(jobs.get(i)).getName() + " memasak");
//					}
//					else {
//						System.out.println("karakter tidak bisa melakukan aksi");
//					}
					Char.get(jobs.get(i)).cook();
//					scan.nextLine();
					break;
				case "work":
//					if (!Char.get(jobs.get(i)).getCheck()){
//						System.out.println(Char.get(jobs.get(i)).getName() + " bekerja");
//					}
//					else {
//						System.out.println("karakter tidak bisa melakukan aksi");
//					}
//					scan.nextLine();
					Char.get(jobs.get(i)).Work();
					break;
				case "paint":
//					if (!Char.get(jobs.get(i)).getCheck()){
//						System.out.println(Char.get(jobs.get(i)).getName() + " melukis");
//					}
//					else {
//						System.out.println("karakter tidak bisa melakukan aksi");
//					}
//					scan.nextLine();
					Char.get(jobs.get(i)).Paint();
					break;
				case "drive":
//					if (!Char.get(jobs.get(i)).getCheck()){
//						System.out.println(Char.get(jobs.get(i)).getName() + " menyetir");
//					}
//					else {
//						System.out.println("karakter tidak bisa melakukan aksi");
//					}
//					scan.nextLine();
					Char.get(jobs.get(i)).Drive();
					break;
				}
		
			}
			scan.nextLine();
			if (kemampuan.equals("exit")){
				flag = false;
				scan.close();
			}
			
		}while (flag);
		enter ();
		System.out.println("thank you");
		
	}

}
