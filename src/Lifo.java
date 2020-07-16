public class Lifo {
    public int[]cola=new int[0];



    public void push(int value){
        int[]aux=new int[cola.length+1];
        aux[0]=value;
        for(int i=0;i<cola.length;i++) {
            aux[i+1] = cola[i];
        }
        cola=aux;
    }

    public int pop() {
        int[] aux = new int[cola.length - 1];
        int result=cola[0];
        for (int i =0; i<aux.length; i++) {
            aux[i] = cola[i+1];
        }
        cola=aux;
        return result;
    }
}
