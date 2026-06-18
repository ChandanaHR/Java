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
