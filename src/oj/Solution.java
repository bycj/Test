package oj;

public class Solution {
	public String replaceSpace(StringBuffer str) {
        int olen=str.length();//�ַ�������
        int slen=0;//����ո�
        int nlen=0;//�������ַ�������
        for(int i=0;i<olen;i++){
            if (str.charAt(i)==' '){
                slen++;
            }
        }
            nlen=olen+2*slen;//�³��ȵ���ԭ���ȼ���2*�ո񳤶�
            str.setLength(nlen);
            int oindex=olen-1;
            int nindex=nlen-1;
            for(;oindex>=0&&oindex<nindex;--oindex){
                if (str.charAt(oindex)==' '){                                          
                str.setCharAt(nindex--, '0');
                str.setCharAt(nindex--, '2');
                str.setCharAt(nindex--, '%');
                         
                }
                else{
                    str.setCharAt(nindex--,str.charAt(oindex));
                }
            }
        return str.toString();
        }

}
