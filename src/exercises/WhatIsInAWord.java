package exercises;
import java.util.Scanner;
public class WhatIsInAWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(alice);
        String alice1 = alice.toLowerCase();
        System.out.println("What is your desired search term? ");
        String word = input.next();
        String word1 = word.toLowerCase();
        if (alice1.contains(word1)) {
        int index = alice1.indexOf(word1);
        int length = word1.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = alice1.replace(word1, "");
        System.out.println(modifiedSentence);
        } else {
            System.out.println("Does not contain " + word);
        }
    }
}
