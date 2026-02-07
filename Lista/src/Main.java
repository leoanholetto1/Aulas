void main() {
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
    IO.println("----------------------------------------");

    //---------------------BUSCA------------------------
    int[] arr2 = {5, 10, 15, 20, 25, -1};
    int[] arr = {5, 10, 15, 20, 25};
    Busca busca = new Busca();
    IO.println("Busca Linear 15: " + busca.buscaLinear(arr, 15));
    IO.println("Busca Linear 30: " + busca.buscaLinear(arr, 30));
    IO.println("Busca Sentinela 20: " + busca.buscaSentinela(arr2, 5, 20));
    IO.println("Busca Sentinela 35: " + busca.buscaSentinela(arr2, 5, 35));
    IO.println("Busca Indexada 25: " + busca.buscaIndexada(arr, 25));
    IO.println("Busca Indexada 11: " + busca.buscaIndexada(arr, 11));
    IO.println("Busca Indexada 30: " + busca.buscaIndexada(arr, 30));
    IO.println("Busca Binaria 10: " + busca.buscaBinaria(arr, 10));
    IO.println("Busca Binaria 22: " + busca.buscaBinaria(arr, 22));
    IO.println("----------------------------------------");
    IO.println("Raiz de 9: " + busca.achaRaiz(9, 0, 10));
    IO.println("----------------------------------------");

    //---------------------ORDENAÇÃO------------------------
    Array array = new Array(10);

    Ordenacao ordenacao = new Ordenacao();
    //compararTempo(array.getArr(), ordenacao);
    IO.println("Array antes da ordenação:");
    array.imprimeArray();
    //ordenacao.bubbleSort(array.getArr());
    //ordenacao.selectionSort(array.getArr());
    //ordenacao.insertionSort(array.getArr());
    //ordenacao.insertionSort2(array.getArr());
    //ordenacao.coutingSort(array.getArr());
    //ordenacao.countingSort2(array.getArr());
    //ordenacao.bucketSort(arr,  4);
    //ordenacao.mergeSort(array.getArr(),0,array.getArr().length-1);
    ordenacao.cocktailSort(array.getArr());
    IO.println("Array depois da ordenação:");
    array.imprimeArray();
}

public static void compararTempo(int[] array, Ordenacao ordenacao) {
    int[] copia1 = array.clone();
    int[] copia2 = array.clone();

    long inicio1 = System.nanoTime();
    ordenacao.bucketSort(copia1,4);
    long fim1 = System.nanoTime();

    long inicio2 = System.nanoTime();
    ordenacao.mergeSort(copia2,0,copia2.length-1);
    long fim2 = System.nanoTime();

    System.out.println("Algoritmo 1: " + (fim1 - inicio1) + " ns");
    System.out.println("Algoritmo 2: " + (fim2 - inicio2) + " ns");
}
