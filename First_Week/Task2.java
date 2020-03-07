import java.io.*;
import java.util.*;

class Task2 {

    public static void main(String[] args) {
		/*int[] a=new int[10];
		for (int i=0;i<10 ;i++ ) {
			System.out.println("输入一个数:");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			a[i]=num;
		}
		for (int b=0;b<10;b++ ) {
			for (int c=b+1;c<10 ;c++ ) {
				if(a[b]>a[c]){
					int temp=a[b];
					a[b]=a[c];
					a[c]=temp;
				}
			}
			System.out.println(a[b]);
		}
		

		for (int x=0;x<10;x++ ) {
			int sum=0;
			if(x!=9){
			if(a[x]!=a[x+1]){
			for (int y=0;y<10 ;y++ ) {
				if(a[x]==a[y]){
					sum++;
				}
			}
		}else{
			for(int y=0;y<10;y++){
				if(a[x]==a[y]){
					sum++;
				}
			}
		}
			System.out.println(a[x]+"出现了"+sum+"次");	
			}
		}
	} */
        int arr[] = new arr[50];
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 50 + 1);
            for (int j = 0; j < 50; j++) {
                if (j == num - 1) {
                    arr[j]++;
                    System.out.println(arr[j] + "     " + num);
                }
            }
        }

        for (int k = 0; k < 50; k++) {
            if (a[k] != 0)
                System.out.println(k + 1 + "出现" + a[k] + "次。");
        }


    }