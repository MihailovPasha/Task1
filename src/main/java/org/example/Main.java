package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        InputParameters parameters = InputHandler.getInputParameters();

        if (!FileCreator.validatePath(parameters.getFolderPath())) {
            System.out.println("Некорректный путь к папке");
            return;
        }

        try {
            FileCreator.createNewFile(parameters.getFolderPath());
            System.out.println("Файлы joke.java успешно созданы во всех подпапках");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файлов: " + e.getMessage());
        }
    }
}