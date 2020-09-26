package threadDemo;

public class Service implements Runnable{
	int counter=0;
	@Override
	public void run() {
		counter++;
		System.out.println("Number of hits : " +counter );
		if(counter==5) {
			throw new NullPointerException();
		}
	}

}
