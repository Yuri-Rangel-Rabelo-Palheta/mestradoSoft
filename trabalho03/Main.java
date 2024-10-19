package trabalho03;

// Main.java
public class Main {

    public static void main(String[] args) {
        // Palavra simples
        Word word = new SimpleWord("normal");
        System.out.println("Texto normal: " + word.render());

        // Palavra com negrito
        Word boldWord = new BoldDecorator(word);
        System.out.println("Texto em negrito: " + boldWord.render());

        // Palavra com itálico
        Word italicWord = new ItalicDecorator(word);
        System.out.println("Texto em itálico: " + italicWord.render());

        // Palavra com negrito e itálico
        Word boldItalicWord = new ItalicDecorator(boldWord);
        System.out.println("Texto em negrito e itálico: " + boldItalicWord.render());

        // Palavra com sublinhado e itálico
        Word underlineItalicWord = new UnderlineDecorator(italicWord);
        System.out.println("Texto sublinhado e itálico: " + underlineItalicWord.render());

        // Apenas a cadeia de caracteres do texto
        System.out.println("Texto simples (sem formatação): " + underlineItalicWord.text());
    }
}

