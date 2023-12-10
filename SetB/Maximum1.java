import java.util.*;
class Maximum1 {

static int R = 4 ;
static int C = 4 ;

static int rowWithMax1s(int mat[][], int R, int C)
{
	 
	boolean flag = true;
	
	int max_row_index = 0, max_ones = 0;;
	for(int i = 0 ; i < R ; i++){

			int count1 = 0 ;
			for(int j = 0 ; j < C ; j++){
				if(mat[i][j] == 1){
					count1++;
					flag = false;
				}
			}
			if(count1>max_ones){
				max_ones = count1;
				max_row_index = i;
			}

		}
		if(flag){
			return -1;
		}
	return max_row_index;
}

		public static void main(String[] args) {
		
	int mat[][] = { {0, 0, 0, 1},
					{0, 1, 1, 1},
					{1, 1, 1, 1},
					{0, 0, 0, 0}};

	System.out.print("Index of row with maximum 1s is " + rowWithMax1s(mat,R,C));
	}
}
