package Dao;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月23日 下午8:17:40 类说明
 */
public class Test {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User(113, "B");
		User user2 = new User(112, "C");
		User user3 = new User(114, "D");
		Dao<T> dao = new Dao<T>();
		dao.save("1", (T) "A");
		dao.save("2", (T) user1);
		dao.save("4", (T) user2);
		dao.save("3", (T) user3);
		System.out.println(dao);

		System.out.println(dao.get("1"));

		dao.update("1", (T) user3);
		System.out.println(dao);

		System.out.println(dao.list());

		dao.delete("1");
		System.out.println(dao);

	}

}
