package karakter;



public class BaseCharacter {
		protected String nama;
		protected boolean cook = false;
		protected boolean Paint = false;
		protected boolean Work = false;
		protected boolean Drive = false;	

	public BaseCharacter() {
	}
	public void getInfo (){
		boolean flag = true;
		if (cook){
			System.out.println( nama + " seorang yang bisa memasak");
			flag = false;
		}
		else if (Paint){
			System.out.println( nama + " Seorang yang bisa menggambar");
			flag = false;
		}
		else if (Work){
			System.out.println(nama +" seorang yang bisa bekerja");
			flag = false;
		}
		else if (Drive){
			System.out.println(nama +" seorang yang bisa menyetir");;
			flag = false;
		}
		else if (flag){
			System.out.println(nama + " karakter tidak bisa melakukan apa pun");
		}
	}
	
	public boolean getCheck (){
		boolean flag = true;
		if (cook){
//			System.out.println( nama + "seorang yang bisa memasak =");
			return flag = false;
		}
		else if (Paint){
//			System.out.println( nama + "Seorang yang bisa menggambar");
			return flag = false;
		}
		else if (Work){
//			System.out.println(nama +"seorang yang bisa bekerja");
			return flag = false;
		}
		else if (Drive){
//			System.out.println(nama +" seorang yang bisa menyetir");;
			return flag = false;
		}
		
		return flag;
	}
	
	public void cook (){
		System.out.println("karakter tidak bisa melakukan aksi");
	}
	public void Work (){
		System.out.println("karakter tidak bisa melakukan aksi");
	}
	public void Paint (){
		System.out.println("karakter tidak bisa melakukan aksi");
	}
	public void Drive (){
		System.out.println("karakter tidak bisa melakukann aksi");
	}
	
	public String getName(){
		return nama;
	}

}
