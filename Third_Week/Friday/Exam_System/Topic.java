package Exam_System;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月21日 下午3:19:48 类说明
 */
public class Topic {

	private int TopicNum;
	private String TopicName;
	private String answerA = "A";
	private String answerB = "B";
	private String answerC = "C";
	private String answerD = "D";
	private String answer;

	public Topic(int topicNum, String topicName, String answerA, String answerB, String answerC, String answerD,
			String answer) {
		super();
		TopicNum = topicNum;
		TopicName = topicName;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answer = answer;
	}

	public Topic(int topicNum, String topicName) {
		super();
		TopicNum = topicNum;
		TopicName = topicName;
	}

	public int getTopicNum() {
		return TopicNum;
	}

	public void setTopicNum(int topicNum) {
		TopicNum = topicNum;
	}

	public String getTopicName() {
		return TopicName;
	}

	public void setTopicName(String topicName) {
		TopicName = topicName;
	}

	public String getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Topic [TopicNum=" + TopicNum + ", TopicName=" + TopicName + ", answerA=" + answerA + ", answerB="
				+ answerB + ", answerC=" + answerC + ", answerD=" + answerD ;
	}

}
