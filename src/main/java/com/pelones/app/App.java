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
        stringUtils.reOrder(operationString, dynamicArray);

        for(int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.getAt(i));
        }

        //System.out.println("Hola mundo");
        //stringUtils.printNumbers("T1u0G8fa9");
        //stringUtils.printNumbers("1234 123");
        //dynamicArray.add("miperro");
        //dynamicArray.add("Tugfa");
        //dynamicArray.add("Viejocochino");
        //dynamicArray.add("no");
        //dynamicArray.add("cochi");
        //dynamicArray.add("Viejo");
        //dynamicArray.add("nel");

        //System.out.println("Antes de borrar: ");
        //for(int len = 0; len < dynamicArray.size(); len++) {
            //System.out.println(dynamicArray.getAt(len));
        //}

        //dynamicArray.erase(0);
        //dynamicArray.erase(5);
        //System.out.println("Despues de borrar: ");
        //for(int len = 0; len < dynamicArray.size(); len++) {
            //System.out.println(dynamicArray.getAt(len));
        //}

            //System.out.println("Escribe algo: "); //toSearch
            //toSearch = scanner.nextLine();
            //index = dynamicArray.search(toSearch);

            //if (index >= 0){
            //    System.out.println("El objeto se encuentra en el indice: " + index);
            //}

        //try {
            //stringUtils.printDummy("Hola");
            //stringUtils.printDummy(null);
            //stringUtils.printDummy("null");
            //System.out.println("Ingresa un numero");
            //number = stringUtils.numbersValue(scanner.nextLine());
            //System.out.println(number);
        //} catch(NullPointerException e) {
            //System.out.println("Hubo un error: " + e.getMessage());
        //} catch(NotANumberException ex) {
            //System.out.println("No es un numero: " + ex.getMessage());
        //}
        
        scanner.close();
    }

}