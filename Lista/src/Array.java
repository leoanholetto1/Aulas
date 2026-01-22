public class Array {
    private int[] arr;

    public void imprimeArray(){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public Array(int tamanho){
        arr = new int[tamanho];
        for(int i=0;i<tamanho;i++){
            arr[i] = randomInt(0,100);
        }
    }

    private int randomInt(int i, int i1) {
        return (int)(Math.random() * (i1 - i)) + i;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
