import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the quote?");
        String quote = input.nextLine();

        Scanner input2 = new Scanner (System.in);
        System.out.println("Who said it?");
        String author = input2.nextLine();

        System.out.println(author + " says, \"" +quote+ "\"");
    }
}
