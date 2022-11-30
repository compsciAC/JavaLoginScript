import java.util.Scanner;
public class LoginScript {
    // Check usernames against user input
    private static int check(String[] users, String toCheckValue) {
        int index;
        for(int i = 0; i < users.length; i++) {
            if(users[i].equals(toCheckValue)) {
                index = i;
                return index;
            }
        }return -1;
    }
    public static void main(String[] args) {
        // Counter
        int i = 3;
        String[] usernames = {"Trevor", "Simon", "Carina", "Chris"};
        String[] passwords = {"trevor1", "simon1", "carina1", "chris1"};



        // Repeats the process to give the user 3 login attempts
        while (i > 0) {
            // Takes user input for username and password
            System.out.println("Enter username: ");
            Scanner keyboard = new Scanner(System.in);
            String inputUsername = keyboard.nextLine();

            //Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter password: ");
            String inputPassword = keyboard.nextLine();

            // Checks if the user input matches the credentials in the file
            if (check(usernames, inputUsername) >= 0) {
                int index = check(usernames, inputUsername);
                if (inputPassword.equals(passwords[index])) {
                    System.out.print("Successful login");
                    System.exit(0);
                }
            } else {
                System.out.print("Incorrect details " + Integer.toString(i-1) + " attempts remaining \n");
            }
            i--;
        }
    }
}
