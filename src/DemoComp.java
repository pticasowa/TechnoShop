public class DemoComp {
    boolean systemOn = false;

    public DemoComp(){
        System.out.println("You are in DemoComp mode!\n" +
                "We prepared a demonstration of computer work.\n" +
                "It will start in a couple of seconds.");

    }
    private class PowerUnit{
        public void toStartPowerUnit() throws InterruptedException {
            systemOn = true;
            System.out.println("systemOn = " + systemOn + ". PowerUnit is started");

            MotherBoard mb = new MotherBoard();
            mb.toPowerMotherBoard();
        }
    }
    private class MotherBoard{
        public void toPowerMotherBoard() throws InterruptedException {
            System.out.println("Motherboard has power supply");

            CPU cpu = new CPU();
            cpu.toCheckCPU();

            RAM ram1 = new RAM();
            ram1.toCheckRAM();
            RAM ram2 = new RAM();
            ram1.toCheckRAM();

            ROM rom = new ROM();
            rom.toCheckROM();
            rom.toStartSystem();
        }
    }
    private class CPU{
        public void toCheckCPU() throws InterruptedException {
            System.out.println("Checking CPU...");
            for (int core=0; core<4;core++){
                Thread.sleep(500);
                System.out.println("Core " + core + " is OK");
            }
            System.out.println("CPU is OK. Go ahead\n" +
                    "===============================");
        }
    }
    private class RAM{
        static int memoryBar=0;
        public void toCheckRAM() throws InterruptedException {
            System.out.println("Checking ram bar " + memoryBar + "...");
            for (int chip=0; chip<8;chip++){
                Thread.sleep(100);
                System.out.println("Chip " + chip + " of memory bar " + memoryBar + " is OK");
            }
            System.out.println("RAM bar " + memoryBar + " is OK\n" +
                    "===============================");
            memoryBar++;//incrementing for next bar.
        }
    }
    private class ROM{
        public void toCheckROM() throws InterruptedException {
            System.out.println("Checking ROM ...");
            for (int section=0; section<10;section++){
                Thread.sleep(150);
                System.out.println("Section " + section + " of storage device is OK");
            }
            System.out.println("ROM is OK. Continue\n" +
                    "===============================");
        }
        public void toStartSystem() throws InterruptedException {
            System.out.println("All devices are checked and OK. Starting a system.");
            for (int percent=0; percent<=100;percent=percent+20){
                Thread.sleep(500);
                System.out.println("System loaded for " + percent + "%");
            }
            System.out.println("System is loaded! Congratulations!");
        }
    }
    public void start() throws InterruptedException {
        Thread.sleep(2999);
        PowerUnit powerUnit = new PowerUnit();
        powerUnit.toStartPowerUnit();

        System.out.println("Did you like it? Let's continue:)");
    }
}
