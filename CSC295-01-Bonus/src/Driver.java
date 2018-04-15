
public class Driver {

	public static void main(String[] args) {
//		Ball ball = new Ball(2,2,4,2,30);
//		System.out.println(ball.toString());
//		for(int i = 0; i < 100; i++) {
//			ball.move();
//			System.out.println(ball.toString());
//		}
		
		Container box = new Container(0,0,100,100);
		System.out.println(box);
		
		Ball ball2 = new Ball(50,50,5,10,30);
		
		for(int i = 0; i < 100; i++) {
			ball2.move();
			box.collidesWith(ball2);
			System.out.println(ball2);
		}
	}
}
