import AllDevices.AllDevices;
import AllDevices.DesktopComputer;
import AllDevices.Laptop;
import AllDevices.Smartphone;
import AllDevices.Tablet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int countOfObjects=0;
    static String pathToCart = "Cart.txt";
    static String border = "===============";
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
                "We can offer you to \n");
        startMenu();
    }
    public static void startMenu() throws FileNotFoundException, InterruptedException {
        System.out.println("1 - Check info about all our products\n" +
                "2 - Choose a certain product\n" +
                "3 - Check DemoComp\n" +
                "4 - Show cart\n" +
                "Any other number - Exit\n" +
                "Just pick a number and input it.\n" +
                "================================");
        toChoose("FirstChoise","");
    }
    public static void toCheckDemoComp() throws InterruptedException, FileNotFoundException {
        DemoComp demoComp = new DemoComp();
        demoComp.start();
        startMenu();
    }
    public static void toCheckAllProducts() throws FileNotFoundException, InterruptedException {
        String[] pathsToFiles = {"Computers.txt","Laptops.txt","Smartphones.txt","Tablets.txt"};
        for (String pathToFile : pathsToFiles){
            Scanner scanFile = new Scanner(new File(pathToFile));
            countOfObjects = scanFile.nextInt();//first line in file will be count of objects of class.
            scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();
            AllDevices[] cartDevices = new AllDevices[countOfObjects];
            for (int i=0;i<countOfObjects;i++){
                cartDevices[i] = new AllDevices();
                toChooseCertainForAllDevices(i, cartDevices[i], scanFile);
                while(!border.equals(scanFile.nextLine())){//without body, because body is in conditions. while they are(======= and scanFile.nextLine()) not equal -> do scanFile
                }
            }
            AllDevices.table(countOfObjects);
            for (int i=0;i<countOfObjects;i++){
                cartDevices[i].info(i);
            }
            scanFile.close();//close thread after finish work with it
        }
        startMenu();
    }
    public static void toChooseCertain() throws InterruptedException, FileNotFoundException {
        System.out.println("Choose a type of device:\n" +
                "1 - DesktopComputer\n" +
                "2 - Laptop\n" +
                "3 - Smartphone\n" +
                "4 - Tablet\n"+
                "Any other number - Exit\n");
        toChoose("ChooseTypeOfDevice","");
    }
    public static void toChooseCertainDesktopComputer() throws InterruptedException, FileNotFoundException {
        String pathToFile = "Computers.txt";
        Scanner scanFile = new Scanner(new File(pathToFile));
        countOfObjects = scanFile.nextInt();//first line in file will be count of objects of class.
        scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();
        DesktopComputer[] computers = new DesktopComputer[countOfObjects];
        for (int i=0;i<countOfObjects;i++){
            computers[i] = new DesktopComputer();
            toChooseCertainForAllDevices(i, computers[i], scanFile);

            //DesktopComputer's methods
            computers[i].setHasDiscreteGraphicsCard(scanFile.nextBoolean()); scanFile.nextLine();//nextBoolean doesn't move cursor to the next line.
            if (String.valueOf(computers[i].getHasDiscreteGraphicsCard()).length() > DesktopComputer.getMaxLengthHasDiscreteGraphicsCard()){//we compare current maximal length in symbols with current data from file. It needed for formating table
                DesktopComputer.setMaxLengthHasDiscreteGraphicsCard(String.valueOf(computers[i].getHasDiscreteGraphicsCard()).length());
            }

            computers[i].setBodyBrand(scanFile.nextLine());
            if (computers[i].getBodyBrand().length() > DesktopComputer.getMaxLengthBodyBrand()){
                DesktopComputer.setMaxLengthBodyBrand(computers[i].getBodyBrand().length());
            }

            computers[i].setCoolingSystem(scanFile.nextLine());
            if (computers[i].getCoolingSystem().length() > DesktopComputer.getMaxLengthCoolingSystem()){
                DesktopComputer.setMaxLengthCoolingSystem(computers[i].getCoolingSystem().length());
            }
            scanFile.nextLine();//this one is for =========== (border) in file
        }
        DesktopComputer.table(countOfObjects);
        for (int i=0;i<countOfObjects;i++){
            computers[i].info(i);
        }
        scanFile.close();//close thread after finish work with it
        System.out.println("Choose a device (input a number)");
        toChoose("ChooseDevice","Computer");
    }
    public static void toChooseCertainLaptop() throws InterruptedException, FileNotFoundException {
        String pathToFile = "Laptops.txt";
        Scanner scanFile = new Scanner(new File(pathToFile));
        countOfObjects = scanFile.nextInt();//first line in file will be count of objects of class.
        scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();
        Laptop[] laptops = new Laptop[countOfObjects];
        for (int i=0;i<countOfObjects;i++){
            laptops[i] = new Laptop();
            toChooseCertainForAllDevices(i, laptops[i], scanFile);

            //Laptop's methods
            laptops[i].setDisplayDiagonal(scanFile.nextDouble()); scanFile.nextLine();
            if (String.valueOf(laptops[i].getDisplayDiagonal()).length() > Laptop.getMaxLengthDisplayDiagonal()){//we compare current maximal length in symbols with current data from file. It needed for formating table
                Laptop.setMaxLengthDisplayDiagonal(String.valueOf(laptops[i].getDisplayDiagonal()).length());
            }

            laptops[i].setHasCDROM(scanFile.nextBoolean()); scanFile.nextLine();//nextBoolean doesn't move cursor to the next line.
            if (String.valueOf(laptops[i].getHasCDROM()).length() > Laptop.getMaxLengthHasCDROM()){
                Laptop.setMaxLengthHasCDROM(String.valueOf(laptops[i].getHasCDROM()).length());
            }

            laptops[i].setTouchPadMaterial(scanFile.nextLine());
            if (laptops[i].getTouchPadMaterial().length() > Laptop.getMaxLengthTouchPadMaterial()){
                Laptop.setMaxLengthTouchPadMaterial(laptops[i].getTouchPadMaterial().length());
            }
            scanFile.nextLine();//this one is for =========== (border) in file
        }
        Laptop.table(countOfObjects);
        for (int i=0;i<countOfObjects;i++){
            laptops[i].info(i);
        }
        scanFile.close();//close thread after finish work with it
        System.out.println("Choose a device (input a number)");
        toChoose("ChooseDevice","Laptop");
    }
    public static void toChooseCertainSmartphone() throws InterruptedException, FileNotFoundException {
        String pathToFile = "Smartphones.txt";
        Scanner scanFile = new Scanner(new File(pathToFile));
        countOfObjects = scanFile.nextInt();//first line in file will be count of objects of class.
        scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();
        Smartphone[] smartphones = new Smartphone[countOfObjects];
        for (int i=0;i<countOfObjects;i++){
            smartphones[i] = new Smartphone();
            toChooseCertainForAllDevices(i, smartphones[i], scanFile);

            //Smartphones's methods
            smartphones[i].setDisplayDiagonal(scanFile.nextDouble()); scanFile.nextLine();
            if (String.valueOf(smartphones[i].getDisplayDiagonal()).length() > Smartphone.getMaxLengthDisplayDiagonal()){//we compare current maximal length in symbols with current data from file. It needed for formating table
                Smartphone.setMaxLengthDisplayDiagonal(String.valueOf(smartphones[i].getDisplayDiagonal()).length());
            }

            smartphones[i].setHasCharger(scanFile.nextBoolean()); scanFile.nextLine();//nextBoolean doesn't move cursor to the next line.
            if (String.valueOf(smartphones[i].getHasCharger()).length() > Smartphone.getMaxLengthHasCharger()){
                Smartphone.setMaxLengthHasCharger(String.valueOf(smartphones[i].getHasCharger()).length());
            }

            smartphones[i].setValueOfCameras(scanFile.nextLine());
            if (smartphones[i].getValueOfCameras().length() > Smartphone.getMaxLengthValueOfCameras()){
                Smartphone.setMaxLengthValueOfCameras(smartphones[i].getValueOfCameras().length());
            }
            scanFile.nextLine();//this one is for =========== (border) in file
        }
        Smartphone.table(countOfObjects);
        for (int i=0;i<countOfObjects;i++){
            smartphones[i].info(i);
            smartphones[i].hasOperatorContract(i);
        }
        scanFile.close();//close thread after finish work with it
        System.out.println("Choose a device (input a number)");
        toChoose("ChooseDevice","Smartphone");
    }
    public static void toChooseCertainTablet() throws InterruptedException, FileNotFoundException {
        String pathToFile = "Tablets.txt";
        Scanner scanFile = new Scanner(new File(pathToFile));
        countOfObjects = scanFile.nextInt();//first line in file will be count of objects of class.
        scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();
        Tablet[] tablets = new Tablet[countOfObjects];
        for (int i=0;i<countOfObjects;i++){
            tablets[i] = new Tablet();
            toChooseCertainForAllDevices(i, tablets[i], scanFile);

            //Smartphones's methods
            tablets[i].setDisplayDiagonal(scanFile.nextDouble()); scanFile.nextLine();
            if (String.valueOf(tablets[i].getDisplayDiagonal()).length() > Tablet.getMaxLengthDisplayDiagonal()){//we compare current maximal length in symbols with current data from file. It needed for formating table
                Tablet.setMaxLengthDisplayDiagonal(String.valueOf(tablets[i].getDisplayDiagonal()).length());
            }

            tablets[i].setHasSIM(scanFile.nextBoolean()); scanFile.nextLine();//nextBoolean doesn't move cursor to the next line.
            if (String.valueOf(tablets[i].getHasSIM()).length() > Tablet.getMaxLengthHasSIM()){
                Tablet.setMaxLengthHasSIM(String.valueOf(tablets[i].getHasSIM()).length());
            }

            tablets[i].setBatteryCapacity(scanFile.nextInt()); scanFile.nextLine();
            if (String.valueOf(tablets[i].getBatteryCapacity()).length() > Tablet.getMaxLengthBatteryCapacity()){
                Tablet.setMaxLengthBatteryCapacity(String.valueOf(tablets[i].getBatteryCapacity()).length());
            }
            scanFile.nextLine();//this one is for =========== (border) in file
        }
        Tablet.table(countOfObjects);
        for (int i=0;i<countOfObjects;i++){
            tablets[i].info(i);
        }
        scanFile.close();//close thread after finish work with it
        System.out.println("Choose a device (input a number)");
        toChoose("ChooseDevice","Tablet");
    }
    public static void toChoose(String message, String typeOfDevice) throws InterruptedException, FileNotFoundException {
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
                    stopProgram = Variants.var1(message, typeOfDevice);
                    break;
                case 2:
                    stopProgram = Variants.var2(message, typeOfDevice);
                    break;
                case 3:
                    stopProgram = Variants.var3(message, typeOfDevice);
                    break;
                case 4:
                    stopProgram = Variants.var4(message, typeOfDevice);
                    break;
                default:
                    stopProgram = Variants.varDefault(message);
            }
        }
    };
    public static void toChooseCertainForAllDevices(int i, AllDevices transferredObject, Scanner scanFile){
        if (String.valueOf(i).length() > AllDevices.getMaxNumeration()){//MaxNumeration needed for numerating a table.
            AllDevices.setMaxNumeration(String.valueOf(i).length());
        }

        transferredObject.setBrand(scanFile.nextLine());
        if (transferredObject.getBrand().length() > AllDevices.getMaxLengthBrand()){//MaxLength needed to formating a table.
            AllDevices.setMaxLengthBrand(transferredObject.getBrand().length());
        }

        transferredObject.setModel(scanFile.nextLine());
        if (transferredObject.getModel().length() > AllDevices.getMaxLengthModel()){
            AllDevices.setMaxLengthModel(transferredObject.getModel().length());
        }

        transferredObject.setPrice(scanFile.nextInt());scanFile.nextLine();
        if (String.valueOf(transferredObject.getPrice()).length() > AllDevices.getMaxLengthPrice()){
            AllDevices.setMaxLengthPrice(String.valueOf(transferredObject.getPrice()).length());
        }

        transferredObject.setProcessor(scanFile.nextLine());
        if (transferredObject.getProcessor().length() > AllDevices.getMaxLengthProcessor()){
            AllDevices.setMaxLengthProcessor(transferredObject.getProcessor().length());
        }

        transferredObject.setMemory(scanFile.nextInt());scanFile.nextLine();
        if (String.valueOf(transferredObject.getMemory()).length() > AllDevices.getMaxLengthMemory()){
            AllDevices.setMaxLengthMemory(String.valueOf(transferredObject.getMemory()).length());
        }

        transferredObject.setDeviceType(scanFile.nextLine());
        if (transferredObject.getDeviceType().length() > AllDevices.getMaxLengthDeviceType()){
            AllDevices.setMaxLengthDeviceType(transferredObject.getDeviceType().length());
        }
    }
    public static void dropDeviceToCart(int numberOfDevice, String typeOfdevice) throws FileNotFoundException {
        numberOfDevice--; //we will use index, it starts from 0.
        String pathToFile = typeOfdevice+"s.txt";//here creating a link to a file (consist of transferred variable device and "s.txt")
        Scanner scanFile = new Scanner(new File(pathToFile));
        scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();

        Scanner scanCart = new Scanner(new File(pathToCart));
        int countOfLinesInCart=0;
        if(scanCart.hasNextLine()){ //for skip first lane - it is count of devices.
            scanCart.nextLine();
        }
        while(scanCart.hasNextLine()){ //checking how many lines in cart
            countOfLinesInCart++;
            scanCart.nextLine();
        }
        scanCart.close();//close reset a cursor in file
        scanCart = new Scanner(new File(pathToCart)); //add a new object. To read form start
        String[] previousCart = new String[countOfLinesInCart]; //creating array for cart lines
        if(scanCart.hasNextLine()){ //if file is not empty - skip first lane - it is count of devices. We need to skip this line, because we don't need to save it to array. Its current count of devices. And it must be erased(skipped and not saved)
            scanCart.nextLine();
        }
        for (int i=0; i<countOfLinesInCart; i++){ //saving current cart in program memory (array previousCart[i]), because file will be cleaned after creating new object of PrintWriter. We save it without first lane(count of devices), because we skipped it earlier.
            previousCart[i] = scanCart.nextLine();
        }
        scanCart.close();
        PrintWriter cart = new PrintWriter(new File(pathToCart));//all data that were in file Cart.txt before will be erased on this line.
        cart.println(countOfLinesInCart/7+1);//+1 because in array indexes are from 0 to 6 for one device. Therefore, 6/7=0.
        for (int i=0; i<countOfLinesInCart; i++){
            cart.println(previousCart[i]);//return saved from previous cart data to new cart.
        }
        for (int i=0; i<=numberOfDevice; i++){
            if(i==numberOfDevice){
                for(int j=0; j<6;j++){//every object of AllDevices has 7 non-static fields. we need to skip remaining. They will be not written to file.
                    cart.println(scanFile.nextLine());
                }
                cart.println(border);
                cart.close();
            }
            else{
                while(!"===============".equals(scanFile.nextLine())){//without body, because body is in conditions. while they are not equal -> do scanFile
                }
            }
        }
        scanFile.close();
        System.out.println(numberOfDevice+1 + "th " + typeOfdevice + " added to cart!");
    }
    public static void showCart() throws FileNotFoundException, InterruptedException {
        String pathToFile = "Cart.txt";
        Scanner scanFile = new Scanner(new File(pathToFile));
        countOfObjects = scanFile.nextInt();//first line in file will be count of objects of class.
        scanFile.nextLine(); //change line, because it doesn't change automatically after nextInt();
        AllDevices[] cartDevices = new AllDevices[countOfObjects];
        for (int i=0;i<countOfObjects;i++){
            cartDevices[i] = new AllDevices();
            toChooseCertainForAllDevices(i, cartDevices[i], scanFile);
            scanFile.nextLine();//this one is for =========== (border) in file
        }
        AllDevices.table(countOfObjects);
        for (int i=0;i<countOfObjects;i++){
            cartDevices[i].info(i);
        }
        scanFile.close();//close thread after finish work with it

        System.out.println("Here is a cart with devices you chosen.\n" +
                "Do you wanna purchase it now or maybe go to menu again?\n" +
                "1 - Purchase\n" +
                "2 - Go to menu\n" +
                "Any other number - Exit\n");
        toChoose("PurchaseOrMenu", "");
    }
}