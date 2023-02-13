class Example{
  public static void main(String[] args){
    String text = "FIFA will never regret it";
    String[] words = text.split(" ");
    for(String word : words){
      System.out.println(word);
    }
  }
}