public class Date {
	int day;
	int month;
	int year;

	public Date() {
		// TODO Auto-generated constructor stub
day=0;
month=0;
year=0;
	}
	public void setInt(int a)
	{day=a;
	
	}
	public void setMonth(int a)
	{month=a;
	
	}
	public void setYear(int a)
	{year=a;
	
	}
public int getDay()
{return(day);

}
public int getMonth()
{return(month);
}
public int getYear()
{return(year);
}
public void displayDate()
{System.out.printf("the date is %d /%d /%d ",day,month,year);
}
}
