import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes;

        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        try (Scanner file = new Scanner(Paths.get(filename))) {
            recipes = new ArrayList<>();

            while (true) {
                boolean hasNext = false;
                Recipe recipe = new Recipe();


                while (hasNext = file.hasNextLine()) {
                    String line = file.nextLine();
                    if (line.equals("")) {
                        break;
                    }
                    recipe.addIngredient(line);
                }

                recipes.add(recipe);

                if (!hasNext) {
                    break;
                }
            }


            while (true) {
                System.out.println();
                System.out.print("Enter command: ");
                String command = scanner.nextLine();

                if (command.equals("stop")) {
                    break;
                }

                if (command.equals("list")) {
                    System.out.println();
                    System.out.println("Recipes:");
                    for (Recipe r : recipes) {
                        System.out.println(r);
                    }
                }

                if (command.equals("find name")) {
                    System.out.print("Searched word: ");
                    String search = scanner.nextLine();
                    System.out.println();
                    System.out.println("Recipes:");
                    for (Recipe r : recipes) {
                        if (r.getName().contains(search)) {
                            System.out.println(r);
                        }
                    }
                }

                if (command.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    int time = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    System.out.println("Recipes:");
                    for (Recipe r : recipes) {
                        if (time >= r.getTime()) {
                            System.out.println(r);
                        }
                    }
                }

                if(command.equals("find ingredient")){
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    System.out.println();
                    System.out.println("Recipes:");
                    for (Recipe r:recipes){
                        if(r.getIngredients().contains(ingredient)){
                            System.out.println(r);
                        }
                    }
                }
            }
        } catch (Exception e) {

        }

    }

}
