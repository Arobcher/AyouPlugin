package com.github.Ayou.myplugins;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener{
		@Override
		public void onEnable(){
			Bukkit.getConsoleSender().sendMessage("插件加载");
			getCommand("fly").setExecutor(new command());
			getCommand("hayo").setExecutor(new command());
			getCommand("heal").setExecutor(new command());
		}
		@Override
		public void onDisable(){
			Bukkit.getConsoleSender().sendMessage("插件卸载");
}
}