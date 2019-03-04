package sort;

public class shellSort {
    public static void main(String[] args){
        int[] a = {12,54,58,45,68,4,58,78,7};
        shellSort(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void shellSort(int a[]){
        int len = a.length;
        for(int r=len/2;r>=1;r/=2){
            for(int i=r;i<a.length;i++){
                int temp = a[i];
                int j = i-r;
                while(j>=0&&temp<a[j]){
                    a[j+r]=a[j];
                    j=j-r;
                }
                a[j+r]=temp;
            }

        }
    }

}
