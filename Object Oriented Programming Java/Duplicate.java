import java.util.*;
public class Duplicate
{
public static Duplicate()
{
	int array[];
	int n;
	if(n==0||n==1){
		return n;
	}
	int[] temp=new int[n];
	int j=0;
	for(int i=0;i<n-1;i++);{
		if(arra[i]!=array[i+1]){
			temp[j++]=array[i];
		}
	}
	temp[j++]=array[n-1];
	for(int i=0;i<j;i++){
		array[i]=temp[i];
	}
	return j;
}
public static void main(String args[]){
	int array[]={1,2,3,3,4,6,6};
	int length=array.length;
	length=Duplicate(array,length);
	for(int i=0;i<=length;i++)
		System.out.print(array[i]+" ");
}

}
	