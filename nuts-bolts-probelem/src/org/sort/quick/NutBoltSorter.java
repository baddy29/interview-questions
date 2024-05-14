package org.sort.quick;

public class NutBoltSorter {
	public static void quickSort(char nuts[],char bolts[], int low, int high){
        if(low<high){
        int nutPivot=partition(nuts,bolts[high],low,high);
        partition(bolts,nuts[nutPivot],low,high);
        quickSort(nuts,bolts,nutPivot+1,high);
        quickSort(nuts,bolts,low,nutPivot-1);
        }
    }
	public static int partition(char[]arr, char pivot, int low,int high){
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }else if(arr[j]==pivot){
                swap(arr,j,high);
                j--;
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
	public static void swap(char[]arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
