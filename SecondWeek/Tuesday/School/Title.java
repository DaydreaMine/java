package School;
/*现有
学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
要求:
其中一个学生（有6个）登录账号进行考试,在控制台随机显示10个题目,并且输入题目的正确答案才会有分数,
每题10分,现在有30个题目(题目自己出,不做要求)。
求学生考完试在控制台最终得到的分数
*/

public class Title {

	private int number;
	private String title;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String answer;
	
	public Title(int number,String Title,String answerA,String answerB,String answerC,String answerD,String answer) {}

	public void set_number(int number) {
		this.number = number;
	}

	public void set_title(String title) {
		this.title = title;
	}

	public void set_answerA(String answerA) {
		this.answerA = answerA;
	}

	public void set_answerB(String answerB) {
		this.answerB = answerB;
	}

	public void set_answerC(String answerC) {
		this.answerC = answerC;
	}

	public void set_answerD(String answerD) {
		this.answerD = answerD;
	}

	public void set_answer(String answer) {
		this.answer = answer;
	}

	public String get_title() {
		return this.title;
	}

	public String get_answerA() {
		return this.answerA;
	}

	public int get_number() {
		return this.number;
	}

	public String get_answerB() {
		return this.answerB;
	}

	public String get_answerC() {
		return this.answerC;
	}

	public String get_answerD() {
		return this.answerD;
	}

	public String get_answer() {
		return answer;
	}

	
	
	
	
}
