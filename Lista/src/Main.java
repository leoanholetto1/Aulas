public class Main {

    public static void main(String[] args) {

        //---------------------LISTA SIMPLES------------------------
        Lista lista = new Lista();
        lista.imprimir();
        lista.inserirInicio(10);
        lista.imprimir();
        lista.inserirInicio(20);
        lista.imprimir();
        lista.inserirFim(30);
        lista.imprimir();

        IO.println("Buscar 20: " + lista.buscar(20));
        IO.println("Buscar 40: " + lista.buscar(40));

        //---------------------BUSCA------------------------
        int[] arr2 = {5, 10, 15, 20, 25, -1};
        int[] arr = {5, 10, 15, 20, 25};

        Busca busca = new Busca();

        IO.println("Busca Linear 15: " + busca.buscaLinear(arr, 15));
        IO.println("Busca Linear 30: " + busca.buscaLinear(arr, 30));

        //---------------------ORDENAÇÃO------------------------
        Array array = new Array(8);
        Ordenacao ordenacao = new Ordenacao();

        IO.println("Array antes da ordenação:");
        array.imprimeArray();

        ordenacao.merge2(array.getArr());

        IO.println("Array depois da ordenação:");
        array.imprimeArray();
    }

    public static void compararTempo(int[] array, Ordenacao ordenacao) {
        int[] copia1 = array.clone();
        int[] copia2 = array.clone();

        long inicio1 = System.nanoTime();
        ordenacao.shellSort(copia1);
        long fim1 = System.nanoTime();

        long inicio2 = System.nanoTime();
        ordenacao.insertionSort2(copia2);
        long fim2 = System.nanoTime();

        System.out.println("Algoritmo 1: " + (fim1 - inicio1) + " ns");
        System.out.println("Algoritmo 2: " + (fim2 - inicio2) + " ns");
    }
}