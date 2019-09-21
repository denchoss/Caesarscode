import java.io.*;
import java.lang.String;
import java.util.ArrayList;

import static java.lang.Math.abs;

public class lab1
{
    public static void main( String[] args)
    {
        StringBuffer alltext = new StringBuffer();  //строка полного текста
        //загрузка полного текста
        try(FileReader reader = new FileReader("C://file.txt"))       ////для второго случая - filename: "C://Clarke Arthur. 2001_ A Space Odyssey - royallib.ru.txt"
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                int b=alltext.length();
                alltext.insert(b,(char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //шифрование фрагмента(encryption)
        crypt crypt=new crypt();
        StringBuffer newtext = new StringBuffer(crypt.crypto());
        System.out.print("\n" + "new " + newtext);
        //анализ источника(analiz full)
        //алфавит
        tablealltext m= new tablealltext('m','M');
        tablealltext n= new tablealltext('n','N');
        tablealltext b= new tablealltext('b','B');
        tablealltext v= new tablealltext('v','V');
        tablealltext c= new tablealltext('c','C');
        tablealltext x= new tablealltext('x','X');
        tablealltext z= new tablealltext('z','Z');
        tablealltext l= new tablealltext('l','L');
        tablealltext k= new tablealltext('k','K');
        tablealltext j= new tablealltext('j','J');
        tablealltext h= new tablealltext('h','H');
        tablealltext g= new tablealltext('g','G');
        tablealltext f= new tablealltext('f','F');
        tablealltext d= new tablealltext('d','D');
        tablealltext s= new tablealltext('s','S');
        tablealltext a= new tablealltext('a','A');
        tablealltext p= new tablealltext('p','P');
        tablealltext o= new tablealltext('o','O');
        tablealltext i= new tablealltext('i','I');
        tablealltext u= new tablealltext('u','U');
        tablealltext y= new tablealltext('y','Y');
        tablealltext t= new tablealltext('t','T');
        tablealltext r= new tablealltext('r','R');
        tablealltext e= new tablealltext('e','E');
        tablealltext w= new tablealltext('w','W');
        tablealltext q= new tablealltext('q','Q');
        tablealltext[] alltable={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
        int all=0; //всего букв в тексте
        //подсчет количества употребления каждой буквы в тексте
        for (int ind=0;ind<alltext.length();ind++){
            char chars = alltext.charAt(ind);
            if (chars=='q'|chars=='Q'){
                q.setkolvo();
                all++;
            }
            if (chars=='w'|chars=='W'){
                w.setkolvo();
                all++;
            }
            if (chars=='e'|chars=='E'){
                e.setkolvo();
                all++;
            }
            if (chars=='r'|chars=='R'){
                r.setkolvo();
                all++;
            }
            if (chars=='t'|chars=='T'){
                t.setkolvo();
                all++;
            }
            if (chars=='y'|chars=='Y'){
                y.setkolvo();
                all++;
            }
            if (chars=='u'|chars=='U'){
                u.setkolvo();
                all++;
            }
            if (chars=='i'|chars=='I'){
                i.setkolvo();
                all++;
            }
            if (chars=='o'|chars=='O'){
                o.setkolvo();
                all++;
            }
            if (chars=='p'|chars=='P'){
                p.setkolvo();
                all++;
            }
            if (chars=='a'|chars=='A'){
                a.setkolvo();
                all++;
            }
            if (chars=='s'|chars=='S'){
                s.setkolvo();
                all++;
            }
            if (chars=='d'|chars=='D'){
                d.setkolvo();
                all++;
            }
            if (chars=='f'|chars=='F'){
                f.setkolvo();
                all++;
            }
            if (chars=='g'|chars=='G'){
                g.setkolvo();
                all++;
            }
            if (chars=='h'|chars=='H'){
                h.setkolvo();
                all++;
            }
            if (chars=='j'|chars=='J'){
                j.setkolvo();
                all++;
            }
            if (chars=='k'|chars=='K'){
                k.setkolvo();
                all++;
            }
            if (chars=='l'|chars=='L'){
                l.setkolvo();
                all++;
            }
            if (chars=='z'|chars=='Z'){
                z.setkolvo();
                all++;
            }
            if (chars=='x'|chars=='X'){
                x.setkolvo();
                all++;
            }
            if (chars=='c'|chars=='C'){
                c.setkolvo();
                all++;
            }
            if (chars=='v'|chars=='V'){
                v.setkolvo();
                all++;
            }
            if (chars=='b'|chars=='B'){
                b.setkolvo();
                all++;
            }
            if (chars=='n'|chars=='N'){
                n.setkolvo();
                all++;
            }
            if (chars=='m'|chars=='M'){
                m.setkolvo();
                all++;
            }
        }

        //подсчет частот употребления букв
        for (int ind=0;ind<=25;ind++){
            alltable[ind].setggz(all);
        }
        //вывод частотной таблицы
        System.out.print("Full table:\n");
        for (int ind=0;ind<=25;ind++) {
            System.out.print(alltable[ind].getname()+"="+alltable[ind].getggz()+"\n");
        }



        //анализ части(analiz fragment)
        //алфавит
        tablealltext m1= new tablealltext('m','M');
        tablealltext n1= new tablealltext('n','N');
        tablealltext b1= new tablealltext('b','B');
        tablealltext v1= new tablealltext('v','V');
        tablealltext c1= new tablealltext('c','C');
        tablealltext x1= new tablealltext('x','X');
        tablealltext z1= new tablealltext('z','Z');
        tablealltext l1= new tablealltext('l','L');
        tablealltext k1= new tablealltext('k','K');
        tablealltext j1= new tablealltext('j','J');
        tablealltext h1= new tablealltext('h','H');
        tablealltext g1= new tablealltext('g','G');
        tablealltext f1= new tablealltext('f','F');
        tablealltext d1= new tablealltext('d','D');
        tablealltext s1= new tablealltext('s','S');
        tablealltext a1= new tablealltext('a','A');
        tablealltext p1= new tablealltext('p','P');
        tablealltext o1= new tablealltext('o','O');
        tablealltext i1= new tablealltext('i','I');
        tablealltext u1= new tablealltext('u','U');
        tablealltext y1= new tablealltext('y','Y');
        tablealltext t1= new tablealltext('t','T');
        tablealltext r1= new tablealltext('r','R');
        tablealltext e1= new tablealltext('e','E');
        tablealltext w1= new tablealltext('w','W');
        tablealltext q1= new tablealltext('q','Q');
        tablealltext[] fragmenttable={a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,k1,l1,m1,n1,o1,p1,q1,r1,s1,t1,u1,v1,w1,x1,y1,z1};
        int all1=0;  //всего количество букв  в тексте
        //подсчет количества употребления каждой буквы в тексте
        for (int ind=0;ind<newtext.length();ind++){
            char chars = newtext.charAt(ind);
            if (chars=='q'|chars=='Q'){
                q1.setkolvo();
                all1++;
            }
            if (chars=='w'|chars=='W'){
                w1.setkolvo();
                all1++;
            }
            if (chars=='e'|chars=='E'){
                e1.setkolvo();
                all1++;
            }
            if (chars=='r'|chars=='R'){
                r1.setkolvo();
                all1++;
            }
            if (chars=='t'|chars=='T'){
                t1.setkolvo();
                all1++;
            }
            if (chars=='y'|chars=='Y'){
                y1.setkolvo();
                all1++;
            }
            if (chars=='u'|chars=='U'){
                u1.setkolvo();
                all1++;
            }
            if (chars=='i'|chars=='I'){
                i1.setkolvo();
                all1++;
            }
            if (chars=='o'|chars=='O'){
                o1.setkolvo();
                all1++;
            }
            if (chars=='p'|chars=='P'){
                p1.setkolvo();
                all1++;
            }
            if (chars=='a'|chars=='A'){
                a1.setkolvo();
                all1++;
            }
            if (chars=='s'|chars=='S'){
                s1.setkolvo();
                all1++;
            }
            if (chars=='d'|chars=='D'){
                d1.setkolvo();
                all1++;
            }
            if (chars=='f'|chars=='F'){
                f1.setkolvo();
                all1++;
            }
            if (chars=='g'|chars=='G'){
                g1.setkolvo();
                all1++;
            }
            if (chars=='h'|chars=='H'){
                h1.setkolvo();
                all1++;
            }
            if (chars=='j'|chars=='J'){
                j1.setkolvo();
                all1++;
            }
            if (chars=='k'|chars=='K'){
                k1.setkolvo();
                all1++;
            }
            if (chars=='l'|chars=='L'){
                l1.setkolvo();
                all1++;
            }
            if (chars=='z'|chars=='Z'){
                z1.setkolvo();
                all1++;
            }
            if (chars=='x'|chars=='X'){
                x1.setkolvo();
                all1++;
            }
            if (chars=='c'|chars=='C'){
                c1.setkolvo();
                all1++;
            }
            if (chars=='v'|chars=='V'){
                v1.setkolvo();
                all1++;
            }
            if (chars=='b'|chars=='B'){
                b1.setkolvo();
                all1++;
            }
            if (chars=='n'|chars=='N'){
                n1.setkolvo();
                all1++;
            }
            if (chars=='m'|chars=='M'){
                m1.setkolvo();
                all1++;
            }
        }
        //подсчет частот употребления букв
        for (int ind=0;ind<=25;ind++){
            fragmenttable[ind].setggz(all1);
        }
        //вывод таблицы частот
        System.out.print("\nFragment table:\n");
        for (int ind=0;ind<=25;ind++) {
            System.out.print(fragmenttable[ind].getname()+"="+fragmenttable[ind].getggz()+"\n");
        }


        //сравнение частотных таблиц(comparison)
        tablealltext[] alf1={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};  //алфавит полного текста
        tablealltext[] alf2={a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,k1,l1,m1,n1,o1,p1,q1,r1,s1,t1,u1,v1,w1,x1,y1,z1};  //алфавит фрагмента текста
        //упорядочивание частотной таблицы полного текста
        for(int ind=0;ind<=24;ind++){
            for(int ind1=0;ind1<=24;ind1++){
                if(alf1[ind1].getggz()<alf1[ind1+1].getggz()){
                    tablealltext res=alf1[ind1+1];
                    alf1[ind1+1]=alf1[ind1];
                    alf1[ind1]=res;
                }
            }
        }
        //упорядочивание частотной таблицы фрагмента текста
        for(int ind=0;ind<=24;ind++){
            for(int ind1=0;ind1<=24;ind1++){
                if(alf2[ind1].getggz()<alf2[ind1+1].getggz()){
                    tablealltext res=alf2[ind1+1];
                    alf2[ind1+1]=alf2[ind1];
                    alf2[ind1]=res;
                }
            }
        }
        //вывод сравнительной таблицы(при выводе таблицы происходит проверка правильности расшифровки,при верном совпадении букв ставится знак "v")
        System.out.print("\n\n\n\n comparison(сравнение):\n");
        for(int ind=0;ind<=25;ind++) {
            System.out.print(alf1[ind].getname()+"="+alf1[ind].getggz()+"  "+alf2[ind].getname()+"="+alf2[ind].getggz());
            if(alf1[ind].getname()=='z' & alf2[ind].getname()=='a'){
                System.out.print("  v");
            }
            if(alf1[ind].getname()==alf2[ind].getname()-1){
                System.out.print("  v");
            }
            System.out.print("\n");
        }


        //вывод рашифрованного текста (decoding)

        StringBuffer oldnewtext = newtext; //строка расшифрованного текста


        for (int ind=0;ind<newtext.length();ind++){
            char chars = newtext.charAt(ind);
            for(int id=0;id<=25;id++){
                if(chars==alf2[id].getname()){
                    oldnewtext.setCharAt(ind, alf1[id].getname());
                }
                String str=String.valueOf(alf2[id].getname());
                String srt=str.toUpperCase();
                char ch2 = srt.charAt(0);
                String str1=String.valueOf(alf1[id].getname());
                String srt1=str1.toUpperCase();
                char ch3 = srt1.charAt(0);
                if(chars==ch2){
                    oldnewtext.setCharAt(ind, ch3);
                }
            }
        }
        System.out.print("\ndecoding:\n"+oldnewtext);


        //биграммы анализ исходника(bygramm full analiz)
        //алфавит биграмм полного текста

        bygramm ee= new bygramm("ee");
        bygramm ea= new bygramm("ea");
        bygramm et= new bygramm("et");
        bygramm ei= new bygramm("ei");
        bygramm eo= new bygramm("eo");
        bygramm en= new bygramm("en");
        bygramm es= new bygramm("es");
        bygramm eh= new bygramm("eh");
        bygramm er= new bygramm("er");
        bygramm ed= new bygramm("ed");
        bygramm el= new bygramm("el");
        bygramm eu= new bygramm("eu");
        bygramm ec= new bygramm("ec");
        bygramm em= new bygramm("em");
        bygramm ep= new bygramm("ep");
        bygramm ew= new bygramm("ew");
        bygramm eg= new bygramm("eg");
        bygramm ey= new bygramm("ey");
        bygramm ef= new bygramm("ef");
        bygramm eb= new bygramm("eb");
        bygramm ev= new bygramm("ev");
        bygramm ek= new bygramm("ek");
        bygramm ex= new bygramm("ex");
        bygramm ej= new bygramm("ej");
        bygramm eq= new bygramm("eq");
        bygramm ez= new bygramm("ez");

        bygramm ae= new bygramm("ae");
        bygramm aa= new bygramm("aa");
        bygramm at= new bygramm("at");
        bygramm ai= new bygramm("ai");
        bygramm ao= new bygramm("ao");
        bygramm an= new bygramm("an");
        bygramm as= new bygramm("as");
        bygramm ah= new bygramm("ah");
        bygramm ar= new bygramm("ar");
        bygramm ad= new bygramm("ad");
        bygramm al= new bygramm("al");
        bygramm au= new bygramm("au");
        bygramm ac= new bygramm("ac");
        bygramm am= new bygramm("am");
        bygramm ap= new bygramm("ap");
        bygramm aw= new bygramm("aw");
        bygramm ag= new bygramm("ag");
        bygramm ay= new bygramm("ay");
        bygramm af= new bygramm("af");
        bygramm ab= new bygramm("ab");
        bygramm av= new bygramm("av");
        bygramm ak= new bygramm("ak");
        bygramm ax= new bygramm("ax");
        bygramm aj= new bygramm("aj");
        bygramm aq= new bygramm("aq");
        bygramm az= new bygramm("az");

        bygramm te= new bygramm("te");
        bygramm ta= new bygramm("ta");
        bygramm tt= new bygramm("tt");
        bygramm ti= new bygramm("ti");
        bygramm to= new bygramm("to");
        bygramm tn= new bygramm("tn");
        bygramm ts= new bygramm("ts");
        bygramm th= new bygramm("th");
        bygramm tr= new bygramm("tr");
        bygramm td= new bygramm("td");
        bygramm tl= new bygramm("tl");
        bygramm tu= new bygramm("tu");
        bygramm tc= new bygramm("tc");
        bygramm tm= new bygramm("tm");
        bygramm tp= new bygramm("tp");
        bygramm tw= new bygramm("tw");
        bygramm tg= new bygramm("tg");
        bygramm ty= new bygramm("ty");
        bygramm tf= new bygramm("tf");
        bygramm tb= new bygramm("tb");
        bygramm tv= new bygramm("tv");
        bygramm tk= new bygramm("tk");
        bygramm tx= new bygramm("tx");
        bygramm tj= new bygramm("tj");
        bygramm tq= new bygramm("tq");
        bygramm tz= new bygramm("tz");

        bygramm ie= new bygramm("ie");
        bygramm ia= new bygramm("ia");
        bygramm it= new bygramm("it");
        bygramm ii= new bygramm("ii");
        bygramm io= new bygramm("io");
        bygramm in= new bygramm("in");
        bygramm is= new bygramm("is");
        bygramm ih= new bygramm("ih");
        bygramm ir= new bygramm("ir");
        bygramm id= new bygramm("id");
        bygramm il= new bygramm("il");
        bygramm iu= new bygramm("iu");
        bygramm ic= new bygramm("ic");
        bygramm im= new bygramm("im");
        bygramm ip= new bygramm("ip");
        bygramm iw= new bygramm("iw");
        bygramm ig= new bygramm("ig");
        bygramm iy= new bygramm("iy");
        bygramm iif= new bygramm("if");
        bygramm ib= new bygramm("ib");
        bygramm iv= new bygramm("iv");
        bygramm ik= new bygramm("ik");
        bygramm ix= new bygramm("ix");
        bygramm ij= new bygramm("ij");
        bygramm iq= new bygramm("iq");
        bygramm iz= new bygramm("iz");

        bygramm oe= new bygramm("oe");
        bygramm oa= new bygramm("oa");
        bygramm ot= new bygramm("ot");
        bygramm oi= new bygramm("oi");
        bygramm oo= new bygramm("oo");
        bygramm on= new bygramm("on");
        bygramm os= new bygramm("os");
        bygramm oh= new bygramm("oh");
        bygramm or= new bygramm("or");
        bygramm od= new bygramm("od");
        bygramm ol= new bygramm("ol");
        bygramm ou= new bygramm("ou");
        bygramm oc= new bygramm("oc");
        bygramm om= new bygramm("om");
        bygramm op= new bygramm("op");
        bygramm ow= new bygramm("ow");
        bygramm og= new bygramm("og");
        bygramm oy= new bygramm("oy");
        bygramm of= new bygramm("of");
        bygramm ob= new bygramm("ob");
        bygramm ov= new bygramm("ov");
        bygramm ok= new bygramm("ok");
        bygramm ox= new bygramm("ox");
        bygramm oj= new bygramm("oj");
        bygramm oq= new bygramm("oq");
        bygramm oz= new bygramm("oz");

        bygramm ne= new bygramm("ne");
        bygramm na= new bygramm("na");
        bygramm nt= new bygramm("nt");
        bygramm ni= new bygramm("ni");
        bygramm no= new bygramm("no");
        bygramm nn= new bygramm("nn");
        bygramm ns= new bygramm("ns");
        bygramm nh= new bygramm("nh");
        bygramm nr= new bygramm("nr");
        bygramm nd= new bygramm("nd");
        bygramm nl= new bygramm("nl");
        bygramm nu= new bygramm("nu");
        bygramm nc= new bygramm("nc");
        bygramm nm= new bygramm("nm");
        bygramm np= new bygramm("np");
        bygramm nw= new bygramm("nw");
        bygramm ng= new bygramm("ng");
        bygramm ny= new bygramm("ny");
        bygramm nf= new bygramm("nf");
        bygramm nb= new bygramm("nb");
        bygramm nv= new bygramm("nv");
        bygramm nk= new bygramm("nk");
        bygramm nx= new bygramm("nx");
        bygramm nj= new bygramm("nj");
        bygramm nq= new bygramm("nq");
        bygramm nz= new bygramm("nz");

        bygramm se= new bygramm("se");
        bygramm sa= new bygramm("sa");
        bygramm st= new bygramm("st");
        bygramm si= new bygramm("si");
        bygramm so= new bygramm("so");
        bygramm sn= new bygramm("sn");
        bygramm ss= new bygramm("ss");
        bygramm sh= new bygramm("sh");
        bygramm sr= new bygramm("sr");
        bygramm sd= new bygramm("sd");
        bygramm sl= new bygramm("sl");
        bygramm su= new bygramm("su");
        bygramm sc= new bygramm("sc");
        bygramm sm= new bygramm("sm");
        bygramm sp= new bygramm("sp");
        bygramm sw= new bygramm("sw");
        bygramm sg= new bygramm("sg");
        bygramm sy= new bygramm("sy");
        bygramm sf= new bygramm("sf");
        bygramm sb= new bygramm("sb");
        bygramm sv= new bygramm("sv");
        bygramm sk= new bygramm("sk");
        bygramm sx= new bygramm("sx");
        bygramm sj= new bygramm("sj");
        bygramm sq= new bygramm("sq");
        bygramm sz= new bygramm("sz");

        bygramm he= new bygramm("he");
        bygramm ha= new bygramm("ha");
        bygramm ht= new bygramm("ht");
        bygramm hi= new bygramm("hi");
        bygramm ho= new bygramm("ho");
        bygramm hn= new bygramm("hn");
        bygramm hs= new bygramm("hs");
        bygramm hh= new bygramm("hh");
        bygramm hr= new bygramm("hr");
        bygramm hd= new bygramm("hd");
        bygramm hl= new bygramm("hl");
        bygramm hu= new bygramm("hu");
        bygramm hc= new bygramm("hc");
        bygramm hm= new bygramm("hm");
        bygramm hp= new bygramm("hp");
        bygramm hw= new bygramm("hw");
        bygramm hg= new bygramm("hg");
        bygramm hy= new bygramm("hy");
        bygramm hf= new bygramm("hf");
        bygramm hb= new bygramm("hb");
        bygramm hv= new bygramm("hv");
        bygramm hk= new bygramm("hk");
        bygramm hx= new bygramm("hx");
        bygramm hj= new bygramm("hj");
        bygramm hq= new bygramm("hq");
        bygramm hz= new bygramm("hz");

        bygramm re= new bygramm("re");
        bygramm ra= new bygramm("ra");
        bygramm rt= new bygramm("rt");
        bygramm ri= new bygramm("ri");
        bygramm ro= new bygramm("ro");
        bygramm rn= new bygramm("rn");
        bygramm rs= new bygramm("rs");
        bygramm rh= new bygramm("rh");
        bygramm rr= new bygramm("rr");
        bygramm rd= new bygramm("rd");
        bygramm rl= new bygramm("rl");
        bygramm ru= new bygramm("ru");
        bygramm rc= new bygramm("rc");
        bygramm rm= new bygramm("rm");
        bygramm rp= new bygramm("rp");
        bygramm rw= new bygramm("rw");
        bygramm rg= new bygramm("rg");
        bygramm ry= new bygramm("ry");
        bygramm rf= new bygramm("rf");
        bygramm rb= new bygramm("rb");
        bygramm rv= new bygramm("rv");
        bygramm rk= new bygramm("rk");
        bygramm rx= new bygramm("rx");
        bygramm rj= new bygramm("rj");
        bygramm rq= new bygramm("rq");
        bygramm rz= new bygramm("rz");

        bygramm de= new bygramm("de");
        bygramm da= new bygramm("da");
        bygramm dt= new bygramm("dt");
        bygramm di= new bygramm("di");
        bygramm ddo= new bygramm("do");
        bygramm dn= new bygramm("dn");
        bygramm ds= new bygramm("ds");
        bygramm dh= new bygramm("dh");
        bygramm dr= new bygramm("dr");
        bygramm dd= new bygramm("dd");
        bygramm dl= new bygramm("dl");
        bygramm du= new bygramm("du");
        bygramm dc= new bygramm("dc");
        bygramm dm= new bygramm("dm");
        bygramm dp= new bygramm("dp");
        bygramm dw= new bygramm("dw");
        bygramm dg= new bygramm("dg");
        bygramm dy= new bygramm("dy");
        bygramm df= new bygramm("df");
        bygramm db= new bygramm("db");
        bygramm dv= new bygramm("dv");
        bygramm dk= new bygramm("dk");
        bygramm dx= new bygramm("dx");
        bygramm dj= new bygramm("dj");
        bygramm dq= new bygramm("dq");
        bygramm dz= new bygramm("dz");

        bygramm le= new bygramm("le");
        bygramm la= new bygramm("la");
        bygramm lt= new bygramm("lt");
        bygramm li= new bygramm("li");
        bygramm lo= new bygramm("lo");
        bygramm ln= new bygramm("ln");
        bygramm ls= new bygramm("ls");
        bygramm lh= new bygramm("lh");
        bygramm lr= new bygramm("lr");
        bygramm ld= new bygramm("ld");
        bygramm ll= new bygramm("ll");
        bygramm lu= new bygramm("lu");
        bygramm lc= new bygramm("lc");
        bygramm lm= new bygramm("lm");
        bygramm lp= new bygramm("lp");
        bygramm lw= new bygramm("lw");
        bygramm lg= new bygramm("lg");
        bygramm ly= new bygramm("ly");
        bygramm lf= new bygramm("lf");
        bygramm lb= new bygramm("lb");
        bygramm lv= new bygramm("lv");
        bygramm lk= new bygramm("lk");
        bygramm lx= new bygramm("lx");
        bygramm lj= new bygramm("lj");
        bygramm lq= new bygramm("lq");
        bygramm lz= new bygramm("lz");

        bygramm ue= new bygramm("ue");
        bygramm ua= new bygramm("ua");
        bygramm ut= new bygramm("ut");
        bygramm ui= new bygramm("ui");
        bygramm uo= new bygramm("uo");
        bygramm un= new bygramm("un");
        bygramm us= new bygramm("us");
        bygramm uh= new bygramm("uh");
        bygramm ur= new bygramm("ur");
        bygramm ud= new bygramm("ud");
        bygramm ul= new bygramm("ul");
        bygramm uu= new bygramm("uu");
        bygramm uc= new bygramm("uc");
        bygramm um= new bygramm("um");
        bygramm up= new bygramm("up");
        bygramm uw= new bygramm("uw");
        bygramm ug= new bygramm("ug");
        bygramm uy= new bygramm("uy");
        bygramm uf= new bygramm("uf");
        bygramm ub= new bygramm("ub");
        bygramm uv= new bygramm("uv");
        bygramm uk= new bygramm("uk");
        bygramm ux= new bygramm("ux");
        bygramm uj= new bygramm("uj");
        bygramm uq= new bygramm("uq");
        bygramm uz= new bygramm("uz");

        bygramm ce= new bygramm("ce");
        bygramm ca= new bygramm("ca");
        bygramm ct= new bygramm("ct");
        bygramm ci= new bygramm("ci");
        bygramm co= new bygramm("co");
        bygramm cn= new bygramm("cn");
        bygramm cs= new bygramm("cs");
        bygramm ch= new bygramm("ch");
        bygramm cr= new bygramm("cr");
        bygramm cd= new bygramm("cd");
        bygramm cl= new bygramm("cl");
        bygramm cu= new bygramm("cu");
        bygramm cc= new bygramm("cc");
        bygramm cm= new bygramm("cm");
        bygramm cp= new bygramm("cp");
        bygramm cw= new bygramm("cw");
        bygramm cg= new bygramm("cg");
        bygramm cy= new bygramm("cy");
        bygramm cf= new bygramm("cf");
        bygramm cb= new bygramm("cb");
        bygramm cv= new bygramm("cv");
        bygramm ck= new bygramm("ck");
        bygramm cx= new bygramm("cx");
        bygramm cj= new bygramm("cj");
        bygramm cq= new bygramm("cq");
        bygramm cz= new bygramm("cz");

        bygramm me= new bygramm("me");
        bygramm ma= new bygramm("ma");
        bygramm mt= new bygramm("mt");
        bygramm mi= new bygramm("mi");
        bygramm mo= new bygramm("mo");
        bygramm mn= new bygramm("mn");
        bygramm ms= new bygramm("ms");
        bygramm mh= new bygramm("mh");
        bygramm mr= new bygramm("mr");
        bygramm md= new bygramm("md");
        bygramm ml= new bygramm("ml");
        bygramm mu= new bygramm("mu");
        bygramm mc= new bygramm("mc");
        bygramm mm= new bygramm("mm");
        bygramm mp= new bygramm("mp");
        bygramm mw= new bygramm("mw");
        bygramm mg= new bygramm("mg");
        bygramm my= new bygramm("my");
        bygramm mf= new bygramm("mf");
        bygramm mb= new bygramm("mb");
        bygramm mv= new bygramm("mv");
        bygramm mk= new bygramm("mk");
        bygramm mx= new bygramm("mx");
        bygramm mj= new bygramm("mj");
        bygramm mq= new bygramm("mq");
        bygramm mz= new bygramm("mz");

        bygramm pe= new bygramm("pe");
        bygramm pa= new bygramm("pa");
        bygramm pt= new bygramm("pt");
        bygramm pi= new bygramm("pi");
        bygramm po= new bygramm("po");
        bygramm pn= new bygramm("pn");
        bygramm ps= new bygramm("ps");
        bygramm ph= new bygramm("ph");
        bygramm pr= new bygramm("pr");
        bygramm pd= new bygramm("pd");
        bygramm pl= new bygramm("pl");
        bygramm pu= new bygramm("pu");
        bygramm pc= new bygramm("pc");
        bygramm pm= new bygramm("pm");
        bygramm pp= new bygramm("pp");
        bygramm pw= new bygramm("pw");
        bygramm pg= new bygramm("pg");
        bygramm py= new bygramm("py");
        bygramm pf= new bygramm("pf");
        bygramm pb= new bygramm("pb");
        bygramm pv= new bygramm("pv");
        bygramm pk= new bygramm("pk");
        bygramm px= new bygramm("px");
        bygramm pj= new bygramm("pj");
        bygramm pq= new bygramm("pq");
        bygramm pz= new bygramm("pz");

        bygramm we= new bygramm("we");
        bygramm wa= new bygramm("wa");
        bygramm wt= new bygramm("wt");
        bygramm wi= new bygramm("wi");
        bygramm wo= new bygramm("wo");
        bygramm wn= new bygramm("wn");
        bygramm ws= new bygramm("ws");
        bygramm wh= new bygramm("wh");
        bygramm wr= new bygramm("wr");
        bygramm wd= new bygramm("wd");
        bygramm wl= new bygramm("wl");
        bygramm wu= new bygramm("wu");
        bygramm wc= new bygramm("wc");
        bygramm wm= new bygramm("wm");
        bygramm wp= new bygramm("wp");
        bygramm ww= new bygramm("ww");
        bygramm wg= new bygramm("wg");
        bygramm wy= new bygramm("wy");
        bygramm wf= new bygramm("wf");
        bygramm wb= new bygramm("wb");
        bygramm wv= new bygramm("wv");
        bygramm wk= new bygramm("wk");
        bygramm wx= new bygramm("wx");
        bygramm wj= new bygramm("wj");
        bygramm wq= new bygramm("wq");
        bygramm wz= new bygramm("wz");

        bygramm ge= new bygramm("ge");
        bygramm ga= new bygramm("ga");
        bygramm gt= new bygramm("gt");
        bygramm gi= new bygramm("gi");
        bygramm go= new bygramm("go");
        bygramm gn= new bygramm("gn");
        bygramm gs= new bygramm("gs");
        bygramm gh= new bygramm("gh");
        bygramm gr= new bygramm("gr");
        bygramm gd= new bygramm("gd");
        bygramm gl= new bygramm("gl");
        bygramm gu= new bygramm("gu");
        bygramm gc= new bygramm("gc");
        bygramm gm= new bygramm("gm");
        bygramm gp= new bygramm("gp");
        bygramm gw= new bygramm("gw");
        bygramm gg= new bygramm("gg");
        bygramm gy= new bygramm("gy");
        bygramm gf= new bygramm("gf");
        bygramm gb= new bygramm("gb");
        bygramm gv= new bygramm("gv");
        bygramm gk= new bygramm("gk");
        bygramm gx= new bygramm("gx");
        bygramm gj= new bygramm("gj");
        bygramm gq= new bygramm("gq");
        bygramm gz= new bygramm("gz");

        bygramm ye= new bygramm("ye");
        bygramm ya= new bygramm("ya");
        bygramm yt= new bygramm("yt");
        bygramm yi= new bygramm("yi");
        bygramm yo= new bygramm("yo");
        bygramm yn= new bygramm("yn");
        bygramm ys= new bygramm("ys");
        bygramm yh= new bygramm("yh");
        bygramm yr= new bygramm("yr");
        bygramm yd= new bygramm("yd");
        bygramm yl= new bygramm("yl");
        bygramm yu= new bygramm("yu");
        bygramm yc= new bygramm("yc");
        bygramm ym= new bygramm("ym");
        bygramm yp= new bygramm("yp");
        bygramm yw= new bygramm("yw");
        bygramm yg= new bygramm("yg");
        bygramm yy= new bygramm("yy");
        bygramm yf= new bygramm("yf");
        bygramm yb= new bygramm("yb");
        bygramm yv= new bygramm("yv");
        bygramm yk= new bygramm("yk");
        bygramm yx= new bygramm("yx");
        bygramm yj= new bygramm("yj");
        bygramm yq= new bygramm("yq");
        bygramm yz= new bygramm("yz");

        bygramm fe= new bygramm("fe");
        bygramm fa= new bygramm("fa");
        bygramm ft= new bygramm("ft");
        bygramm fi= new bygramm("fi");
        bygramm fo= new bygramm("fo");
        bygramm fn= new bygramm("fn");
        bygramm fs= new bygramm("fs");
        bygramm fh= new bygramm("fh");
        bygramm fr= new bygramm("fr");
        bygramm fd= new bygramm("fd");
        bygramm fl= new bygramm("fl");
        bygramm fu= new bygramm("fu");
        bygramm fc= new bygramm("fc");
        bygramm fm= new bygramm("fm");
        bygramm fp= new bygramm("fp");
        bygramm fw= new bygramm("fw");
        bygramm fg= new bygramm("fg");
        bygramm fy= new bygramm("fy");
        bygramm ff= new bygramm("ff");
        bygramm fb= new bygramm("fb");
        bygramm fv= new bygramm("fv");
        bygramm fk= new bygramm("fk");
        bygramm fx= new bygramm("fx");
        bygramm fj= new bygramm("fj");
        bygramm fq= new bygramm("fq");
        bygramm fz= new bygramm("fz");

        bygramm be= new bygramm("be");
        bygramm ba= new bygramm("ba");
        bygramm bt= new bygramm("bt");
        bygramm bi= new bygramm("bi");
        bygramm bo= new bygramm("bo");
        bygramm bn= new bygramm("bn");
        bygramm bs= new bygramm("bs");
        bygramm bh= new bygramm("bh");
        bygramm br= new bygramm("br");
        bygramm bd= new bygramm("bd");
        bygramm bl= new bygramm("bl");
        bygramm bu= new bygramm("bu");
        bygramm bc= new bygramm("bc");
        bygramm bm= new bygramm("bm");
        bygramm bp= new bygramm("bp");
        bygramm bw= new bygramm("bw");
        bygramm bg= new bygramm("bg");
        bygramm by= new bygramm("by");
        bygramm bf= new bygramm("bf");
        bygramm bb= new bygramm("bb");
        bygramm bv= new bygramm("bv");
        bygramm bk= new bygramm("bk");
        bygramm bx= new bygramm("bx");
        bygramm bj= new bygramm("bj");
        bygramm bq= new bygramm("bq");
        bygramm bz= new bygramm("bz");

        bygramm ve= new bygramm("ve");
        bygramm va= new bygramm("va");
        bygramm vt= new bygramm("vt");
        bygramm vi= new bygramm("vi");
        bygramm vo= new bygramm("vo");
        bygramm vn= new bygramm("vn");
        bygramm vs= new bygramm("vs");
        bygramm vh= new bygramm("vh");
        bygramm vr= new bygramm("vr");
        bygramm vd= new bygramm("vd");
        bygramm vl= new bygramm("vl");
        bygramm vu= new bygramm("vu");
        bygramm vc= new bygramm("vc");
        bygramm vm= new bygramm("vm");
        bygramm vp= new bygramm("vp");
        bygramm vw= new bygramm("vw");
        bygramm vg= new bygramm("vg");
        bygramm vy= new bygramm("vy");
        bygramm vf= new bygramm("vf");
        bygramm vb= new bygramm("vb");
        bygramm vv= new bygramm("vv");
        bygramm vk= new bygramm("vk");
        bygramm vx= new bygramm("vx");
        bygramm vj= new bygramm("vj");
        bygramm vq= new bygramm("vq");
        bygramm vz= new bygramm("vz");

        bygramm ke= new bygramm("ke");
        bygramm ka= new bygramm("ka");
        bygramm kt= new bygramm("kt");
        bygramm ki= new bygramm("ki");
        bygramm ko= new bygramm("ko");
        bygramm kn= new bygramm("kn");
        bygramm ks= new bygramm("ks");
        bygramm kh= new bygramm("kh");
        bygramm kr= new bygramm("kr");
        bygramm kd= new bygramm("kd");
        bygramm kl= new bygramm("kl");
        bygramm ku= new bygramm("ku");
        bygramm kc= new bygramm("kc");
        bygramm km= new bygramm("km");
        bygramm kp= new bygramm("kp");
        bygramm kw= new bygramm("kw");
        bygramm kg= new bygramm("kg");
        bygramm ky= new bygramm("ky");
        bygramm kf= new bygramm("kf");
        bygramm kb= new bygramm("kb");
        bygramm kv= new bygramm("kv");
        bygramm kk= new bygramm("kk");
        bygramm kx= new bygramm("kx");
        bygramm kj= new bygramm("kj");
        bygramm kq= new bygramm("kq");
        bygramm kz= new bygramm("kz");

        bygramm xe= new bygramm("xe");
        bygramm xa= new bygramm("xa");
        bygramm xt= new bygramm("xt");
        bygramm xi= new bygramm("xi");
        bygramm xo= new bygramm("xo");
        bygramm xn= new bygramm("xn");
        bygramm xs= new bygramm("xs");
        bygramm xh= new bygramm("xh");
        bygramm xr= new bygramm("xr");
        bygramm xd= new bygramm("xd");
        bygramm xl= new bygramm("xl");
        bygramm xu= new bygramm("xu");
        bygramm xc= new bygramm("xc");
        bygramm xm= new bygramm("xm");
        bygramm xp= new bygramm("xp");
        bygramm xw= new bygramm("xw");
        bygramm xg= new bygramm("xg");
        bygramm xy= new bygramm("xy");
        bygramm xf= new bygramm("xf");
        bygramm xb= new bygramm("xb");
        bygramm xv= new bygramm("xv");
        bygramm xk= new bygramm("xk");
        bygramm xx= new bygramm("xx");
        bygramm xj= new bygramm("xj");
        bygramm xq= new bygramm("xq");
        bygramm xz= new bygramm("xz");

        bygramm je= new bygramm("je");
        bygramm ja= new bygramm("ja");
        bygramm jt= new bygramm("jt");
        bygramm ji= new bygramm("ji");
        bygramm jo= new bygramm("jo");
        bygramm jn= new bygramm("jn");
        bygramm js= new bygramm("js");
        bygramm jh= new bygramm("jh");
        bygramm jr= new bygramm("jr");
        bygramm jd= new bygramm("jd");
        bygramm jl= new bygramm("jl");
        bygramm ju= new bygramm("ju");
        bygramm jc= new bygramm("jc");
        bygramm jm= new bygramm("jm");
        bygramm jp= new bygramm("jp");
        bygramm jw= new bygramm("jw");
        bygramm jg= new bygramm("jg");
        bygramm jy= new bygramm("jy");
        bygramm jf= new bygramm("jf");
        bygramm jb= new bygramm("jb");
        bygramm jv= new bygramm("jv");
        bygramm jk= new bygramm("jk");
        bygramm jx= new bygramm("jx");
        bygramm jj= new bygramm("jj");
        bygramm jq= new bygramm("jq");
        bygramm jz= new bygramm("jz");

        bygramm qe= new bygramm("qe");
        bygramm qa= new bygramm("qa");
        bygramm qt= new bygramm("qt");
        bygramm qi= new bygramm("qi");
        bygramm qo= new bygramm("qo");
        bygramm qn= new bygramm("qn");
        bygramm qs= new bygramm("qs");
        bygramm qh= new bygramm("qh");
        bygramm qr= new bygramm("qr");
        bygramm qd= new bygramm("qd");
        bygramm ql= new bygramm("ql");
        bygramm qu= new bygramm("qu");
        bygramm qc= new bygramm("qc");
        bygramm qm= new bygramm("qm");
        bygramm qp= new bygramm("qp");
        bygramm qw= new bygramm("qw");
        bygramm qg= new bygramm("qg");
        bygramm qy= new bygramm("qy");
        bygramm qf= new bygramm("qf");
        bygramm qb= new bygramm("qb");
        bygramm qv= new bygramm("qv");
        bygramm qk= new bygramm("qk");
        bygramm qx= new bygramm("qx");
        bygramm qj= new bygramm("qj");
        bygramm qq= new bygramm("qq");
        bygramm qz= new bygramm("qz");

        bygramm ze= new bygramm("ze");
        bygramm za= new bygramm("za");
        bygramm zt= new bygramm("zt");
        bygramm zi= new bygramm("zi");
        bygramm zo= new bygramm("zo");
        bygramm zn= new bygramm("zn");
        bygramm zs= new bygramm("zs");
        bygramm zh= new bygramm("zh");
        bygramm zr= new bygramm("zr");
        bygramm zd= new bygramm("zd");
        bygramm zl= new bygramm("zl");
        bygramm zu= new bygramm("zu");
        bygramm zc= new bygramm("zc");
        bygramm zm= new bygramm("zm");
        bygramm zp= new bygramm("zp");
        bygramm zw= new bygramm("zw");
        bygramm zg= new bygramm("zg");
        bygramm zy= new bygramm("zy");
        bygramm zf= new bygramm("zf");
        bygramm zb= new bygramm("zb");
        bygramm zv= new bygramm("zv");
        bygramm zk= new bygramm("zk");
        bygramm zx= new bygramm("zx");
        bygramm zj= new bygramm("zj");
        bygramm zq= new bygramm("zq");
        bygramm zz= new bygramm("zz");


        bygramm[] bym;
        bym=new bygramm[676]; //алфавит биграмм полного текста
        bym[0]=aa;
        bym[1]=ab;
        bym[2]=ac;
        bym[3]=ad;
        bym[4]=ae;
        bym[5]=af;
        bym[6]=ag;
        bym[7]=ah;
        bym[8]=ai;
        bym[9]=aj;
        bym[10]=ak;
        bym[11]=al;
        bym[12]=am;
        bym[13]=an;
        bym[14]=ao;
        bym[15]=ap;
        bym[16]=aq;
        bym[17]=ar;
        bym[18]=as;
        bym[19]=at;
        bym[20]=au;
        bym[21]=av;
        bym[22]=aw;
        bym[23]=ax;
        bym[24]=ay;
        bym[25]=az;
        bym[26]=ba;
        bym[27]=bb;
        bym[28]=bc;
        bym[29]=bd;
        bym[30]=be;
        bym[31]=bf;
        bym[32]=bg;
        bym[33]=bh;
        bym[34]=bi;
        bym[35]=bj;
        bym[36]=bk;
        bym[37]=bl;
        bym[38]=bm;
        bym[39]=bn;
        bym[40]=bo;
        bym[41]=bp;
        bym[42]=bq;
        bym[43]=br;
        bym[44]=bs;
        bym[45]=bt;
        bym[46]=bu;
        bym[47]=bv;
        bym[48]=bw;
        bym[49]=bx;
        bym[50]=by;
        bym[51]=bz;
        bym[52]=ca;
        bym[53]=cb;
        bym[54]=cc;
        bym[55]=cd;
        bym[56]=ce;
        bym[57]=cf;
        bym[58]=cg;
        bym[59]=ch;
        bym[60]=ci;
        bym[61]=cj;
        bym[62]=ck;
        bym[63]=cl;
        bym[64]=cm;
        bym[65]=cn;
        bym[66]=co;
        bym[67]=cp;
        bym[68]=cq;
        bym[69]=cr;
        bym[70]=cs;
        bym[71]=ct;
        bym[72]=cu;
        bym[73]=cv;
        bym[74]=cw;
        bym[75]=cx;
        bym[76]=cy;
        bym[77]=cz;
        bym[78]=da;
        bym[79]=db;
        bym[80]=dc;
        bym[81]=dd;
        bym[82]=de;
        bym[83]=df;
        bym[84]=dg;
        bym[85]=dh;
        bym[86]=di;
        bym[87]=dj;
        bym[88]=dk;
        bym[89]=dl;
        bym[90]=dm;
        bym[91]=dn;
        bym[92]=ddo;
        bym[93]=dp;
        bym[94]=dq;
        bym[95]=dr;
        bym[96]=ds;
        bym[97]=dt;
        bym[98]=du;
        bym[99]=dv;
        bym[100]=dw;
        bym[101]=dx;
        bym[102]=dy;
        bym[103]=dz;
        bym[104]=ea;
        bym[105]=eb;
        bym[106]=ec;
        bym[107]=ed;
        bym[108]=ee;
        bym[109]=ef;
        bym[110]=eg;
        bym[111]=eh;
        bym[112]=ei;
        bym[113]=ej;
        bym[114]=ek;
        bym[115]=el;
        bym[116]=em;
        bym[117]=en;
        bym[118]=eo;
        bym[119]=ep;
        bym[120]=eq;
        bym[121]=er;
        bym[122]=es;
        bym[123]=et;
        bym[124]=eu;
        bym[125]=ev;
        bym[126]=ew;
        bym[127]=ex;
        bym[128]=ey;
        bym[129]=ez;
        bym[130]=fa;
        bym[131]=fb;
        bym[132]=fc;
        bym[133]=fd;
        bym[134]=fe;
        bym[135]=ff;
        bym[136]=fg;
        bym[137]=fh;
        bym[138]=fi;
        bym[139]=fj;
        bym[140]=fk;
        bym[141]=fl;
        bym[142]=fm;
        bym[143]=fn;
        bym[144]=fo;
        bym[145]=fp;
        bym[146]=fq;
        bym[147]=fr;
        bym[148]=fs;
        bym[149]=ft;
        bym[150]=fu;
        bym[151]=fv;
        bym[152]=fw;
        bym[153]=fx;
        bym[154]=fy;
        bym[155]=fz;
        bym[156]=ga;
        bym[157]=gb;
        bym[158]=gc;
        bym[159]=gd;
        bym[160]=ge;
        bym[161]=gf;
        bym[162]=gg;
        bym[163]=gh;
        bym[164]=gi;
        bym[165]=gj;
        bym[166]=gk;
        bym[167]=gl;
        bym[168]=gm;
        bym[169]=gn;
        bym[170]=go;
        bym[171]=gp;
        bym[172]=gq;
        bym[173]=gr;
        bym[174]=gs;
        bym[175]=gt;
        bym[176]=gu;
        bym[177]=gv;
        bym[178]=gw;
        bym[179]=gx;
        bym[180]=gy;
        bym[181]=gz;
        bym[182]=ha;
        bym[183]=hb;
        bym[184]=hc;
        bym[185]=hd;
        bym[186]=he;
        bym[187]=hf;
        bym[188]=hg;
        bym[189]=hh;
        bym[190]=hi;
        bym[191]=hj;
        bym[192]=hk;
        bym[193]=hl;
        bym[194]=hm;
        bym[195]=hn;
        bym[196]=ho;
        bym[197]=hp;
        bym[198]=hq;
        bym[199]=hr;
        bym[200]=hs;
        bym[201]=ht;
        bym[202]=hu;
        bym[203]=hv;
        bym[204]=hw;
        bym[205]=hx;
        bym[206]=hy;
        bym[207]=hz;
        bym[208]=ia;
        bym[209]=ib;
        bym[210]=ic;
        bym[211]=id;
        bym[212]=ie;
        bym[213]=iif;
        bym[214]=ig;
        bym[215]=ih;
        bym[216]=ii;
        bym[217]=ij;
        bym[218]=ik;
        bym[219]=il;
        bym[220]=im;
        bym[221]=in;
        bym[222]=io;
        bym[223]=ip;
        bym[224]=iq;
        bym[225]=ir;
        bym[226]=is;
        bym[227]=it;
        bym[228]=iu;
        bym[229]=iv;
        bym[230]=iw;
        bym[231]=ix;
        bym[232]=iy;
        bym[233]=iz;
        bym[234]=ja;
        bym[235]=jb;
        bym[236]=jc;
        bym[237]=jd;
        bym[238]=je;
        bym[239]=jf;
        bym[240]=jg;
        bym[241]=jh;
        bym[242]=ji;
        bym[243]=jj;
        bym[244]=jk;
        bym[245]=jl;
        bym[246]=jm;
        bym[247]=jn;
        bym[248]=jo;
        bym[249]=jp;
        bym[250]=jq;
        bym[251]=jr;
        bym[252]=js;
        bym[253]=jt;
        bym[254]=ju;
        bym[255]=jv;
        bym[256]=jw;
        bym[257]=jx;
        bym[258]=jy;
        bym[259]=jz;
        bym[260]=ka;
        bym[261]=kb;
        bym[262]=kc;
        bym[263]=kd;
        bym[264]=ke;
        bym[265]=kf;
        bym[266]=kg;
        bym[267]=kh;
        bym[268]=ki;
        bym[269]=kj;
        bym[270]=kk;
        bym[271]=kl;
        bym[272]=km;
        bym[273]=kn;
        bym[274]=ko;
        bym[275]=kp;
        bym[276]=kq;
        bym[277]=kr;
        bym[278]=ks;
        bym[279]=kt;
        bym[280]=ku;
        bym[281]=kv;
        bym[282]=kw;
        bym[283]=kx;
        bym[284]=ky;
        bym[285]=kz;
        bym[286]=la;
        bym[287]=lb;
        bym[288]=lc;
        bym[289]=ld;
        bym[290]=le;
        bym[291]=lf;
        bym[292]=lg;
        bym[293]=lh;
        bym[294]=li;
        bym[295]=lj;
        bym[296]=lk;
        bym[297]=ll;
        bym[298]=lm;
        bym[299]=ln;
        bym[300]=lo;
        bym[301]=lp;
        bym[302]=lq;
        bym[303]=lr;
        bym[304]=ls;
        bym[305]=lt;
        bym[306]=lu;
        bym[307]=lv;
        bym[308]=lw;
        bym[309]=lx;
        bym[310]=ly;
        bym[311]=lz;
        bym[312]=ma;
        bym[313]=mb;
        bym[314]=mc;
        bym[315]=md;
        bym[316]=me;
        bym[317]=mf;
        bym[318]=mg;
        bym[319]=mh;
        bym[320]=mi;
        bym[321]=mj;
        bym[322]=mk;
        bym[323]=ml;
        bym[324]=mm;
        bym[325]=mn;
        bym[326]=mo;
        bym[327]=mp;
        bym[328]=mq;
        bym[329]=mr;
        bym[330]=ms;
        bym[331]=mt;
        bym[332]=mu;
        bym[333]=mv;
        bym[334]=mw;
        bym[335]=mx;
        bym[336]=my;
        bym[337]=mz;
        bym[338]=na;
        bym[339]=nb;
        bym[340]=nc;
        bym[341]=nd;
        bym[342]=ne;
        bym[343]=nf;
        bym[344]=ng;
        bym[345]=nh;
        bym[346]=ni;
        bym[347]=nj;
        bym[348]=nk;
        bym[349]=nl;
        bym[350]=nm;
        bym[351]=nn;
        bym[352]=no;
        bym[353]=np;
        bym[354]=nq;
        bym[355]=nr;
        bym[356]=ns;
        bym[357]=nt;
        bym[358]=nu;
        bym[359]=nv;
        bym[360]=nw;
        bym[361]=nx;
        bym[362]=ny;
        bym[363]=nz;
        bym[364]=oa;
        bym[365]=ob;
        bym[366]=oc;
        bym[367]=od;
        bym[368]=oe;
        bym[369]=of;
        bym[370]=og;
        bym[371]=oh;
        bym[372]=oi;
        bym[373]=oj;
        bym[374]=ok;
        bym[375]=ol;
        bym[376]=om;
        bym[377]=on;
        bym[378]=oo;
        bym[379]=op;
        bym[380]=oq;
        bym[381]=or;
        bym[382]=os;
        bym[383]=ot;
        bym[384]=ou;
        bym[385]=ov;
        bym[386]=ow;
        bym[387]=ox;
        bym[388]=oy;
        bym[389]=oz;
        bym[390]=pa;
        bym[391]=pb;
        bym[392]=pc;
        bym[393]=pd;
        bym[394]=pe;
        bym[395]=pf;
        bym[396]=pg;
        bym[397]=ph;
        bym[398]=pi;
        bym[399]=pj;
        bym[400]=pk;
        bym[401]=pl;
        bym[402]=pm;
        bym[403]=pn;
        bym[404]=po;
        bym[405]=pp;
        bym[406]=pq;
        bym[407]=pr;
        bym[408]=ps;
        bym[409]=pt;
        bym[410]=pu;
        bym[411]=pv;
        bym[412]=pw;
        bym[413]=px;
        bym[414]=py;
        bym[415]=pz;
        bym[416]=qa;
        bym[417]=qb;
        bym[418]=qc;
        bym[419]=qd;
        bym[420]=qe;
        bym[421]=qf;
        bym[422]=qg;
        bym[423]=qh;
        bym[424]=qi;
        bym[425]=qj;
        bym[426]=qk;
        bym[427]=ql;
        bym[428]=qm;
        bym[429]=qn;
        bym[430]=qo;
        bym[431]=qp;
        bym[432]=qq;
        bym[433]=qr;
        bym[434]=qs;
        bym[435]=qt;
        bym[436]=qu;
        bym[437]=qv;
        bym[438]=qw;
        bym[439]=qx;
        bym[440]=qy;
        bym[441]=qz;
        bym[442]=ra;
        bym[443]=rb;
        bym[444]=rc;
        bym[445]=rd;
        bym[446]=re;
        bym[447]=rf;
        bym[448]=rg;
        bym[449]=rh;
        bym[450]=ri;
        bym[451]=rj;
        bym[452]=rk;
        bym[453]=rl;
        bym[454]=rm;
        bym[455]=rn;
        bym[456]=ro;
        bym[457]=rp;
        bym[458]=rq;
        bym[459]=rr;
        bym[460]=rs;
        bym[461]=rt;
        bym[462]=ru;
        bym[463]=rv;
        bym[464]=rw;
        bym[465]=rx;
        bym[466]=ry;
        bym[467]=rz;
        bym[468]=sa;
        bym[469]=sb;
        bym[470]=sc;
        bym[471]=sd;
        bym[472]=se;
        bym[473]=sf;
        bym[474]=sg;
        bym[475]=sh;
        bym[476]=si;
        bym[477]=sj;
        bym[478]=sk;
        bym[479]=sl;
        bym[480]=sm;
        bym[481]=sn;
        bym[482]=so;
        bym[483]=sp;
        bym[484]=sq;
        bym[485]=sr;
        bym[486]=ss;
        bym[487]=st;
        bym[488]=su;
        bym[489]=sv;
        bym[490]=sw;
        bym[491]=sx;
        bym[492]=sy;
        bym[493]=sz;
        bym[494]=ta;
        bym[495]=tb;
        bym[496]=tc;
        bym[497]=td;
        bym[498]=te;
        bym[499]=tf;
        bym[500]=tg;
        bym[501]=th;
        bym[502]=ti;
        bym[503]=tj;
        bym[504]=tk;
        bym[505]=tl;
        bym[506]=tm;
        bym[507]=tn;
        bym[508]=to;
        bym[509]=tp;
        bym[510]=tq;
        bym[511]=tr;
        bym[512]=ts;
        bym[513]=tt;
        bym[514]=tu;
        bym[515]=tv;
        bym[516]=tw;
        bym[517]=tx;
        bym[518]=ty;
        bym[519]=tz;
        bym[520]=ua;
        bym[521]=ub;
        bym[522]=uc;
        bym[523]=ud;
        bym[524]=ue;
        bym[525]=uf;
        bym[526]=ug;
        bym[527]=uh;
        bym[528]=ui;
        bym[529]=uj;
        bym[530]=uk;
        bym[531]=ul;
        bym[532]=um;
        bym[533]=un;
        bym[534]=uo;
        bym[535]=up;
        bym[536]=uq;
        bym[537]=ur;
        bym[538]=us;
        bym[539]=ut;
        bym[540]=uu;
        bym[541]=uv;
        bym[542]=uw;
        bym[543]=ux;
        bym[544]=uy;
        bym[545]=uz;
        bym[546]=va;
        bym[547]=vb;
        bym[548]=vc;
        bym[549]=vd;
        bym[550]=ve;
        bym[551]=vf;
        bym[552]=vg;
        bym[553]=vh;
        bym[554]=vi;
        bym[555]=vj;
        bym[556]=vk;
        bym[557]=vl;
        bym[558]=vm;
        bym[559]=vn;
        bym[560]=vo;
        bym[561]=vp;
        bym[562]=vq;
        bym[563]=vr;
        bym[564]=vs;
        bym[565]=vt;
        bym[566]=vu;
        bym[567]=vv;
        bym[568]=vw;
        bym[569]=vx;
        bym[570]=vy;
        bym[571]=vz;
        bym[572]=wa;
        bym[573]=wb;
        bym[574]=wc;
        bym[575]=wd;
        bym[576]=we;
        bym[577]=wf;
        bym[578]=wg;
        bym[579]=wh;
        bym[580]=wi;
        bym[581]=wj;
        bym[582]=wk;
        bym[583]=wl;
        bym[584]=wm;
        bym[585]=wn;
        bym[586]=wo;
        bym[587]=wp;
        bym[588]=wq;
        bym[589]=wr;
        bym[590]=ws;
        bym[591]=wt;
        bym[592]=wu;
        bym[593]=wv;
        bym[594]=ww;
        bym[595]=wx;
        bym[596]=wy;
        bym[597]=wz;
        bym[598]=xa;
        bym[599]=xb;
        bym[600]=xc;
        bym[601]=xd;
        bym[602]=xe;
        bym[603]=xf;
        bym[604]=xg;
        bym[605]=xh;
        bym[606]=xi;
        bym[607]=xj;
        bym[608]=xk;
        bym[609]=xl;
        bym[610]=xm;
        bym[611]=xn;
        bym[612]=xo;
        bym[613]=xp;
        bym[614]=xq;
        bym[615]=xr;
        bym[616]=xs;
        bym[617]=xt;
        bym[618]=xu;
        bym[619]=xv;
        bym[620]=xw;
        bym[621]=xx;
        bym[622]=xy;
        bym[623]=xz;
        bym[624]=ya;
        bym[625]=yb;
        bym[626]=yc;
        bym[627]=yd;
        bym[628]=ye;
        bym[629]=yf;
        bym[630]=yg;
        bym[631]=yh;
        bym[632]=yi;
        bym[633]=yj;
        bym[634]=yk;
        bym[635]=yl;
        bym[636]=ym;
        bym[637]=yn;
        bym[638]=yo;
        bym[639]=yp;
        bym[640]=yq;
        bym[641]=yr;
        bym[642]=ys;
        bym[643]=yt;
        bym[644]=yu;
        bym[645]=yv;
        bym[646]=yw;
        bym[647]=yx;
        bym[648]=yy;
        bym[649]=yz;
        bym[650]=za;
        bym[651]=zb;
        bym[652]=zc;
        bym[653]=zd;
        bym[654]=ze;
        bym[655]=zf;
        bym[656]=zg;
        bym[657]=zh;
        bym[658]=zi;
        bym[659]=zj;
        bym[660]=zk;
        bym[661]=zl;
        bym[662]=zm;
        bym[663]=zn;
        bym[664]=zo;
        bym[665]=zp;
        bym[666]=zq;
        bym[667]=zr;
        bym[668]=zs;
        bym[669]=zt;
        bym[670]=zu;
        bym[671]=zv;
        bym[672]=zw;
        bym[673]=zx;
        bym[674]=zy;
        bym[675]=zz;
        int allb=0;  //общее количество сочетаний букв в тексте

        //подсчет количества употребления для каждой биграммы
        tablealltext[] alf4={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
        int cros=0;
        for(int ind=0;ind<=25;ind++){
            for(int ind1=0;ind1<=25;ind1++){
                for (int ind2=0;ind2<((alltext.length())-1);ind2++) {
                    char chars = alltext.charAt(ind2);
                    char chars1 = alltext.charAt(ind2 + 1);
                    String str=String.valueOf(alf4[ind].getname());
                    String srt=str.toUpperCase();
                    char ch2 = srt.charAt(0);
                    String str1=String.valueOf(alf4[ind1].getname());
                    String srt1=str1.toUpperCase();
                    char ch3 = srt1.charAt(0);
                    if ((chars == ch2 | chars == alf4[ind].getname()) & (chars1 == ch3 | chars1 == alf4[ind1].getname())) {
                        bym[cros].setkolvo();
                        allb++;
                    }
                }
                cros++;
            }
        }


        //подсчет чавстот биграмм полного текста
        for (int ind=0;ind<=675;ind++){
            bym[ind].setggz(allb);
        }
        //вывод частотной таблицы биграмм полного текста
        System.out.print("\nFull bygramm table:\n");
        for (int ind=0;ind<=675;ind++) {
            if(bym[ind].getggz()!=0) {
                System.out.print(bym[ind].getname() + "=" + bym[ind].getggz() + "\n");
            }
        }



        //биграммы анализ зашифрованного фрагмента(bygramm analiz fragment)
        StringBuffer new1text = new StringBuffer(crypt.crypto()); //строка зашифрованного текста
        //алфавит биграмм фрагмента текста
        bygramm aa1= new bygramm("aa");
        bygramm ab1= new bygramm("ab");
        bygramm ac1= new bygramm("ac");
        bygramm ad1= new bygramm("ad");
        bygramm ae1= new bygramm("ae");
        bygramm af1= new bygramm("af");
        bygramm ag1= new bygramm("ag");
        bygramm ah1= new bygramm("ah");
        bygramm ai1= new bygramm("ai");
        bygramm aj1= new bygramm("aj");
        bygramm ak1= new bygramm("ak");
        bygramm al1= new bygramm("al");
        bygramm am1= new bygramm("am");
        bygramm an1= new bygramm("an");
        bygramm ao1= new bygramm("ao");
        bygramm ap1= new bygramm("ap");
        bygramm aq1= new bygramm("aq");
        bygramm ar1= new bygramm("ar");
        bygramm as1= new bygramm("as");
        bygramm at1= new bygramm("at");
        bygramm au1= new bygramm("au");
        bygramm av1= new bygramm("av");
        bygramm aw1= new bygramm("aw");
        bygramm ax1= new bygramm("ax");
        bygramm ay1= new bygramm("ay");
        bygramm az1= new bygramm("az");

        bygramm ba1= new bygramm("ba");
        bygramm bb1= new bygramm("bb");
        bygramm bc1= new bygramm("bc");
        bygramm bd1= new bygramm("bd");
        bygramm be1= new bygramm("be");
        bygramm bf1= new bygramm("bf");
        bygramm bg1= new bygramm("bg");
        bygramm bh1= new bygramm("bh");
        bygramm bi1= new bygramm("bi");
        bygramm bj1= new bygramm("bj");
        bygramm bk1= new bygramm("bk");
        bygramm bl1= new bygramm("bl");
        bygramm bm1= new bygramm("bm");
        bygramm bn1= new bygramm("bn");
        bygramm bo1= new bygramm("bo");
        bygramm bp1= new bygramm("bp");
        bygramm bq1= new bygramm("bq");
        bygramm br1= new bygramm("br");
        bygramm bs1= new bygramm("bs");
        bygramm bt1= new bygramm("bt");
        bygramm bu1= new bygramm("bu");
        bygramm bv1= new bygramm("bv");
        bygramm bw1= new bygramm("bw");
        bygramm bx1= new bygramm("bx");
        bygramm by1= new bygramm("by");
        bygramm bz1= new bygramm("bz");

        bygramm ca1= new bygramm("ca");
        bygramm cb1= new bygramm("cb");
        bygramm cc1= new bygramm("cc");
        bygramm cd1= new bygramm("cd");
        bygramm ce1= new bygramm("ce");
        bygramm cf1= new bygramm("cf");
        bygramm cg1= new bygramm("cg");
        bygramm ch1= new bygramm("ch");
        bygramm ci1= new bygramm("ci");
        bygramm cj1= new bygramm("cj");
        bygramm ck1= new bygramm("ck");
        bygramm cl1= new bygramm("cl");
        bygramm cm1= new bygramm("cm");
        bygramm cn1= new bygramm("cn");
        bygramm co1= new bygramm("co");
        bygramm cp1= new bygramm("cp");
        bygramm cq1= new bygramm("cq");
        bygramm cr1= new bygramm("cr");
        bygramm cs1= new bygramm("cs");
        bygramm ct1= new bygramm("ct");
        bygramm cu1= new bygramm("cu");
        bygramm cv1= new bygramm("cv");
        bygramm cw1= new bygramm("cw");
        bygramm cx1= new bygramm("cx");
        bygramm cy1= new bygramm("cy");
        bygramm cz1= new bygramm("cz");

        bygramm da1= new bygramm("da");
        bygramm db1= new bygramm("db");
        bygramm dc1= new bygramm("dc");
        bygramm dd1= new bygramm("dd");
        bygramm de1= new bygramm("de");
        bygramm df1= new bygramm("df");
        bygramm dg1= new bygramm("dg");
        bygramm dh1= new bygramm("dh");
        bygramm di1= new bygramm("di");
        bygramm dj1= new bygramm("dj");
        bygramm dk1= new bygramm("dk");
        bygramm dl1= new bygramm("dl");
        bygramm dm1= new bygramm("dm");
        bygramm dn1= new bygramm("dn");
        bygramm do1= new bygramm("do");
        bygramm dp1= new bygramm("dp");
        bygramm dq1= new bygramm("dq");
        bygramm dr1= new bygramm("dr");
        bygramm ds1= new bygramm("ds");
        bygramm dt1= new bygramm("dt");
        bygramm du1= new bygramm("du");
        bygramm dv1= new bygramm("dv");
        bygramm dw1= new bygramm("dw");
        bygramm dx1= new bygramm("dx");
        bygramm dy1= new bygramm("dy");
        bygramm dz1= new bygramm("dz");

        bygramm ea1= new bygramm("ea");
        bygramm eb1= new bygramm("eb");
        bygramm ec1= new bygramm("ec");
        bygramm ed1= new bygramm("ed");
        bygramm ee1= new bygramm("ee");
        bygramm ef1= new bygramm("ef");
        bygramm eg1= new bygramm("eg");
        bygramm eh1= new bygramm("eh");
        bygramm ei1= new bygramm("ei");
        bygramm ej1= new bygramm("ej");
        bygramm ek1= new bygramm("ek");
        bygramm el1= new bygramm("el");
        bygramm em1= new bygramm("em");
        bygramm en1= new bygramm("en");
        bygramm eo1= new bygramm("eo");
        bygramm ep1= new bygramm("ep");
        bygramm eq1= new bygramm("eq");
        bygramm er1= new bygramm("er");
        bygramm es1= new bygramm("es");
        bygramm et1= new bygramm("et");
        bygramm eu1= new bygramm("eu");
        bygramm ev1= new bygramm("ev");
        bygramm ew1= new bygramm("ew");
        bygramm ex1= new bygramm("ex");
        bygramm ey1= new bygramm("ey");
        bygramm ez1= new bygramm("ez");

        bygramm fa1= new bygramm("fa");
        bygramm fb1= new bygramm("fb");
        bygramm fc1= new bygramm("fc");
        bygramm fd1= new bygramm("fd");
        bygramm fe1= new bygramm("fe");
        bygramm ff1= new bygramm("ff");
        bygramm fg1= new bygramm("fg");
        bygramm fh1= new bygramm("fh");
        bygramm fi1= new bygramm("fi");
        bygramm fj1= new bygramm("fj");
        bygramm fk1= new bygramm("fk");
        bygramm fl1= new bygramm("fl");
        bygramm fm1= new bygramm("fm");
        bygramm fn1= new bygramm("fn");
        bygramm fo1= new bygramm("fo");
        bygramm fp1= new bygramm("fp");
        bygramm fq1= new bygramm("fq");
        bygramm fr1= new bygramm("fr");
        bygramm fs1= new bygramm("fs");
        bygramm ft1= new bygramm("ft");
        bygramm fu1= new bygramm("fu");
        bygramm fv1= new bygramm("fv");
        bygramm fw1= new bygramm("fw");
        bygramm fx1= new bygramm("fx");
        bygramm fy1= new bygramm("fy");
        bygramm fz1= new bygramm("fz");

        bygramm ga1= new bygramm("ga");
        bygramm gb1= new bygramm("gb");
        bygramm gc1= new bygramm("gc");
        bygramm gd1= new bygramm("gd");
        bygramm ge1= new bygramm("ge");
        bygramm gf1= new bygramm("gf");
        bygramm gg1= new bygramm("gg");
        bygramm gh1= new bygramm("gh");
        bygramm gi1= new bygramm("gi");
        bygramm gj1= new bygramm("gj");
        bygramm gk1= new bygramm("gk");
        bygramm gl1= new bygramm("gl");
        bygramm gm1= new bygramm("gm");
        bygramm gn1= new bygramm("gn");
        bygramm go1= new bygramm("go");
        bygramm gp1= new bygramm("gp");
        bygramm gq1= new bygramm("gq");
        bygramm gr1= new bygramm("gr");
        bygramm gs1= new bygramm("gs");
        bygramm gt1= new bygramm("gt");
        bygramm gu1= new bygramm("gu");
        bygramm gv1= new bygramm("gv");
        bygramm gw1= new bygramm("gw");
        bygramm gx1= new bygramm("gx");
        bygramm gy1= new bygramm("gy");
        bygramm gz1= new bygramm("gz");

        bygramm ha1= new bygramm("ha");
        bygramm hb1= new bygramm("hb");
        bygramm hc1= new bygramm("hc");
        bygramm hd1= new bygramm("hd");
        bygramm he1= new bygramm("he");
        bygramm hf1= new bygramm("hf");
        bygramm hg1= new bygramm("hg");
        bygramm hh1= new bygramm("hh");
        bygramm hi1= new bygramm("hi");
        bygramm hj1= new bygramm("hj");
        bygramm hk1= new bygramm("hk");
        bygramm hl1= new bygramm("hl");
        bygramm hm1= new bygramm("hm");
        bygramm hn1= new bygramm("hn");
        bygramm ho1= new bygramm("ho");
        bygramm hp1= new bygramm("hp");
        bygramm hq1= new bygramm("hq");
        bygramm hr1= new bygramm("hr");
        bygramm hs1= new bygramm("hs");
        bygramm ht1= new bygramm("ht");
        bygramm hu1= new bygramm("hu");
        bygramm hv1= new bygramm("hv");
        bygramm hw1= new bygramm("hw");
        bygramm hx1= new bygramm("hx");
        bygramm hy1= new bygramm("hy");
        bygramm hz1= new bygramm("hz");

        bygramm ia1= new bygramm("ia");
        bygramm ib1= new bygramm("ib");
        bygramm ic1= new bygramm("ic");
        bygramm id1= new bygramm("id");
        bygramm ie1= new bygramm("ie");
        bygramm if1= new bygramm("if");
        bygramm ig1= new bygramm("ig");
        bygramm ih1= new bygramm("ih");
        bygramm ii1= new bygramm("ii");
        bygramm ij1= new bygramm("ij");
        bygramm ik1= new bygramm("ik");
        bygramm il1= new bygramm("il");
        bygramm im1= new bygramm("im");
        bygramm in1= new bygramm("in");
        bygramm io1= new bygramm("io");
        bygramm ip1= new bygramm("ip");
        bygramm iq1= new bygramm("iq");
        bygramm ir1= new bygramm("ir");
        bygramm is1= new bygramm("is");
        bygramm it1= new bygramm("it");
        bygramm iu1= new bygramm("iu");
        bygramm iv1= new bygramm("iv");
        bygramm iw1= new bygramm("iw");
        bygramm ix1= new bygramm("ix");
        bygramm iy1= new bygramm("iy");
        bygramm iz1= new bygramm("iz");

        bygramm ja1= new bygramm("ja");
        bygramm jb1= new bygramm("jb");
        bygramm jc1= new bygramm("jc");
        bygramm jd1= new bygramm("jd");
        bygramm je1= new bygramm("je");
        bygramm jf1= new bygramm("jf");
        bygramm jg1= new bygramm("jg");
        bygramm jh1= new bygramm("jh");
        bygramm ji1= new bygramm("ji");
        bygramm jj1= new bygramm("jj");
        bygramm jk1= new bygramm("jk");
        bygramm jl1= new bygramm("jl");
        bygramm jm1= new bygramm("jm");
        bygramm jn1= new bygramm("jn");
        bygramm jo1= new bygramm("jo");
        bygramm jp1= new bygramm("jp");
        bygramm jq1= new bygramm("jq");
        bygramm jr1= new bygramm("jr");
        bygramm js1= new bygramm("js");
        bygramm jt1= new bygramm("jt");
        bygramm ju1= new bygramm("ju");
        bygramm jv1= new bygramm("jv");
        bygramm jw1= new bygramm("jw");
        bygramm jx1= new bygramm("jx");
        bygramm jy1= new bygramm("jy");
        bygramm jz1= new bygramm("jz");

        bygramm ka1= new bygramm("ka");
        bygramm kb1= new bygramm("kb");
        bygramm kc1= new bygramm("kc");
        bygramm kd1= new bygramm("kd");
        bygramm ke1= new bygramm("ke");
        bygramm kf1= new bygramm("kf");
        bygramm kg1= new bygramm("kg");
        bygramm kh1= new bygramm("kh");
        bygramm ki1= new bygramm("ki");
        bygramm kj1= new bygramm("kj");
        bygramm kk1= new bygramm("kk");
        bygramm kl1= new bygramm("kl");
        bygramm km1= new bygramm("km");
        bygramm kn1= new bygramm("kn");
        bygramm ko1= new bygramm("ko");
        bygramm kp1= new bygramm("kp");
        bygramm kq1= new bygramm("kq");
        bygramm kr1= new bygramm("kr");
        bygramm ks1= new bygramm("ks");
        bygramm kt1= new bygramm("kt");
        bygramm ku1= new bygramm("ku");
        bygramm kv1= new bygramm("kv");
        bygramm kw1= new bygramm("kw");
        bygramm kx1= new bygramm("kx");
        bygramm ky1= new bygramm("ky");
        bygramm kz1= new bygramm("kz");

        bygramm la1= new bygramm("la");
        bygramm lb1= new bygramm("lb");
        bygramm lc1= new bygramm("lc");
        bygramm ld1= new bygramm("ld");
        bygramm le1= new bygramm("le");
        bygramm lf1= new bygramm("lf");
        bygramm lg1= new bygramm("lg");
        bygramm lh1= new bygramm("lh");
        bygramm li1= new bygramm("li");
        bygramm lj1= new bygramm("lj");
        bygramm lk1= new bygramm("lk");
        bygramm ll1= new bygramm("ll");
        bygramm lm1= new bygramm("lm");
        bygramm ln1= new bygramm("ln");
        bygramm lo1= new bygramm("lo");
        bygramm lp1= new bygramm("lp");
        bygramm lq1= new bygramm("lq");
        bygramm lr1= new bygramm("lr");
        bygramm ls1= new bygramm("ls");
        bygramm lt1= new bygramm("lt");
        bygramm lu1= new bygramm("lu");
        bygramm lv1= new bygramm("lv");
        bygramm lw1= new bygramm("lw");
        bygramm lx1= new bygramm("lx");
        bygramm ly1= new bygramm("ly");
        bygramm lz1= new bygramm("lz");

        bygramm ma1= new bygramm("ma");
        bygramm mb1= new bygramm("mb");
        bygramm mc1= new bygramm("mc");
        bygramm md1= new bygramm("md");
        bygramm me1= new bygramm("me");
        bygramm mf1= new bygramm("mf");
        bygramm mg1= new bygramm("mg");
        bygramm mh1= new bygramm("mh");
        bygramm mi1= new bygramm("mi");
        bygramm mj1= new bygramm("mj");
        bygramm mk1= new bygramm("mk");
        bygramm ml1= new bygramm("ml");
        bygramm mm1= new bygramm("mm");
        bygramm mn1= new bygramm("mn");
        bygramm mo1= new bygramm("mo");
        bygramm mp1= new bygramm("mp");
        bygramm mq1= new bygramm("mq");
        bygramm mr1= new bygramm("mr");
        bygramm ms1= new bygramm("ms");
        bygramm mt1= new bygramm("mt");
        bygramm mu1= new bygramm("mu");
        bygramm mv1= new bygramm("mv");
        bygramm mw1= new bygramm("mw");
        bygramm mx1= new bygramm("mx");
        bygramm my1= new bygramm("my");
        bygramm mz1= new bygramm("mz");

        bygramm na1= new bygramm("na");
        bygramm nb1= new bygramm("nb");
        bygramm nc1= new bygramm("nc");
        bygramm nd1= new bygramm("nd");
        bygramm ne1= new bygramm("ne");
        bygramm nf1= new bygramm("nf");
        bygramm ng1= new bygramm("ng");
        bygramm nh1= new bygramm("nh");
        bygramm ni1= new bygramm("ni");
        bygramm nj1= new bygramm("nj");
        bygramm nk1= new bygramm("nk");
        bygramm nl1= new bygramm("nl");
        bygramm nm1= new bygramm("nm");
        bygramm nn1= new bygramm("nn");
        bygramm no1= new bygramm("no");
        bygramm np1= new bygramm("np");
        bygramm nq1= new bygramm("nq");
        bygramm nr1= new bygramm("nr");
        bygramm ns1= new bygramm("ns");
        bygramm nt1= new bygramm("nt");
        bygramm nu1= new bygramm("nu");
        bygramm nv1= new bygramm("nv");
        bygramm nw1= new bygramm("nw");
        bygramm nx1= new bygramm("nx");
        bygramm ny1= new bygramm("ny");
        bygramm nz1= new bygramm("nz");

        bygramm oa1= new bygramm("oa");
        bygramm ob1= new bygramm("ob");
        bygramm oc1= new bygramm("oc");
        bygramm od1= new bygramm("od");
        bygramm oe1= new bygramm("oe");
        bygramm of1= new bygramm("of");
        bygramm og1= new bygramm("og");
        bygramm oh1= new bygramm("oh");
        bygramm oi1= new bygramm("oi");
        bygramm oj1= new bygramm("oj");
        bygramm ok1= new bygramm("ok");
        bygramm ol1= new bygramm("ol");
        bygramm om1= new bygramm("om");
        bygramm on1= new bygramm("on");
        bygramm oo1= new bygramm("oo");
        bygramm op1= new bygramm("op");
        bygramm oq1= new bygramm("oq");
        bygramm or1= new bygramm("or");
        bygramm os1= new bygramm("os");
        bygramm ot1= new bygramm("ot");
        bygramm ou1= new bygramm("ou");
        bygramm ov1= new bygramm("ov");
        bygramm ow1= new bygramm("ow");
        bygramm ox1= new bygramm("ox");
        bygramm oy1= new bygramm("oy");
        bygramm oz1= new bygramm("oz");

        bygramm pa1= new bygramm("pa");
        bygramm pb1= new bygramm("pb");
        bygramm pc1= new bygramm("pc");
        bygramm pd1= new bygramm("pd");
        bygramm pe1= new bygramm("pe");
        bygramm pf1= new bygramm("pf");
        bygramm pg1= new bygramm("pg");
        bygramm ph1= new bygramm("ph");
        bygramm pi1= new bygramm("pi");
        bygramm pj1= new bygramm("pj");
        bygramm pk1= new bygramm("pk");
        bygramm pl1= new bygramm("pl");
        bygramm pm1= new bygramm("pm");
        bygramm pn1= new bygramm("pn");
        bygramm po1= new bygramm("po");
        bygramm pp1= new bygramm("pp");
        bygramm pq1= new bygramm("pq");
        bygramm pr1= new bygramm("pr");
        bygramm ps1= new bygramm("ps");
        bygramm pt1= new bygramm("pt");
        bygramm pu1= new bygramm("pu");
        bygramm pv1= new bygramm("pv");
        bygramm pw1= new bygramm("pw");
        bygramm px1= new bygramm("px");
        bygramm py1= new bygramm("py");
        bygramm pz1= new bygramm("pz");

        bygramm qa1= new bygramm("qa");
        bygramm qb1= new bygramm("qb");
        bygramm qc1= new bygramm("qc");
        bygramm qd1= new bygramm("qd");
        bygramm qe1= new bygramm("qe");
        bygramm qf1= new bygramm("qf");
        bygramm qg1= new bygramm("qg");
        bygramm qh1= new bygramm("qh");
        bygramm qi1= new bygramm("qi");
        bygramm qj1= new bygramm("qj");
        bygramm qk1= new bygramm("qk");
        bygramm ql1= new bygramm("ql");
        bygramm qm1= new bygramm("qm");
        bygramm qn1= new bygramm("qn");
        bygramm qo1= new bygramm("qo");
        bygramm qp1= new bygramm("qp");
        bygramm qq1= new bygramm("qq");
        bygramm qr1= new bygramm("qr");
        bygramm qs1= new bygramm("qs");
        bygramm qt1= new bygramm("qt");
        bygramm qu1= new bygramm("qu");
        bygramm qv1= new bygramm("qv");
        bygramm qw1= new bygramm("qw");
        bygramm qx1= new bygramm("qx");
        bygramm qy1= new bygramm("qy");
        bygramm qz1= new bygramm("qz");

        bygramm ra1= new bygramm("ra");
        bygramm rb1= new bygramm("rb");
        bygramm rc1= new bygramm("rc");
        bygramm rd1= new bygramm("rd");
        bygramm re1= new bygramm("re");
        bygramm rf1= new bygramm("rf");
        bygramm rg1= new bygramm("rg");
        bygramm rh1= new bygramm("rh");
        bygramm ri1= new bygramm("ri");
        bygramm rj1= new bygramm("rj");
        bygramm rk1= new bygramm("rk");
        bygramm rl1= new bygramm("rl");
        bygramm rm1= new bygramm("rm");
        bygramm rn1= new bygramm("rn");
        bygramm ro1= new bygramm("ro");
        bygramm rp1= new bygramm("rp");
        bygramm rq1= new bygramm("rq");
        bygramm rr1= new bygramm("rr");
        bygramm rs1= new bygramm("rs");
        bygramm rt1= new bygramm("rt");
        bygramm ru1= new bygramm("ru");
        bygramm rv1= new bygramm("rv");
        bygramm rw1= new bygramm("rw");
        bygramm rx1= new bygramm("rx");
        bygramm ry1= new bygramm("ry");
        bygramm rz1= new bygramm("rz");

        bygramm sa1= new bygramm("sa");
        bygramm sb1= new bygramm("sb");
        bygramm sc1= new bygramm("sc");
        bygramm sd1= new bygramm("sd");
        bygramm se1= new bygramm("se");
        bygramm sf1= new bygramm("sf");
        bygramm sg1= new bygramm("sg");
        bygramm sh1= new bygramm("sh");
        bygramm si1= new bygramm("si");
        bygramm sj1= new bygramm("sj");
        bygramm sk1= new bygramm("sk");
        bygramm sl1= new bygramm("sl");
        bygramm sm1= new bygramm("sm");
        bygramm sn1= new bygramm("sn");
        bygramm so1= new bygramm("so");
        bygramm sp1= new bygramm("sp");
        bygramm sq1= new bygramm("sq");
        bygramm sr1= new bygramm("sr");
        bygramm ss1= new bygramm("ss");
        bygramm st1= new bygramm("st");
        bygramm su1= new bygramm("su");
        bygramm sv1= new bygramm("sv");
        bygramm sw1= new bygramm("sw");
        bygramm sx1= new bygramm("sx");
        bygramm sy1= new bygramm("sy");
        bygramm sz1= new bygramm("sz");

        bygramm ta1= new bygramm("ta");
        bygramm tb1= new bygramm("tb");
        bygramm tc1= new bygramm("tc");
        bygramm td1= new bygramm("td");
        bygramm te1= new bygramm("te");
        bygramm tf1= new bygramm("tf");
        bygramm tg1= new bygramm("tg");
        bygramm th1= new bygramm("th");
        bygramm ti1= new bygramm("ti");
        bygramm tj1= new bygramm("tj");
        bygramm tk1= new bygramm("tk");
        bygramm tl1= new bygramm("tl");
        bygramm tm1= new bygramm("tm");
        bygramm tn1= new bygramm("tn");
        bygramm to1= new bygramm("to");
        bygramm tp1= new bygramm("tp");
        bygramm tq1= new bygramm("tq");
        bygramm tr1= new bygramm("tr");
        bygramm ts1= new bygramm("ts");
        bygramm tt1= new bygramm("tt");
        bygramm tu1= new bygramm("tu");
        bygramm tv1= new bygramm("tv");
        bygramm tw1= new bygramm("tw");
        bygramm tx1= new bygramm("tx");
        bygramm ty1= new bygramm("ty");
        bygramm tz1= new bygramm("tz");

        bygramm ua1= new bygramm("ua");
        bygramm ub1= new bygramm("ub");
        bygramm uc1= new bygramm("uc");
        bygramm ud1= new bygramm("ud");
        bygramm ue1= new bygramm("ue");
        bygramm uf1= new bygramm("uf");
        bygramm ug1= new bygramm("ug");
        bygramm uh1= new bygramm("uh");
        bygramm ui1= new bygramm("ui");
        bygramm uj1= new bygramm("uj");
        bygramm uk1= new bygramm("uk");
        bygramm ul1= new bygramm("ul");
        bygramm um1= new bygramm("um");
        bygramm un1= new bygramm("un");
        bygramm uo1= new bygramm("uo");
        bygramm up1= new bygramm("up");
        bygramm uq1= new bygramm("uq");
        bygramm ur1= new bygramm("ur");
        bygramm us1= new bygramm("us");
        bygramm ut1= new bygramm("ut");
        bygramm uu1= new bygramm("uu");
        bygramm uv1= new bygramm("uv");
        bygramm uw1= new bygramm("uw");
        bygramm ux1= new bygramm("ux");
        bygramm uy1= new bygramm("uy");
        bygramm uz1= new bygramm("uz");

        bygramm va1= new bygramm("va");
        bygramm vb1= new bygramm("vb");
        bygramm vc1= new bygramm("vc");
        bygramm vd1= new bygramm("vd");
        bygramm ve1= new bygramm("ve");
        bygramm vf1= new bygramm("vf");
        bygramm vg1= new bygramm("vg");
        bygramm vh1= new bygramm("vh");
        bygramm vi1= new bygramm("vi");
        bygramm vj1= new bygramm("vj");
        bygramm vk1= new bygramm("vk");
        bygramm vl1= new bygramm("vl");
        bygramm vm1= new bygramm("vm");
        bygramm vn1= new bygramm("vn");
        bygramm vo1= new bygramm("vo");
        bygramm vp1= new bygramm("vp");
        bygramm vq1= new bygramm("vq");
        bygramm vr1= new bygramm("vr");
        bygramm vs1= new bygramm("vs");
        bygramm vt1= new bygramm("vt");
        bygramm vu1= new bygramm("vu");
        bygramm vv1= new bygramm("vv");
        bygramm vw1= new bygramm("vw");
        bygramm vx1= new bygramm("vx");
        bygramm vy1= new bygramm("vy");
        bygramm vz1= new bygramm("vz");

        bygramm wa1= new bygramm("wa");
        bygramm wb1= new bygramm("wb");
        bygramm wc1= new bygramm("wc");
        bygramm wd1= new bygramm("wd");
        bygramm we1= new bygramm("we");
        bygramm wf1= new bygramm("wf");
        bygramm wg1= new bygramm("wg");
        bygramm wh1= new bygramm("wh");
        bygramm wi1= new bygramm("wi");
        bygramm wj1= new bygramm("wj");
        bygramm wk1= new bygramm("wk");
        bygramm wl1= new bygramm("wl");
        bygramm wm1= new bygramm("wm");
        bygramm wn1= new bygramm("wn");
        bygramm wo1= new bygramm("wo");
        bygramm wp1= new bygramm("wp");
        bygramm wq1= new bygramm("wq");
        bygramm wr1= new bygramm("wr");
        bygramm ws1= new bygramm("ws");
        bygramm wt1= new bygramm("wt");
        bygramm wu1= new bygramm("wu");
        bygramm wv1= new bygramm("wv");
        bygramm ww1= new bygramm("ww");
        bygramm wx1= new bygramm("wx");
        bygramm wy1= new bygramm("wy");
        bygramm wz1= new bygramm("wz");

        bygramm xa1= new bygramm("xa");
        bygramm xb1= new bygramm("xb");
        bygramm xc1= new bygramm("xc");
        bygramm xd1= new bygramm("xd");
        bygramm xe1= new bygramm("xe");
        bygramm xf1= new bygramm("xf");
        bygramm xg1= new bygramm("xg");
        bygramm xh1= new bygramm("xh");
        bygramm xi1= new bygramm("xi");
        bygramm xj1= new bygramm("xj");
        bygramm xk1= new bygramm("xk");
        bygramm xl1= new bygramm("xl");
        bygramm xm1= new bygramm("xm");
        bygramm xn1= new bygramm("xn");
        bygramm xo1= new bygramm("xo");
        bygramm xp1= new bygramm("xp");
        bygramm xq1= new bygramm("xq");
        bygramm xr1= new bygramm("xr");
        bygramm xs1= new bygramm("xs");
        bygramm xt1= new bygramm("xt");
        bygramm xu1= new bygramm("xu");
        bygramm xv1= new bygramm("xv");
        bygramm xw1= new bygramm("xw");
        bygramm xx1= new bygramm("xx");
        bygramm xy1= new bygramm("xy");
        bygramm xz1= new bygramm("xz");

        bygramm ya1= new bygramm("ya");
        bygramm yb1= new bygramm("yb");
        bygramm yc1= new bygramm("yc");
        bygramm yd1= new bygramm("yd");
        bygramm ye1= new bygramm("ye");
        bygramm yf1= new bygramm("yf");
        bygramm yg1= new bygramm("yg");
        bygramm yh1= new bygramm("yh");
        bygramm yi1= new bygramm("yi");
        bygramm yj1= new bygramm("yj");
        bygramm yk1= new bygramm("yk");
        bygramm yl1= new bygramm("yl");
        bygramm ym1= new bygramm("ym");
        bygramm yn1= new bygramm("yn");
        bygramm yo1= new bygramm("yo");
        bygramm yp1= new bygramm("yp");
        bygramm yq1= new bygramm("yq");
        bygramm yr1= new bygramm("yr");
        bygramm ys1= new bygramm("ys");
        bygramm yt1= new bygramm("yt");
        bygramm yu1= new bygramm("yu");
        bygramm yv1= new bygramm("yv");
        bygramm yw1= new bygramm("yw");
        bygramm yx1= new bygramm("yx");
        bygramm yy1= new bygramm("yy");
        bygramm yz1= new bygramm("yz");

        bygramm za1= new bygramm("za");
        bygramm zb1= new bygramm("zb");
        bygramm zc1= new bygramm("zc");
        bygramm zd1= new bygramm("zd");
        bygramm ze1= new bygramm("ze");
        bygramm zf1= new bygramm("zf");
        bygramm zg1= new bygramm("zg");
        bygramm zh1= new bygramm("zh");
        bygramm zi1= new bygramm("zi");
        bygramm zj1= new bygramm("zj");
        bygramm zk1= new bygramm("zk");
        bygramm zl1= new bygramm("zl");
        bygramm zm1= new bygramm("zm");
        bygramm zn1= new bygramm("zn");
        bygramm zo1= new bygramm("zo");
        bygramm zp1= new bygramm("zp");
        bygramm zq1= new bygramm("zq");
        bygramm zr1= new bygramm("zr");
        bygramm zs1= new bygramm("zs");
        bygramm zt1= new bygramm("zt");
        bygramm zu1= new bygramm("zu");
        bygramm zv1= new bygramm("zv");
        bygramm zw1= new bygramm("zw");
        bygramm zx1= new bygramm("zx");
        bygramm zy1= new bygramm("zy");
        bygramm zz1= new bygramm("zz");

        bygramm[] bym1;
        bym1=new bygramm[676]; //алфавит биграмм фрагмента текста
        bym1[0]=aa1;
        bym1[1]=ab1;
        bym1[2]=ac1;
        bym1[3]=ad1;
        bym1[4]=ae1;
        bym1[5]=af1;
        bym1[6]=ag1;
        bym1[7]=ah1;
        bym1[8]=ai1;
        bym1[9]=aj1;
        bym1[10]=ak1;
        bym1[11]=al1;
        bym1[12]=am1;
        bym1[13]=an1;
        bym1[14]=ao1;
        bym1[15]=ap1;
        bym1[16]=aq1;
        bym1[17]=ar1;
        bym1[18]=as1;
        bym1[19]=at1;
        bym1[20]=au1;
        bym1[21]=av1;
        bym1[22]=aw1;
        bym1[23]=ax1;
        bym1[24]=ay1;
        bym1[25]=az1;

        bym1[26]=ba1;
        bym1[27]=bb1;
        bym1[28]=bc1;
        bym1[29]=bd1;
        bym1[30]=be1;
        bym1[31]=bf1;
        bym1[32]=bg1;
        bym1[33]=bh1;
        bym1[34]=bi1;
        bym1[35]=bj1;
        bym1[36]=bk1;
        bym1[37]=bl1;
        bym1[38]=bm1;
        bym1[39]=bn1;
        bym1[40]=bo1;
        bym1[41]=bp1;
        bym1[42]=bq1;
        bym1[43]=br1;
        bym1[44]=bs1;
        bym1[45]=bt1;
        bym1[46]=bu1;
        bym1[47]=bv1;
        bym1[48]=bw1;
        bym1[49]=bx1;
        bym1[50]=by1;
        bym1[51]=bz1;

        bym1[52]=ca1;
        bym1[53]=cb1;
        bym1[54]=cc1;
        bym1[55]=cd1;
        bym1[56]=ce1;
        bym1[57]=cf1;
        bym1[58]=cg1;
        bym1[59]=ch1;
        bym1[60]=ci1;
        bym1[61]=cj1;
        bym1[62]=ck1;
        bym1[63]=cl1;
        bym1[64]=cm1;
        bym1[65]=cn1;
        bym1[66]=co1;
        bym1[67]=cp1;
        bym1[68]=cq1;
        bym1[69]=cr1;
        bym1[70]=cs1;
        bym1[71]=ct1;
        bym1[72]=cu1;
        bym1[73]=cv1;
        bym1[74]=cw1;
        bym1[75]=cx1;
        bym1[76]=cy1;
        bym1[77]=cz1;

        bym1[78]=da1;
        bym1[79]=db1;
        bym1[80]=dc1;
        bym1[81]=dd1;
        bym1[82]=de1;
        bym1[83]=df1;
        bym1[84]=dg1;
        bym1[85]=dh1;
        bym1[86]=di1;
        bym1[87]=dj1;
        bym1[88]=dk1;
        bym1[89]=dl1;
        bym1[90]=dm1;
        bym1[91]=dn1;
        bym1[92]=do1;
        bym1[93]=dp1;
        bym1[94]=dq1;
        bym1[95]=dr1;
        bym1[96]=ds1;
        bym1[97]=dt1;
        bym1[98]=du1;
        bym1[99]=dv1;
        bym1[100]=dw1;
        bym1[101]=dx1;
        bym1[102]=dy1;
        bym1[103]=dz1;

        bym1[104]=ea1;
        bym1[105]=eb1;
        bym1[106]=ec1;
        bym1[107]=ed1;
        bym1[108]=ee1;
        bym1[109]=ef1;
        bym1[110]=eg1;
        bym1[111]=eh1;
        bym1[112]=ei1;
        bym1[113]=ej1;
        bym1[114]=ek1;
        bym1[115]=el1;
        bym1[116]=em1;
        bym1[117]=en1;
        bym1[118]=eo1;
        bym1[119]=ep1;
        bym1[120]=eq1;
        bym1[121]=er1;
        bym1[122]=es1;
        bym1[123]=et1;
        bym1[124]=eu1;
        bym1[125]=ev1;
        bym1[126]=ew1;
        bym1[127]=ex1;
        bym1[128]=ey1;
        bym1[129]=ez1;

        bym1[130]=fa1;
        bym1[131]=fb1;
        bym1[132]=fc1;
        bym1[133]=fd1;
        bym1[134]=fe1;
        bym1[135]=ff1;
        bym1[136]=fg1;
        bym1[137]=fh1;
        bym1[138]=fi1;
        bym1[139]=fj1;
        bym1[140]=fk1;
        bym1[141]=fl1;
        bym1[142]=fm1;
        bym1[143]=fn1;
        bym1[144]=fo1;
        bym1[145]=fp1;
        bym1[146]=fq1;
        bym1[147]=fr1;
        bym1[148]=fs1;
        bym1[149]=ft1;
        bym1[150]=fu1;
        bym1[151]=fv1;
        bym1[152]=fw1;
        bym1[153]=fx1;
        bym1[154]=fy1;
        bym1[155]=fz1;

        bym1[156]=ga1;
        bym1[157]=gb1;
        bym1[158]=gc1;
        bym1[159]=gd1;
        bym1[160]=ge1;
        bym1[161]=gf1;
        bym1[162]=gg1;
        bym1[163]=gh1;
        bym1[164]=gi1;
        bym1[165]=gj1;
        bym1[166]=gk1;
        bym1[167]=gl1;
        bym1[168]=gm1;
        bym1[169]=gn1;
        bym1[170]=go1;
        bym1[171]=gp1;
        bym1[172]=gq1;
        bym1[173]=gr1;
        bym1[174]=gs1;
        bym1[175]=gt1;
        bym1[176]=gu1;
        bym1[177]=gv1;
        bym1[178]=gw1;
        bym1[179]=gx1;
        bym1[180]=gy1;
        bym1[181]=gz1;

        bym1[182]=ha1;
        bym1[183]=hb1;
        bym1[184]=hc1;
        bym1[185]=hd1;
        bym1[186]=he1;
        bym1[187]=hf1;
        bym1[188]=hg1;
        bym1[189]=hh1;
        bym1[190]=hi1;
        bym1[191]=hj1;
        bym1[192]=hk1;
        bym1[193]=hl1;
        bym1[194]=hm1;
        bym1[195]=hn1;
        bym1[196]=ho1;
        bym1[197]=hp1;
        bym1[198]=hq1;
        bym1[199]=hr1;
        bym1[200]=hs1;
        bym1[201]=ht1;
        bym1[202]=hu1;
        bym1[203]=hv1;
        bym1[204]=hw1;
        bym1[205]=hx1;
        bym1[206]=hy1;
        bym1[207]=hz1;

        bym1[208]=ia1;
        bym1[209]=ib1;
        bym1[210]=ic1;
        bym1[211]=id1;
        bym1[212]=ie1;
        bym1[213]=if1;
        bym1[214]=ig1;
        bym1[215]=ih1;
        bym1[216]=ii1;
        bym1[217]=ij1;
        bym1[218]=ik1;
        bym1[219]=il1;
        bym1[220]=im1;
        bym1[221]=in1;
        bym1[222]=io1;
        bym1[223]=ip1;
        bym1[224]=iq1;
        bym1[225]=ir1;
        bym1[226]=is1;
        bym1[227]=it1;
        bym1[228]=iu1;
        bym1[229]=iv1;
        bym1[230]=iw1;
        bym1[231]=ix1;
        bym1[232]=iy1;
        bym1[233]=iz1;

        bym1[234]=ja1;
        bym1[235]=jb1;
        bym1[236]=jc1;
        bym1[237]=jd1;
        bym1[238]=je1;
        bym1[239]=jf1;
        bym1[240]=jg1;
        bym1[241]=jh1;
        bym1[242]=ji1;
        bym1[243]=jj1;
        bym1[244]=jk1;
        bym1[245]=jl1;
        bym1[246]=jm1;
        bym1[247]=jn1;
        bym1[248]=jo1;
        bym1[249]=jp1;
        bym1[250]=jq1;
        bym1[251]=jr1;
        bym1[252]=js1;
        bym1[253]=jt1;
        bym1[254]=ju1;
        bym1[255]=jv1;
        bym1[256]=jw1;
        bym1[257]=jx1;
        bym1[258]=jy1;
        bym1[259]=jz1;

        bym1[260]=ka1;
        bym1[261]=kb1;
        bym1[262]=kc1;
        bym1[263]=kd1;
        bym1[264]=ke1;
        bym1[265]=kf1;
        bym1[266]=kg1;
        bym1[267]=kh1;
        bym1[268]=ki1;
        bym1[269]=kj1;
        bym1[270]=kk1;
        bym1[271]=kl1;
        bym1[272]=km1;
        bym1[273]=kn1;
        bym1[274]=ko1;
        bym1[275]=kp1;
        bym1[276]=kq1;
        bym1[277]=kr1;
        bym1[278]=ks1;
        bym1[279]=kt1;
        bym1[280]=ku1;
        bym1[281]=kv1;
        bym1[282]=kw1;
        bym1[283]=kx1;
        bym1[284]=ky1;
        bym1[285]=kz1;

        bym1[286]=la1;
        bym1[287]=lb1;
        bym1[288]=lc1;
        bym1[289]=ld1;
        bym1[290]=le1;
        bym1[291]=lf1;
        bym1[292]=lg1;
        bym1[293]=lh1;
        bym1[294]=li1;
        bym1[295]=lj1;
        bym1[296]=lk1;
        bym1[297]=ll1;
        bym1[298]=lm1;
        bym1[299]=ln1;
        bym1[300]=lo1;
        bym1[301]=lp1;
        bym1[302]=lq1;
        bym1[303]=lr1;
        bym1[304]=ls1;
        bym1[305]=lt1;
        bym1[306]=lu1;
        bym1[307]=lv1;
        bym1[308]=lw1;
        bym1[309]=lx1;
        bym1[310]=ly1;
        bym1[311]=lz1;

        bym1[312]=ma1;
        bym1[313]=mb1;
        bym1[314]=mc1;
        bym1[315]=md1;
        bym1[316]=me1;
        bym1[317]=mf1;
        bym1[318]=mg1;
        bym1[319]=mh1;
        bym1[320]=mi1;
        bym1[321]=mj1;
        bym1[322]=mk1;
        bym1[323]=ml1;
        bym1[324]=mm1;
        bym1[325]=mn1;
        bym1[326]=mo1;
        bym1[327]=mp1;
        bym1[328]=mq1;
        bym1[329]=mr1;
        bym1[330]=ms1;
        bym1[331]=mt1;
        bym1[332]=mu1;
        bym1[333]=mv1;
        bym1[334]=mw1;
        bym1[335]=mx1;
        bym1[336]=my1;
        bym1[337]=mz1;

        bym1[338]=na1;
        bym1[339]=nb1;
        bym1[340]=nc1;
        bym1[341]=nd1;
        bym1[342]=ne1;
        bym1[343]=nf1;
        bym1[344]=ng1;
        bym1[345]=nh1;
        bym1[346]=ni1;
        bym1[347]=nj1;
        bym1[348]=nk1;
        bym1[349]=nl1;
        bym1[350]=nm1;
        bym1[351]=nn1;
        bym1[352]=no1;
        bym1[353]=np1;
        bym1[354]=nq1;
        bym1[355]=nr1;
        bym1[356]=ns1;
        bym1[357]=nt1;
        bym1[358]=nu1;
        bym1[359]=nv1;
        bym1[360]=nw1;
        bym1[361]=nx1;
        bym1[362]=ny1;
        bym1[363]=nz1;

        bym1[364]=oa1;
        bym1[365]=ob1;
        bym1[366]=oc1;
        bym1[367]=od1;
        bym1[368]=oe1;
        bym1[369]=of1;
        bym1[370]=og1;
        bym1[371]=oh1;
        bym1[372]=oi1;
        bym1[373]=oj1;
        bym1[374]=ok1;
        bym1[375]=ol1;
        bym1[376]=om1;
        bym1[377]=on1;
        bym1[378]=oo1;
        bym1[379]=op1;
        bym1[380]=oq1;
        bym1[381]=or1;
        bym1[382]=os1;
        bym1[383]=ot1;
        bym1[384]=ou1;
        bym1[385]=ov1;
        bym1[386]=ow1;
        bym1[387]=ox1;
        bym1[388]=oy1;
        bym1[389]=oz1;

        bym1[390]=pa1;
        bym1[391]=pb1;
        bym1[392]=pc1;
        bym1[393]=pd1;
        bym1[394]=pe1;
        bym1[395]=pf1;
        bym1[396]=pg1;
        bym1[397]=ph1;
        bym1[398]=pi1;
        bym1[399]=pj1;
        bym1[400]=pk1;
        bym1[401]=pl1;
        bym1[402]=pm1;
        bym1[403]=pn1;
        bym1[404]=po1;
        bym1[405]=pp1;
        bym1[406]=pq1;
        bym1[407]=pr1;
        bym1[408]=ps1;
        bym1[409]=pt1;
        bym1[410]=pu1;
        bym1[411]=pv1;
        bym1[412]=pw1;
        bym1[413]=px1;
        bym1[414]=py1;
        bym1[415]=pz1;

        bym1[416]=qa1;
        bym1[417]=qb1;
        bym1[418]=qc1;
        bym1[419]=qd1;
        bym1[420]=qe1;
        bym1[421]=qf1;
        bym1[422]=qg1;
        bym1[423]=qh1;
        bym1[424]=qi1;
        bym1[425]=qj1;
        bym1[426]=qk1;
        bym1[427]=ql1;
        bym1[428]=qm1;
        bym1[429]=qn1;
        bym1[430]=qo1;
        bym1[431]=qp1;
        bym1[432]=qq1;
        bym1[433]=qr1;
        bym1[434]=qs1;
        bym1[435]=qt1;
        bym1[436]=qu1;
        bym1[437]=qv1;
        bym1[438]=qw1;
        bym1[439]=qx1;
        bym1[440]=qy1;
        bym1[441]=qz1;

        bym1[442]=ra1;
        bym1[443]=rb1;
        bym1[444]=rc1;
        bym1[445]=rd1;
        bym1[446]=re1;
        bym1[447]=rf1;
        bym1[448]=rg1;
        bym1[449]=rh1;
        bym1[450]=ri1;
        bym1[451]=rj1;
        bym1[452]=rk1;
        bym1[453]=rl1;
        bym1[454]=rm1;
        bym1[455]=rn1;
        bym1[456]=ro1;
        bym1[457]=rp1;
        bym1[458]=rq1;
        bym1[459]=rr1;
        bym1[460]=rs1;
        bym1[461]=rt1;
        bym1[462]=ru1;
        bym1[463]=rv1;
        bym1[464]=rw1;
        bym1[465]=rx1;
        bym1[466]=ry1;
        bym1[467]=rz1;

        bym1[468]=sa1;
        bym1[469]=sb1;
        bym1[470]=sc1;
        bym1[471]=sd1;
        bym1[472]=se1;
        bym1[473]=sf1;
        bym1[474]=sg1;
        bym1[475]=sh1;
        bym1[476]=si1;
        bym1[477]=sj1;
        bym1[478]=sk1;
        bym1[479]=sl1;
        bym1[480]=sm1;
        bym1[481]=sn1;
        bym1[482]=so1;
        bym1[483]=sp1;
        bym1[484]=sq1;
        bym1[485]=sr1;
        bym1[486]=ss1;
        bym1[487]=st1;
        bym1[488]=su1;
        bym1[489]=sv1;
        bym1[490]=sw1;
        bym1[491]=sx1;
        bym1[492]=sy1;
        bym1[493]=sz1;

        bym1[494]=ta1;
        bym1[495]=tb1;
        bym1[496]=tc1;
        bym1[497]=td1;
        bym1[498]=te1;
        bym1[499]=tf1;
        bym1[500]=tg1;
        bym1[501]=th1;
        bym1[502]=ti1;
        bym1[503]=tj1;
        bym1[504]=tk1;
        bym1[505]=tl1;
        bym1[506]=tm1;
        bym1[507]=tn1;
        bym1[508]=to1;
        bym1[509]=tp1;
        bym1[510]=tq1;
        bym1[511]=tr1;
        bym1[512]=ts1;
        bym1[513]=tt1;
        bym1[514]=tu1;
        bym1[515]=tv1;
        bym1[516]=tw1;
        bym1[517]=tx1;
        bym1[518]=ty1;
        bym1[519]=tz1;

        bym1[520]=ua1;
        bym1[521]=ub1;
        bym1[522]=uc1;
        bym1[523]=ud1;
        bym1[524]=ue1;
        bym1[525]=uf1;
        bym1[526]=ug1;
        bym1[527]=uh1;
        bym1[528]=ui1;
        bym1[529]=uj1;
        bym1[530]=uk1;
        bym1[531]=ul1;
        bym1[532]=um1;
        bym1[533]=un1;
        bym1[534]=uo1;
        bym1[535]=up1;
        bym1[536]=uq1;
        bym1[537]=ur1;
        bym1[538]=us1;
        bym1[539]=ut1;
        bym1[540]=uu1;
        bym1[541]=uv1;
        bym1[542]=uw1;
        bym1[543]=ux1;
        bym1[544]=uy1;
        bym1[545]=uz1;

        bym1[546]=va1;
        bym1[547]=vb1;
        bym1[548]=vc1;
        bym1[549]=vd1;
        bym1[550]=ve1;
        bym1[551]=vf1;
        bym1[552]=vg1;
        bym1[553]=vh1;
        bym1[554]=vi1;
        bym1[555]=vj1;
        bym1[556]=vk1;
        bym1[557]=vl1;
        bym1[558]=vm1;
        bym1[559]=vn1;
        bym1[560]=vo1;
        bym1[561]=vp1;
        bym1[562]=vq1;
        bym1[563]=vr1;
        bym1[564]=vs1;
        bym1[565]=vt1;
        bym1[566]=vu1;
        bym1[567]=vv1;
        bym1[568]=vw1;
        bym1[569]=vx1;
        bym1[570]=vy1;
        bym1[571]=vz1;

        bym1[572]=wa1;
        bym1[573]=wb1;
        bym1[574]=wc1;
        bym1[575]=wd1;
        bym1[576]=we1;
        bym1[577]=wf1;
        bym1[578]=wg1;
        bym1[579]=wh1;
        bym1[580]=wi1;
        bym1[581]=wj1;
        bym1[582]=wk1;
        bym1[583]=wl1;
        bym1[584]=wm1;
        bym1[585]=wn1;
        bym1[586]=wo1;
        bym1[587]=wp1;
        bym1[588]=wq1;
        bym1[589]=wr1;
        bym1[590]=ws1;
        bym1[591]=wt1;
        bym1[592]=wu1;
        bym1[593]=wv1;
        bym1[594]=ww1;
        bym1[595]=wx1;
        bym1[596]=wy1;
        bym1[597]=wz1;

        bym1[598]=xa1;
        bym1[599]=xb1;
        bym1[600]=xc1;
        bym1[601]=xd1;
        bym1[602]=xe1;
        bym1[603]=xf1;
        bym1[604]=xg1;
        bym1[605]=xh1;
        bym1[606]=xi1;
        bym1[607]=xj1;
        bym1[608]=xk1;
        bym1[609]=xl1;
        bym1[610]=xm1;
        bym1[611]=xn1;
        bym1[612]=xo1;
        bym1[613]=xp1;
        bym1[614]=xq1;
        bym1[615]=xr1;
        bym1[616]=xs1;
        bym1[617]=xt1;
        bym1[618]=xu1;
        bym1[619]=xv1;
        bym1[620]=xw1;
        bym1[621]=xx1;
        bym1[622]=xy1;
        bym1[623]=xz1;

        bym1[624]=ya1;
        bym1[625]=yb1;
        bym1[626]=yc1;
        bym1[627]=yd1;
        bym1[628]=ye1;
        bym1[629]=yf1;
        bym1[630]=yg1;
        bym1[631]=yh1;
        bym1[632]=yi1;
        bym1[633]=yj1;
        bym1[634]=yk1;
        bym1[635]=yl1;
        bym1[636]=ym1;
        bym1[637]=yn1;
        bym1[638]=yo1;
        bym1[639]=yp1;
        bym1[640]=yq1;
        bym1[641]=yr1;
        bym1[642]=ys1;
        bym1[643]=yt1;
        bym1[644]=yu1;
        bym1[645]=yv1;
        bym1[646]=yw1;
        bym1[647]=yx1;
        bym1[648]=yy1;
        bym1[649]=yz1;

        bym1[650]=za1;
        bym1[651]=zb1;
        bym1[652]=zc1;
        bym1[653]=zd1;
        bym1[654]=ze1;
        bym1[655]=zf1;
        bym1[656]=zg1;
        bym1[657]=zh1;
        bym1[658]=zi1;
        bym1[659]=zj1;
        bym1[660]=zk1;
        bym1[661]=zl1;
        bym1[662]=zm1;
        bym1[663]=zn1;
        bym1[664]=zo1;
        bym1[665]=zp1;
        bym1[666]=zq1;
        bym1[667]=zr1;
        bym1[668]=zs1;
        bym1[669]=zt1;
        bym1[670]=zu1;
        bym1[671]=zv1;
        bym1[672]=zw1;
        bym1[673]=zx1;
        bym1[674]=zy1;
        bym1[675]=zz1;
        int allb1=0; //общее количество сочетаний букв в тексте


        //подсчет количества употребления для каждой биграммы
        int cros1=0;
        for(int ind=0;ind<=25;ind++){
            for(int ind1=0;ind1<=25;ind1++){
                for (int ind2=0;ind2<((newtext.length())-1);ind2++) {
                    char chars = new1text.charAt(ind2);
                    char chars1 = new1text.charAt(ind2 + 1);
                    String str=String.valueOf(alf4[ind].getname());
                    String srt=str.toUpperCase();
                    char ch2 = srt.charAt(0);
                    String str1=String.valueOf(alf4[ind1].getname());
                    String srt1=str1.toUpperCase();
                    char ch3 = srt1.charAt(0);
                    if ((chars == ch2 | chars == alf4[ind].getname()) & (chars1 == ch3 | chars1 == alf4[ind1].getname())) {
                        bym1[cros1].setkolvo();
                        allb1++;
                    }
                }
                cros1++;
            }
        }
        //подсчет частот биграмм зашифрованного фрагмента текста

        for (int ind=0;ind<=675;ind++){
            bym1[ind].setggz(allb1);
        }
        //вывод частотной таблицы биграмм зашифрованного фрагмента текста
        System.out.print("\nFragment bygramm table:\n");
        for (int ind=0;ind<=675;ind++) {
            if(bym1[ind].getggz()!=0) {
                System.out.print(bym1[ind].getname() + "=" + bym1[ind].getggz() + "\n");
            }
        }


        //сравнение частотныых таблиц биграмм(comparison bygramm)
        //упорядочивание таблицы частот биграмм полного текста
        for(int ind=0;ind<=674;ind++){
            for(int ind1=0;ind1<=674;ind1++){
                if(bym[ind1].getggz()<bym[ind1+1].getggz()){
                    bygramm res=bym[ind1+1];
                    bym[ind1+1]=bym[ind1];
                    bym[ind1]=res;
                }
            }
        }
        //упорядочивание таблицы частот биграмм зашифрованного фрагмента текста
        for(int ind=0;ind<=674;ind++){
            for(int ind1=0;ind1<=674;ind1++){
                if(bym1[ind1].getggz()<bym1[ind1+1].getggz()){
                    bygramm res=bym1[ind1+1];
                    bym1[ind1+1]=bym1[ind1];
                    bym1[ind1]=res;
                }
            }
        }

        //вывод сравнительной таблицы(при выводе таблицы происходит проверка правильности расшифровки,при верном совпадении букв ставится знак "v")
        System.out.print("\n\n\n\n comparison(сравнение):\n");
        for(int ind=0;ind<=(675);ind++) {

            System.out.print(bym[ind].getname() + "=" + bym[ind].getggz() + "  " + bym1[ind].getname() + "=" + bym1[ind].getggz());
            StringBuffer getname1=bym[ind].getname();
            StringBuffer getname2=bym1[ind].getname();
            char chars11 = getname1.charAt(0);
            char chars12 = getname1.charAt(1);
            char chars21 = getname2.charAt(0);
            char chars22 = getname2.charAt(1);
            if ((chars11==chars21-1 | (chars11=='z' & chars21=='a')) & (chars12==chars22-1 | (chars11=='z' & chars21=='a'))){
                System.out.print("  v");
            }

            System.out.print("\n");

        }

    }
}