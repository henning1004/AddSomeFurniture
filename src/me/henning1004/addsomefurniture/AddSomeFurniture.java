package me.henning1004.addsomefurniture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;


import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.furniture.Blocks;
import me.henning1004.addsomefurniture.utils.MetricsLite;
import me.henning1004.addsomefurniture.recipes.Recipes_normal;
import me.henning1004.addsomefurniture.recipes.Recipes_birch;
import me.henning1004.addsomefurniture.recipes.Recipes_jungle;
import me.henning1004.addsomefurniture.recipes.Recipes_spruce;
import me.henning1004.addsomefurniture.listener.BlockListener;
import me.henning1004.addsomefurniture.listener.SeatListener;
import me.henning1004.addsomefurniture.listener.LampListener;
import me.henning1004.addsomefurniture.listener.WorktopListener;
import me.henning1004.addsomefurniture.listener.CraftListener;

import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;

public class AddSomeFurniture extends JavaPlugin
{
	public Texture chair;
	public Texture table;
	public Texture throne;
	public Texture worktop;
	public Texture other;
	public Texture carpet;
	public static Permission permission = null;
	
	
	public AddSomeFurniture()
	{
		
	}
	
	
	public void onDisable()
	{
		Bukkit.getLogger().log(Level.INFO,"\033[36m" +  "[AddSomeFurniture] Disabled!" + "\033[0m");
	}
	
