package com.pelones.app.utils;
import java.lang.StringBuilder;
import com.pelones.app.exceptions.NotANumberException;

public class StringUtils {


    public void printChars(String string) {
        for(int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public void printDummy(String string) throws NotANumberException {
        if(string == null) {
            throw new NotANumberException("Valio verga");
        }
        System.out.println(string);
    }

    public void printNumbers(String string) {

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                stringBuilder.append(string.charAt(i));
            } else {
                System.out.println(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        System.out.println(stringBuilder.toString());

    }

    public int printNumbersValue(String string) throws NotANumberException {

        int number = 0;
        int idx = 0;
        boolean negativeFlag = false;

        if (string.charAt(0) == '-'){
            negativeFlag = true;
            idx++;
        }
        for(; idx < string.length(); idx++) {
            if (string.charAt(idx) >= '0' && string.charAt(idx) <= '9'){
                number = number * 10;
                number = number + (string.charAt(idx) - '0');
            } else {
                throw new NotANumberException("Valio verga");
            }
        }
        if(negativeFlag == true) {
            number *= -1;
        }
        return number;
    }

    public void reOrder(String operationString, DynamicArray<String> dynamicArray){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < operationString.length(); i++){
            if(operationString.charAt(i) == '*'){
                dynamicArray.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
            if(operationString.charAt(i) == '/'){
                dynamicArray.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
            if(operationString.charAt(i) == '+'){
                dynamicArray.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
            if(operationString.charAt(i) == '-'){
                dynamicArray.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
            if(operationString.charAt(i) >= '0' && operationString.charAt(i) <= '9'){
                stringBuilder.append(operationString.charAt(i));
            } else {
                dynamicArray.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        dynamicArray.add(stringBuilder.toString());
    }

}
