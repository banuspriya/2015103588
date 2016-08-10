
public class Sale {
static int sal=200;
int gross;
int total;
	public Sale() {
		// TODO Auto-generated constructor stub
	sal=0;
	gross=0;
	}
	public void setSal(int a)
	{sal= a;	
	}
	public void setGross(int a)
	{gross=a;
	}
	public int getSal()
	{return(sal);
	}
public int getGross()
{return(gross);
}
public void calTotal()
{total=sal+((gross*9)/100);
}
public int getTotal()
{return(total);

}
}
