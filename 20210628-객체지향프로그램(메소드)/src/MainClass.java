// �޼ҵ�
/*
 * �޼ҵ�
 * 	1) ����
 *  2) ���α׷� ������ (���� ������) => ���α׷��� ����ȭ
 *  3) �޼ҵ�ȿ��� ������ �������� �ϱ� ������ �Ѱ��� ��ɸ� ������ �����ϰ� �Ѵ�
 *  	��) ã��, ���, ������ �߰� ...
 *  		��� (��۾���, ��� ����, ��� ����, ��� ����...)
 *  4) �޼ҵ� ���� ���
 *  		������		�Ű�����
 * 	 	=     o			   o  =====> ���� ���� ���Ǵ� �޼ҵ� ����
 * 	 	=     o			   x
 * 	 	=     x			   o  =====> ���� ���Ǵ� ����
 * 	 	=     x			   x  =====> ���󵵰� ����
 * 
 * 5) �޼ҵ� ����
 * 	  (����������) ������ �޼ҵ�(�Ű�����...) ==> �Ű������� ���� ���� �ְ� ������ ����� ����,
 * 	  �� �������� �Ѱ��� ��� (�������� ���� ���� void)
 * 	  ==> �޼ҵ� ������� : return�� �ִ� ������ ����
 *   =========
 *   public, protected, default, private
 *   
 *   void display(int a)
 *   {
 *   	if(a==0)
 *   	  return;  ����ڰ� 0�� �Է����ָ� �޼ҵ� ����  ==> ����ڰ� �Է��� �Է����� �ʴ� ���
 *   	else
 *   	  return;
 *   }
 *   
 *   ����)
 *   	int display(int a)
 *   	{
 *   		=== �Ű������� ó��
 *   		===
 *   		===
 *   		return ��; => ���� �ݵ�� �������� ��ġ ==> ó�� �����
 *   
 *   	ȣ���
 *   	int a=display(10);
 *   		 ==> �Ű������� 10�� �Է½�Ų��
 *   	======
 *   	������� ��´�
 *   
 *   	*** return���� ���� ������ �޼ҵ� {} �ȿ� �ִ� ��� ������ ���� �Ѵ�
 *   	*** �޼ҵ�� �ݺ� ���� �� �� �ִ� ����� �ִ�
 *   	}
 *	=> class
 *		Tv
 *		 = Tv������ ����ϴ� ���� (�Ӽ�) : ����, ����(off,on), channel
 *		 = Tv������ ����ϴ� �޼ҵ� (���) : ���� 
 *
 *		============================
 *		���
 *		 �Ӽ� : �̸�, �ֹι�ȣ, ����, ����, Ű, ������, ��ȭ, �ּ�... ��, �ٸ�, ��, ��
 *		 ���� : �Դ� ���, �ȴ� ���, �ٴ� ���
 *		 ================================ �ùķ��̼�
 *
 * 1. ��������� ����޼ҵ� � ���̵� ������� ����� ����
 * 2. static �޼ҵ�� ��������� ��� �� �� ����
 * 	 => ��ü�� ���� �Ŀ� ����� ����
 */
class Temp{ 
	int a=10; // static �޼��忡 ����ϱ� ���ؼ� ��ü ���� �ؾ��Ѵ�
	static int b=10; // static������ ��𼭵� ��밡��
	void aaa() {
		System.out.println("a="+a);
		System.out.println(b);
	}
	void bbb() {
		a+=10;
		b+=20;
	}
	static void ccc() {
		Temp t=new Temp(); // ��ü�����Ŀ� ����� ���� => ���󵵰� ���� �幰��
		System.out.println("a="+t.a);
		System.out.println(b);
	}
}

class Tv{
//	==============Tv�� ���Ǵ� ���� ==> class ��ü���� ����� ����
	String color;
	boolean power;
	int channel;
//	==============
//	Tv�� �۵� => ���� (�޼ҵ�)
	void setPower() { // ���� ���� => ���� ������ �ƴ϶�(����) => power=true (Tv�ѱ�), power=false(Tv����)
		power=!power;
	}
	// channel �̵�
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	// �ν��Ͻ� (����, �޼ҵ�) => �������� => new ������()
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t=new Tv();
		System.out.println(t); // t(�޸� �ּ�:41a4555e) => color, power, channel, setPower~
		t.setPower();
		if(t.power) {
			System.out.println("Tv ����...");
		}
		else {
			System.out.println("Tv ����...");
		}
		t.channelUp();
		t.channelUp();
		t.channelUp();
		t.channelUp();
		t.channelUp();
		System.out.println("channel="+t.channel);
		
		Tv t2=new Tv();
		t2.setPower();
		if(t2.power) {
			System.out.println("Tv ����...");
		}
		else {
			System.out.println("Tv ����...");
		}
		// �޸� ����(�޸� �Ҵ�) => new (���� �޸� �Ҵ�)
		// Ŭ������ ��ü��=new ������() => �����ڴ� �ݵ�� Ŭ������� ����
		// ����� ��������� �����ϴ� ���, static�� �����ϴ� ���
		// ����޼ҵ� : ��ü��.�޼ҵ��(�Ű�������...), Ŭ������.�޼ҵ��()
		// => new�� �̿����� �ʾƵ� �޸𸮿� ���� => �ʿ��Ҷ� ���� new�� ������� �ʰ� ����� ����
		// Scanner scan=new Scanner(System.in) => scan.nextInt() => �ν��Ͻ� �޼ҵ�
		// Math.random() => static �޼ҵ� (Math => ���� ó��)
		// Math.cell(); �ø�
	}

}
