package karakter;

import kemampuan.IArtist;

public class Artist extends BaseCharacter implements IArtist {

	public Artist() {
		nama = "Artist";
		Paint = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Paint() {
		System.out.println(nama + " menggambar");
		// TODO Auto-generated method stub
		
	}

}
