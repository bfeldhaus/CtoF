import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);

            double fahrenheit = 0;
            double celsius = 0;
            String trash = "";
            boolean loop = false;

            do {
            System.out.print("Enter a degree in Celsius: ");

                if (input.hasNextDouble())
                {
                    celsius = input.nextDouble();
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
                    loop = true;
                }
                else
                {
                    trash = input.nextLine();
                    System.out.println("You must enter a valid integer: not " + fahrenheit);
                }
            }
            while (!loop);
        }
        private static class string{

    }
}
