package me.henning1004.addsomefurniture.recipes;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.furniture.Blocks;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class Recipes_normal {
    public static ItemStack res_woodtable1;
    public static ItemStack res_irontable1;
    public static ItemStack res_goldtable1;
    public static ItemStack res_stonetable1;
    public static ItemStack res_obsidiantable1;
    public static ItemStack res_woodchair;
    public static ItemStack res_ironchair;
    public static ItemStack res_goldchair;
    public static ItemStack res_woodthrone;
    public static ItemStack res_ironthrone;
    public static ItemStack res_goldthrone;
    public static ItemStack res_woodenbarstool;
    public static ItemStack res_stonebarstool;
    public static ItemStack res_stonesimplechair;
    public static ItemStack res_woodsimplechair;
    public static ItemStack res_tv;
    public static ItemStack res_obsidianworktop1;
    public static ItemStack res_ironworktop1;
    public static ItemStack res_goldworktop1;
    public static ItemStack res_stoneworktop1;
    public static ItemStack res_craftingworktop1;
    public static ItemStack res_woodenworktop1;
    public static ItemStack res_lamp;
    public static ItemStack res_neonlamp;
    public static ItemStack res_leatherthrone;
    public static ItemStack res_neonlampred;
    public static ItemStack res_neonlampblue;
    public static ItemStack res_neonlampgreen;
    public static ItemStack res_carpetblack;
	public static ItemStack res_carpetred;
	public static ItemStack res_carpetdarkgreen;
	public static ItemStack res_carpetbrown;
	public static ItemStack res_carpetblue;
	public static ItemStack res_carpetpurple;
	public static ItemStack res_carpetcyan;
	public static ItemStack res_carpetlightgrey;
	public static ItemStack res_carpetgrey;
	public static ItemStack res_carpetpink;
	public static ItemStack res_carpetlightgreen;
	public static ItemStack res_carpetyellow;
	public static ItemStack res_carpetlightblue;
	public static ItemStack res_carpetmagenta;
	public static ItemStack res_carpetorange;
	public static ItemStack res_carpetwhite;
	public static ItemStack res_flowerbox;
	public static ItemStack res_blueflower;
	public static ItemStack res_whiterose;
	private static SpoutShapedRecipe recipe;
	private static SpoutShapelessRecipe recipe2;

	public static void registerRecipes(AddSomeFurniture addSomeFurniture) 
	{
		res_woodtable1 = new SpoutItemStack(Blocks.woodtable, 1);
		recipe = new SpoutShapedRecipe(res_woodtable1);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_irontable1 = new SpoutItemStack(Blocks.irontable, 1);
		recipe = new SpoutShapedRecipe(res_irontable1);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_goldtable1 = new SpoutItemStack(Blocks.goldtable, 1);
		recipe = new SpoutShapedRecipe(res_goldtable1);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.goldIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		
		res_stonetable1 = new SpoutItemStack(Blocks.stonetable, 1);
		recipe = new SpoutShapedRecipe(res_stonetable1);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_obsidiantable1 = new SpoutItemStack(Blocks.obsidiantable, 1);
		recipe = new SpoutShapedRecipe(res_obsidiantable1);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.obsidian);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_woodchair = new SpoutItemStack(Blocks.woodchairN, 1);
		recipe = new SpoutShapedRecipe(res_woodchair);
		recipe.shape(" A ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_ironchair = new SpoutItemStack(Blocks.ironchairN, 1);
		recipe = new SpoutShapedRecipe(res_ironchair);
		recipe.shape(" A ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_goldchair = new SpoutItemStack(Blocks.goldchairN, 1);
		recipe = new SpoutShapedRecipe(res_goldchair);
		recipe.shape(" A ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.goldIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodthrone = new SpoutItemStack(Blocks.woodthroneN, 1);
		recipe = new SpoutShapedRecipe(res_woodthrone);
		recipe.shape("BAB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_ironthrone = new SpoutItemStack(Blocks.ironthroneN, 1);
		recipe = new SpoutShapedRecipe(res_ironthrone);
		recipe.shape("BAB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_goldthrone = new SpoutItemStack(Blocks.goldthroneN, 1);
		recipe = new SpoutShapedRecipe(res_goldthrone);
		recipe.shape("BAB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.goldIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodenbarstool = new SpoutItemStack(Blocks.woodenbarstool, 1);
		recipe = new SpoutShapedRecipe(res_woodenbarstool);
		recipe.shape("AAA", " B ");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_stonebarstool = new SpoutItemStack(Blocks.stonebarstool, 1);
		recipe = new SpoutShapedRecipe(res_stonebarstool);
		recipe.shape("AAA", " B ");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodsimplechair = new SpoutItemStack(Blocks.woodsimplechair, 1);
		recipe = new SpoutShapedRecipe(res_woodsimplechair);
		recipe.shape("AAA", " B ", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_stonesimplechair = new SpoutItemStack(Blocks.stonesimplechair, 1);
		recipe = new SpoutShapedRecipe(res_stonesimplechair);
		recipe.shape("AAA", " B ", "B B");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_tv = new SpoutItemStack(Blocks.tvN, 1);
		recipe = new SpoutShapedRecipe(res_tv);
		recipe.shape("AAA", "ABA", "ACA");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.paintings);
		recipe.setIngredient('C', MaterialData.redstone);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_obsidianworktop1 = new SpoutItemStack(Blocks.obsidianworktop, 3);
		recipe = new SpoutShapedRecipe(res_obsidianworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.obsidian);
		recipe.setIngredient('B', MaterialData.wood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_ironworktop1 = new SpoutItemStack(Blocks.ironworktop, 3);
		recipe = new SpoutShapedRecipe(res_ironworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.ironBlock);
		recipe.setIngredient('B', MaterialData.wood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_goldworktop1 = new SpoutItemStack(Blocks.goldworktop, 3);
		recipe = new SpoutShapedRecipe(res_goldworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.goldBlock);
		recipe.setIngredient('B', MaterialData.wood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_stoneworktop1 = new SpoutItemStack(Blocks.stoneworktop, 3);
		recipe = new SpoutShapedRecipe(res_stoneworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.wood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	
		
		res_craftingworktop1 = new SpoutItemStack(Blocks.craftingworktop, 3);
		recipe = new SpoutShapedRecipe(res_craftingworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.craftingTable);
		recipe.setIngredient('B', MaterialData.wood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodenworktop1 = new SpoutItemStack(Blocks.woodenworktop, 3);
		recipe = new SpoutShapedRecipe(res_woodenworktop1);
		recipe.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.log);
		recipe.setIngredient('B', MaterialData.wood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_lamp = new SpoutItemStack(Blocks.lamp, 2);
		recipe = new SpoutShapedRecipe(res_lamp);
		recipe.shape(" A ", " B ", "BCB");
		recipe.setIngredient('A', MaterialData.stick);
		recipe.setIngredient('B', MaterialData.log);
		recipe.setIngredient('C', MaterialData.torch);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_neonlamp = new SpoutItemStack(Blocks.neonlampW, 2);
		recipe = new SpoutShapedRecipe(res_neonlamp);
		recipe.shape("BAB", "BBB");
		recipe.setIngredient('A', MaterialData.torch);
		recipe.setIngredient('B', MaterialData.glass);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_leatherthrone = new SpoutItemStack(Blocks.leatherthroneN, 1);
		recipe = new SpoutShapedRecipe(res_leatherthrone);
		recipe.shape("BAB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.leather);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_neonlampred = new SpoutItemStack(Blocks.neonlampWred);
		recipe2 = new SpoutShapelessRecipe(res_neonlampred);
		recipe2.addIngredient(MaterialData.roseRed);
		recipe2.addIngredient(Blocks.neonlampS);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		
		res_neonlampblue = new SpoutItemStack(Blocks.neonlampWblue);
		recipe2 = new SpoutShapelessRecipe(res_neonlampblue);
		recipe2.addIngredient(MaterialData.lapisLazuli);
		recipe2.addIngredient(Blocks.neonlampS);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		
		res_neonlampgreen = new SpoutItemStack(Blocks.neonlampWgreen);
		recipe2 = new SpoutShapelessRecipe(res_neonlampgreen);
		recipe2.addIngredient(MaterialData.cactusGreen);
		recipe2.addIngredient(Blocks.neonlampS);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		
		res_neonlampred = new SpoutItemStack(Blocks.neonlampWred);
		recipe2 = new SpoutShapelessRecipe(res_neonlampred);
		recipe2.addIngredient(MaterialData.roseRed);
		recipe2.addIngredient(Blocks.neonlampW);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		
		res_neonlampblue = new SpoutItemStack(Blocks.neonlampWblue);
		recipe2 = new SpoutShapelessRecipe(res_neonlampblue);
		recipe2.addIngredient(MaterialData.lapisLazuli);
		recipe2.addIngredient(Blocks.neonlampW);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		
		res_neonlampgreen = new SpoutItemStack(Blocks.neonlampWgreen);
		recipe2 = new SpoutShapelessRecipe(res_neonlampgreen);
		recipe2.addIngredient(MaterialData.cactusGreen);
		recipe2.addIngredient(Blocks.neonlampW);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		
//		res_carpetblack = new SpoutItemStack(Blocks.carpetblack, 6);
//		recipe = new SpoutShapedRecipe(res_carpetblack);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.blackWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetred = new SpoutItemStack(Blocks.carpetred, 6);
//		recipe = new SpoutShapedRecipe(res_carpetred);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.redWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetdarkgreen = new SpoutItemStack(Blocks.carpetdarkgreen, 6);
//		recipe = new SpoutShapedRecipe(res_carpetdarkgreen);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.greenWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetbrown = new SpoutItemStack(Blocks.carpetbrown, 6);
//		recipe = new SpoutShapedRecipe(res_carpetbrown);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.brownWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetblue = new SpoutItemStack(Blocks.carpetblue, 6);
//		recipe = new SpoutShapedRecipe(res_carpetblue);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.blueWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetpurple = new SpoutItemStack(Blocks.carpetpurple, 6);
//		recipe = new SpoutShapedRecipe(res_carpetpurple);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.purpleWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetcyan = new SpoutItemStack(Blocks.carpetcyan, 6);
//		recipe = new SpoutShapedRecipe(res_carpetcyan);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.cyanWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetlightgrey = new SpoutItemStack(Blocks.carpetlightgrey, 6);
//		recipe = new SpoutShapedRecipe(res_carpetlightgrey);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.lightGreyWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetgrey = new SpoutItemStack(Blocks.carpetgrey, 6);
//		recipe = new SpoutShapedRecipe(res_carpetgrey);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.greyWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetpink = new SpoutItemStack(Blocks.carpetpink, 6);
//		recipe = new SpoutShapedRecipe(res_carpetpink);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.pinkWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetlightgreen = new SpoutItemStack(Blocks.carpetlightgreen, 6);
//		recipe = new SpoutShapedRecipe(res_carpetlightgreen);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.limeWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetyellow = new SpoutItemStack(Blocks.carpetyellow, 6);
//		recipe = new SpoutShapedRecipe(res_carpetyellow);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.yellowWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetlightblue = new SpoutItemStack(Blocks.carpetlightblue, 6);
//		recipe = new SpoutShapedRecipe(res_carpetlightblue);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.lightBlueWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetmagenta = new SpoutItemStack(Blocks.carpetmagenta, 6);
//		recipe = new SpoutShapedRecipe(res_carpetmagenta);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.magentaWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetorange = new SpoutItemStack(Blocks.carpetorange, 6);
//		recipe = new SpoutShapedRecipe(res_carpetorange);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.orangeWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
//		
//		res_carpetwhite = new SpoutItemStack(Blocks.carpetwhite, 6);
//		recipe = new SpoutShapedRecipe(res_carpetwhite);
//		recipe.shape("AAA");
//		recipe.setIngredient('A', MaterialData.whiteWool);
//		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

		res_flowerbox = new SpoutItemStack(Blocks.flowerbox1N, 1);
		recipe = new SpoutShapedRecipe(res_flowerbox);
		recipe.shape("AB", "CC");
		recipe.setIngredient('A', MaterialData.rose);
		recipe.setIngredient('B', MaterialData.dandelion);
		recipe.setIngredient('C', MaterialData.clayBrick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_blueflower = new SpoutItemStack(Blocks.blueflower);
		recipe2 = new SpoutShapelessRecipe(res_blueflower);
		recipe2.addIngredient(MaterialData.dandelion);
		recipe2.addIngredient(MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		
		res_whiterose = new SpoutItemStack(Blocks.whiterose);
		recipe2 = new SpoutShapelessRecipe(res_whiterose);
		recipe2.addIngredient(MaterialData.rose);
		recipe2.addIngredient(MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
	}

}
