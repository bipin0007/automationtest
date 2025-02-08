package strings;

import java.util.Locale;
import java.util.Scanner;

public class Easy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s= sc.nextLine();

         firstMethod(s);
        secondMethod(s);
        thirdMethod(s);
        fourthMethod(s);
        fifthMethod(s);
        sixthMethod(s);
        EighthMethod(s);
        ninthMethod(s);
    }
    /*
    Hello QA Engineer!
   This is a Test String
QA testing is essential for QA Engineers!
Hello, QA World!
Welcome to Java Strings!
Software testing is crucial for engineers.
Madam
A man a plan a canal Panama
QA Automation Testing
QA is important. QA_Tools help in QA_Automation. Learning QA is fun!
Hello QA World QA_Tools QA_World Welcome to QA
Welcome to QA Automation. QA is essential in QA_World.



     */

    /*
    Your First Task
✅ Try writing a program that takes a string input from the user and checks:

The length of the string.
Whether it contains the word "Test".
Replace the word "Test" with "Automation" if present.
     */

    public static void firstMethod(String s){
        System.out.println("Length: "+ s.length());
        String trimmedString = s.trim();
        System.out.println("Trimmed: "+ trimmedString);

        if(trimmedString.contains("Test")){
            System.out.println("Replaced: "+ trimmedString.replace("Test", "Automation"));
        }else{
            System.out.println("The word 'Test' was not found in the String.");
        }
    }

    /*
    🚀 Next Task
✅ Write a method that:

Converts the string to lowercase and uppercase.
Finds the index of the first occurrence of the word "QA".
Splits the string into words and prints each word separately.
     */
public static void secondMethod(String s){
    System.out.println("\n1.Lowercase: "+s.toLowerCase(Locale.ROOT));
    System.out.println("2. UpperCase: "+s.toUpperCase());
    if(s.contains("QA")) {
        System.out.println("3. First occurrence of 'QA' is at index: " + s.indexOf("QA"));
    }else {
System.out.println("3. 'QA' is not present in the String.");
    }
    System.out.println("4. Words in the string:");
String[] trimmed = s.split(" ");
       for(String s3: trimmed){
           System.out.println("   " +s3);
       }
    }

    /*
    🚀 Next Task
✅ Write a method that:

Counts the total number of words in the string.
Reverses the string and prints the reversed version.
Checks if the string is a palindrome (reads the same forwards and backwards).

     */

    public static void thirdMethod(String s){
        // 1. Count Total Number of Words
        System.out.println("Total Number of Words in the String: " + s.trim().split("\\s+").length);
        String reverse="";

        // 2. Reverse the String
        for(int i = s.length()-1;i>=0;i--){
            reverse +=s.charAt(i);
        }
        System.out.println("The Reversed String is: "+reverse);

        // 3. Check if the String is a Palindrome (ignoring case and spaces)
        if(reverse.replaceAll("\\s+","").equalsIgnoreCase(s.replaceAll("\\s+",""))){
            System.out.println("Yes it is Palindrome: "+ s);
        }else {
            System.out.println("Its not a Palindrome: "+ s);
        }

    }
    /*
    🚀 Next Task
✅ Write a method that:

Counts the number of times the word "QA" appears in the string.
Extracts and prints all substrings starting with "QA" (if any).
Checks if the string starts with "Hello" and ends with "World".
     */
    public static void fourthMethod(String s){
        int count=0;
        String[] words=s.split(" ");
            for (String word:words) {
                if(word.equals("QA")){
                    count++;
                }
        }
        System.out.println(count+ " .times the Word 'QA' appears in the String");

            System.out.println("\nSubStrings starting with 'QA':");
           for(String t:words){
               if(t.startsWith("QA")){
                   System.out.println(t);
               }
           }

        System.out.println("\nChecking the entire String:");
           if(s.startsWith("Hello") && s.endsWith("World")){
               System.out.println("The staring starts with 'Hello' and end with 'World'.");
           }else{
               System.out.println("The string does NOT start with 'Hello' and end with 'World'.");
           }

    }

    /*
    🚀 Next Task
✅ Write a method that:

Counts how many vowels (a, e, i, o, u) are present in the string.
Removes all spaces from the string and prints the result.
Replaces all vowels with *.
     */

    public static void fifthMethod(String s) {

        int count = 0;
        char[] c = s.toLowerCase().toCharArray();

        for(char ch: c){
            if(ch =='a'|| ch =='e'|| ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Total Vowels counts are: " + count);

        char[] vowels={'a','e','i','o','u'};
           int newCount=0;
        for(char ch: c){

            for(char vowel: vowels){

                if(ch==vowel){
                    newCount++;
                    break;
                }
            }
        }
        System.out.println("Total Vowels counts using nested for loops are: " + newCount);
    }

    /*
    🚀 Next Task (Optional for Practice):
✅ Write a method that:
Removes all vowels from a string and prints the result.
Counts consonants in the string.
     */
    public static void sixthMethod(String s){

        for(int i = 0; i<s.length(); i++){
            System.out.print("\n"+s.charAt(i));
        }
        System.out.println();
      char[] s1= s.toLowerCase().toCharArray();
      char[] vowels = {'a','e','i','o','u'};
        StringBuilder result = new StringBuilder();  // To store the string without vowels
        int consonantCount = 0;

     for(char c : s1){
         boolean isVowel = false;
         for(char vowel:vowels){
             if(c==vowel){
                 isVowel = true;
                 break;
             }
         }
         if (!isVowel && Character.isLetter(c)) {
             result.append(c);  // Add consonant to the result
             consonantCount++;  // Increment consonant count
         }
     }

        System.out.println("String after removing vowels: " + result.toString());
        System.out.println("Total number of consonants: " + consonantCount);
    }

    /*
    ✅ Your First Task with StringBuilder
✅ Write a method that:

Takes a string input and appends " is awesome!" to it.
Reverses the modified string.
Replaces the word "awesome" with "amazing".
Once done, share your code for validation! 💡🚀
     */

    public static void seventhMethod(String s){

        StringBuilder sb = new StringBuilder(s);
        sb.append("is awesome!");

        int startIndex = sb.indexOf("awesome");
        if(startIndex != -1){
            sb.replace(startIndex, startIndex+"awesome".length(),"amazing");
        }

        System.out.println(sb);



    }
    /*
    🚀 Next Task
✅ Modify the program to:

Insert the word "Java " at the beginning of the string.
Delete the word "Engineer" from the string if it exists.
Convert the final string to uppercase.


     */
    public static void EighthMethod(String s){

        StringBuilder sb = new StringBuilder(s);
       System.out.println(sb.insert(0,"java "));

      int startIndex = sb.indexOf("Engineer");
      if(startIndex!=-1){
          sb.delete(startIndex,startIndex+"Engineer".length());
          System.out.println("After deleting: "+ sb);
      }
System.out.println("Fina result in upper case: "+ sb.toString().toUpperCase());

    }

    /*
    🚀 Next Task
✅ Modify the program to:

Replace all occurrences of "QA" with "Quality Assurance".
Check if the final string contains the word "Java".
Reverse the final result and print it.
     */
    public static void ninthMethod(String s){
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf("QA") != -1){
            int start =sb.indexOf("QA");
            sb.replace(start, start+"QA".length(),"Quality Assurance");
        }
        System.out.println("After replacing the string: "+ sb);

        if(sb.toString().toLowerCase().contains("java")) {
            System.out.println("The final String contains 'java' and hence will have to reverse it: " + sb.reverse());
        }else{
            System.out.println("The Final String doesn't Contain the 'java' word: " + sb);
        }


    }








    }











