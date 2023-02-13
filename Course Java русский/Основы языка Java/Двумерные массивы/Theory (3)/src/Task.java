class A {
  public static void main(String[] args) {

    // пример создания
    int n = 10;
    int m = 20;
    int p = 3;
    int[][][] mas = new int[n][m][p];

    // пример заполнения
    for (int i = 0; i<n; i++)
      for (int j = 0; j<m; j++)
        for (int k = 0; k < p; k++)
          mas[i][j][k] = 0;

    //пример вывода
    for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++){
        System.out.print("(");
        for (int k = 0; k < p; k++)
          System.out.print(mas[i][j][k] + " ");
        System.out.println(")");
      }
      System.out.println();
    }
  }
}