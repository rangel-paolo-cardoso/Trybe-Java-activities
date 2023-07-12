package com.rangel;

public class ValidateCPF {

    /**
     * Verifies whether the CPF number is valid or not.
     * @param cpf a number representing the Brazilian identification document.
     * @return a boolean, true when valida, false when invalid.
     */
    public static boolean validateCpf(String cpf) {
        String cpfNumbers = cpf.substring(0, cpf.length() - 2);
        String cpfNumbersAndFirstVerifyingDigit = cpf.substring(0, cpf.length() - 1);
        short firstVerifyingDigit;
        short secondVerifyingDigit;
        if (cpf.length() == 11) {
            firstVerifyingDigit = setVerifyingDigit(cpfNumbers);
            secondVerifyingDigit = setVerifyingDigit(cpfNumbersAndFirstVerifyingDigit);
            String verifiers = "" + firstVerifyingDigit + secondVerifyingDigit;
            return verifiers.equals(cpf.substring(cpf.length() - 2));
        }
        return false;
    }

    private static short setVerifyingDigit(String textDigits) {
        short sum = 0;
        short subtraction;
        for (int i = 0, j = textDigits.length() + 1; i < textDigits.length(); i++) {
            sum += j * Character.getNumericValue(textDigits.charAt(i));
            j--;
        }
        subtraction = (short) (11 - (sum % 11));
        return (subtraction == 10 || subtraction == 11) ? 0 : subtraction;
    }
}
