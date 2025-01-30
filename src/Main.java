import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение сдвига элементов: "); int shift = in.nextInt();
        System.out.print("Введите текст для шифрования: "); char[] input = in.next().toLowerCase().toCharArray();
        System.out.print("Какой метод вы хотите использовать?\n1 - Шифрование текста\n2 - Дешифрование текста");
        while(true){
            switch (in.nextInt()){
                case 1:
                    System.out.println(Encryption(input, shift));
                    return;
                case 2:

                    return;
                default:
                    System.out.print("Нет метода под таким номером!\n");
                    break;
            }
        }
    }
    public static char[] Encryption(char[] inPut, int shift){
        char[] outPut = inPut;
        char[] ruAlphabet = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
                'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'
        };
        char[] enAlphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'
        };
        for (int i = 0; i < outPut.length - 1; i++){
            for(int r = 0; r < ruAlphabet.length - 1; r++){
                if(outPut[i] == ruAlphabet[r]){
                    outPut[i] = ruAlphabet[r + shift];
                    break;
                }
            }
            for(int e = 0; e < enAlphabet.length - 1; e++){
                if(outPut[i] == enAlphabet[e]){
                    outPut[i] = enAlphabet[e + shift];
                    break;
                }
            }
        }
        return outPut;
    }
    public static char[] Decryption(char[] inPut, int shift){
        char[] outPut = inPut;
        char[] ruAlphabet = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
                'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'
        };
        char[] enAlphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'
        };
        for (int i = 0; i < outPut.length - 1; i++){
            for(int r = 0; r < ruAlphabet.length - 1; r++){
                if(outPut[i] == ruAlphabet[r]){
                    outPut[i] = ruAlphabet[r - shift];
                    break;
                }
            }
            for(int e = 0; e < enAlphabet.length - 1; e++){
                if(outPut[i] == enAlphabet[e]){
                    outPut[i] = enAlphabet[e - shift];
                    break;
                }
            }
        }
        return outPut;
    }
}