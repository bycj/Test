package oj;

public class Paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paixu px=new Paixu();
		int []a= {5,6,8,2,4,1};
		System.out.println("����ǰ");
		px.print(a);
		px.Zjcr(a);
		System.out.println("�����");
		px.print(a);
		
	}
	//��ӡ���
	public void print(int []array){
		for(int i=0;i<array.length-1;i++){
			System.out.print(array[i]);
		}
		System.out.println(array[array.length-1]);
	}
	//ֱ�Ӳ�������
	public void Zjcr(int []a){
		
		
		 for(int i=1;i<a.length;i++){//��ͷ����һ�������Ѿ��ź���ģ��Ѻ����һ��һ���Ĳ嵽�Ѿ��źõ��б���ȥ��    
             int j=0;    
             int x=a[i];//xΪ������Ԫ��    
             for( j=i;  j>0 && x<a[j-1];j--){//ͨ��ѭ�����������һλ�ҵ�Ҫ�����λ�á�    
                 a[j]=a[j-1];    
             }    
             a[j]=x;//����    
		 }
		
	}
}
 