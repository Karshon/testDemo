package sort;

public class selectSort {
    public static void main(String[] args){
        int[] a = {12,54,58,45,68,4,58,78,7};
        selectSort(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    static void selectSort(int a[]){
        for(int i=0;i<a.length;i++){
            int k=i;
            int temp;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[k])
                {
                    temp = a[k];
                    a[k]=a[j];
                    a[j]=temp;
                }

            }

        }

    }

}
