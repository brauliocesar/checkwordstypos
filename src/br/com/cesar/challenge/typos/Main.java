package br.com.cesar.challenge.typos;

/**
 * There are three types of typos that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to
 * check if they are one typo (or zero typos) away.
 *
 * Examples:
 *      pale, ple ­> true
 *      pales, pale ­> true
 *      pale, bale ­> true
 *      pale, bake ­> false
 */
public class Main {

    public static void main(String[] args) {
        String[] aStringsOne = {"pale", "pales", "pale", "pale", "fake", "brake", "prake"};
        String[] aStringsTwo = {"ple", "pale", "bale", "bake", "lake", "brale", "brale"};

        CheckWordsTypos mCheckWordsTypos = new CheckWordsTypos();
        try {
            for (int iIndex = 0; iIndex < aStringsOne.length; iIndex++) {
                boolean bResult = mCheckWordsTypos.checkTypos(aStringsOne[iIndex], aStringsTwo[iIndex]);
                System.out.println("-> " + aStringsOne[iIndex] + ", " + aStringsTwo[iIndex] + " -> " + bResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
