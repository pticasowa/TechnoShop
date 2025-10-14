package AllDevices;

public class Laptop extends AllDevices{
    protected double displayDiagonal;
    protected boolean hasCDROM;
    protected String touchPadMaterial;

    protected static int maxLengthDisplayDiagonal = "display size".length();
    protected static int maxLengthHasCDROM = "CDROM".length();
    protected static int maxLengthTouchPadMaterial = "touch pad material".length();

    public double getDisplayDiagonal(){
        return displayDiagonal;
    }
    public boolean getHasCDROM(){
        return hasCDROM;
    }
    public String getTouchPadMaterial() {
        return touchPadMaterial;
    }

    public void setDisplayDiagonal(double displayDiagonal){
        this.displayDiagonal = displayDiagonal;
    }
    public void setHasCDROM(boolean hasCDROM){
        this.hasCDROM = hasCDROM;
    }
    public void setTouchPadMaterial(String touchPadMaterial){
        this.touchPadMaterial = touchPadMaterial;
    }

    public static int getMaxLengthDisplayDiagonal(){
        return maxLengthDisplayDiagonal;
    }
    public static int getMaxLengthHasCDROM(){
        return maxLengthHasCDROM;
    }
    public static int getMaxLengthTouchPadMaterial(){
        return maxLengthTouchPadMaterial;
    }

    public static void setMaxLengthDisplayDiagonal(int maxLengthDisplayDiagonal){
        Laptop.maxLengthDisplayDiagonal = maxLengthDisplayDiagonal;
    }
    public static void setMaxLengthHasCDROM(int maxLengthHasCDROM){
        Laptop.maxLengthHasCDROM = maxLengthHasCDROM;
    }
    public static void setMaxLengthTouchPadMaterial(int maxLengthTouchPadMaterial){
        Laptop.maxLengthTouchPadMaterial = maxLengthTouchPadMaterial;
    }

    public static void table(int counter){
        int countOfSpaces = String.valueOf(counter).length()+1; //+1 because we count length of number and point(.) after it. Example (4. - 1+1) (243. - 3+1)
        System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"s|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"s|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthDisplayDiagonal+X)+"s|%-"+(maxLengthHasCDROM+X)+"s|%-"+(maxLengthTouchPadMaterial+X)+"s","","brand","model","price","processor","memory","device type","display size","CDROM","touch pad material");
        System.out.println();
    }
    public void info(int counter){
        System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"d|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"d|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthDisplayDiagonal+X)+"f|%-"+(maxLengthHasCDROM+X)+"b|%-"+(maxLengthTouchPadMaterial+X)+"s",(counter+1)+".",brand,model,price,processor,memory,deviceType,displayDiagonal,hasCDROM,touchPadMaterial);
        System.out.println();
    }
}
