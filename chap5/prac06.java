package chap5;
class Point3
{
	private int x,y;
	public Point3(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
		
	}
	protected void move(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class ColorPoint3 extends Point3{
	
	String color;
	public ColorPoint3()
	{
		super(0,0);
		this.color="BLACK";
	}
	public ColorPoint3(int x,int y)
	{
		super(x,y);
		this.color="BLACK";
		
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setXY(int x,int y)
	{
		move(x,y);
	}
	public String toString()
	{
		String tmp = color + "색의 (" + getX() + "," + getY() + ") 점";		
		return tmp;
	}
}
public class prac06 {

	public static void main(String[] args) {
		ColorPoint3 zeroPoint = new ColorPoint3();
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPoint3 cp = new ColorPoint3(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}