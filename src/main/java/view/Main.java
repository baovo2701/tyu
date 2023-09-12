/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CounterController;
import model.CounterModel;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();

        CounterModel model = new CounterModel();
        CounterController controller = new CounterController(model);
        controller.analyzeContent(content);

        displayResults(model.getCharCounter(), model.getWordCounter());
    }

    public static void displayResults(Map<Character, Integer> charCounter, Map<String, Integer> wordCounter) {
        System.out.println(wordCounter);
        System.out.println(charCounter);
       
    }
}