//Task
//        An equilateral triangle is one that has all three sides of equal length. Your task for this is to write a program that can print out equilateral triangles of different sizes. You will print them out using a ASCII characters.
//
//
//
//        Details
//        Name the project Triangles.
//        You should get two pieces of input from the user: the size of the triangle and the character to use for drawing it (called the “fill” character). The Scanner has no “nextChar” function. Instead, you can just read a String, and use the first character of it:
//        in.next( ).charAt(0);
//        You should make sure that the size is in the range 1-50. If the user enters zero, a negative number, or one greater than 50, you should repeatedly ask them for a new size.
//        To make the triangles look more balanced, you should put a space between each fill character.
//        After running the program, it should ask the user if they want to run it again. If so, get input and draw a new triangle. If not, the program should exit.
//
//
//        General Requirements
//        Your code should be readable and reasonably indented.
//        You must provide comments in your program.
//
//
//        Example Run
//        Here is an example run of this program. User input is shown in bold face:
//
//        Enter size: 7
//        Enter fill: #
//        #
//        # #
//        # # #
//        # # # #
//        # # # # #
//        # # # # # #
//        # # # # # # #
//        Would you like another triangle (Y/N)?
//        : y
//        Enter size: 15
//        Enter fill: +
//        +
//        + +
//        + + +
//        + + + +
//        + + + + +
//        + + + + + +
//        + + + + + + +
//        + + + + + + + +
//        + + + + + + + + +
//        + + + + + + + + + +
//        + + + + + + + + + + +
//        + + + + + + + + + + + +
//        + + + + + + + + + + + + +
//        + + + + + + + + + + + + + +
//        + + + + + + + + + + + + + + +
//        Would you like another triangle (Y/N)?
//        : y
//        Enter size: -12
//        Size must be between 1-50!
//        Enter size: 88
//        Size must be between 1-50!
//        Enter size: 0
//        Size must be between 1-50!
//        Enter size: 3
//        Enter fill: ~
//        ~
//        ~ ~
//        ~ ~ ~
//        Would you like another triangle (Y/N)?
//        : y
//        Enter size: 2
//        Enter fill: #
//        #
//        # #
//        Would you like another triangle (Y/N)?
//        : y
//        Enter size: 1
//        Enter fill: Q
//        Q
//        Would you like another triangle (Y/N)?
//        : y
//        Enter size: 50
//        Enter fill: %
//        %
//        % %
//        % % %
//        % % % %
//        % % % % %
//        % % % % % %
//        % % % % % % %
//        % % % % % % % %
//        % % % % % % % % %
//        % % % % % % % % % %
//        % % % % % % % % % % %
//        % % % % % % % % % % % %
//        % % % % % % % % % % % % %
//        % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
//        Would you like another triangle (Y/N)?
//        : N
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    // Prompts User for Pyramid Size
    static int size() {
        System.out.print("\nChoose a pyramid size between 1 and 50: ");
        return sc.nextInt();

    }

    //Prompts User for Symbol
    static String fill(int size) {
        System.out.print("\nChoose a character to build the pyramid with: ");
        sc.nextLine();
        return sc.nextLine();
    }

//Main Method
    public static void main(String[] args) {
        boolean goAgain = true;
        while (goAgain) { //Boolean conditional to play again
            int p;
            do {
                p = size();
                if (p < 1 || p > 50){

                System.out.println("Size must be between 1 and 50!");
                size();
            }
            } while(p < 1 || p > 50);

            String t = fill(p);// Assigns fill() the value of p (which is now = size())
            for (int i = 1; i <= p; i++) { // Space, character
                for (int j = 1; j <= p - i; j++) {
                    System.out.print(" ");// whitespace
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(t + " ");// Prints t variable fill(p)
                }
                System.out.println();
            }

                System.out.print("\nPress 1 to make another triangle, or any other key to exit: ");
                int choice = sc.nextInt();
                goAgain = (choice == 1);
            }
        }
    }




