import java.util.HashMap;
import java.util.HashMap;

public class SequenceToSentence {
    public static void main(String[] args) {
        HashMap<Integer,Character> numToChar = new HashMap<>();
        numToChar.put(1,'A');
        numToChar.put(2,'B');
        numToChar.put(3,'C');
        numToChar.put(4,'D');
        numToChar.put(5,'E');
        numToChar.put(6,'F');
        numToChar.put(7,'G');
        numToChar.put(8,'H');
        numToChar.put(9,'I');
        numToChar.put(10,'J');
        numToChar.put(11,'K');
        numToChar.put(12,'L');
        numToChar.put(13,'M');
        numToChar.put(14,'N');
        numToChar.put(15,'O');
        numToChar.put(16,'P');
        numToChar.put(17,'Q');
        numToChar.put(18,'R');
        numToChar.put(19,'S');
        numToChar.put(20,'T');
        numToChar.put(21,'U');
        numToChar.put(22,'V');
        numToChar.put(23,'W');
        numToChar.put(24,'X');
        numToChar.put(25,'Y');
        numToChar.put(26,'Z');

        HashMap<Character,Integer> charToNum = new HashMap<>();
        charToNum.put('A',1);
        charToNum.put('B',2);
        charToNum.put('C',3);
        charToNum.put('D',4);
        charToNum.put('E',5);
        charToNum.put('F',6);
        charToNum.put('G',7);
        charToNum.put('H',8);
        charToNum.put('I',9);
        charToNum.put('J',10);
        charToNum.put('K',11);
        charToNum.put('L',12);
        charToNum.put('M',13);
        charToNum.put('N',14);
        charToNum.put('O',15);
        charToNum.put('P',16);
        charToNum.put('Q',17);
        charToNum.put('R',18);
        charToNum.put('S',19);
        charToNum.put('T',20);
        charToNum.put('U',21);
        charToNum.put('V',22);
        charToNum.put('W',23);
        charToNum.put('X',24);
        charToNum.put('Y',25);
        charToNum.put('Z',26);






        StringBuilder stringBuilder = new StringBuilder();
        String str = "GCIHJ HELLO";
        str = str.replaceAll(" ","");
        System.out.println(str);
        for (int i = 0; i < str.length();i++)
        {
            if (str.charAt(i) ==' ')
                stringBuilder.append(' ');
            else {
                System.out.println(numToChar.get((charToNum.get(str.charAt(i)) + i + 1) % 26) + ": " + str.charAt(i) + " i:" + i + " " + ((str.charAt(i) + i + 1) % 26));
                stringBuilder.append(numToChar.get((charToNum.get(str.charAt(i)) + i + 1) % 26));
            }

        }
        System.out.println(stringBuilder);
    }
}
