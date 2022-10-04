public class Pilha {
    int dados [];
    int topo;

    public Pilha(int capMaxima){
        dados = new int[capMaxima];
        topo = -1;
    }

    public boolean vazia(){
        if(topo < 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean cheia(){
        if(topo == dados.length){
            return true;
        }else{
            return false;
        }
    }

    // public void empilha(int e){
    //     while(!dados.cheia()){
    //         dados[topo] = e;
    //         topo ++;
    //     }
    // }

    // public int desempilha(){
    //     int r = -1;
    //     while(!dados.vazia()){
    //         r = dados[topo-1];
    //         topo --;
    //     }
    //     return r;
    // }

    public String toString(){
        String r = "";
        for(int i =0; i < topo; i ++){
            r = r + dados[i] + "\t";
            return r;
        }
    }
}
