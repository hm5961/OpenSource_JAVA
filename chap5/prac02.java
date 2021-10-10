package chap5;

class TV 
{
	private int size;

	public TV(int size) 
	{
		this.size = size;
	}

	protected int getSize() 
	{
		return size;
	}
}

class ColorTV extends TV 
{
	private int color;

	ColorTV(int size, int color) 
	{
		super(size);
		this.color = color;
	}

	public void printProperty() 
	{
		System.out.print( getSize() + "��ġ " + color + "�÷�");
	}
}

class IPTV extends ColorTV 
{
	String IP;

	IPTV(String IP, int size, int resolution) 
	{
		super(size, resolution);
		this.IP = IP;
	}

	public void printProperty() 
	{
		System.out.print("���� IPTV�� " + IP + " �ּ��� ");
		super.printProperty();
	}
}

public class prac02 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}