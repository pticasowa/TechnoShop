import AllDevices.AllDevices;
import AllDevices.DesktopComputer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int countOfObjects=0;

    static String username;
    static int variant=0;
    static String variantString;
    static boolean stopProgram = false;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("""
                Hello, The hardware store TechnoShop welcomes you.
                We have desktop computers, laptops, phones, tablets.
                You can even try our DemoComp, that shows how computer works
                and what details does it contain.
                What's your name? Don't tell us, that you are Qwerty)
                ================================""");

        username = scanner.nextLine().intern(); //intern() places username value to StringPool.
        if(username.equals("Qwerty")){
            try{
                throw new RuntimeException();
            }   catch (RuntimeException e){
                System.out.println("We have asked you not input Qwerty. \n" +
                        "Sorry we don't serve users with name Qwerty. \n" +
                        "Let's try one more time? Input your name:\n" +
                        "================================");
                username = scanner.nextLine().intern();
            }
        }
        if(username.equals("Qwerty")){
                throw new RuntimeException("Bye Qwerty, this store is not for you\n" +
                        "================================") {};
        }
        System.out.println("Nice to meet you, " + username + "! \n" +
                "We can offer you to \n" +
                "1 - Check info about all our products\n" +
                "2 - Choose a certain product\n" +
                "3 - Check DemoComp\n" +
                "Any other number - Exit\n" +
                "Just pick a number and input it.\n" +
                "================================");
        toChoose("FirstChoise");
    }
    public static void toCheckDemoComp() throws InterruptedException {
        DemoComp demoComp = new DemoComp();
        demoComp.start();
        System.out.println();
    }
    public static void toCheckAllProducts(){

    }
    public static void toChooseCertain() throws InterruptedException, FileNotFoundException {
        System.out.println("Choose a type of device:\n" +
                "1 - DesktopComputer\n" +
                "2 - Laptop\n" +
                "3 - Smartphone\n" +
                "4 - Tablet\n");
        toChoose("ChooseTypeOfDevice");
    }
    public static void toChooseCertainDesktopComputer() throws InterruptedException, FileNotFoundException {
        String pathToFile = "Computers.txt";
        File file = new File(pathToFile);
        Scanner scanFile = new Scanner(file);
        countOfObjects = scanFile.nextInt();
        scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();
        DesktopComputer[] computers = new DesktopComputer[countOfObjects];
        for (int i=0;i<countOfObjects;i++){
            computers[i] = new DesktopComputer();

            if (String.valueOf(i).length() > AllDevices.getMaxNumeration()){//MaxLength needed to formating a table.
                AllDevices.setMaxNumeration(String.valueOf(i).length());
            }

            computers[i].setBrand(scanFile.nextLine());
            if (computers[i].getBrand().length() > AllDevices.getMaxLengthBrand()){//MaxLength needed to formating a table.
                AllDevices.setMaxLengthBrand(computers[i].getBrand().length());
            }

            computers[i].setModel(scanFile.nextLine());
            if (computers[i].getModel().length() > AllDevices.getMaxLengthModel()){
                AllDevices.setMaxLengthModel(computers[i].getModel().length());
            }

            computers[i].setPrice(scanFile.nextInt());scanFile.nextLine();
            if (String.valueOf(computers[i].getPrice()).length() > AllDevices.getMaxLengthPrice()){
                AllDevices.setMaxLengthPrice(String.valueOf(computers[i].getPrice()).length());
            }

            computers[i].setProcessor(scanFile.nextLine());
            if (computers[i].getProcessor().length() > AllDevices.getMaxLengthProcessor()){
                AllDevices.setMaxLengthProcessor(computers[i].getProcessor().length());
            }

            computers[i].setMemory(scanFile.nextInt());scanFile.nextLine();
            if (String.valueOf(computers[i].getMemory()).length() > AllDevices.getMaxLengthMemory()){
                AllDevices.setMaxLengthMemory(String.valueOf(computers[i].getMemory()).length());
            }

            computers[i].setDeviceType(scanFile.nextLine());
            if (computers[i].getDeviceType().length() > AllDevices.getMaxLengthDeviceType()){
                AllDevices.setMaxLengthDeviceType(computers[i].getDeviceType().length());
            }
        }
        DesktopComputer.table(countOfObjects);
        for (int i=0;i<countOfObjects;i++){
            computers[i].info(i);
        }
        //first line in file will be count of objects of class.

        System.out.println("Choose a device:\n" +
                "1 - \n" +
                "2 - \n" +
                "3 - \n" +
                "4 - \n");
        toChoose("ChooseTypeOfDevice");
    }
    public static void toChooseCertainLaptop() throws InterruptedException, FileNotFoundException {
        System.out.println("Choose a device:" +
                "1 - \n" +
                "2 - \n" +
                "3 - \n" +
                "4 - \n");
        toChoose("ChooseTypeOfDevice");
    }
    public static void toChooseCertainSmartphone() throws InterruptedException, FileNotFoundException {
        System.out.println("Choose a device:" +
                "1 - \n" +
                "2 - \n" +
                "3 - \n" +
                "4 - \n");
        toChoose("ChooseTypeOfDevice");
    }
    public static void toChooseCertainTablet() throws InterruptedException, FileNotFoundException {
        System.out.println("Choose a device:" +
                "1 - \n" +
                "2 - \n" +
                "3 - \n" +
                "4 - \n");
        toChoose("ChooseTypeOfDevice");
    }
    public static void toChoose(String message) throws InterruptedException, FileNotFoundException {
        while(!stopProgram){
            variantString = scanner.nextLine();
            try{
                variant = Integer.parseInt(variantString);
            } catch(Exception e){
                System.out.println("You entered wrong symbol");
                continue;//if wrong symbol - stop this iteration.
            }
            switch (variant) {
                case 1:
                    stopProgram = Variants.var1(message);
                    break;
                case 2:
                    stopProgram = Variants.var2(message);
                    break;
                case 3:
                    stopProgram = Variants.var3(message);
                    break;
                case 4:
                    stopProgram = Variants.var4(message);
                    break;
                default:
                    stopProgram = Variants.varDefault(message);
            }
        }
    };
}