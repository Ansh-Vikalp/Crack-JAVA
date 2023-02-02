public class cwh_39_CmdArg {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No argument passed");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Arg at " + i + " :" + args[i]);
            }

            // *use javac cwh_39_CmdArg.java
            // *java cwh_39_CmdArg raju shyam 4 5 ^ Mohan
        }
    }
}
