public class Busca {
    public boolean buscaLinear(int[] arr,int valor){
        int i=0;
        while(i < arr.length && arr[i] != valor) i++;
        return i < arr.length;
    }

    public boolean buscaSentinela(int [] arr,int n,int valor){
        arr[n] = valor;
        int i=0;
        while(arr[i] != valor) i++;
        return i != n;
    }

    public boolean buscaIndexada(int[] arr,int valor){
        int i=0;
        while(i< arr.length && valor > arr[i]) i++;
        return i < arr.length && arr[i] == valor;
    }

    public boolean buscaBinaria(int[] arr,int valor){
        int ini = 0, fim = arr.length-1;
        while(ini <= fim){
            int meio = (ini + fim) / 2;
            if(arr[meio] == valor) return true;
            else if(valor < arr[meio]) fim = meio-1;
            else ini = meio +1;
        }
        return false;
    }

    double f(double x){
        return x*x;
    }

    public double achaRaiz(double valor,double ini,double fim){
        int t = 100;
        while(t-- > 0){
            double meio = (ini + fim) / 2;
            if(valor < f(meio)) fim = meio;
            else ini = meio;
        }
        return ini;
    }
}
