package Sort;
import java.util.TreeSet;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月19日 下午9:38:02
* 类说明
*/
public class Sorttest{
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet treeSet = new TreeSet();
		treeSet.add(new Sort("apple"));
		treeSet.add(new Sort("grape"));
		treeSet.add(new Sort("banana"));
		treeSet.add(new Sort("pear"));
		for (Object obj : treeSet) {
			Sort sort = (Sort)obj;
			System.out.println(sort);
		}
		
	}
}
