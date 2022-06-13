
public class Ordenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v;
		v=new int[6];
		
		v[0]=4;
		v[1]=3;
		v[2]=1;
		v[3]=5;
		v[4]=2;

	}
	
	public static void seleccion(int [] vector,int t) {
        int i, j, k, p, auxiliar, limit = t-1;
        for(k = 0; k < limit; k++){
            p = k;
            for(i = k+1; i <= limit; i++){
                if(vector[i] < vector[p]) 
                	p = i;
                if(p != k){
                    auxiliar = vector[p];
                    vector [p] = vector[k];
                    vector[k] = auxiliar;
                }
            }
        }
        }

}
