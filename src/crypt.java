//Загрузка фрагмента и его шжифрование шифром Цезаря

import java.io.FileReader;
import java.io.IOException;

public class crypt {
    StringBuffer text = new StringBuffer("");     //строка фрагмента
    StringBuffer newtext = new StringBuffer("");  //строка зашифрованного фрагмента

    int num=1;      //количество сдвигов алфавита
    //загрузка фрагмента из файла
    public StringBuffer crypto() {
        try(FileReader reader = new FileReader("C://file2.txt"))     ////для второго случая - filename: "C://2001.txt"
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                int b=text.length();
                text.insert(b,(char)c);
                int v=newtext.length();
                newtext.insert(v,(char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //шифрование(encryption)
        for (int ind = 0; ind < text.length(); ind++) {
            char chars = text.charAt(ind);
            if (chars == 'q' | chars == 'w' | chars == 'e' | chars == 'r' | chars == 't' | chars == 'y' | chars == 'u' | chars == 'i' | chars == 'o' | chars == 'p' | chars == 'a' | chars == 's' | chars == 'd' | chars == 'f' | chars == 'g' | chars == 'h' | chars == 'j' | chars == 'k' | chars == 'l' | chars == 'z' | chars == 'x' | chars == 'c' | chars == 'v' | chars == 'b' | chars == 'n' | chars == 'm' | chars == 'Q' | chars == 'W' | chars == 'E' | chars == 'R' | chars == 'T' | chars == 'Y' | chars == 'U' | chars == 'I' | chars == 'O' | chars == 'P' | chars == 'A' | chars == 'S' | chars == 'D' | chars == 'F' | chars == 'G' | chars == 'H' | chars == 'J' | chars == 'K' | chars == 'L' | chars == 'Z' | chars == 'X' | chars == 'C' | chars == 'V' | chars == 'B' | chars == 'N' | chars == 'M') {
                for (int j = 1; j <= num; j++) {
                    if (chars == 'z') {
                        chars = 'a';
                        newtext.setCharAt(ind, chars);
                    } else {
                        if (chars == 'Z') {
                            chars = 'A';
                            newtext.setCharAt(ind, chars);
                        } else {
                            chars++;
                            newtext.setCharAt(ind, chars);
                        }
                    }
                }
            }
        }
        return newtext;

    }

}