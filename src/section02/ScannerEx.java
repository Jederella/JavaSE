package section02;

import java.util.Scanner;

/*
 * Scanner
 *  ����ڷκ��� �����͸� �б� ���� ���Ǵ� Ŭ����
 *  Scanner Ŭ������ ����ϸ� Ű����κ��� �ؽ�Ʈ�� ���ڸ� ���� �� �ִ�.
 */
public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, address;   //���ڿ� ���� ��� ����
		int age;				//���� ���� ��� ����
		double weight;			//�Ǽ� ���� ��� ����
		
		System.out.println("�̸�, �ּ�, ����, ü���� ��ĭ���� �����Ͽ� ������� �Է��ϼ���.");
		name = scanner.next();			//name = "������"
		address = scanner.next();		//address = "����"
		age = scanner.nextInt();		//age = 27
		weight = scanner.nextDouble();	//weight = 64
		
		System.out.printf("����� �̸��� %s�Դϴ�.\n",name);
		System.out.printf("����� �ּҴ� %s�Դϴ�.\n",address);
		System.out.printf("����� ���̴� %d�Դϴ�.\n",age);
		System.out.printf("����� ü���� %.1fkg�Դϴ�.\n",weight);
	}

}
