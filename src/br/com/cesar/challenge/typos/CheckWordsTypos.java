package br.com.cesar.challenge.typos;

/**
 * Class to check words typos
 *
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
public class CheckWordsTypos {

    public boolean checkTypos(final String strOne, final String strTwo) throws Exception {
        if (strOne == null || strOne.length() == 0) {
            throw new Exception("String has can not null or empty");
        }
        if (strTwo == null || strTwo.length() == 0) {
            throw new Exception("String has can not null or empty");
        }

        char[] szStringOne = strOne.toCharArray();
        char[] szStringTwo = strTwo.toCharArray();
        int iLenStringOne = szStringOne.length;
        int iLenStringTwo = szStringTwo.length;
        int iCount = 0;
        boolean bResult = true;

        for (int iIndexOne = 0, iIndexTwo = 0;
                iIndexOne < iLenStringOne && iIndexTwo < iLenStringTwo; ) {
            if (szStringOne[iIndexOne] != szStringTwo[iIndexTwo]) {
                if (iLenStringOne > iLenStringTwo) {
                    iIndexOne++;
                } else if (iLenStringTwo > iLenStringOne){
                    iIndexTwo++;
                }
                iCount++;
            }

            if (iCount > 1) {
                bResult = false;
                break;
            }

            iIndexOne++;
            iIndexTwo++;
        }

        return bResult;
    }

}
