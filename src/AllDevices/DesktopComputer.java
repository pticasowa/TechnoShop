package AllDevices;

public class DesktopComputer extends AllDevices{
    protected boolean hasDiscreteGraphicsCard;
    protected String bodyBrand;
    protected String coolingSystem;

    protected static int maxLengthHasDiscreteGraphicsCard = "disc.graphics card".length();
    protected static int maxLengthBodyBrand = "body".length();
    protected static int maxLengthCoolingSystem = "cooling".length();

    public Boolean getHasDiscreteGraphicsCard(){
        return hasDiscreteGraphicsCard;
    }
    public String getBodyBrand(){
        return bodyBrand;
    }
    public String getCoolingSystem(){
        return coolingSystem;
    }

    public void setHasDiscreteGraphicsCard(Boolean hasDiscreteGraphicsCard){
        this.hasDiscreteGraphicsCard = hasDiscreteGraphicsCard;
    }
    public void setBodyBrand(String bodyBrand){
        this.bodyBrand = bodyBrand;
    }
    public void setCoolingSystem(String coolingSystem){
        this.coolingSystem = coolingSystem;
    }

    public static int getMaxLengthHasDiscreteGraphicsCard(){
        return maxLengthHasDiscreteGraphicsCard;
    }
    public static int getMaxLengthBodyBrand(){
        return maxLengthBodyBrand;
    }
    public static int getMaxLengthCoolingSystem(){
        return maxLengthCoolingSystem;
    }

    public static void setMaxLengthHasDiscreteGraphicsCard(int maxLengthHasDiscreteGraphicsCard){
        DesktopComputer.maxLengthHasDiscreteGraphicsCard = maxLengthHasDiscreteGraphicsCard;
    }
    public static void setMaxLengthBodyBrand(int maxLengthBodyBrand){
        DesktopComputer.maxLengthBodyBrand = maxLengthBodyBrand;
    }
    public static void setMaxLengthCoolingSystem(int maxLengthCoolingSystem){
        DesktopComputer.maxLengthCoolingSystem = maxLengthCoolingSystem;
    }

    public static void table(int counter){
        int countOfSpaces = String.valueOf(counter).length()+1; //+1 because we count length of number and point(.) after it. Example (4. - 1+1) (243. - 3+1)
        System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"s|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"s|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthHasDiscreteGraphicsCard+X)+"s|%-"+(maxLengthBodyBrand+X)+"s|%-"+(maxLengthCoolingSystem+X)+"s","","brand","model","price","processor","memory","device type","disc.graphics card","body","cooling");
        System.out.println();
    }
    public void info(int counter){
                System.out.printf("%-"+(maxNumeration+X)+"s %-"+(maxLengthBrand+X)+"s|%-"+(maxLengthModel+X)+"s|%-"+(maxLengthPrice+X)+"d|%-"+(maxLengthProcessor+X)+"s|%-"+(maxLengthMemory+X)+"d|%-"+(maxLengthDeviceType+X)+"s|%-"+(maxLengthHasDiscreteGraphicsCard+X)+"b|%-"+(maxLengthBodyBrand+X)+"s|%-"+(maxLengthCoolingSystem+X)+"s",(counter+1)+".",brand,model,price,processor,memory,deviceType,hasDiscreteGraphicsCard,bodyBrand,coolingSystem);
        System.out.println();
    }
}
