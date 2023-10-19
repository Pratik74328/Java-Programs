package point;
import java.util.Scanner;

public class Testerpoint2d {

	public static void main(String[] args) {
		
//		Point2d p1 = new Point2d();
////	p1.displaycoord();
//		
//		Point2d p2 = new Point2d(14, 18);
////	p2.displaycoord();
//		System.out.println(p2);
		
		Scanner sc = new Scanner(System.in);
		
		//Created Array of objects of Point2d 
		Point2d[] location = new Point2d[5];
		
		System.out.println("Enter 1 to Show all coord. Enter 2 to Add new coord.  Enter 0 for exit..");
		int choice, index = 0;
		
		do {
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				for(Point2d locid :location) {
					System.out.println(locid);
				}
				break;
				
			case 2:
				if(index<location.length) {
					System.out.println("Enter x-coord  y-coord ");
					Point2d pobj = new Point2d(sc.nextInt(), sc.nextInt());
					location[index] = pobj;
					index++;
				}else {
					System.out.println("Array of object is full");
				}
				break;
			
			case 0:
				System.out.println("----Program Terminated-----");
				break;
			}
				
		}while(choice!=0);
		
	}

}
