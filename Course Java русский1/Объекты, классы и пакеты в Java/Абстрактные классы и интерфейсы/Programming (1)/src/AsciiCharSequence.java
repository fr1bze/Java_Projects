public class AsciiCharSequence implements CharSequence/* extends/implements */ {
    public final byte[] aChar;
    AsciiCharSequence(byte... chars)
    {
        aChar = new byte[chars.length];
        for (int i = 0; i < chars.length;i++) {
            aChar[i] =chars[i];
        }
    }

    @Override
    public int length() {
        return aChar.length;
    }

    @Override
    public char charAt(int index) {
        return (char)aChar[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[]  result = new byte[end - start];
        for (int i = 0; start < end; start++, i++) {
            result[i] = aChar[start];
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < aChar.length;i++)
            stringBuilder.append((char) aChar[i]);
        return stringBuilder.toString();
    }
//
//    public static void main(String[] args) {
//        byte[] example = {72, 101, 108, 108, 111, 33};
//        AsciiCharSequence answer = new AsciiCharSequence(example);
//        System.out.println("Последовательность - " + answer.toString());//Hello!
//        System.out.println("Размер её - " + answer.length());//6
//        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
//        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
////проверка на нарушение инкапсуляции private поля
//        System.out.println(answer.toString());//Hello!
//        example[0] = 74;
//        System.out.println(answer.toString());//Hello!
//    }

}