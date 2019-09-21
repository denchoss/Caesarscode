//класс биграмм
public class bygramm {
    public String name; //имя биграммы
    public float ggz;   //частота употребления в тексте
    public int kolvo;   //количество данной биграммы в тексте
    bygramm(String name){ this.name=name; }
    public void setggz(int all){
        float k=kolvo,a=all;
        ggz=k/a;
    }
    public void setkolvo() { kolvo++; }
    public StringBuffer getname(){
        StringBuffer name1=new StringBuffer(name);
        return name1;
    }
    public int getkolvo(){ return kolvo; }
    public float getggz(){ return ggz; }
}