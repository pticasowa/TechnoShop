package AllDevices;

public class Tablet extends AllDevices{
    protected double displayDiagonal;
    protected boolean hasSIM;
    protected int batteryCapacity;

    protected static int maxLengthDisplayDiagonal = "display size".length();
    protected static int maxLengthHasSIM = "has SIM".length();
    protected static int maxLengthBatteryCapacity = "battery".length();

    public double getDisplayDiagonal(){
        return displayDiagonal;
    }
    public boolean getHasSIM(){
        return hasSIM;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setDisplayDiagonal(double displayDiagonal){
        this.displayDiagonal = displayDiagonal;
    }
    public void setHasSIM(boolean hasSIM){
        this.hasSIM = hasSIM;
    }
    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public static int getMaxLengthDisplayDiagonal(){
        return maxLengthDisplayDiagonal;
    }
    public static int getMaxLengthHasSIM(){
        return maxLengthHasSIM;
    }
    public static int getMaxLengthBatteryCapacity(){
        return maxLengthBatteryCapacity;
    }

    public static void setMaxLengthDisplayDiagonal(int maxLengthDisplayDiagonal){
        Tablet.maxLengthDisplayDiagonal = maxLengthDisplayDiagonal;
    }
    public static void setMaxLengthHasSIM(int maxLengthHasSIM){
        Tablet.maxLengthHasSIM = maxLengthHasSIM;
    }
    public static void setMaxLengthBatteryCapacity(int maxLengthBatteryCapacity){
        Tablet.maxLengthBatteryCapacity = maxLengthBatteryCapacity;
    }

    public static void table(int counter){
        int countOfSpaces = String.valueOf(counter).length()+1; //+1 because we count length of number and point(.) after it. Example (4. - 1+1) (243. - 3+1)
        System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"s|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"s|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthDisplayDiagonal+X)+"s|%-"+(maxLengthHasSIM+X)+"s|%-"+(maxLengthBatteryCapacity+X)+"s","","brand","model","price","processor","memory","device type","display size","has SIM","battery");
        System.out.println();
    }
    public void info(int counter){
        System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"d|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"d|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthDisplayDiagonal+X)+"f|%-"+(maxLengthHasSIM+X)+"b|%-"+(maxLengthBatteryCapacity+X)+"d",(counter+1)+".",brand,model,price,processor,memory,deviceType,displayDiagonal,hasSIM,batteryCapacity);
        System.out.println();
    }
}
