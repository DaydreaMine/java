package Number;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月23日 下午8:52:33
* 类说明
*/

import java.util.ArrayList;
import java.util.List;

public class Array<T extends Number> {

	private T[] array;

	public Array(T[] array) {
		super();
		this.array = array;
	}

	public Array() {
		super();
	}

	public void min() {
		T min = this.array[0];
		for (int i = 1; i < array.length; i++) {
			if (array.toString().compareTo(min.toString()) < 0) {
				min = array[i];
			}
		}
		System.out.println("最小值：" + min);
	}

	public void max() {
		T max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array.toString().compareTo(max.toString()) > 0) {
				max = array[i];
			}
		}
		System.out.println("最大值：" + max);
	}

	public void avg() {
		double avg =  0;
		double num =0;
		for (int i = 0; i < array.length; i++) {
			num += array[i].doubleValue();
		}
		avg=num/array.length;
		System.out.println("平均值："+avg);
	}

	
}
