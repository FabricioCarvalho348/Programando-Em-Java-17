package exceptions;

import java.io.FileNotFoundException;

public class TesteCheckedException {

    public static void main(String[] args) {
        try {
            exemploChecked();
        } catch (FileNotFoundException ex) {
            System.out.println("Deu ruim aqui!" + ex.getMessage());
        }
    }

    public static void exemploChecked() throws FileNotFoundException {
        throw new FileNotFoundException("Segura a bomba ai! FileNotFound");
    }

    public static void exemploUnchecked() {
        throw new RuntimeException("Deu ruim! RuntimeException.");
    }
}
