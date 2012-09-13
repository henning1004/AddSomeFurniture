package me.henning1004.addsomefurniture.config;

public class HDTextureConfig
{

    public HDTextureConfig()
    {
    }

    public static void set() 
    {
       
        if(!Configuration.textureHD.contains("Table HD Texture"))
            Configuration.textureHD.set("Table HD Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/HD%20Textures/text_table_HD.png");
        if(!Configuration.textureHD.contains("Chair HD Texture"))
            Configuration.textureHD.set("Chair HD Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/HD%20Textures/text_chair_HD.png");
        if(!Configuration.textureHD.contains("Throne HD Texture"))
            Configuration.textureHD.set("Throne HD Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/HD%20Textures/text_throne_HD.png");
        if(!Configuration.textureHD.contains("Worktop HD Texture"))
            Configuration.textureHD.set("Worktop HD Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/HD%20Textures/text_worktop_HD.png");
        if(!Configuration.textureHD.contains("Other HD Texture"))
            Configuration.textureHD.set("Other HD Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/HD%20Textures/text_other_HD.png");
        if(!Configuration.textureHD.contains("Carpet HD Texture"))
            Configuration.textureHD.set("Carpet HD Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/HD%20Textures/text_carpet_HD.png");
       
    }
}
