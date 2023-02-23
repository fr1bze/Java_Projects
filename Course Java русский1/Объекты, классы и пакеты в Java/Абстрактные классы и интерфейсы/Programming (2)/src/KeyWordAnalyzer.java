abstract class KeyWordAnalyzer implements TextAnalyzer {

    abstract protected String[] getKeyWords();
    abstract protected Label getLabel();
    @Override
    public Label processText(String text) {
        for (String keyword : getKeyWords()) {
            if (text.contains(keyword))
                return getLabel();
        }
        return Label.OK;
    }
}