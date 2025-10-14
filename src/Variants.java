import java.io.FileNotFoundException;

public class Variants {
    static boolean stopProgram = false;
    public Variants(){
    }
    public static boolean var1(String message, String typeOfDevice) throws FileNotFoundException, InterruptedException {
        if(message=="FirstChoise"){
            Main.toCheckAllProducts();
        }
        else if(message=="ChooseTypeOfDevice"){//to Desktop computer
            Main.toChooseCertainDesktopComputer();
        }
        else if(message=="ChooseDevice"){
            Main.dropDeviceToCart(1, typeOfDevice);
        }
        return stopProgram;
    }
    public static boolean var2(String message, String typeOfDevice) throws InterruptedException, FileNotFoundException {
        if(message=="FirstChoise"){
            Main.toChooseCertain();
        }
        else if(message=="ChooseTypeOfDevice"){//to Laptop
            Main.toChooseCertainLaptop();
        }
        else if(message=="ChooseDevice"){
            Main.dropDeviceToCart(2, typeOfDevice);
        }
        return stopProgram;
    }
    public static boolean var3(String message, String typeOfDevice) throws InterruptedException, FileNotFoundException {
        if(message=="FirstChoise"){
            Main.toCheckDemoComp();
        }
        else if(message=="ChooseTypeOfDevice"){//tp smartphone
            Main.toChooseCertainSmartphone();
        }
        else if(message=="ChooseDevice"){
            Main.dropDeviceToCart(3, typeOfDevice);
        }
        return stopProgram;
    }
    public static boolean var4(String message, String typeOfDevice) throws InterruptedException, FileNotFoundException {
        if(message=="FirstChoise"){
            varDefault(message);
        }
        else if(message=="ChooseTypeOfDevice"){ //to Tablet
            Main.toChooseCertainTablet();
        }
        else if(message=="ChooseDevice"){
            Main.dropDeviceToCart(4, typeOfDevice);
        }
        return stopProgram;//if there is not this variant in current choise than method returns stopProgram = true;
    }
    public static boolean varDefault(String message){
        System.out.println("You pressed exit, thank you for visiting us.");
        stopProgram = true;
        return stopProgram;
    }
}

