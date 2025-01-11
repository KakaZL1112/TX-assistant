package com.example.items;

import com.example.txassistantMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

class InitializeUtil{
    public void addGroup(ItemGroup group,Item item){}

    public void addFuel(Item item,int time){}

    public void addCompostingChance(CompostingChanceRegistry registry){}
}

public class ModItems {
    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.TX_CHECKER));
        CompostingChanceRegistry.INSTANCE.add(ModItems.TX_CHECKER,0.6f);
        FuelRegistry.INSTANCE.add(ModItems.TX_CHECKER,30*20);


    }

    public static final Item POWERFUL_COAL = register(
            new Item(new Item.Settings()),
            "powerful_coal"
    );

    public static final Item TX_CHECKER = register(
            new Item(new Item.Settings()),
            "tx_checker"
    );

    public static Item register(Item item, String id){
        Identifier itemID = Identifier.of(txassistantMod.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM,itemID,item);

        return registeredItem;
    }

}
