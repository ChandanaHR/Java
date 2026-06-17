Future Interface in java
  The result of an asynchronous task that will be available in the future.
  When a task is submitted using: submit(, the ExecutorService immediately returns a Future object.
  The task may still be running, but the Future acts like a placeholder for the result.

  Important methods
get() -> Returns the result of the task
  If task is not completed:Current thread waits, until task finishes
            ExecutorService service =
                  Executors.newFixedThreadPool(2);
            Future<Integer> future =
                  service.submit(() -> {
          
                      return 100;
                  });
          
             System.out.println(future.get());
             service.shutdown();
Task submitted: return 100
  Executor executes task.
  Result stored inside Future.
  future.get(); retrieves the result.
  If task takes time: future.get(); waits until task finishes.

  Example with delay
          Future<String> future =
                service.submit(() -> {
        
                    Thread.sleep(3000);
        
                    return "Completed";
                });
        
        System.out.println(future.get());

2) get(timeout, TimeUnit)
  Waits only for a specified time.
  future.get(2, TimeUnit.SECONDS); : Wait maximum 2 seconds
          Future<String> future =
                service.submit(() -> {
        
                    Thread.sleep(5000);
        
                    return "Done";
                });
        
        System.out.println(
                future.get(2, TimeUnit.SECONDS));
Task requires:5 seconds
  But get waits only: 2 seconds
  Result: TimeoutException
  Real life example
        Food delivery expected in 30 mins
         You decide:
         "I'll wait only 10 mins"
          If not delivered,
          stop waiting.

  3) isDone(): Checks whether task has completed.
  future.isDone(); Returns true or false
              Future<Integer> future =
                    service.submit(() -> {
            
                        Thread.sleep(3000);
            
                        return 100;
                    });
            
            System.out.println(future.isDone());
Immediately after submission: false=> Because task is still running.
  After completion: true => 

  4) cancel(): Attempts to cancel the task.
  future.cancel(true) or future.cancel(false)
  cancel(true) : Interrupt running task
  cancel(false) : Cancel only if task has not started yet
            Future<String> future =
                  service.submit(() -> {
          
                      Thread.sleep(5000);
          
                      return "Completed";
                  });
          
          future.cancel(true);
Task is interrupted before completion. Task Cancelled
  true: Task cancelled sucessfully
  false: Task could not be cancelled

  5) isCancelled()
    Checks whether task was cancelled.
    future.isCancelled()
          Future<String> future =
                service.submit(() -> {
        
                    Thread.sleep(5000);
        
                    return "Done";
                });
        
        future.cancel(true);
        
        System.out.println(
                future.isCancelled());

Example import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
                Executors.newFixedThreadPool(2);

        Future<Integer> future =
                service.submit(() -> {

                    Thread.sleep(2000);

                    return 500;
                });

        System.out.println(
                "Completed? " + future.isDone());

        Integer result = future.get();

        System.out.println(
                "Result = " + result);

        System.out.println(
                "Completed? " + future.isDone());

        service.shutdown();
    }
}

