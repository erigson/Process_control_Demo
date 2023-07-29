package LaunchProcess;

import java.io.*;

public class LaunchProcess {

    public static void main(String[] args) throws IOException, Exception {

        if(args.length < 2) {
            System.out.println("Please provide the class name and file path as arguments.");
            return;
        }

        String className = args[0]; // The first argument is the Java class to be executed.
        String filePath = args[1]; // The second argument is the file path.

        String javaPath = "java";
        String command = javaPath + " " + className + " " + filePath;

        try {

            long startTime = System.currentTimeMillis();

            Process process = Runtime.getRuntime().exec(command);

            BufferedReader is = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = is.readLine()) != null)
                System.out.println(line);


            int exit = process.waitFor();
            long endTime = System.currentTimeMillis();

            // checking the exit value of subprocess
            System.out.println("exit value:" + process.exitValue());
            System.out.println("Time to finish all tasks: " + (endTime - startTime) + " ms");
        }

        // Catch block to handle the exceptions
        catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}
