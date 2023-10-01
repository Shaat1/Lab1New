import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
        String yn = "";
        do {
            System.out.println("Enter Title");
            movie.getTitle();
            String title = scanner.nextLine();
            movie.setTitle(title);
            System.out.println("enter Movie Rating");
            String rating = scanner.nextLine();
            movie.setRating(rating);
            System.out.println("Enter numbers of tickets sold for this movie");
            int ticketsSold = Integer.parseInt(scanner.nextLine());
            movie.setSoldTickets(ticketsSold);
            System.out.println("Do you want to enter another?");
            yn = scanner.nextLine();
            // line 23 do not get excuted
        } while (yn.equalsIgnoreCase("y"));
        System.out.println("Good Bye");
    }
    Scanner scanner = new Scanner(System.in);
    Movie movie = new Movie();
}


