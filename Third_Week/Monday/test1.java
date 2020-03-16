import java.io.UnsupportedEncodingException;

public class test1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1.将 byte [] by={65,67,68,97,98,101} 转换成字符串输出, 将上诉字节数组 从指定的位置开始到结束转换成字符串输出
		byte[] by = { 65, 67, 68, 97, 98, 101 };
		String A = new String(by, 1, 5);
		System.out.println("换成字符串输出 " + A);
		//2.同样的自定义一个字符数组用字符串的方式输出
		byte[] B = { 91, 92, 93, 94, 95, 96, 97, 98, 99 };
		String C = new String(B, 2, 4);
		System.out.println("自定义一个字符数组用字符串的方式输出 "+C);
		// 3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
		String D = "abcdw";
		String E = "ABCDw";
		System.out.println("比较两个字符串是否相等"+D.equals(E));
		//  4."我是你的谁,我是你的剑" 判断是否包含 "剑"
		String F = "我是你的谁,我是你的剑";
		System.out.println("是否包含 "+F.contains("剑"));
		//5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾
		System.out.println("否以'我'开头 "+(F.indexOf("我",0)!=-1));
		System.out.println("是否以'剑'结尾 "+(F.indexOf("剑", 10)!=-1));
		//6.String   str=""和 String  str2=null; 判断他们是否为空
		String str = "";
		String str2 = null;
		System.out.println("str是否为空 "+str ==null);
		System.out.println("str2是否为空"+str2 == null);
		// 7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
		String G = "我是你的小宝贝";
		System.out.println(G.indexOf("我"));
		// 8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
		System.out.println("第一次出现的位置"+F.indexOf("你"));
		// 9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
		System.out.println("最后一次出现 '你' 的位置 "+F.lastIndexOf("你"));
		System.out.println("从第4个位置开始找第一次出现的'你'"+F.indexOf("你", 4));
		// 10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
		String H = F.substring(2, 10);
		String I = F.substring(3);
		System.out.println(H);
		System.out.println(I);
		// 11." 我是你的谁,我是你的剑 " 去除字符串左右空格
		String J  = " 我是你的谁,我是你的剑 ";
		System.out.println("去除空格后    1"+J.trim()+"1");
		//13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
		System.out.println("替换 "+F.replace("你", "哈"));
		// 14. 比较 "avabc" 和 "avab" 字符串
		String k = "avabc";
		String L = "avab";
		System.out.println("比较"+k.equalsIgnoreCase(L));
		//15. 将字符数组转换成 字符串输出
		char[] M = {'A','B','C'};
		String N = String.valueOf(M);
		System.out.println("将字符数组转换成 字符串输出 "+N);
		//16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
		byte[] P = { 65, 67, 68, 97, 98, 101,102 };
		String Q = new String(P,"GBK");
		byte[] R = Q.getBytes("GBK");
		String W = new String(R, "UTF-8");
		System.out.println("转换成字符串 "+Q);
		System.out.println("转换成字节数组 "+R);
		System.out.println("转换成字节数组 "+W);
	}
}
