package section01;
/*
 * 주석
 *  코드에 영향을 주지 않는 개발자가 사용하는 메모공간
 *  
 *  여러줄 주석
 *  
 *  줄삭제 : Ctrl + d
 *  
 *  실행단축키 Ctrl + F11
 *  
 *  주석단축키: Ctrl + /
 *  
 *  JavaDoc 주석 단축키 : Alt +shift + J
 */

/**JavaDoc 주석
 * 
 * 입력받은 정수 출력하는 메소드
 * 
 */
/**
 * 
 */
/**
 * 
 */
public class Comment {
    public static void main(String[] args) {
    	//한글 주석
		System.out.println("Hello,Java!");
		
		printNum(712);
	}
    
    public static void printNum(int num) {
    	System.out.println("num: " + num);
    }
}
