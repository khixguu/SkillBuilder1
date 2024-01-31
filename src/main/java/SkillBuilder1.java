import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("What's your name?");
        String userName = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        spice = Math.pow(2, Math.sqrt(5) / Math.pow(spice, 3));
        spice = (4.0 / 3) * spice;

        System.out.print("Well" + userName + ", the spice value resulted in ");
        System.out.println(spice);
        System.out.print("And the converted value is ");
        spice = ((int) (spice * 100)) / 100.0;
        System.out.println(spice);

    }


    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // Calculating the Walls Area
        double wallArea = (wallWidth * wallHeight);
        System.out.print("Wall area: ");
        System.out.println(wallArea + " square feet");

        //Paint needed
        double paintAmnt = ((wallArea/squareFeetPerGallons));

        System.out.printf("Paint needed: %.2f gallons\n",paintAmnt);

        //Cans needed
        int cans = (int)Math.ceil(paintAmnt/gallonsPerCan);
        System.out.println("Cans needed: " + cans + " can(s)");






        // TODO: Calculate and output the wall's area

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
    }
}
