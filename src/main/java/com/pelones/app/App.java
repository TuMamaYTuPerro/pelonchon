package com.pelones.app;

import com.pelones.app.exceptions.NotANumberException;
import com.pelones.app.utils.StringUtils;
import java.util.Scanner;
import com.pelones.app.utils.DynamicArray;


public class App {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        int number;
        String toSearch;
        String operationString;
        int index;
        Scanner scanner = new Scanner(System.in);
        DynamicArray<String> dynamicArray = new DynamicArray<String>();

        System.out.println("Ingresa una operacion: ");
        operationString = scanner.nextLine();
        stringUtils.operationPush(operationString, dynamicArray);

        for(int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.getAt(i));
        }

        
        scanner.close();
    }

}
