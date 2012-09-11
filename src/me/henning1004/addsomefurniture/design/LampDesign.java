package me.henning1004.addsomefurniture.design;

import me.henning1004.addsomefurniture.AddSomeFurniture;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class LampDesign extends GenericBlockDesign
{
	
	public LampDesign(AddSomeFurniture plugin, int[] textureids) {
		texture = plugin.other;
		setBoundingBox(0,0,0,1,1,1).setQuadNumber(11);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex1 = texture.getSubTexture(textureids[0]);
		SubTexture subTex2 = texture.getSubTexture(textureids[1]);
		SubTexture subTex3 = texture.getSubTexture(textureids[2]);
		

	    Quad oben = new Quad(5, subTex2);
        oben.addVertex(0, 0.3125F, 0.75F, 0.6875F);
        oben.addVertex(1, 0.6875F, 0.75F, 0.6875F);
        oben.addVertex(2, 0.6875F, 0.75F, 0.3125F);
        oben.addVertex(3, 0.3125F, 0.75F, 0.3125F);
		
        Quad unten = new Quad(1, subTex3);
		unten.addVertex(0, 0.125F, 0.0625F, 0.125F);
		unten.addVertex(1, 0.875F, 0.0625F, 0.125F);
		unten.addVertex(2, 0.875F, 0.0625F, 0.875F);
		unten.addVertex(3, 0.125F, 0.0625F, 0.875F);
		
        Quad tops1 = new Quad(2, subTex2);
        tops1.addVertex(1, 0.125F, 0.0625F, 0.875F);
        tops1.addVertex(2, 0.3125F, 0.75F, 0.6875F);
        tops1.addVertex(3, 0.3125F, 0.75F, 0.3125F);
        tops1.addVertex(0, 0.125F, 0.0625F, 0.125F);
        
        Quad tops2 = new Quad(3, subTex2);
        tops2.addVertex(0, 0.125F, 0.0625F, 0.875F);
        tops2.addVertex(1, 0.875F, 0.0625F, 0.875F);
        tops2.addVertex(2, 0.6875F, 0.75F, 0.6875F);
        tops2.addVertex(3, 0.3125F, 0.75F, 0.6875F);
        
        Quad tops3 = new Quad(4, subTex2);
        tops3.addVertex(1, 0.6875F, 0.75F, 0.6875F);
        tops3.addVertex(2, 0.875F, 0.0625F, 0.875F);
        tops3.addVertex(3, 0.875F, 0.0625F, 0.125F);
        tops3.addVertex(0, 0.6875F, 0.75F, 0.3125F);
        
        Quad tops4 = new Quad(0, subTex2);
		tops4.addVertex(0, 0.3125F, 0.75F, 0.3125F);
		tops4.addVertex(1, 0.6875F, 0.75F, 0.3125F);
		tops4.addVertex(2, 0.875F, 0.0625F, 0.125F);
		tops4.addVertex(3, 0.125F, 0.0625F, 0.125F);
       
        
        
        Quad ants1 = new Quad(6, subTex1);
        ants1.addVertex(0, 0.4375F, 1F, 0.4375F);
        ants1.addVertex(1, 0.5625F, 1F, 0.4375F);
        ants1.addVertex(2, 0.5625F, 0.125F, 0.4375F);
        ants1.addVertex(3, 0.4375F, 0.125F, 0.4375F);
        
        Quad ants2 = new Quad(7, subTex1);
        ants2.addVertex(1, 0.5625F, 1F, 0.5625F);
        ants2.addVertex(2, 0.5625F, 0.125F, 0.5625F);
        ants2.addVertex(3, 0.5625F, 0.125F, 0.4375F);
        ants2.addVertex(0, 0.5625F, 1F, 0.4375F);
        
        Quad ants3 = new Quad(8, subTex1);
        ants3.addVertex(0, 0.4375F, 0.125F, 0.5625F);
        ants3.addVertex(1, 0.5625F, 0.1875F, 0.5625F);
        ants3.addVertex(2, 0.5625F, 1F, 0.5625F);
        ants3.addVertex(3, 0.4375F, 1F, 0.5625F);
        
        Quad ants4 = new Quad(9, subTex1);
        ants4.addVertex(1, 0.4375F, 0.125F, 0.5625F);
        ants4.addVertex(2, 0.4375F, 1F, 0.5625F);
        ants4.addVertex(3, 0.4375F, 1F, 0.4375F);
        ants4.addVertex(0, 0.4375F, 0.125F, 0.4375F);
        
        Quad anttop = new Quad(10, subTex1);
        anttop.addVertex(0, 0.4375F, 1F, 0.5625F);
        anttop.addVertex(1, 0.5625F, 1F, 0.5625F);
        anttop.addVertex(2, 0.5625F, 1F, 0.4375F);
        anttop.addVertex(3, 0.4375F, 1F, 0.4375F);
		

		setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(anttop).setQuad(ants1).setQuad(ants4).setQuad(ants3).setQuad(ants2);
	}
}
	
