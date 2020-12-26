package someasseblyrequired.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import someasseblyrequired.common.init.RecipeTypes;

public class ToastingRecipe extends ConversionRecipe {

    public ToastingRecipe(ResourceLocation id, String group, Ingredient input, ItemStack result) {
        super(RecipeTypes.TOASTING, id, group, input, result);
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return RecipeTypes.TOASTING_SERIALIZER;
    }
}
