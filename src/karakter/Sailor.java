package karakter;

import kemampuan.*;

public class Sailor extends BaseCharacter implements IDriver, Ichef{

	public Sailor() {
		nama = "Sailor";
		cook = true;
		Drive = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cook() {
		System.out.println(nama + " memasak");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Drive() {
		System.out.println(nama +" menyetir");
		// TODO Auto-generated method stub
		
	}

}
