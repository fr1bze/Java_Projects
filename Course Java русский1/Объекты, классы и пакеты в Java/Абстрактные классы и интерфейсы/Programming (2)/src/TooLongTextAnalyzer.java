class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;
    Label label = Label.OK;

    TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            label = Label.TOO_LONG;
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
    public Label getLabel() {
        return label;
    }
}
