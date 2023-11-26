package aritmetikselLab;

public class Driver {

	public static void main(String[] args) {
		/*int x = 10;
		float y = 20;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		System.out.println(5 % 2);

		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int e = 10;
		//a = a + 2;
		a+=2;
		b-=2;
		c*=2;
		d/=2;
		e%=2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
		int q = 12;
		System.out.println(q++); // Postfix: önce değişkenin değeri ekrana basılır sonra değişkenin değeri 1 artırılır
		System.out.println(q);
		System.out.println(++q); // Prefix: önce değişkenin değeri 1 artılır sonra ekrana basılır
		System.out.println(q);*/
		
		int i = 10; // 00000000 00000000 00000000 00001010 10 değerinin bellekte kapladığı alan (inte 32 bit)
		int x = 4;  // 00000000 00000000 00000000 00000100
		System.out.println(~i); // 11111111 11111111 11111111 11110101 (tilda operaötürü ile değilini aldık)
		System.out.println(i & x);  // 00000000 00000000 00000000 00000000
		System.out.println(i | x);  // 00000000 00000000 00000000 00001110
		System.out.println(x >> 1); // 000000000 00000000 00000000 0000010 1 defa sağa doğru kaydırdığımda aslında sayıyı 2'ye bölmüş oluyorum
		System.out.println(x << 1); // 0000000 00000000 00000000 000001000 1 defa sola doğru kaydırdığımda aslında sayıyı 2 ile çarpmış oluyorum
		
		
	}

}
