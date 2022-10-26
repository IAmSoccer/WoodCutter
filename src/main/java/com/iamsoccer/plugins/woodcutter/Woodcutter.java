package com.iamsoccer.plugins.woodcutter;

import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.StonecuttingRecipe;

public class Woodcutter extends JavaPlugin {

    @Override
    public void onEnable() {
//        Try to load in all the recipes, if it fails disable the plugin and print error.
        if(tryCreateStonecutterRecipes()) {
            getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.GOLD + "Woodcutter" + ChatColor.GRAY + "]" + ChatColor.GREEN + " Plugin has been enabled!");
        }
        else {
            getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.GOLD + "Woodcutter" + ChatColor.GRAY + "]" + ChatColor.RED + " Failed to load all or some recipes.... Disabling Plugin");
            this.getPluginLoader().disablePlugin(this);
        }
        }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.GOLD + "Woodcutter" + ChatColor.GRAY + "]" + ChatColor.RED + " Plugin has been disabled!");
    }
//    Probably want to add something to remove the recipes onDisable. Not really needed, but can help if the plugin is ever removed.

    public boolean tryCreateStonecutterRecipes() {
        try {
            StonecuttingRecipe stripoaklog = new StonecuttingRecipe(NamespacedKey.minecraft("oak_log_strip"), new ItemStack(Material.STRIPPED_OAK_LOG), Material.OAK_LOG);
            Bukkit.getServer().addRecipe(stripoaklog);
            StonecuttingRecipe stripoakwood = new StonecuttingRecipe(NamespacedKey.minecraft("oak_wood_strip"), new ItemStack(Material.STRIPPED_OAK_WOOD), Material.OAK_WOOD);
            Bukkit.getServer().addRecipe(stripoakwood);

            StonecuttingRecipe stripsprucelog = new StonecuttingRecipe(NamespacedKey.minecraft("spruce_log_strip"), new ItemStack(Material.STRIPPED_SPRUCE_LOG), Material.SPRUCE_LOG);
            Bukkit.getServer().addRecipe(stripsprucelog);
            StonecuttingRecipe stripsprucewood = new StonecuttingRecipe(NamespacedKey.minecraft("spruce_wood_strip"), new ItemStack(Material.STRIPPED_SPRUCE_WOOD), Material.SPRUCE_WOOD);
            Bukkit.getServer().addRecipe(stripsprucewood);

            StonecuttingRecipe stripbirchlog = new StonecuttingRecipe(NamespacedKey.minecraft("birch_log_strip"), new ItemStack(Material.STRIPPED_BIRCH_LOG), Material.BIRCH_LOG);
            Bukkit.getServer().addRecipe(stripbirchlog);
            StonecuttingRecipe stripbirchwood = new StonecuttingRecipe(NamespacedKey.minecraft("birch_wood_strip"), new ItemStack(Material.STRIPPED_BIRCH_WOOD), Material.BIRCH_WOOD);
            Bukkit.getServer().addRecipe(stripbirchwood);

            StonecuttingRecipe stripjunglelog = new StonecuttingRecipe(NamespacedKey.minecraft("jungle_log_strip"), new ItemStack(Material.STRIPPED_JUNGLE_LOG), Material.JUNGLE_LOG);
            Bukkit.getServer().addRecipe(stripjunglelog);
            StonecuttingRecipe stripjunglewood = new StonecuttingRecipe(NamespacedKey.minecraft("jungle_wood_strip"), new ItemStack(Material.STRIPPED_JUNGLE_WOOD), Material.JUNGLE_WOOD);
            Bukkit.getServer().addRecipe(stripjunglewood);

            StonecuttingRecipe stripacacialog = new StonecuttingRecipe(NamespacedKey.minecraft("acacia_log_strip"), new ItemStack(Material.STRIPPED_ACACIA_LOG), Material.ACACIA_LOG);
            Bukkit.getServer().addRecipe(stripacacialog);
            StonecuttingRecipe stripacaciawood = new StonecuttingRecipe(NamespacedKey.minecraft("acacia_wood_strip"), new ItemStack(Material.STRIPPED_ACACIA_WOOD), Material.ACACIA_WOOD);
            Bukkit.getServer().addRecipe(stripacaciawood);

            StonecuttingRecipe stripdarkoaklog = new StonecuttingRecipe(NamespacedKey.minecraft("dark_oak_log_strip"), new ItemStack(Material.STRIPPED_DARK_OAK_LOG), Material.DARK_OAK_LOG);
            Bukkit.getServer().addRecipe(stripdarkoaklog);
            StonecuttingRecipe stripdarkoakwood = new StonecuttingRecipe(NamespacedKey.minecraft("dark_oak_wood_strip"), new ItemStack(Material.STRIPPED_DARK_OAK_WOOD), Material.DARK_OAK_WOOD);
            Bukkit.getServer().addRecipe(stripdarkoakwood);

            StonecuttingRecipe stripmangrovelog = new StonecuttingRecipe(NamespacedKey.minecraft("mangrove_log_strip"), new ItemStack(Material.STRIPPED_MANGROVE_LOG), Material.MANGROVE_LOG);
            Bukkit.getServer().addRecipe(stripmangrovelog);
            StonecuttingRecipe stripmangrovewood = new StonecuttingRecipe(NamespacedKey.minecraft("mangrove_wood_strip"), new ItemStack(Material.STRIPPED_MANGROVE_WOOD), Material.MANGROVE_WOOD);
            Bukkit.getServer().addRecipe(stripmangrovewood);

            StonecuttingRecipe stripcrimsonstem = new StonecuttingRecipe(NamespacedKey.minecraft("crimson_stem_strip"), new ItemStack(Material.STRIPPED_CRIMSON_STEM), Material.CRIMSON_STEM);
            Bukkit.getServer().addRecipe(stripcrimsonstem);
            StonecuttingRecipe stripcrimsonhyphae = new StonecuttingRecipe(NamespacedKey.minecraft("crimson_hyphae_strip"), new ItemStack(Material.STRIPPED_CRIMSON_HYPHAE), Material.CRIMSON_HYPHAE);
            Bukkit.getServer().addRecipe(stripcrimsonhyphae);

            StonecuttingRecipe stripwarpedstem = new StonecuttingRecipe(NamespacedKey.minecraft("warped_stem_strip"), new ItemStack(Material.STRIPPED_WARPED_STEM), Material.WARPED_STEM);
            Bukkit.getServer().addRecipe(stripwarpedstem);
            StonecuttingRecipe stripwarpedhyphae = new StonecuttingRecipe(NamespacedKey.minecraft("warped_hyphae_strip"), new ItemStack(Material.STRIPPED_WARPED_HYPHAE), Material.WARPED_HYPHAE);
            Bukkit.getServer().addRecipe(stripwarpedhyphae);

            return true;
        } catch (Exception e) {
            getServer().getConsoleSender().sendMessage(String.valueOf(e));
            return false;
        }
    }
}

