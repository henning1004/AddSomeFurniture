package me.henning1004.addsomefurniture.recipes;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.furniture.Blocks;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class Recipes_birch {
    public static ItemStack res_woodtable1;
    public static ItemStack res_woodchair;
    public static ItemStack res_woodthrone;
    public static ItemStack res_woodenbarstool;
    public static ItemStack res_woodsimplechair;
    public static ItemStack res_obsidianworktop1;
    public static ItemStack res_ironworktop1;
    public static ItemStack res_goldworktop1;
    public static ItemStack res_stoneworktop1;
    public static ItemStack res_craftingworktop1;
    public static ItemStack res_woodenworktop1;
    public static ItemStack res_lamp;
	private static SpoutShapedRecipe recipe;

	public static void registerRecipes(AddSomeFurniture addSomeFurniture) 
	{
		
		
		res_woodtable1 = new SpoutItemStack(Blocks.woodtable, 1);
		recipe = new SpoutShapedRecipe(res_woodtable1);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.birchWood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodchair = new SpoutItemStack(Blocks.woodchairN, 1);
		recipe = new SpoutShapedRecipe(res_woodchair);
		recipe.shape(" A ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.birchWood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		
		res_woodthrone = new SpoutItemStack(Blocks.woodthroneN, 1);
		recipe = new SpoutShapedRecipe(res_woodthrone);
		recipe.shape("BAB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.birchWood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		
		res_woodenbarstool = new SpoutItemStack(Blocks.woodenbarstool, 1);
		recipe = new SpoutShapedRecipe(res_woodenbarstool);
		recipe.shape("AAA", " B ");
		recipe.setIngredient('A', MaterialData.birchWood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodsimplechair = new SpoutItemStack(Blocks.woodsimplechair, 1);
		recipe = new SpoutShapedRecipe(res_woodsimplechair);
		recipe.shape("AAA", " B ", "B B");
		recipe.setIngredient('A', MaterialData.birchWood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		
		res_obsidianworktop1 = new SpoutItemStack(Blocks.obsidianworktop, 3);
		recipe = new SpoutShapedRecipe(res_obsidianworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.obsidian);
		recipe.setIngredient('B', MaterialData.birchWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	
		res_ironworktop1 = new SpoutItemStack(Blocks.ironworktop, 3);
		recipe = new SpoutShapedRecipe(res_ironworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.ironBlock);
		recipe.setIngredient('B', MaterialData.birchWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	
		res_goldworktop1 = new SpoutItemStack(Blocks.goldworktop, 3);
		recipe = new SpoutShapedRecipe(res_goldworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.goldBlock);
		recipe.setIngredient('B', MaterialData.birchWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_stoneworktop1 = new SpoutItemStack(Blocks.stoneworktop, 3);
		recipe = new SpoutShapedRecipe(res_stoneworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.birchWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_craftingworktop1 = new SpoutItemStack(Blocks.craftingworktop, 3);
		recipe = new SpoutShapedRecipe(res_craftingworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.craftingTable);
		recipe.setIngredient('B', MaterialData.birchWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_woodenworktop1 = new SpoutItemStack(Blocks.woodenworktop, 3);
		recipe = new SpoutShapedRecipe(res_woodenworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.birchLog);
		recipe.setIngredient('B', MaterialData.birchWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_lamp = new SpoutItemStack(Blocks.lamp, 2);
		recipe = new SpoutShapedRecipe(res_lamp);
		recipe.shape(" A ", " B ", "BCB");
		recipe.setIngredient('A', MaterialData.stick);
		recipe.setIngredient('B', MaterialData.birchLog);
		recipe.setIngredient('C', MaterialData.torch);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	}

}
