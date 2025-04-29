
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
    
    String match(int i){ // Return status of the philosopher
        if (i == 0)
            return "Thinking";
        else if(i == 1)
            return "Hungry";
        else if(i == 3)
            return "Eating";        

        return "";
    }
        
    void display(){ // Display philosopher number with status
        System.out.println("\n\n-------------------------------------------");
        System.out.println("Philosopher\tStatus\n");
        for(int i=0;i<n;i++){
            System.out.println(i+1 + "\t\t" + match(state[i]));
        }
    }
    
    void verify(int num){
        
        int left=(num + n - 1)%n;
        int right=(num + 1)%n;
        if (state[num] == 1){
            if (state[left] != 3 && state[right] != 3){   
                state[num] = 3;
                System.out.println("\nPhilosopher " + (num+1) + " is now eating.");
            }
        }
    }

        void status(){ // Change status of the philosopher
            System.out.print("\nEnter philosopher's number : ");
            int num = sc.nextInt();
            num -= 1;
            int left=(num + n - 1)%n;
            int right=(num + 1)%n;
            if (state[num] != 3){ // If he is not eating
                state[num] = 1;
                
                if (state[left] != 3 && state[right] != 3){ // If left and right are not eating
                    state[num] = 3;
                    System.out.println("\nPhilosopher " + (num+1) + " is now eating.");
                }
            else if(state[left] != 3) // If right is eating
                System.out.println("\nRight philosopher is eating so " + (num+1) + " is hungry.");
                else if(state[right] != 3)// If left is eating
                System.out.println("\nLeft philosopher is eating so " + (num+1) + " is hungry.");
                else// If both are eating
                System.out.println("\nBoth left and right philosopher is eating so " + (num+1) + " is hungry.");
            }
            else{ // If philosopher wants to stop eating
                state[num] = 0;
                System.out.println("\nPhilosopher " + (num+1) + " stopped eating so now he is thinking.");
                verify(left); // Check if adjacent philophers are hungry or not.
                verify(right);
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