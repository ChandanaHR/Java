ScheduledExecutorService is an interface in the Executor Framework used to:
Execute tasks after a delay or execute tasks repeatedly at fixed intervals.

  Why Do We Need ScheduledExecutorService?
    Send notifications every hour
    Backup database every day
    Generate reports every night
    Run health checks every 5 minutes

  Creating threads manually and managing timing is difficult.
  ScheduledExecutorService handles this automatically.

  Imagine an alarm clock. Set alarm for 6:00 AM The alarm waits and rings at the specified time. This is similar to schedule()
  Imagine a classroom bell. Every 45 minutes,Ring Bell  scheduleAtFixedRate()

  Creating ScheduledExecutorService ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

Methods
  1) schedule()
    Execute a task once after a specified delay. 
  Syntax: schedule(Runnable task,
         long delay,
         TimeUnit unit)
               import java.util.concurrent.*;
            
            public class ScheduleDemo {
            
                public static void main(String[] args) {
            
                    ScheduledExecutorService service =
                            Executors.newScheduledThreadPool(2);
            
                    service.schedule(() -> {
            
                        System.out.println("Task Executed");
            
                    }, 5, TimeUnit.SECONDS);
                }
            }
Program Starts
      |
Wait 5 Seconds
      |
Execute Task
      |
Print Message

  2) scheduleAtFixedRate() : Runs a task repeatedly at fixed intervals.
    Syntax: scheduleAtFixedRate(
    Runnable task,
    long initialDelay,
    long period,
    TimeUnit unit
)

          import java.util.concurrent.*;
        
        public class FixedRateDemo {
        
            public static void main(String[] args) {
        
                ScheduledExecutorService service =
                        Executors.newScheduledThreadPool(2);
        
                service.scheduleAtFixedRate(() -> {
        
                    System.out.println("Task Running");
        
                }, 2, 3, TimeUnit.SECONDS);
            }
        }
2 Initial delay : Wait 2 seconds before first execution.
  3 Period: Execute every 3 seconds.
  Execution Timeline
  0 sec -> Program Start

2 sec -> Task Runs

5 sec -> Task Runs

8 sec -> Task Runs

11 sec -> Task Runs

14 sec -> Task Runs


  3) scheduleWithFixedDelay() : Runs tasks repeatedly but waits a fixed delay after the previous execution completes.
  scheduleWithFixedDelay(
    Runnable task,
    long initialDelay,
    long delay,
    TimeUnit unit
)

          import java.util.concurrent.*;
        
        public class FixedDelayDemo {
        
            public static void main(String[] args) {
        
                ScheduledExecutorService service =
                        Executors.newScheduledThreadPool(2);
        
                service.scheduleWithFixedDelay(() -> {
        
                    System.out.println("Task Running");
        
                    try {
                        Thread.sleep(2000);
                    }
                    catch(Exception e) {
        
                    }
        
                }, 2, 3, TimeUnit.SECONDS);
            }
        }
0 sec  Program Start

2 sec  Task Starts

4 sec  Task Ends

7 sec  Task Starts

9 sec  Task Ends

12 sec Task Starts
