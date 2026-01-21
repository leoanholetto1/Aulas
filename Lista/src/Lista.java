public class Lista {
    private No cabeca;

    public Lista() {
        this.cabeca = null;
    }

    public void inserirInicio(int valor){
        No novo = new No(valor);
        novo.setProximo(this.cabeca);
        this.cabeca = novo;
    }

    public void inserirFim(int valor){
        No novo = new No(valor);
        if(this.cabeca == null){
            this.cabeca = novo;
        }
        else{
            No atual = this.cabeca;
            while(atual.getProximo()!= null){
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }

    public boolean buscar(int valor){
        No atual = this.cabeca;
        while(atual!=null && atual.getValor()!=valor){
            atual = atual.getProximo();
        }
        return atual != null;
    }

    public boolean excluir(int valor){
        No atual = this.cabeca;
        No ant = null;

        while(atual != null && atual.getValor() != valor){
            ant = atual;
            atual = atual.getProximo();
        }

        if(atual != null){
            ant.setProximo(atual.getProximo());
            return true;
        }
        return false;
    }


    public void imprimir(){
        No atual = this.cabeca;
        while(atual != null){
            System.out.print(atual.getValor() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }
}
