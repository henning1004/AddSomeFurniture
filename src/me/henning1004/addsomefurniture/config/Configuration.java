package me.henning1004.addsomefurniture.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.Bukkit;

public class Configuration
{

    public Configuration()
    {
    }

    public static void start()
    {
    	Bukkit.getLogger().log(Level.INFO,"\033[36m" +   "[AddSomeFurniture] Configuration loading..."  + "\033[0m");
    }

    private static void exclaim(String filename)
    {
    	Bukkit.getLogger().log(Level.INFO, "[AddSomeFurniture] Saved file ");
    }

    private static void complain(String filename)
    {
    	Bukkit.getLogger().log(Level.SEVERE, "[AddSomeFurniture] On file ");
    	Bukkit.getLogger().log(Level.SEVERE, "[AddSomeFurniture] Invalid configuration!");
    }

    private static void complainFileCreation(String filename)
    {
    	Bukkit.getLogger().log(Level.SEVERE, "[AddSomeFurniture] On file ");
    	Bukkit.getLogger().log(Level.SEVERE, "[AddSomeFurniture] Could NOT create default files!");
    }

    private static boolean load(MyConfiguration y, String name)
    {
        try
        {
            y.load((new StringBuilder("plugins/AddSomeFurniture/")).append(name).toString());
        }
        catch(FileNotFoundException e)
        {
            return true;
        }
        catch(Exception e)
        {
            complain(name);
        }
        return false;
    }

    private static void save(MyConfiguration y)
    {
        try
        {
            y.save();
            try
            {
                y.load((new StringBuilder("plugins/AddSomeFurniture/")).append(y.getFilename()).toString());
            }
            catch(Exception exception) { }
            exclaim(y.getFilename());
        }
        catch(IOException e)
        {
            complainFileCreation(y.getFilename());
        }
    }
    
    
    public static MyConfiguration textureHD;

    static 
    {
    	textureHD = new MyConfiguration();
        if(load(textureHD, "HDTextureConfig.yml"))
        {
        	textureHD = MyConfiguration.loadConfiguration("plugins/AddSomeFurniture/HDTextureConfig.yml");
            HDTextureConfig.set();
            save(textureHD);
        }
        HDTextureConfig.set();
        try
        {
        	textureHD.save();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public static MyConfiguration texture;

    static 
    {
        texture = new MyConfiguration();
        if(load(texture, "texturesConfig.yml"))
        {
            texture = MyConfiguration.loadConfiguration("plugins/AddSomeFurniture/texturesConfig.yml");
            TextureConfig.set();
            save(texture);
        }
        TextureConfig.set();
        try
        {
            texture.save();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    } 
    
    public static MyConfiguration confi;

    static 
    {
    	confi = new MyConfiguration();
        if(load(confi, "config.yml"))
        {
        	confi = MyConfiguration.loadConfiguration("plugins/AddSomeFurniture/config.yml");
            config.set();
            save(confi);
        }
        config.set();
        try
        {
        	confi.save();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
