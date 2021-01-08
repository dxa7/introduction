package threads;

import java.util.Random;

public class ThreadEx implements Runnable {

	String name;
	int time;
	Random r = new Random(); 	//generates random numbers
	
	public ThreadEx(String threadName) {
		name = threadName;
		time = r.nextInt(500);
	}
	
	@Override
	public void run() {
		try {
			//System.out.printf("%s is sleeping for %d!\n", name, time);		//printf value format is int = %d and string = %s
			
			System.out.println(name + " is sleeping for " + time); //normal way to write it in println()
			
			Thread.sleep(time);			//Sleep for a random time
			
			//System.out.printf("%s is awake!\n", name);	//Print this when the thread wakes up
			
			System.out.println(name + " is awake " );
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	   
	}
	

