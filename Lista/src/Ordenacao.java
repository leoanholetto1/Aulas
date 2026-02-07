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

    public void bubbleSort(int arr[], int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public void bucketSort(int arr[],int balde) {
        int n = arr.length;
        int mn = arr[0], mx = arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i] < mn) mn = arr[i];
            if(arr[i] > mx) mx = arr[i];
        }
        int tamIntervalo = (mx - mn) / balde + 1;
        int[][] baldes = new int[balde][n];
        int[] tl = new int[balde];
        int contaBalde = 0;
        for(int i = mn; i<mx;i+=tamIntervalo){
            int ini = i, fim = i + tamIntervalo;
            for(int j=0;j<n;j++){
                if(arr[j] >= ini && arr[j] < fim){
                    baldes[contaBalde][tl[contaBalde]++] = arr[j];
                }
            }
            contaBalde++;
        }
        int index = 0;
        for(int i=0;i<balde;i++){
            bubbleSort(baldes[i],tl[i]);
            for(int j=0;j<tl[i];j++){
                arr[index++] = baldes[i][j];
            }
        }
    }

    public void mergeSort(int arr[], int left, int right) {
        if(left < right) {
            int meio = (left + right) / 2;
            mergeSort(arr, left, meio);
            mergeSort(arr, meio + 1, right);
            merge(arr, left, meio, meio+1, right);
        }
    }

    private void merge(int arr[],int ini,int fim,int ini2,int fim2){
        int[] aux = new int[fim2 - ini + 1];
        int i = ini, j = ini2, tl = 0;
        while(i <= fim && j <= fim2){
            if(arr[i] < arr[j]) aux[tl++] = arr[i++];
            else aux[tl++] = arr[j++];
        }
        while(i <= fim) aux[tl++] = arr[i++];
        while(j <= fim2) aux[tl++] = arr[j++];
        for(int k=0;k<tl;k++){
            arr[ini+k] = aux[k];
        }
    }

    public void cocktailSort(int arr[]){
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;
        while(swapped){
            swapped = false;
            for(int i=start; i < end; i++){
                if(arr[i] > arr[i+1]){
                    int aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    swapped = true;
                }
            }
            end--;
            if(swapped){
                swapped = false;
                for(int i = end;i>start;i--){
                    if(arr[i] < arr[i-1]){
                        int aux = arr[i];
                        arr[i] = arr[i-1];
                        arr[i-1] = aux;
                        swapped = true;
                    }
                }
                start++;
            }
        }
    }

    public void count(int[] arr, int exp){
        int conta[10];
        for(int i=0;i<arr.length;i++){
            conta[(arr[i]/exp)%10]++;
        }
        int out[] = new int[arr.length];
        for(int i=1;i<10;i++) conta[i]+=conta[i-1];
        for(int i=arr.length-1;i>=0;i--){
            out[conta[(arr[i]/exp)%10] - 1] = arr[i];
            conta[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = out[i];
        }
    }

    public void radix(int[] arr){
        int mx = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > mx) mx = arr[i];
        }
        for(int exp=1; mx/exp > 0;exp*=10){
            count(arr,exp);
        }
    }
}
