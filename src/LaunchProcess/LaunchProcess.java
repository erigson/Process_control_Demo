package LaunchProcess;

import java.io.*;

public class LaunchProcess {

    public static void main(String[] args) {

        // Check if command line argument is provided
        if(args.length < 1) {
            System.out.println("No file path provided. Please provide a file path as command line argument.");
            System.exit(1);
        }

        String filePath = args[0];

        // Command to open the file
        String command;
        String os = System.getProperty("os.name").toLowerCase();

        // Check for operating system
        if (os.contains("win")) {
            command = "cmd /c start " + filePath;
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            command = "open " + filePath;
        } else {
            System.out.println("Unsupported operating system. This program supports Windows, Linux and MacOS only.");
            System.exit(1);
            return;
        }

        try {
            long startTime = System.currentTimeMillis();

            Process process = Runtime.getRuntime().exec(command);

            BufferedReader is = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = is.readLine()) != null)
                System.out.println(line);

            int exit = process.waitFor();
            long endTime = System.currentTimeMillis();

            System.out.println("exit value:" + process.exitValue());
            System.out.println("Time to finish all tasks: " + (endTime - startTime) + " ms");
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
