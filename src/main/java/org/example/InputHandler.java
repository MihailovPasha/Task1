package org.example;

public class InputHandler {
    public static InputParameter getInputParameters() {
        System.out.println("Введите абсолютный путь до папки (Например для WIN C:/Documents/...): ");
        String path = System.console().readLine();
        return new InputParameter(path);
    }
}
