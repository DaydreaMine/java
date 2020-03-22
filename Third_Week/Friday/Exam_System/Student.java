package Exam_System;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月21日 下午3:16:46 类说明
 */
public class Student {
	private String name;
	private int StuId;
	private int StuPWD;
	private double StuScore;
	

	public Student() {
		super();
	}
	
	public Student(String name, int stuId, int stuPWD) {
		super();
		this.name = name;
		StuId = stuId;
		StuPWD = stuPWD;		
	}

	public Student(String name, int stuId, int stuPWD, double stuScore) {
		super();
		this.name = name;
		StuId = stuId;
		StuPWD = stuPWD;
		StuScore = stuScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuId() {
		return StuId;
	}

	public void setStuId(int stuId) {
		StuId = stuId;
	}

	public int getStuPWD() {
		return StuPWD;
	}

	public void setStuPWD(int stuPWD) {
		StuPWD = stuPWD;
	}

	public double getStuScore() {
		return StuScore;
	}

	public void setStuScore(double stuScore) {
		StuScore = stuScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", StuId=" + StuId + ", StuScore"+StuScore+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StuId;
		result = prime * result + StuPWD;
		long temp;
		temp = Double.doubleToLongBits(StuScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StuId != other.StuId)
			return false;
		if (StuPWD != other.StuPWD)
			return false;
		if (Double.doubleToLongBits(StuScore) != Double.doubleToLongBits(other.StuScore))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

}
