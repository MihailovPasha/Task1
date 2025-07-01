package org.example;

public class InputHandler {
    public static InputParameters getInputParameters() {
        System.out.println("Введите абсолютный путь до папки (Например для WIN C:/Documents/...): ");
        String path = System.console().readLine();
        return new InputParameters(path);
    }
}
