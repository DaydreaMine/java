package Elephant;

public class ElephantVoid {

	public static Elephant[] elephant = new Elephant[10];
	private static int num = 0;// 大象数量
	private static double avg = 0;//


	 public static  void  set_Num(Elephant  per){
	      elephant[num]=per;
	      num++;
	    }


	public static  void set_avg(double num) {
		double sum = 0;
		for (int i = 0; i < num; i++) {
			sum += elephant[i].get_Height();
		}
		avg = sum / num;
	}
	
	public static int get_Num() {
		return num;
	}
	
	public static double get_Avg() {
		return avg;
	}

		
	}



