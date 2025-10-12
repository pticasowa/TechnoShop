import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String username;
        int variant=0;
        String variantString;
        boolean ok = false;
        System.out.println("Hello, The hardware store TechnoShop welcomes you.\n" +
                "We have desktop computers, laptops, phones, tablets. \n" +
                "You can even try our DemoComp, that shows how computer works\n" +
                "and what details does it contain.\n" +
                "What's your name? Don't tell us, that you are Qwerty)\n" +
                "================================");
        Scanner scanner = new Scanner(System.in);
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

        while(!ok){
            variantString = scanner.nextLine();
            try{
                variant = Integer.parseInt(variantString);
                ok = true;
            } catch(Exception e){
                System.out.println("You entered wrong symbol");
            }
        }
        switch (variant) {
            case 1:
                System.out.println("go to 1");
                break;
            case 2:
                System.out.println("go to 2");
                break;
            case 3:
                toCheckDemoComp();
                break;
            default:
                System.out.println("exit");
        }

    }
    public static void toCheckDemoComp() throws InterruptedException {
        DemoComp demoComp = new DemoComp();
        demoComp.start();
        System.out.println("");
    }
}