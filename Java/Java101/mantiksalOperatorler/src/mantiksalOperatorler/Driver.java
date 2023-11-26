package mantiksalOperatorler;

public class Driver {

	public static boolean test() {
		System.out.println("Test çalıştırıldı");
		return false;
	}
	
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(b & true);
		System.out.println(b | false);
		
		// short circuit and operator (&&)
		System.out.println(b && false); // önce sol taraftaki değere bakılır. Sol taraftaki değer false ise sağ taraftaki değere hiç bakmaz. sol taraftaki değer true olmuş olsaydı o zaman sağ tarafa bakardı.
	    System.out.println(b && test()); // sol tarafta olan b değerim true olduğu için sağ taraftaki değere bakıldı ve ekrana çıktısı verildi. sol taraftaki b false olmuş olsa sağ tarafa hiç bakılmaz.
	    
	    // short circuit or operator (||)
	    System.out.println(b || test()); // sol taraftaki değer true olduğu için sağ taraftaki değer hiç işletilmez.
	}

}
