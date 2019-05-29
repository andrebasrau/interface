package karakter;

import kemampuan.*;

public class Chef extends BaseCharacter implements Ichef , IDriver{

	public Chef() {
		nama = "Chef";
		cook = true;
		Drive = true;
	}

	@Override
	public void cook() {
		System.out.println(nama + " memasak");
	}

	@Override
	public void Drive() {
		System.out.println(nama +" menyetir");
		// TODO Auto-generated method stub
		
	}

}
