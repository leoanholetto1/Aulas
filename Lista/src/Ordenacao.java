public class Ordenacao {
    public void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]  > arr[j+1]){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int aux = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = aux;
            }
        }
    }

    public void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j > 0 && arr[j-1] > arr[j]){
                int aux = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = aux;
                j--;
            }
        }
    }

    public void insertionSort2(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            int key = arr[j];
            while(j > 0 && arr[j-1] > key){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

    public void coutingSort(int arr[]){
        int mx = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        int[] count = new int[mx + 1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int index = 0;
        for(int i=0;i<=mx;i++){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public void countingSort2(int arr[]){
        int mx = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        int[] count = new int[mx + 1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=mx;i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
    }
}
