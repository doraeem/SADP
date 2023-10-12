// Task-8 (Facade Pattern)

interface HardwareComponent {
    void start();
}

class CPU implements HardwareComponent {
    @Override
    public void start() {
        System.out.println("CPU is starting");
    }
}

class Memory implements HardwareComponent {
    @Override
    public void start() {
        System.out.println("Memory is loading");
    }
}

class HardDrive implements HardwareComponent {
    @Override
    public void start() {
        System.out.println("Hard Drive is reading");
    }
}

class Computer {
    private HardwareComponent cpu ;
    private HardwareComponent  memory  ;
    private HardwareComponent hardDrive ;
       

    public Computer() {
        cpu = new CPU();
        memory= new Memory();
        hardDrive= new HardDrive();

    }

    public void startComputer() {
        System.out.println("Starting the computer...");
        cpu .start();
        memory.start();
        hardDrive.start();
        System.out.println("Computer started successfully.");
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
