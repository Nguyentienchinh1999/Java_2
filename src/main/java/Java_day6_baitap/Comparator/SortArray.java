package Java_day6_baitap.Comparator;

public class SortArray {

    public <T extends Comparator > void printArry(T[] arr){
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i] + "\n");
        }
    }
    public <T extends Comparator > void sorted(T[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i].compare(arr[j]) > 0){
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
