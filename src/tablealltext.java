//класс букв
public class tablealltext {
    public char name;   //строчное значение буквы
    public char nme;    //заглавное значение буквы
    public float ggz;   //частота употребления буквы в тексте
    public int kolvo;   //количество данной буквы в тексте
    tablealltext(char name, char nme){
        this.name=name;
        this.nme=nme;
    }
    public void setggz(int all){
        float k=kolvo,a=all;
        ggz=k/a;
    }
    public void setkolvo() {
        kolvo++;
    }
    public char getname(){
        return name;
    }
    public char getnme(){
        return name;
    }
    public void setnme(char a){
        nme=a;
    }
    public int getkolvo(){
        return kolvo;
    }
    public float getggz(){
        return ggz;
    }
}