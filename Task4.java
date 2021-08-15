package coddingTask;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]num ={{1, 2, 3, 5}, {6, 7, 9}};
		int evenNum;
		for(int i=0; i<num.length; i++){
		for(int j=0; j<num[i].length; j++){
		if(num[i][j]%2==0){
		evenNum=num[i][j];
		System.out.print(evenNum+" ");

	}
		}
}
}
}