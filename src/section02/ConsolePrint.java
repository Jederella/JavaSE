package section02;
/*
 * ��¹�
 *  �����͸� ȭ�鿡 Ǯ���ϴ� ���
 *  
 *  System.out.println(): ��ȣ�� ���� ��� �� �� �ٲ�
 *  System.out.print()  : ��ȣ�� ���� ��� �� �ٲ� X
 *  System.out.printf() : ���ڿ� ���� ���ڸ� �̿��� ����ȭ�� ���� ��� �� �ٲ� X
 *  
 *  ���� ����
 *       %d: ����(10����)
 *       %o: ����(8����)
 *       %x: ����(16����)
 *       %f: �Ǽ�
 *       %e: ����(eǥ�� ���)
 *       %g: ��� ��� ���� %e �Ǵ� %f ���·� ���
 *       %s: ���ڿ�
 *       %c: ����
 * 
 */
public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("Welcome.");
		
		System.out.println("Java World");
		
		System.out.printf("������ %d�� %d�� �Դϴ�.\n", 7 ,14);
		
		System.out.printf("%d�� ù��°, %f�� �ι�°, %s�� ����°.\n", 1, 2.0, "��");
	}
}
