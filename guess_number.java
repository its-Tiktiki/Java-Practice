import java.util.Scanner;
class NumberGuess{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int target = 33;
        int lives = 5;
        boolean game_on = true;
        

        while(game_on){
            int guess;
            System.out.print("Guess the number(1 to 100): ");
            guess = sc.nextInt();
            if(guess == target){
                System.out.println("Correct Guess! You've won!");
                lives = 0;
            }else{
                if(guess > target)
                    System.out.println("target is smaller");
                else
                    System.out.println("Target is larger");

                lives--;
            }

            if(lives <= 0){
                int restart;
                System.out.println("You've lost all lives.\nWanna play again?(1 if yes/0 if no): ");
                restart = sc.nextInt();

                if(restart == 0)
                    game_on = false;
                else
                    lives = 5;
            }
             
        }

    }

}