
import java.util.concurrent.atomic.AtomicInteger;
public class  p33{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SumWithThreads <N> <number_of_threads>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int numberOfThreads = Integer.parseInt(args[1]);

        
        AtomicInteger[] partialSums = new AtomicInteger[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            partialSums[i] = new AtomicInteger(0);
        }

        
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int start = (N / numberOfThreads) * threadIndex + 1;
                int end = (threadIndex == numberOfThreads - 1) ? N : start + (N / numberOfThreads) - 1;
                for (int j = start; j <= end; j++) {
                    partialSums[threadIndex].addAndGet(j);
                }
            });
            threads[i].start();
        }

        
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
        int totalSum = 0;
        for (AtomicInteger partialSum : partialSums) {
            totalSum += partialSum.get();
        }

        
        System.out.println("The sum of the first " + N + " numbers is: " + totalSum);
    }
}

