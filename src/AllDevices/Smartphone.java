package AllDevices;

public class Smartphone extends AllDevices{
    protected double displayDiagonal;
    protected boolean hasCharger;
    protected String valueOfCameras;

    protected static int maxLengthDisplayDiagonal = "display size".length();
    protected static int maxLengthHasCharger = "has charger".length();
    protected static int maxLengthValueOfCameras = "count of cameras".length();

    public double getDisplayDiagonal(){
        return displayDiagonal;
    }
    public boolean getHasCharger(){
        return hasCharger;
    }
    public String getValueOfCameras() {
        return valueOfCameras;
    }

    public void setDisplayDiagonal(double displayDiagonal){
        this.displayDiagonal = displayDiagonal;
    }
    public void setHasCharger(boolean hasCharger){
        this.hasCharger = hasCharger;
    }
    public void setValueOfCameras(String valueOfCameras){
        this.valueOfCameras = valueOfCameras;
    }

    public static int getMaxLengthDisplayDiagonal(){
        return maxLengthDisplayDiagonal;
    }
    public static int getMaxLengthHasCharger(){
        return maxLengthHasCharger;
    }
    public static int getMaxLengthValueOfCameras(){
        return maxLengthValueOfCameras;
    }

    public static void setMaxLengthDisplayDiagonal(int maxLengthDisplayDiagonal){
        Smartphone.maxLengthDisplayDiagonal = maxLengthDisplayDiagonal;
    }
    public static void setMaxLengthHasCharger(int maxLengthHasCharger){
        Smartphone.maxLengthHasCharger = maxLengthHasCharger;
    }
    public static void setMaxLengthValueOfCameras(int maxLengthValueOfCameras){
        Smartphone.maxLengthValueOfCameras = maxLengthValueOfCameras;
    }

    public static void table(int counter){
        int countOfSpaces = String.valueOf(counter).length()+1; //+1 because we count length of number and point(.) after it. Example (4. - 1+1) (243. - 3+1)
        System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"s|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"s|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthDisplayDiagonal+X)+"s|%-"+(maxLengthHasCharger+X)+"s|%-"+(maxLengthValueOfCameras+X)+"s","","brand","model","price","processor","memory","device type","display size","has charger","count of cameras");
        System.out.println();
    }
    public void info(int counter){
        System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"d|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"d|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthDisplayDiagonal+X)+"f|%-"+(maxLengthHasCharger+X)+"b|%-"+(maxLengthValueOfCameras+X)+"s",(counter+1)+".",brand,model,price,processor,memory,deviceType,displayDiagonal,hasCharger,valueOfCameras);
        System.out.println();
    }
}
