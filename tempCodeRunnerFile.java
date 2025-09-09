import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read returned date
        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();

        // Read due date
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        int fine = 0;

        // Case 1: Returned in a different year
        if (returnedYear > dueYear) {
            fine = 5000;
        } 
        // Case 2: Returned in the same year
        else if (returnedYear == dueYear) {
            // Case 2a: Returned in a different month
            if (returnedMonth > dueMonth) {
                fine = 500 * (returnedMonth - dueMonth);
            } 
            // Case 2b: Returned in the same month
            else if (returnedMonth == dueMonth) {
                // Case 2c: Returned late on a different day
                if (returnedDay > dueDay) {
                    fine = 15 * (returnedDay - dueDay);
                }
            }
        }
        
        System.out.println(fine);

        scanner.close();
    }
}