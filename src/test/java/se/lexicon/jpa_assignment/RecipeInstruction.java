package se.lexicon.jpa_assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class RecipeInstruction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int RecipeInstructionId;
    public String instructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(int recipeInstructionId, String instructions) {
        RecipeInstructionId = recipeInstructionId;
        this.instructions = instructions;
    }

    public RecipeInstruction(String instructions) {
        this.instructions = instructions;
    }

    public int getRecipeInstructionId() {
        return RecipeInstructionId;
    }

    public void setRecipeInstructionId(int recipeInstructionId) {
        RecipeInstructionId = recipeInstructionId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(getInstructions(), that.getInstructions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstructions());
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "RecipeInstructionId=" + RecipeInstructionId +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