	public void onEnable()
	{
		Bukkit.getLogger().log(Level.INFO,"\033[33m" + "--------------------------------------------"+ "\033[0m");
		
		if(getServer().getPluginManager().getPlugin("Spout") != null){
		Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Enabled!" + "\033[0m");
		Configuration.start();
		Bukkit.getLogger().log(Level.INFO,"\033[36m" + "[AddSomeFurniture] Hooking into Vault..." + "\033[0m");
        if(getServer().getPluginManager().getPlugin("Vault") != null)
        {
            if(!setupPermissions())
            {
            	Bukkit.getLogger().log(Level.WARNING,"\033[31m" + "[AddSomeFurniture] Can't find an permissions plugin." + "\033[0m");
            	getServer().getPluginManager().disablePlugin(this);
            }
            else
            	Bukkit.getLogger().log(Level.INFO,"\033[36m" +  "[AddSomeFurniture] Connected to permissions plugin via Vault!" + "\033[0m");
        } else
        {
        	Bukkit.getLogger().log(Level.WARNING,"\033[31m" + "[AddSomeFurniture] Vault plugin not found." + "\033[0m");
        }
        
        if (Configuration.textureHD.getString("Enable").equals("true")){
        precacheHD();
		loadtexturesHD();
		}
        else{
        	precache();
    		loadtextures();	
        }
        
		Bukkit.getLogger().log(Level.INFO,"\033[36m" + "[AddSomeFurniture] Loading modified pieces of furniture" + "\033[0m");
		Blocks.registerBlocks(this);
		Bukkit.getLogger().log(Level.INFO,"\033[36m" + "[AddSomeFurniture] Loading modified recipes!" + "\033[0m");
		Recipes_normal.registerRecipes(this);
		Recipes_birch.registerRecipes(this);
		Recipes_jungle.registerRecipes(this);
		Recipes_spruce.registerRecipes(this);
		getServer().getPluginManager().registerEvents(new CraftListener(this), this);
		getServer().getPluginManager().registerEvents(new BlockListener(this), this);
		getServer().getPluginManager().registerEvents(new SeatListener(this), this);
		getServer().getPluginManager().registerEvents(new LampListener(this), this);
		getServer().getPluginManager().registerEvents(new WorktopListener(this), this);

		
		try {
		    MetricsLite metrics = new MetricsLite(this);
		    metrics.start();
		} catch (IOException e) {
		    // Failed to submit the stats :-(
		}
		
		updateCheck();
		}
		else{
			Bukkit.getLogger().log(Level.WARNING,"\033[31m" + "[AddSomeFurniture] Spoutplugin not found, can't load AddSomeFurniture!" + "\033[0m");
			Bukkit.getLogger().log(Level.WARNING,"\033[31m" + "[AddSomeFurniture] Download Spout here: http://get.spout.org/" + "\033[0m");
		}
		
		Bukkit.getLogger().log(Level.INFO,"\033[33m" + "--------------------------------------------"+ "\033[0m");
		
	}

	private void precacheHD() {
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.textureHD.getString("Table HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.textureHD.getString("Chair HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.textureHD.getString("Throne HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.textureHD.getString("Worktop HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.textureHD.getString("Other HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.textureHD.getString("Carpet HD Texture"));
	}
	private void precache() {
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.texture.getString("Table Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.texture.getString("Chair Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.texture.getString("Throne Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.texture.getString("Worktop Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.texture.getString("Other Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(AddSomeFurniture.this, Configuration.texture.getString("Carpet Texture"));
	}


	private void loadtexturesHD() {
		table = new Texture(this, Configuration.textureHD.getString("Table HD Texture"), 1024, 1024, 64);
		chair = new Texture(this, Configuration.textureHD.getString("Chair HD Texture"), 1024, 1024, 64);
		throne = new Texture(this, Configuration.textureHD.getString("Throne HD Texture"), 1024, 1024, 64);
		worktop = new Texture(this, Configuration.textureHD.getString("Worktop HD Texture"), 1024, 1024, 64);
		other = new Texture(this, Configuration.textureHD.getString("Other HD Texture"), 1024, 1024, 64);
		carpet = new Texture(this, Configuration.textureHD.getString("Carpet HD Texture"), 1024, 1024, 64);	
		Bukkit.getLogger().log(Level.INFO,"\033[36m" + "[AddSomeFurniture] HD Textures loaded!" + "\033[0m");
	}
			
	private void loadtextures() {
		table = new Texture(this, Configuration.texture.getString("Table Texture"), 256, 256, 16);
		chair = new Texture(this, Configuration.texture.getString("Chair Texture"), 256, 256, 16);
		throne = new Texture(this, Configuration.texture.getString("Throne Texture"), 256, 256, 16);
		worktop = new Texture(this, Configuration.texture.getString("Worktop Texture"), 256, 256, 16);
		other = new Texture(this, Configuration.texture.getString("Other Texture"), 256, 256, 16);
		carpet = new Texture(this, Configuration.texture.getString("Carpet Texture"), 256, 256, 16);
		Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Normal Textures loaded!" + "\033[0m");	
	}
	
    private boolean setupPermissions()
    {
		@SuppressWarnings("rawtypes")
		RegisteredServiceProvider permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if(permissionProvider != null)
            permission = (Permission)permissionProvider.getProvider();
        return (permission != null);
    }
      
    
    public static boolean hasPermission(Player player, String permissionNode)
    {
        if(permission != null)
            return permission.has(player, permissionNode);
        else
            return player.hasPermission(permissionNode);
    }
    
    private void updateCheck()
    {
        Bukkit.getLogger().log(Level.INFO,"\033[36m" +  "[AddSomeFurniture] Checking for updates..." + "\033[0m");
        try
        {
        	
        	URLConnection txt = (new URL("https://dl.dropbox.com/u/62050717/AddSomeFurniture/latestVersion.TXT")).openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(txt.getInputStream()));
            String latestVersion = in.readLine();
            int this_pluginversion = Integer.parseInt(getDescription().getVersion().replace(".", ""));
            int latest_pluginversion = Integer.parseInt(latestVersion.replace(".", ""));
            String msg = null;
            
            if(this_pluginversion < latest_pluginversion){
                msg = (new StringBuilder("\033[31m" + "[AddSomeFurniture] Plugin is out of date, version ")).append(latestVersion).append(" is available for download.").toString() + "\033[0m";
            }
                else{
                	if(this_pluginversion > latest_pluginversion){
                    	msg = (new StringBuilder("\033[35m" + "[AddSomeFurniture] Plugin is more than up to date! Your Version: ").toString() + getDescription().getVersion() + (" Recommended Version: ").toString() + latestVersion + "\033[0m");	
                    	}
                    	else{
                    		msg = (new StringBuilder("\033[32m" + "[AddSomeFurniture] Plugin is up to date! Your Version: ").toString() + getDescription().getVersion() + "\033[0m");	
                    	}                	}
            if(msg != null){
            	Bukkit.getLogger().log(Level.INFO, msg);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	if(cmd.getName().equalsIgnoreCase("asf")){ 
    		try
            {
    			
    			URLConnection txt = (new URL("https://dl.dropbox.com/u/62050717/AddSomeFurniture/latestVersion.TXT")).openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(txt.getInputStream()));
                String latestVersion = in.readLine();
                int this_pluginversion = Integer.parseInt(getDescription().getVersion().replace(".", ""));
                int latest_pluginversion = Integer.parseInt(latestVersion.replace(".", ""));
                String msg = null;
                
                if(this_pluginversion < latest_pluginversion){
                    msg = (new StringBuilder("&4 AddSomeFurniture is out of date, version ")).append(latestVersion).append(" is available for download.").toString();
                }
                    else{
                    	if(this_pluginversion > latest_pluginversion){
                    	msg = (new StringBuilder("&4 AddSomeFurniture is more than up to date! Your Version: ").toString() + getDescription().getVersion() + (" Recommended Version: ").toString() + latestVersion);	
                    	}
                    	else{
                    		msg = (new StringBuilder("&4 AddSomeFurniture is up to date! Your Version: ").toString() + getDescription().getVersion());	
                    	}
                    }
                if(msg != null){
                	sender.sendMessage(msg);
                }
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    		return true;
    	}
    	return false; 
    }
    
    @SuppressWarnings("unused")
	private void hideitems() {

	}



}
