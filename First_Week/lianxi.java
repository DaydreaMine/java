  1.
int a = 10;
    int b = 10;
    int c = 10;
    a = b++;    
    c = --a;    
    b = ++a;    
    a = c--;    
System.out.println("a="+a+",b="+b+",c="+c);
求出a  b  c的值

a=9 b=10 c=8

2.
int x = 4;
    int y =(x++)+(++x)+(x*10);
System.out.println("x="+x+",y="+y);        
求出x  y的值

x=6 y=70;

3
byte b = 10;
b++;          
b = b + 1;   
b=b+1;不兼容，左边byte型，右边int型

4.
public static void main(String[] args) {
          int i = 0;
          test(i);
          i = ++i;
         System.out.println("----" + i); //i=2
         i = i++;
         System.out.println("****" + i);  //i=2       
     }
     
     public static void test(int i){
         i++;
         System.out.println("++++" + i);  //i=1
     }

5.int x = 5, y = 6, z;
   A.z = ++x + y++;
  B.z = ++x + x++;
   C.x = ++x + x++；
  D.z = x > y ? ++x : y++; 
输出ABCD题目中x、y、z的值
A.x=6,y=7,z=12;
B.x=6,y=6,z=12
C.x=6+6;
D.z=6,y=7,x=5


6. String a ="aa";  
int c = 555;  
String b = a+"bbb"+c;  
double d = 5.66600;  
int e = (int) d;  
int f = 3;  
double g = 3.53; 
float h = 1.7f;  
int i = 1;  
System.out.println(b); 
System.out.println(e);  
System.out.println( f/i );  
System.out.println( g/f);  
System.out.println( h/f );
System.out.println(  9.5<8 );  
System.out.println( (int)'a' +  (int)'z' );  
System.out.println("A~Z："+((int)'A')+"~"+((int)'Z'));  
System.out.println("'A' < 'a':"+('A' < 'a'));




