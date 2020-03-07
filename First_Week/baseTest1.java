
        3.10011101  转换成八进制  和十六进制
        235  9D

        6.
        short price = ...; // 先计算出原价
        short realPrice = price * 8 / 10; //再计算出打折之后的价格

        问：这段代码是否正确？
        如果正确，假设price  为100 ，那计算之后的
        realPrice值为多少？如果不正确，应该怎么改正？
        不正确 short realPrice =(short)price*8/10;

        7.找错
        void public main(){   //publice void main(String[] args)

        int i=1,j;

        float f1=0.1;
        float f2=123;
        long  l1=123141L,l2=88888888888;   //l2定值超出范围
        double d1=2e20,d2=124;
        byte b1=1,b2=2,b3=129;
        j=j+10;
        i=i/10;
        i=i*0.1;

        char c1='a',c2=125;

        byte b=b1-b2;

        char c=c1+c2-1;
        float f3=f1+f2;

        float f4=f1+f2*0.1;

        double d=d1*i+j;

        float f=(float)(d1*5+d2);

        }

        8.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
        int   a=2;
        int  b=3;
        int  c=a;
        a=b;
        b=c;

        a=a+b;
        b=a-b;
        a=a-b;

        a=a^b;
        b=a^b;
        a=a^b;

        9.写出下列变量a和b的运算结果。

        int a = 9 / 3;

        int b = 9 % 2;

        a=3;
        b=1;

        10.判断代码是否有错误，如有，请修改。

        float a = 2.1;           //float a =(float)2.1

        float b = (double)20.9;  //double b=20.9;

        int b3 = 210.9f +2.51;  //double b3=210.9f+2.51;

        int b4 = (int)20.9 + (int)2.51;

        12.Task5

        13.java的命名规范
        类名：首字母大写，如果2个单词或以上则每个单词首字母大写,不能以关键字,八大数据类型修饰符命名.




















