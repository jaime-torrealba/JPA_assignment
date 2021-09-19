package se.lexicon.jpa_assignment;

public class RecipeInstruction {

    public RecipeInstruction(int recipeInstructionId, String unique) {
        RecipeInstructionId = recipeInstructionId;
        this.unique = unique;
    }

    public int RecipeInstructionId;
    public String unique;

    public int getRecipeInstructionId() {
        return RecipeInstructionId;
    }

    public void setRecipeInstructionId(int recipeInstructionId) {
        RecipeInstructionId = recipeInstructionId;
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }
}
