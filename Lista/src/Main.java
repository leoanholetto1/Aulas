void main() {
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
}
