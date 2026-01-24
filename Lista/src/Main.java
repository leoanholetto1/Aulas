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
    IO.println("Array antes da ordenação:");
    array.imprimeArray();
    //ordenacao.bubbleSort(array.getArr());
    //ordenacao.selectionSort(array.getArr());
    //ordenacao.insertionSort(array.getArr());
    //ordenacao.insertionSort2(array.getArr());
    IO.println("Array depois da ordenação:");
    array.imprimeArray();
}
