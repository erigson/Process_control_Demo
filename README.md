# LaunchProcess

`LaunchProcess` is a simple Java program designed to execute a file provided as a command-line argument. 
This file is opened using the default program associated with its file type, as determined by the operating system.

## Getting Started

These instructions will help you run the project on your local machine for development and testing purposes.

### Prerequisites

Ensure you have the following installed on your system:

- Java Development Kit (JDK)

### Installation

- Clone this repository to your local machine.
- Navigate to the directory containing the Java files.
- Compile the Java files using the `javac` command:

```bash
javac LaunchProcess.java
```

This will create `LaunchProcess.class`.

### Usage

Run the `LaunchProcess` program with a file as an argument:

```bash
java launchprocess.LaunchProcess /path/to/your/file
```

This command will execute `LaunchProcess` with `file` as the file to be opened. The program will open the file using the system's default program for the file type.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License.
