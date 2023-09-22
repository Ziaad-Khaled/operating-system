# Simulated Operating System (Java)

## Project Overview

The Simulated Operating System project is designed to provide a hands-on experience with operating system concepts through simulation. This project encompasses two main phases.

## Phase 1: Basic Interpreter

In this phase, we have implemented a basic interpreter that reads and executes programs represented in text files. Each text file, when read and executed, becomes a process within our simulated operating system. We provide three sample text files, each representing a program with specific functionality.

### Programs

- **Program 1:** This program takes a filename as input from the user and prints the content of the file on the screen.

- **Program 2:** This program takes a filename and some data as input from the user, and then writes the data to the specified file.

- **Program 3:** This program takes two numbers as input from the user, performs their addition, and displays the result on the screen.

### System Calls

System calls are the processes' means of interacting with the simulated operating system. These system calls enable processes to utilize available hardware resources. The following system calls are implemented:

1. Read the data of any file from the disk.
2. Write text output to a file on the disk.
3. Print data on the screen.
4. Take text input from the user.
5. Read data from memory.
6. Write data to memory.

### Program Syntax

Programs are written using a simple syntax:

- `print`: Used to display output on the screen. Example: `print x`
- `assign`: Initializes a new variable and assigns a value to it. Example: `assign x y`, where `x` is the variable and `y` is the assigned value, which can be an integer or a string.
- `add`: Performs the summation of two numbers. Example: `add x y`, where `x` and `y` are the values to be summed, and the result is saved in `x`.
- `writeFile`: Writes data to a file. Example: `writeFile x y`, where `x` is the filename and `y` is the data.
- `readFile`: Reads data from a file. Example: `readFile x`, where `x` is the filename.

### Execution

In this phase, our Simulated OS can read provided programs and execute them sequentially.

## Phase 2: Scheduler and Memory Management

In this phase, we enhance the project by implementing a scheduler and memory management components.

### Scheduling

A scheduler is responsible for managing processes in the Ready Queue, ensuring fair execution. Our implementation uses the Round Robin algorithm, where each process is assigned a fixed time slice, and each process executes 2 instructions within its time slice. Processes are assumed to arrive in the order P1, P2, P3.

### Memory Management

In Phase 1, we stored all variables in a single data structure without protection for each process's data. In this phase, we improve memory management by allowing the OS to manage memory allocation for each process. Memory is of non-dynamic size, capable of holding unparsed lines of code, variables, and Process Control Blocks (PCBs). Memory is divided into words, each storing a variable and its data. Processes are restricted from accessing data outside their allocated memory blocks.

### Process Control Block (PCB)

A PCB stores information about a process, essential for scheduling. Each PCB includes:

1. Process ID (corresponding to the program number).
2. Process State.
3. Program Counter.
4. Memory Boundaries.

### Execution

To execute this phase, you need to run the main class, where process scheduling takes place. The system begins by reading program files from disk and allocating memory locations for each process. Once all processes are loaded into memory, the scheduler selects processes for execution based on their states, as stored in the PCBs. The selected process's code is then executed from memory.

## How to Run the Project

1. Clone this repository to your local machine.

2. Ensure you have Java installed on your system.

3. Navigate to the project directory in your terminal or command prompt.

4. Compile the Java source files, if necessary.

5. Run the main class of the project to start the simulation.

6. Follow the on-screen instructions to interact with the simulated operating system and observe the execution of programs.

This project provides valuable insights into operating system concepts and allows you to experiment with various aspects of process management and resource allocation.
