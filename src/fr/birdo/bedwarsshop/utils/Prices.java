package fr.birdo.bedwarsshop.utils;

import fr.birdo.bedwarsshop.BedwarsShop;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Prices implements Listener {

    // create Main class instance
    private static BedwarsShop instance;

    public Prices(BedwarsShop pluginInstance) {
        this.instance = pluginInstance;
    }

    @EventHandler
    public static void createFile(){

        //Blocks
        instance.createPricesFile("blocks.wool.price","1");
        instance.createPricesFile("blocks.wool.money","type1");
        instance.createPricesFile("blocks.clay.price","1");
        instance.createPricesFile("blocks.clay.money","type1");
        instance.createPricesFile("blocks.glass.price","1");
        instance.createPricesFile("blocks.glass.money","type1");
        instance.createPricesFile("blocks.end_stone.price","24");
        instance.createPricesFile("blocks.end_stone.money","type1");
        instance.createPricesFile("blocks.planks.price","1");
        instance.createPricesFile("blocks.planks.money","type1");
        instance.createPricesFile("blocks.ladders.price","1");
        instance.createPricesFile("blocks.ladders.money","type1");
        instance.createPricesFile("blocks.obsidian.price","1");
        instance.createPricesFile("blocks.obsidian.money","type1");

        //Weapons
        instance.createPricesFile("weapons.stone_sword.price","1");
        instance.createPricesFile("weapons.stone_sword.money","type1");
        instance.createPricesFile("weapons.iron_sword.price","1");
        instance.createPricesFile("weapons.iron_sword.money","type1");
        instance.createPricesFile("weapons.diamond_sword.price","1");
        instance.createPricesFile("weapons.diamond_sword.money","type1");
        instance.createPricesFile("weapons.stick.price","24");
        instance.createPricesFile("weapons.stick.money","type1");

        //Armors
        instance.createPricesFile("armors.chain_armor.price","1");
        instance.createPricesFile("armors.chain_armor.money","type1");
        instance.createPricesFile("armors.iron_armor.price","1");
        instance.createPricesFile("armors.iron_armor.money","type1");
        instance.createPricesFile("armors.diamond_armor.price","1");
        instance.createPricesFile("armors.diamond_armor.money","type1");

        //Tools
        instance.createPricesFile("tools.wood_pickaxe.price","1");
        instance.createPricesFile("tools.wood_pickaxe.money","type1");
        instance.createPricesFile("tools.stone_pickaxe.price","1");
        instance.createPricesFile("tools.stone_pickaxe.money","type1");
        instance.createPricesFile("tools.iron_pickaxe.price","1");
        instance.createPricesFile("tools.iron_pickaxe.money","type1");
        instance.createPricesFile("tools.diamond_pickaxe.price","24");
        instance.createPricesFile("tools.diamond_pickaxe.money","type1");
        instance.createPricesFile("tools.diamond_pickaxe_enchanted.price","1");
        instance.createPricesFile("tools.diamond_pickaxe_enchanted.money","type1");
        instance.createPricesFile("tools.wood_axe.price","1");
        instance.createPricesFile("tools.wood_axe.money","type1");
        instance.createPricesFile("tools.stone_axe.price","1");
        instance.createPricesFile("tools.stone_axe.money","type1");
        instance.createPricesFile("tools.iron_axe.price","1");
        instance.createPricesFile("tools.iron_axe.money","type1");
        instance.createPricesFile("tools.diamond_axe.price","24");
        instance.createPricesFile("tools.diamond_axe.money","type1");
        instance.createPricesFile("tools.diamond_axe_enchanted.price","1");
        instance.createPricesFile("tools.diamond_axe_enchanted.money","type1");
        instance.createPricesFile("tools.shears.price","1");
        instance.createPricesFile("tools.shears.money","type1");

        //Bows
        instance.createPricesFile("bows.arrows.price","1");
        instance.createPricesFile("bows.arrows.money","type1");
        instance.createPricesFile("bows.bow.price","1");
        instance.createPricesFile("bows.bow.money","type1");
        instance.createPricesFile("bows.bow_enchanted_1.price","1");
        instance.createPricesFile("bows.bow_enchanted_1.money","type1");
        instance.createPricesFile("bows.bow_enchanted_2.price","24");
        instance.createPricesFile("bows.bow_enchanted_2.money","type1");

        //Potions
        instance.createPricesFile("potions.speed_potion.price","1");
        instance.createPricesFile("potions.speed_potion.money","type1");
        instance.createPricesFile("potions.jump_potion.price","1");
        instance.createPricesFile("potions.jump_potion.money","type1");
        instance.createPricesFile("potions.invisibility_potion.price","1");
        instance.createPricesFile("potions.invisibility_potion.money","type1");

        //Other
        instance.createPricesFile("other.golden_apple.price","1");
        instance.createPricesFile("other.golden_apple.money","type1");
        instance.createPricesFile("other.tnt.price","1");
        instance.createPricesFile("other.tnt.money","type1");
        instance.createPricesFile("other.ender_pearl.price","1");
        instance.createPricesFile("other.ender_pearl.money","type1");
        instance.createPricesFile("other.water_bucket.price","24");
        instance.createPricesFile("other.water_bucket.money","type1");
        instance.createPricesFile("other.milk_bucket.price","1");
        instance.createPricesFile("other.milk_bucket.money","type1");
        instance.createPricesFile("other.sponge.price","1");
        instance.createPricesFile("other.sponge.money","type1");
    }
}