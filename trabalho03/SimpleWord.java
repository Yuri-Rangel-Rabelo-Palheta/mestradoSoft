package trabalho03;

// SimpleWord.java
public class SimpleWord implements Word {
    private String content;

    public SimpleWord(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return content;  // Palavra sem formatação
    }

    @Override
    public String text() {
        return content;  // Retorna o texto puro
    }
}
