package inheritance;
import java.util.*;
	class Video{
	String title;
	boolean[]  flag=new boolean[10];
	
	int[] user_rating=new int[10];
	void being_checkedout(int i)
	{
		if(flag[i]==true)
			flag[i]=false;
	}
	void being_returned(int j)
	{
		if(flag[j]==false)
		  flag[j]=true;
	}
	void receive_a_rating()
	{
		
	}
}
class VideoStore extends Video
{
Video obj=new Video();
	String[] videos=new String[10];
	int[] rate=new int[10];
	int i=0;
	
	void addVideo(String title)
	{
	
	videos[i++]=title;	
	}
	void checkOut(String nm)
	{
	
		int j,index=0;
		for(j=0;j<3;j++)
		{
			if(videos[j].equals(nm))
			{
				index=j;
			}
		}
		being_checkedout(index);
	}
	void returnVideo(String nm)
	{
		int j,index=0;
		for(j=0;j<3;j++)
		{
			if(videos[j].equals(nm))
			{
				index=j;
			}
		}
		being_returned(index);
	}
	void receiveRating(int n, int no )
	{
		rate[n]=no;
	}
	void listInventory()
	{
		int i;
		
		for(i=0;i<3;i++)
		{
			
		    if(flag[i]==true)
			System.out.println(videos[i]+" " +flag[i]);
		}
		
	}
}
public class store extends VideoStore{
	public static void main(String args[])
	{
		VideoStore o=new VideoStore();
	//	VideoStore o1=new VideoStore();
		Arrays.fill(o.flag, true);
		//VideoStore o2=new VideoStore();
		o.addVideo("The Matrix");
		o.addVideo("Godfather II");
		o.addVideo("Star War Episode IV: A New Hope");
		o.receiveRating(0, 4);
		o.receiveRating(1, 3);
		o.receiveRating(2, 5);
	    o.checkOut("The Matrix");
		o.checkOut("Godfather II");
		o.checkOut("Star War Episode IV: A New Hope");
		o.returnVideo("The Matrix");
		o.returnVideo("Godfather II");
		o.returnVideo("Star War Episode IV: A New Hope");
		o.checkOut("Godfather II");
		o.listInventory();
		
	}
}
