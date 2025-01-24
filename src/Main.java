void main() {
    // NUMBER GUESSING GAME

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    int guess = 0;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min, max + 1);

    System.out.println("Number Guessing Game");
    System.out.printf("Guess the number between %d-%d\n", min, max);

    do {
        System.out.print("Enter a guess: ");
        guess = sc.nextInt();
        attempts++;

        if (guess < randomNumber) {
            System.out.println("Your number is too low. Try again.");
        }
        else if (guess > randomNumber) {
            System.out.println("Your number is too high. Try again.");
        }
        else{
            System.out.println("CORRECT! The number was: " + randomNumber);
            System.out.println("# of attempts: " + attempts);
        }

    } while (guess != randomNumber);

    sc.close();

    System.out.println("You have won");


}