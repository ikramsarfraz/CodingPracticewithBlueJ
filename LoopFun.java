 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if(number == 0 || number == 1) return 1; // base case
          return number * factorial(number - 1); // recursive
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String acronym = "" + phrase.charAt(0); // init with first letter
          int index = phrase.indexOf(" "); // find first occurence index
          while(index != -1){
              phrase = phrase.substring(index + 1); // update phrase by removing first word
              acronym += phrase.charAt(0); // concat acronym with first letter
              index = phrase.indexOf(" "); // find new first occurence index 
          }
          return acronym.toUpperCase(); // return acronym after making it uppercase
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String encryptedWord = "";
          for(int i = 0; i < word.length(); i++){
              // if:   ASCII value is greater than 122
              // then: subtract 26 and add 3
              // else: add 3
              encryptedWord += (word.charAt(i) + 3 <= 122) ? (char) (word.charAt(i) + 3) : (char) ((word.charAt(i) - 26) + 3);
          }
          return encryptedWord;
      }
}
