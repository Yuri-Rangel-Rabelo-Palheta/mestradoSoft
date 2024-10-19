package trabalho03;

// UnderlineDecorator.java
public class UnderlineDecorator extends WordDecorator {

    public UnderlineDecorator(Word word) {
        super(word);
    }

    @Override
    public String render() {
        return "<u>" + word.render() + "</u>";  // Envolve a palavra em <u> para sublinhado
    }
}

