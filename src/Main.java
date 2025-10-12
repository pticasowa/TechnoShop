import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String username;
        int variant;
        String variantString;
        boolean ok = false;
        System.out.println("Hello, The hardware store TechnoShop welcomes you.\n" +
                "We have desktop computers, laptops, phones, tablets. \n" +
                "You can even try our DemoComp, that shows how computer works\n" +
                "and what details does it contain.\n" +
                "What's your name? Don't tell us, that you are Qwerty)");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine().intern(); //intern() places username value to StringPool.
        if(username.equals("Qwerty")){
            try{
                throw new RuntimeException();
            }   catch (RuntimeException e){
                System.out.println("We have asked you not input Qwerty. \n" +
                        "Sorry we don't serve users with name Qwerty. \n" +
                        "Let's try one more time? Input your name:");
                username = scanner.nextLine().intern();
            }
        }
        if(username.equals("Qwerty")){
                throw new RuntimeException("Bye Qwerty, this store is not for you") {};
        }
        System.out.println("Nice to meet you, " + username + "! \n" +
                "We can offer you to \n" +
                "1 - Check info about all our products\n" +
                "2 - Choose a certain product\n" +
                "3 - Check DemoComp\n" +
                "Any other number - Exit\n" +
                "Just pick a number and input it.");

        while(!ok){
            variantString = scanner.nextLine();
            try{
                variant = Integer.parseInt(variantString);
                ok = true;
            } catch(Exception e){
                System.out.println("You entered wrong symbol");
            }
        }

    }
}