public class cwh_44_Errors {

    public int factorial(int num) {
        // Note: There is no termination condition
        // if (num <= 1)
        // return 1;

        // Calling recursively to compute factorial of a number
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/find-max-memory-free-memory-total-memory-java/?ref=rp
        // https://www.geeksforgeeks.org/heap-and-stack-memory-errors-in-java/?ref=rp

        /**
         ** Errors describe some serious system failure.In other words it denotes
         ** abnormal termination of application. It happens due to lack of System
         ** resorces. We can somehow handel the Exceptions(RunTime Errors) by catch(){}.
         ** However, we can never able to catch an error. It is always Unchecked(Occurs
         ** in RunTime Enviroment)
         * ! Error & Exceptions are the sub class of Throwable
         * ? Popular Errors:-
         * ! 1)VirtualMachineError
         * ! a) StackOverflowError(occurs in java stack memory detected by JVM)
         * ? EX-it is thrown when we are calling a method recursively without any proper
         * ? termination condition.
         * ! b) OutOfMemoryError(occurs in java heap detected by JVM)
         * ? EX- is is thrown when very large no. of objects in heap memory and there is
         * ? no space left for new object. It is a general responsibility of Garbage
         * ? collector to deallocate memory of objects which not been refrenced.
         * ? But we can't tell the exact time when Garbage collection will occurs.
         * ! 2) I/O Error
         * ! 3) AWT Error
         * ! 4) Assertion Error
         * ! 5)ExceptionInitializer Error
         */
        // StackOverflowError

        cwh_44_Errors err = new cwh_44_Errors();
        System.out.println(err.factorial(8));

        Runtime r = Runtime.getRuntime();
        double mb = 1000000;

        System.out.println("Maximum Heap Size: " + (r.maxMemory() / mb));
        System.out.println("Initial Heap Size: " + (r.totalMemory() / mb));
        System.out.println("Free memory: " + (r.freeMemory() / mb));
        System.out.println("Consumed memory: " + ((r.totalMemory() - r.freeMemory()) / mb));
        r.gc();// called garbage collector
        System.out.println();
        System.out.println();
        System.out.println("Maximum Heap Size: " + (r.maxMemory() / mb));
        System.out.println("Initial Heap Size: " + (r.totalMemory() / mb));
        System.out.println("Free memory: " + (r.freeMemory() / mb));
        System.out.println("Consumed memory: " + ((r.totalMemory() - r.freeMemory()) / mb));
        // OutOfMemoryError
        cwh_44_Errors[] obj = new cwh_44_Errors[1000000000 * 100000000];
        for (cwh_44_Errors o : obj) {
            o = new cwh_44_Errors();
        }

    }
}