class SpamAnalyzer extends KeyWordAnalyzer {
    private String[] spamWords;
    Label label;

    SpamAnalyzer(String[] words) {
        this.spamWords =words.clone();
    }

    @Override
    public Label processText(String text) {
        this.label = Label.OK;
        for (int i = 0; i < spamWords.length; i++) {
            if (text.contains(spamWords[i])) {
                this.label = Label.SPAM;
            }

        }
        return this.label;
    }

    @Override
    protected String[] getKeyWords() {
//        String[] textSplited = text.split(" ");
//        ArrayList<String> spamWordsList = new ArrayList<>();
//        for (String word : textSplited)
//            if (spamWords.contains(word))
//                spamWordsList.add(word);
//        String[] arr = new String[spamWordsList.size()];
//        for (int i = 0; i < spamWordsList.size(); i++)
//            arr[i] = spamWordsList.get(i);
//        return arr;
        return spamWords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}