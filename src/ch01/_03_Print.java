package ch01;

public class _03_Print {

	public static void main(String[] args) {
		System.out.print(false);
		System.out.print(false);
		System.out.print(false);
		System.out.print(false);
		System.out.println(false);
		System.out.println(5);	//정수
		System.out.println(5.897); //실수
		System.out.println(3+5);
		System.out.println(3.9 * 5.72);
		System.out.println(10/3);
		System.out.println("덧셈 결과는 " + (3+5));
		System.out.println("덧셈 결과는 " + 3*5 + " 입니다");
		/* printf(format)
		 %d: decimal
 		 %f: float
		 %c: character
		 %s: string
		 */
		System.out.printf("덧셈 결과는 %d 입니다\n", 7 + 123400);
		System.out.printf("%d + %d = %d", 3,5, 3+5);
		System.out.printf("%c\n", 'T');
		System.out.printf("%s", "Im so powerful");
	}
	

}
