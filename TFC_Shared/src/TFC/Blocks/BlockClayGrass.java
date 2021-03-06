package TFC.Blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import TFC.*;
import TFC.Core.ColorizerGrassTFC;
import TFC.Core.TFC_Climate;
import TFC.Core.TFC_Settings;

public class BlockClayGrass extends BlockGrass
{

    public BlockClayGrass(int par1, int par2)
    {
        super(par1, par2);
    }

    @Override
    public void func_94332_a(IconRegister registerer)
    {
		for(int i = 0; i < 23; i++)
		{
			DirtTexture[i] = registerer.func_94245_a("clay/Clay"+i);
		}
		GrassTopTexture = registerer.func_94245_a("GrassTop");
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.clay.itemID;
    }

}
