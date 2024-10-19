package trabalho03;

// WordDecorator.java
public abstract class WordDecorator implements Word {
    protected Word word;  // Instância da palavra decorada

    public WordDecorator(Word word) {
        this.word = word;
    }

    @Override
    public String text() {
        return word.text();  // Retorna o texto simples da palavra decorada
    }
}

