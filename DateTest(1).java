import java.util.Scanner;
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d;
		d = new Date();
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.printf("\nenter the day");
		a=input.nextInt();
		d.setInt(a);
		System.out.printf("\nenter the month");
		b=input.nextInt();
		d.setMonth(b);
		System.out.printf("\nenter the year");
		c=input.nextInt();
		d.setYear(c);
		d.displayDate();
		}

}
