
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

    void display(){
        System.out.println("\n\n-------------------------------------------");
        System.out.println("Number\tStatus\n");
        for(int i=0;i<n;i++){
            System.out.println(i+1 + "\t" + match(state[i]));
        }
    }
    

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        // Documentation
        System.out.println("It is a typical IPC problem with n number of philosophers in round table.");
        System.out.println("They will either eat or think.");
        System.out.println("They can only eat if their left and right forks are empty");
        
        System.out.println("\nLet's start the simulation...");

        System.out.println("\n\nEnter number of philosophers :");
        int n = sc.nextInt();

        Dinphil dp = new Dinphil(n);
        boolean don = true;
        while(don){
            System.out.println("\nEnter : \n1 to check status of philosophers.\n2 to change status.\n3 to exit");
            int ch = sc.nextInt();

            switch(ch){
                case 3:don = false;break;

                case 1:dp.display();break;

                case 2:dp.status();break;

                default:System.out.println("Invalid choice...");
            }
        }
    }
}