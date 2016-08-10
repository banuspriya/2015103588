import java.util.Scanner;
import java.util.Arrays;
public class SaleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sale[] s;
		final int OBJ_NO=5;
		s = new Sale[OBJ_NO];
		
		int[] a;
		final int ARRAY_LENGTH=9;
		a = new int[ARRAY_LENGTH];
		int i,j,k;
		for(i=0;i<OBJ_NO;i++)
		{s[i] = new Sale();
		}
		Scanner input = new Scanner(System.in);
		for(i=0;i<OBJ_NO;i++)
		{
		System.out.printf("\nenter gross sales for employee %d ",i+1);
		k=input.nextInt();
		s[i].setGross(k);
		s[i].calTotal();
		}
		for(i=0;i<ARRAY_LENGTH;i++)
		{a[i]=0;}
		for(i=0;i<OBJ_NO;i++)
		{if(s[i].getTotal()>999)
			++a[8];
		
		else if(s[i].getTotal()>899)
			++a[7];
		else if(s[i].getTotal()>799)
			++a[6];
		else if(s[i].getTotal()>699)
			++a[5];
		else if(s[i].getTotal()>599)
			++a[4];
		else if(s[i].getTotal()>499)
			++a[3];
		else if(s[i].getTotal()>399)
			++a[2];
		else if(s[i].getTotal()>299)
			++a[1];
		else if(s[i].getTotal()>199)
			++a[0];
		}
		System.out.printf("\nthe salary range of employes is depicted by the following tabular column");
		for(i=0,j=2;i<8;i++,j++)
		{System.out.printf("\n%d00-%d99  \t%d",j,j,a[i]);}
		System.out.printf("\n1000-more\t%d",a[8]);
		
	}

}
