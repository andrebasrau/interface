package karakter;

import kemampuan.IDriver;

public class Driver extends BaseCharacter implements IDriver{

	public Driver() {
		nama = "Driver";
		Drive = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Drive() {
		System.out.println(nama + " mneyetir");
		// TODO Auto-generated method stub
	}
	
	

}
