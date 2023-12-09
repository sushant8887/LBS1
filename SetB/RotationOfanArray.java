package SetB;

public class RotationOfanArray {
void rightRotate(int arr[], int d, int n) {
	while (d>n) {
		d=d-n;
	}
	int temp[] = new int [n-d];
	for(int i=0; i<n-d; i++)
		temp [i]= arr[i];
	for (int i= n-d; i<n; i++) {
		arr [i-n+d]= arr[i];
	}
	for(int i=0; i<n-d; i++) {
		arr[i+d] = temp[i];
	}
}
void printArray(int arr[], int n) {
	for(int i=0; i<n; i++)
		System.out.println(arr[i]+ " ");
}
public static void main(String[] args) {
	RotationOfanArray ob = new RotationOfanArray();
	int arr [] = {1,2,3,4,5};
	ob.rightRotate(arr, 2, arr.length);
	ob.printArray(arr, arr.length);
}
}
