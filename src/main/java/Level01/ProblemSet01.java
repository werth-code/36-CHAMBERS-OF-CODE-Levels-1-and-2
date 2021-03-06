package Level01;

public class ProblemSet01 {

    /**
     * Have the wordCount(input) take the str string parameter being passed
     * and return the number of words the string contains
     * (e.g. "Never eat shredded wheat or cake" would return 6). Words will be
     * separated by single spaces.
     */
    public String wordCount(String input) {
        //Take the input
        //split input on " "
        //use .length to get length
        //save length to an Integer variable
        //return integer variable.toString()
        Integer strLength = input.split(" ").length;
        return strLength.toString();
    }

    /**
     * Using the Java language, have the function firstReverse(String input) take the input parameter being passed and
     * return the string in reversed order. For example: if the input string is "Hello World and Coders" then your
     * program should return the string sredoC dna dlroW olleH.
     */

    public String firstReverse(String input){
        //create new StringBuilder and pass in input as argument
        //call .reverse()
        //call .toString()
        //return in one line
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Have the longestWord(String input) take the input parameter being passed and return the
     * largest word in the string. If there are two or more words that are the same length,
     * return the first word from the string with that length. Ignore punctuation and assume
     * input will not be empty.
     */
    public String longestWord(String input) {
        //create a longestWord variable of type String
        //set longestWord = ""
        //take input and split into ^a-zA-Z to exclude extra characters
        //create a for loop
        //create an if statement - ask if current word length is > longestWord.
        //if it is, set longestWord = currentWord.
        //if not, continue looping.
        //return longestWord
        String longestWord = "";
        String[] split = input.split("[^a-zA-Z+]");
        for(String word : split) {
            if(word.length() > 0 && word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    /**
     * Have the swapCase(String input) take the input parameter and swap the case of each
     * character. For example: if str is "Hello World" the output should be hELLO wORLD.
     * Let numbers and symbols stay the way they are.
     */
    public String swapCase(String str) {
        //create a returnString variable.
        //take the string and split into char[] with ("")
        //create a for loop
        //if(current letter == current letters uppercase version) current letter to lowercase
        //if(current letter == current letters lowercase version) current letter to uppercase
        //add char to returnString
        //return Character[] as a string
        String returnStr = "";
        String[] chars = str.split("");
        for(String ch : chars) {
            if(ch == ch.toUpperCase()) {
                ch = ch.toLowerCase();
                returnStr += ch;
                continue;
            }
            if(ch == ch.toLowerCase()) {
                ch = ch.toUpperCase();
                returnStr += ch;
                continue;
            }
        }
        return returnStr;
    }
}
