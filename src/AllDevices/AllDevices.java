package AllDevices;

public class AllDevices {
    protected static final int X = 2;//this one is for formating table
    protected String brand;
    protected String model;
    protected int price;
    protected String processor;
    protected int memory;
    protected String deviceType;

    protected static int maxNumeration;
    protected static int maxLengthBrand = "brand".length();
    protected static int maxLengthModel = "model".length();
    protected static int maxLengthPrice = "price".length();
    protected static int maxLengthProcessor = "processor".length();
    protected static int maxLengthMemory = "memory".length();
    protected static int maxLengthDeviceType = "device type".length();

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public void setDeviceType(String deviceType){
        this.deviceType = deviceType;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public String getProcessor(){
        return processor;
    }
    public int getMemory(){
        return memory;
    }
    public String getDeviceType(){
        return deviceType;
    }


    public static int getMaxNumeration(){
        return maxNumeration;
    }
    public static int getMaxLengthBrand(){
        return maxLengthBrand;
    }
    public static int getMaxLengthModel(){
        return maxLengthModel;
    }
    public static int getMaxLengthPrice(){
        return maxLengthPrice;
    }
    public static int getMaxLengthProcessor(){
        return maxLengthProcessor;
    }
    public static int getMaxLengthMemory(){
        return maxLengthMemory;
    }
    public static int getMaxLengthDeviceType(){
        return maxLengthDeviceType;
    }

    public static void setMaxNumeration(int maxNumeration){
        AllDevices.maxNumeration = maxNumeration;
    }
    public static void setMaxLengthBrand(int maxLengthBrand){
        AllDevices.maxLengthBrand = maxLengthBrand;
    }
    public static void setMaxLengthModel(int maxLengthModel){
        AllDevices.maxLengthModel = maxLengthModel;
    }
    public static void setMaxLengthPrice(int maxLengthPrice){
        AllDevices.maxLengthPrice = maxLengthPrice;
    }
    public static void setMaxLengthProcessor(int maxLengthProcessor){
        AllDevices.maxLengthProcessor = maxLengthProcessor;
    }
    public static void setMaxLengthMemory(int maxLengthMemory){
        AllDevices.maxLengthMemory = maxLengthMemory;
    }
    public static void setMaxLengthDeviceType(int maxLengthDeviceType){
        AllDevices.maxLengthDeviceType = maxLengthDeviceType;
    }
}
