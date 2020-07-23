import java.util.Scanner;

public class CountingCharInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine(); // Taking user input
        System.out.println();

        // Variable to store different character counts ----------
        byte countA = 0; byte countB = 0; byte countC = 0; byte countD = 0; byte countE = 0; byte countF = 0; byte countG = 0;
        byte countH = 0; byte countI = 0; byte countJ = 0; byte countK = 0; byte countL = 0; byte countM = 0; byte countN = 0;
        byte countO = 0; byte countP = 0; byte countQ = 0; byte countR = 0; byte countS = 0; byte countT = 0; byte countU = 0;
        byte countV = 0; byte countW = 0; byte countX = 0; byte countY = 0; byte countZ = 0; byte spaceCount = 0;

        // Iterating through the string --------------
        for (int iteration = 0; iteration < word.length(); iteration++) {

            // Checking each word. If its matches with the characters of the string then adding those character-count with 1
            if (word.charAt(iteration) == 'a' || word.charAt(iteration) == 'A')
                    countA++;
            else if (word.charAt(iteration) == 'b' || word.charAt(iteration) == 'B')
                    countB++;
            else if (word.charAt(iteration) == 'c' || word.charAt(iteration) == 'C')
                    countC++;
            else if (word.charAt(iteration) == 'd' || word.charAt(iteration) == 'D')
                    countD++;
            else if (word.charAt(iteration) == 'e' || word.charAt(iteration) == 'E')
                    countE++;
            else if (word.charAt(iteration) == 'f' || word.charAt(iteration) == 'F')
                    countF++;
            else if (word.charAt(iteration) == 'g' || word.charAt(iteration) == 'G')
                    countG++;
            else if (word.charAt(iteration) == 'h' || word.charAt(iteration) == 'H')
                    countH++;
            else if (word.charAt(iteration) == 'i' || word.charAt(iteration) == 'I')
                    countI++;
            else if (word.charAt(iteration) == 'j' || word.charAt(iteration) == 'J')
                    countJ++;
            else if (word.charAt(iteration) == 'k' || word.charAt(iteration) == 'K')
                    countK++;
            else if (word.charAt(iteration) == 'l' || word.charAt(iteration) == 'L')
                    countL++;
            else if (word.charAt(iteration) == 'm' || word.charAt(iteration) == 'M')
                    countM++;
            else if (word.charAt(iteration) == 'n' || word.charAt(iteration) == 'N')
                    countN++;
            else if (word.charAt(iteration) == 'o' || word.charAt(iteration) == 'O')
                    countO++;
            else if (word.charAt(iteration) == 'p' || word.charAt(iteration) == 'P')
                    countP++;
            else if (word.charAt(iteration) == 'q' || word.charAt(iteration) == 'Q')
                    countQ++;
            else if (word.charAt(iteration) == 'r' || word.charAt(iteration) == 'R')
                    countR++;
            else if (word.charAt(iteration) == 's' || word.charAt(iteration) == 'S')
                    countS++;
            else if (word.charAt(iteration) == 't' || word.charAt(iteration) == 'T')
                    countT++;
            else if (word.charAt(iteration) == 'u' || word.charAt(iteration) == 'U')
                    countU++;
            else if (word.charAt(iteration) == 'v' || word.charAt(iteration) == 'V')
                    countV++;
            else if (word.charAt(iteration) == 'w' || word.charAt(iteration) == 'W')
                    countW++;
            else if (word.charAt(iteration) == 'x' || word.charAt(iteration) == 'X')
                    countX++;
            else if (word.charAt(iteration) == 'y' || word.charAt(iteration) == 'Y')
                    countY++;
            else if (word.charAt(iteration) == 'z' || word.charAt(iteration) == 'Z')
                    countZ++;
            else if (word.charAt(iteration) == ' ')
                spaceCount += 1;

        }

        // Printing the string --------------
        System.out.println(word);
        System.out.println();

        // Printing the character count of the string -------------------------------
        if (countA > 0)
            System.out.println("Number of A is - " + countA);
        if (countB > 0)
            System.out.println("Number of B is - " + countB);
        if (countC > 0)
            System.out.println("Number of C is - " + countC);
        if (countD > 0)
            System.out.println("Number of D is - " + countD);
        if (countE > 0)
            System.out.println("Number of E is - " + countE);
        if (countF > 0)
            System.out.println("Number of F is - " + countF);
        if (countG > 0)
            System.out.println("Number of G is - " + countG);
        if (countH > 0)
            System.out.println("Number of H is - " + countH);
        if (countI > 0)
            System.out.println("Number of I is - " + countI);
        if (countJ > 0)
            System.out.println("Number of J is - " + countJ);
        if (countK > 0)
            System.out.println("Number of K is - " + countK);
        if (countL > 0)
            System.out.println("Number of L is - " + countL);
        if (countM > 0)
            System.out.println("Number of M is - " + countM);
        if (countN > 0)
            System.out.println("Number of N is - " + countN);
        if (countO > 0)
            System.out.println("Number of O is - " + countO);
        if (countP > 0)
            System.out.println("Number of P is - " + countP);
        if (countQ > 0)
            System.out.println("Number of Q is - " + countQ);
        if (countR > 0)
            System.out.println("Number of R is - " + countR);
        if (countS > 0)
            System.out.println("Number of S is - " + countS);
        if (countT > 0)
            System.out.println("Number of T is - " + countT);
        if (countU > 0)
            System.out.println("Number of U is - " + countU);
        if (countV > 0)
            System.out.println("Number of V is - " + countV);
        if (countW > 0)
            System.out.println("Number of W is - " + countW);
        if (countX > 0)
            System.out.println("Number of X is - " + countX);
        if (countY > 0)
            System.out.println("Number of Y is - " + countY);
        if (countZ > 0)
            System.out.println("Number of Z is - " + countZ);
        if (spaceCount > 0)
            System.out.println("Number of space is - " + spaceCount);

    }
}
