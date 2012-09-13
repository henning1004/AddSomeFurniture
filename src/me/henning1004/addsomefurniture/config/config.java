package me.henning1004.addsomefurniture.config;

public class config
{

    public config()
    {
    }

    public static void set()
    {
    	if(!Configuration.confi.contains("NoPermissions"))
            Configuration.confi.set("NoPermissions", "false");
    	if(!Configuration.confi.contains("HDTextures"))
            Configuration.confi.set("HDTextures", "false");
}
}
