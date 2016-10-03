package com.github.Ayou.myplugins;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class command 
     implements CommandExecutor
     {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(!(sender instanceof Player))
		{
		sender.sendMessage("§c只有玩家可以使用!");
		return true;
		}
		if(cmd.getName().equalsIgnoreCase("hayo")){
			Player hp = (Player)sender;
			if(hp.hasPermission("hayo.use"))
			{
				hp.sendMessage("hayo~");
			}else{
				hp.sendMessage("你没有权限");
			}
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("heal")){
			Player player = (Player)sender;
			if(player.hasPermission("heal.use"))
			{
				if (player.hasPermission("heal.use"));
					player.setHealth(20);
					player.setFoodLevel(20);
					player.setHealth(20);
					sender.sendMessage("§b你已被治疗");
			}else{
					sender.sendMessage("§c你需要权限才能执行这个指令");
			}
			return true;
		}
		Player p = (Player)sender;
		
		if(!p.hasPermission("fly.use"))
		{
			p.sendMessage("你没有权限使用该指令");
			return true;
		}
		if (p.getAllowFlight()) 
		{
			p.setAllowFlight(false);
			p.setFlying(false);
			p.sendMessage("§c你关闭了飞行模式");
		}
		else 
		{
		p.setAllowFlight(true);
		p.sendMessage("§a你开启了飞行模式");
		}
		return true;
	}
}