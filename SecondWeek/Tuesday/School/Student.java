package School;
/*现有
学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
要求:
其中一个学生（有6个）登录账号进行考试,在控制台随机显示10个题目,并且输入题目的正确答案才会有分数,
每题10分,现在有30个题目(题目自己出,不做要求)。
求学生考完试在控制台最终得到的分数
*/
public class Student {

	private int stuNum;
    private String stuName;
	private String stuGrade;
	private int stuScore;
	
	public Student(int stuNum,String stuName,String stuGrade) {
		this.stuNum=stuNum;
		this.stuName=stuName;
		this.stuGrade=stuGrade;
	}
	
	public void set_stuNum(int stuNum) {
		this.stuNum=stuNum;
	}
	public void set_stuGrade(String stuGrade) {
		this.stuGrade=stuGrade;
	}
	public void set_stuName(String stuName) {
		this.stuName=stuName;
	}

	public void set_stuScore(int stuScore) {
		this.stuScore=stuScore;
	}
	
	public int get_stuNum(){
		return stuNum;
	}
	
	public String get_stuName() {
		return stuName;
	}
	
	public int get_stuScore() {
		return stuScore;
	}
	
	public String get_stugrade() {
		return stuGrade;
		
	}
}
