import java.util.*;
public class Pattern_printing{

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int f=a.length();
		String m="";
		if(f%2==1){
		    m=a+"*";
		}else{
		    m=a;
		}String[] b=m.split("");
        int c=a.length();
        int d=((c/2)*(c-2))+(c/2);
        int count=c-2;
        int count1=1;
        for(int i=0;i<(c-2);i++){
            int add=0;
            for(int j=0;j<(m.length());j++){
                if(j==0){
                    System.out.print(b[j].repeat(count));
                    add+=3;
                }else{
                    if(add==j){
                        if(add%2==0){
                            System.out.print(b[j].repeat(count));
                            add+=3;
                        }else{
                            System.out.print(b[j].repeat(count));
                            ad++;
                        }
                    }
                    else{
                        System.out.print(b[j].repeat(count1));
                    }
                }
            }
            count--;
            count1++;
            System.out.println();
        }
    }
}
