
import java.util.Scanner;

class Dinphil{

    int n; // Number of philosophers
    int state[]; // Thinking, Hungry, Eating
    Scanner sc;
    
    Dinphil(int n){
        this.n = n;
        state = new int[n];
        for(int i=0;i<n;i++){
            state[i] = 0; // By default thinking
        }
        sc = new Scanner(System.in);
        
    }
}