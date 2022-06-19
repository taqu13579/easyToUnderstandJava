package chapter24;

public enum Color {
    WHITE("WS202-1"),
    BLACK("BS202-1"),
    GOLD("GS202-1");

    private String ModelNumber;

    private Color(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }
    public String getModelNumber() {
        return ModelNumber;
    }
}
