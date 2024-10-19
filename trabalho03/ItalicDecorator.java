package trabalho03;

// ItalicDecorator.java
public class ItalicDecorator extends WordDecorator {

    public ItalicDecorator(Word word) {
        super(word);
    }

    @Override
    public String render() {
        return "<i>" + word.render() + "</i>";  // Envolve a palavra em <i> para itálico
    }
}

