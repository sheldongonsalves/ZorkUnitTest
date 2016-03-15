import static org.junit.Assert.*;

import org.junit.Test;

public class ZorkTest {
	Player pl = new Player();

	@Test
	public void test() {
		System.out.println("Assume User goes into the front room");
		Room rm=new Room("Front Room", 63, "you are in the front room", "piano");
		assertTrue(rm!=null);
		
	}
	@Test
	public void test1() {
		System.out.println("Assume User goes into the front room");
		Room rm=new Room("Front Room", 63, "you are in the front room", "piano");
		double [] Money =new double[8];
		Money[0]=rm.getMoney();
		assertTrue(Money[0]!=0);
		
		
	}
	@Test
	public void test2() {
		System.out.println("Assume User goes into the front room");
		Room rm=new Room("Front Room", 63, "you are in the front room", "piano");
		String [] things =new String[8];
		things[0]=rm.getThings();
		assertTrue(!things[0].equalsIgnoreCase(""));
	
		
	}
	@Test
	public void test3() {
		System.out.println("Assume User goes into the front room");
		Room rm=new Room("Front Room", 63, "you are in the front room", "piano");
		String Message;
		Message=rm.getName();
		assertTrue(!Message.equalsIgnoreCase(""));
		
		
	}
	@Test
	public void test4() {
		System.out.println("Assume User goes into the front room");
		Room rm=new Room("Front Room", 63, "you are in the front room", "piano");
		assertTrue(!rm.toString().equalsIgnoreCase(""));
		System.out.println(rm.toString());
		
		
	}

}
