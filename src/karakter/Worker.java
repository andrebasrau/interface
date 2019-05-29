package karakter;

import kemampuan.*;

public class Worker extends BaseCharacter implements Ichef, IWorker, IArtist, IDriver {

	public Worker() {
		nama = "Worker";
		Drive = true;
		Paint = true;
		Work = true;
		cook =true;
	}

	@Override
	public void Drive() {
		System.out.println(nama + " menyetir");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Paint() {
		System.out.println(nama + " menggambar");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		System.out.println(nama + " bekerja");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cook() {
		System.out.println(nama + " memasak");
		// TODO Auto-generated method stub
		
	}
	

}
