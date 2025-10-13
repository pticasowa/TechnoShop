import java.io.FileNotFoundException;

public class Variants {
    static boolean stopProgram = false;
    public Variants(){
    }
    public static boolean var1(String message) throws FileNotFoundException, InterruptedException {
        if(message=="FirstChoise"){
            Main.toCheckAllProducts();
        }
        else if(message=="ChooseTypeOfDevice"){
            Main.toChooseCertainDesktopComputer();
        }
        return stopProgram;
    }
    public static boolean var2(String message) throws InterruptedException, FileNotFoundException {
        if(message=="FirstChoise"){
            Main.toChooseCertain();
        }
        else if(message=="ChooseTypeOfDevice"){
            Main.toChooseCertainLaptop();
        }
        return stopProgram;
    }
    public static boolean var3(String message) throws InterruptedException, FileNotFoundException {
        if(message=="FirstChoise"){
            Main.toCheckDemoComp();
        }
        else if(message=="ChooseTypeOfDevice"){
            Main.toChooseCertainSmartphone();
        }
        return stopProgram;
    }
    public static boolean var4(String message) throws InterruptedException, FileNotFoundException {
        if(message=="FirstChoise"){
            varDefault(message);
        }
        else if(message=="ChooseTypeOfDevice"){
            Main.toChooseCertainTablet();
        }
        return stopProgram;//if there is not this variant in current choise than method returns stopProgram = true;
    }
    public static boolean varDefault(String message){
        System.out.println("You pressed exit, thank you for visiting us.");
        stopProgram = true;
        return stopProgram;
    }
}

