import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println(":"+")"+"\\"+"_"+"_"+"_"+"_"+"_"+"/"+"("+":");
            System.out.println(" "+"{"+"("+"@"+")"+"v"+"("+"@"+")"+"}");
            System.out.println(" "+"{"+ "|"+"~"+"-"+" "+"-"+"~"+"|"+"}");
            System.out.println(" "+"{"+ "/" + "^"+ "\'"+"^"+"\'"+"^"+"\\"+"}");
            System.out.println(" "+"=" + "=" + "="+ "m"+"-"+ "m" + "=" + "=" +"=");
            System.out.println();
        }
    }
}