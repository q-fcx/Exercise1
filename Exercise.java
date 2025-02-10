
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
//
////        1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
//
//
        Scanner weightInput = new Scanner(System.in);
        Scanner heightInput = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms: ");
        double weight = weightInput.nextDouble();

        System.out.println("Please enter your height in meters:");
        double height = heightInput.nextDouble();
        double bmi = weight/(height*height);

        System.out.println("your BMI is: " + bmi);


//        2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
//
//        Scanner obtainedInput = new Scanner(System.in);
//        Scanner totalInput = new Scanner(System.in);

//        System.out.println("Please enter your obtained marks: ");
//        float obtainedMarks = obtainedInput.nextFloat();
//
//        System.out.println("Please enter the total marks: ");
//        float totalMarks = totalInput.nextFloat();
//
//        float percentage = (obtainedMarks / totalMarks) * 100;
//        System.out.println("Your percentage is: " + percentage);



//      3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.

//        Scanner amountInput = new Scanner(System.in);
//        Scanner exchangeInput = new Scanner(System.in);
//
//        System.out.println("Please enter the currency amount: ");
//        int currencyAmount = amountInput.nextInt();
//        System.out.println("Please enter the exchange rate: ");
//        double exchangeRate = exchangeInput.nextDouble();
//
//        double amount = currencyAmount * exchangeRate;
//        System.out.println(amount);



//        4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.


//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter any text: ");
//        String text = input.nextLine();
//
//        StringBuilder textBuilder = new StringBuilder(text);
//        int textLength = textBuilder.length();
//        StringBuilder textReverse = textBuilder.reverse();
//
//        System.out.println("Length of the String: " + textLength + " And reversed string: " + textReverse );



//        5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a sentence: ");
//        String sentence = input.nextLine();
//
//        String extractedSubstring = sentence.substring(10, 20);
//        System.out.println(extractedSubstring);


//        6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.

//        Scanner sentenceInput = new Scanner(System.in);
//        Scanner keywordInput = new Scanner(System.in);
//
//        System.out.println("Please enter a sentence: ");
//        String sentence = sentenceInput.nextLine();
//
//        System.out.println("Please enter a keyword:");
//        String keyword = keywordInput.nextLine();
//
//        boolean isPresent = sentence.contains(keyword);
//        System.out.println(isPresent);


        //7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.

//        Scanner sentenceInput = new Scanner(System.in);
//        Scanner wordInput = new Scanner(System.in);
//
//        System.out.println("Please enter a sentence: ");
//        String sentence = sentenceInput.nextLine();
//        String replace = sentence.replaceAll("fox", "cat");
//        System.out.println(replace);


        //8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.

//        Scanner input1 = new Scanner(System.in);
//        Scanner input2 = new Scanner(System.in);
//
//        System.out.println("Please enter first string: ");
//        String word1 = input1.nextLine();
//
//        System.out.println("Please enter second string");
//        String word2 = input2.nextLine();
//
//        boolean isEqual = word1.equalsIgnoreCase(word2);
//        System.out.println("Strings are equal?: " + isEqual);


    }
}
