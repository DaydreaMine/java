package Triangle;
/**
* @author DaydreaminE
* @version 创建时间：2020年3月17日 下午6:01:12
* 类说明
*/
public class TriangleTest {

	public static void main(String[] args) throws TriangleException {
		// TODO Auto-generated method stub
		int a =4;int b =3; int c =5;
		isTriangle(a, b, c);

	}

	public static void isTriangle(int a,int b,int c)throws TriangleException {
		if(Math.pow(a,2)+Math.pow(b,2)!=Math.pow(c,2)
				&&Math.pow(c,2)+Math.pow(b,2)!=Math.pow(a,2)
				&&Math.pow(a,2)+Math.pow(c,2)!=Math.pow(b,2)) {
			throw new TriangleException("不能构成三角形");
		}else {
			System.out.println("三个整数是"+a+","+b+","+c);
		}
	}
}
