import java.util.*;

public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        int k=sc.nextInt();
        int[][] submatrix=new int[k][k];
        
        boolean allsame=true;
        
        for(int i=0;i<n;i+=k){
            for(int j=0;j<n;j+=k){
                
                int first=matrix[i][j];
                
                for(int x=0;x<k;x++){
                    for(int y=0;y<k;y++){
                        submatrix[x][y]=matrix[i+x][j+y];
                        
                        if(submatrix[x][y]!=first){
                            allsame=false;
                            break;
                        }
                    }
                    
                    if(!allsame){
                        break;
                    }
                }
                
                if(!allsame){
                    break;
                }
            }
            
            if(!allsame){
                break;
            }
        }
        
        if(allsame){
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
