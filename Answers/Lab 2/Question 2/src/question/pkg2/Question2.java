/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg2;

/**
 *
 * @author Afrie Irham
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        permuteString("", "ABC");

    }

    public static void permuteString(String beginningString, String endingString) {
      if (endingString.length() <= 1)
        System.out.println(beginningString + endingString);
      else{
        for (int i = 0; i < endingString.length(); i++) {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
          permuteString(beginningString + endingString.charAt(i), newString);
        }
      }
    }

}
