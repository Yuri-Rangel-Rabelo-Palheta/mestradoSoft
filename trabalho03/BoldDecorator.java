package trabalho03;

// BoldDecorator.java
public class BoldDecorator extends WordDecorator {

    public BoldDecorator(Word word) {
        super(word);
    }

    @Override
    public String render() {
        return "<b>" + word.render() + "</b>";  // Envolve a palavra em <b> para negrito
    }
}
