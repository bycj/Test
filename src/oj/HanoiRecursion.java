package oj;

public class HanoiRecursion {
	int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HanoiRecursion hanoi=new HanoiRecursion();
		 
	     System.out.println("moveCount="+hanoi.hanoiCount(6,'A','B','C'));

	     //hanoi.hanoi(3,'A','B','C');
	}
	/**
	  * @param n ��ŵ���Ĳ���
	  * @param x x�� �����(A)
	  * @param y y�� Ŀ����(B)
	  * @param z z�� ��ת��(C)
	  * ���� A B C ֻ����Ϊ����˼��
	  */
	 public void hanoi(int n, char x ,char y ,char z){

	     //H(0)=0
	     if (n==0){
	         //ʲôҲ����
	     }else {
	         //���ƹ�ʽ��H(n)=H(n-1) + 1 + H(n-1)
	         //��n-1��Բ�̴�x�ƶ���z,yΪ��ת��
	         hanoi(n-1,x,z,y); //----------------------->���n-1�㺺ŵ��:H(n-1)

	         //�ƶ����Բ�̵�Ŀ����
	         System.out.println(x+"->"+y);//------------> 1

	         //��n-1��Բ�̴�z�ƶ���y,xΪ��ת��
	         hanoi(n-1,z,y,x);//------------------------>���n-1�㺺ŵ��:H(n-1)
	     }

	 }
	public int hanoiCount(int n, char x ,char y ,char z){
	     int moveCount=0;
	    
	     //H(0)=0
	     if (n==0){
	         //ʲôҲ����
	         return 0;
	     }else {
	         //���ƹ�ʽ��H(n)=H(n-1) + 1 + H(n-1)
	         //��n-1��Բ�̴�x�ƶ���z,yΪ��ת��
	         moveCount += hanoiCount(n-1,x,z,y); //------------->���n-1�㺺ŵ��:H(n-1)
	         System.out.println(i++ +"n--"+n);
	         //�ƶ����Բ�̵�Ŀ����
	         moveCount += 1; //---------------------------------> 1
	         System.out.print(moveCount+"moveCount");
	         //��n-1��Բ�̴�z�ƶ���y,xΪ��ת��
	         moveCount +=hanoiCount(n-1,z,y,x);//--------------->���n-1�㺺ŵ��:H(n-1)
	     }

	     return moveCount;
	 }
}
