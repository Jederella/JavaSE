package section02;
/*
 * 2.������(char)
 * 	���� �� ���� ���� ���� - �� ���� ���̴� ��κ� ���� ǥ�� ����
 * 	2byte
 * 
 *������
 *	char ������;
 *
 *���� �ʱ�ȭ
 * ������ ����ϱ��� ���� ó�� �Ҵ��ϴ� ���� �ǹ��Ѵ�.
 */
public class Variable02 {
	 public static void main(String[] args) {
		//char �� ���� ���� �� ����
		char ch1 = 'A';
		System.out.println("char �� ������ ����� ����:" + ch1);
		
		char ch2, ch3;
		ch2 ='��';
		ch3 ='�Q';
		System.out.println("ch2 ����� ����:" + ch2);
		System.out.println("ch3 ����� ����:" + ch3);
		
		int num = ch1; // char ch1 ������ int ���������� ����ȯ
		System.out.println("�빮�� A�� �ش��ϴ� �����ڵ�:" + num);
		
		char ch4 = 66;
		System.out.println("���� 66�� �ش��ϴ� �����ڵ�:" + ch4);
		
	}
}
