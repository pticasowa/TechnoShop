package AllDevices;

public class DesktopComputer extends AllDevices{
    boolean hasDiscreteGraphicsCard;
    String bodyBrand;
    String coolingSystem;
    static int x = 2;

    public static void table(int counter){
        int countOfSpaces = String.valueOf(counter).length()+1; //+1 because we count length of number and point(.) after it. Example (4. - 1+1) (243. - 3+1)
        System.out.printf("%-"+(MaxNumeration+x)+"s %-"+(maxLengthBrand+x)+"s|%-"+(maxLengthModel+x)+"s|%-"+(maxLengthPrice+x)+"s|%-"+(maxLengthProcessor+x)+"s|%-"+(maxLengthMemory+x)+"s|%-"+(maxLengthDeviceType+x)+"s","","brand","model","price","processor","memory","device type");
        System.out.println();
    }
    public void info(int counter){
                System.out.printf("%-"+(MaxNumeration+x)+"s %-"+(maxLengthBrand+x)+"s|%-"+(maxLengthModel+x)+"s|%-"+(maxLengthPrice+x)+"d|%-"+(maxLengthProcessor+x)+"s|%-"+(maxLengthMemory+x)+"d|%-"+(maxLengthDeviceType+x)+"s",(counter+1)+".",brand,model,price,processor,memory,deviceType);
        System.out.println();
    }
}
