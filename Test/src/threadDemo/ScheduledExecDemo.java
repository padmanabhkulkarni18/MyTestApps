package threadDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecDemo {

	static ScheduledExecutorService ex = new ScheduledThreadPoolExecutor(2);
	
	public static void main(String[] args) {
		
		ex.scheduleWithFixedDelay(new Service(), 1, 2, TimeUnit.SECONDS);
		
	}

}
