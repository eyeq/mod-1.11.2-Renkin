package eyeq.renkin;

import eyeq.util.item.crafting.UCraftingManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.renkin.Renkin.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class Renkin {
    public static final String MOD_ID = "eyeq_renkin";

    @Mod.Instance(MOD_ID)
    public static Renkin instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        addRecipes();
    }

    public static void addRecipes() {
        addRenkinRecipe(new int[]{8, 1, 6, 3, 5, 7, 4, 9, 2});
        addRenkinRecipe(new int[]{6, 7, 2, 1, 5, 9, 8, 3, 4});
        addRenkinRecipe(new int[]{2, 9, 4, 7, 5, 3, 6, 1, 8});
        addRenkinRecipe(new int[]{4, 3, 8, 9, 5, 1, 2, 7, 6});
    }

    private static void addRenkinRecipe(int[] stackSizes) {
        UCraftingManager.addAmountRecipe(new ItemStack(Items.DIAMOND), "012", "345", "678",
                '0', new ItemStack(Blocks.DIRT, stackSizes[0]),
                '1', new ItemStack(Blocks.DIRT, stackSizes[1]),
                '2', new ItemStack(Blocks.DIRT, stackSizes[2]),
                '3', new ItemStack(Blocks.DIRT, stackSizes[3]),
                '4', new ItemStack(Blocks.DIRT, stackSizes[4]),
                '5', new ItemStack(Blocks.DIRT, stackSizes[5]),
                '6', new ItemStack(Blocks.DIRT, stackSizes[6]),
                '7', new ItemStack(Blocks.DIRT, stackSizes[7]),
                '8', new ItemStack(Blocks.DIRT, stackSizes[8]));
    }
}
