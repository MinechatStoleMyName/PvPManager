package me.NoChance.PvPManager.Config;

import java.util.List;

import me.NoChance.PvPManager.PvPManager;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Variables {

	private PvPManager plugin;
	public static boolean inCombatEnabled;
	public static int timeInCombat;
	public static boolean stopCommands;
	public static boolean punishmentsEnabled;
	public static boolean dropInventory;
	public static boolean dropExp;
	public static boolean dropArmor;
	public static boolean killOnLogout;
	public static List<String> worldsExcluded;
	public static boolean disableFly;
	public static boolean pvpTimerEnabled;
	public static boolean toggleSignsEnabled;
	public static boolean disableToggleCommand;
	public static boolean onlyTagAttacker;
	public static boolean updateCheck;
	public static boolean autoUpdate;
	public static boolean newbieProtectionEnabled;
	public static int newbieProtectionTime;
	public static String pvpOffSound;
	public static String pvpOnSound;
	public static boolean enableSound;
	public static boolean announcePvpOnWorldChange;
	public static boolean broadcastPvpLog;
	public static boolean fineEnabled;
	public static double fineAmount;
	public static boolean pvpBlood;
	public static boolean disableGamemode;
	public static boolean update = false;
	public static String newVersion;
	public static String currentVersion;

	public Variables(PvPManager plugin) {
		this.plugin = plugin;
		InitialiseVariables();
	}

	private void InitialiseVariables() {
		inCombatEnabled = getBoolean("In Combat.Enabled");
		timeInCombat = getInt("In Combat.Time(seconds)");
		stopCommands = getBoolean("In Combat.Stop Commands");
		punishmentsEnabled = getBoolean("In Combat.Punishments.Enabled");
		dropInventory = getBoolean("In Combat.Punishments.Drops.Inventory");
		dropExp = getBoolean("In Combat.Punishments.Drops.Experience");
		dropArmor = getBoolean("In Combat.Punishments.Drops.Armor");
		killOnLogout = getBoolean("In Combat.Punishments.Kill on Logout");
		worldsExcluded = getStringList("World Exclusions");
		disableFly = getBoolean("In Combat.Disable Fly");
		pvpTimerEnabled = getBoolean("PvP Timer.Enabled");
		toggleSignsEnabled = getBoolean("Toggle Signs.Enabled");
		disableToggleCommand = getBoolean("Toggle Signs.Disable Toggle Command");
		onlyTagAttacker = getBoolean("In Combat.Only Tag Attacker");
		updateCheck = getBoolean("Update Check.Enabled");
		autoUpdate = getBoolean("Update Check.Auto Update");
		newbieProtectionEnabled = getBoolean("Newbie Protection.Enabled");
		newbieProtectionTime = getInt("Newbie Protection.Time(minutes)");
		pvpOffSound = getString("PvP Timer.Sound.PvP Off Sound");
		pvpOnSound = getString("PvP Timer.Sound.PvP On Sound");
		enableSound = getBoolean("PvP Timer.Sound.Enabled");
		announcePvpOnWorldChange = getBoolean("PvP Timer.Announce On World Change");
		broadcastPvpLog = getBoolean("In Combat.Punishments.Broadcast PvPLog");
		fineEnabled = getBoolean("In Combat.Punishments.Fine.Enabled");
		fineAmount = getDouble("In Combat.Punishments.Fine.Amount");
		pvpBlood = getBoolean("PvP Blood");
		disableGamemode = getBoolean("In Combat.Disable GameMode");
		currentVersion = plugin.getDescription().getVersion();
	}

	private double getDouble(String a) {
		return plugin.getConfig().getDouble(a);
	}

	private boolean getBoolean(String a) {
		return plugin.getConfig().getBoolean(a);
	}

	private int getInt(String a) {
		return plugin.getConfig().getInt(a);
	}

	private List<String> getStringList(String a) {
		return plugin.getConfig().getStringList(a);
	}

	private String getString(String a) {
		return plugin.getConfig().getString(a);
	}

	public static void helpMenu(Player player) {
		player.sendMessage(ChatColor.GOLD + "-------------- PvPManager Help Page --------------");
		player.sendMessage(ChatColor.GOLD + "/pvp " + ChatColor.WHITE + "| Set PvP Enabled or Disabled.");
		player.sendMessage(ChatColor.GOLD + "/pvp status " + ChatColor.WHITE + "| Check What is your PvP Status.");
		player.sendMessage(ChatColor.GOLD + "/pvp status <player> " + ChatColor.WHITE + "| Check Another Player PvP Status.");
		player.sendMessage(ChatColor.GOLD + "/pvp disable protection " + ChatColor.WHITE + "| Disable Newbie Protection Before Expiration");
		player.sendMessage(ChatColor.GOLD + "/pm " + ChatColor.WHITE + "| Show This Help Page");
		player.sendMessage(ChatColor.GOLD + "/pm update " + ChatColor.WHITE + "| Update to Latest Version");
		player.sendMessage(ChatColor.GOLD + "/pm reload " + ChatColor.WHITE + "| Reload PvPManager");
		player.sendMessage(ChatColor.GOLD + "/pm pvpstart <time> [world] " + ChatColor.WHITE + "| Change the time PvP Starts in a world");
		player.sendMessage(ChatColor.GOLD + "/pm pvpend <time> [world] " + ChatColor.WHITE + "| Change the time PvP Ends in a world");
		player.sendMessage(ChatColor.GOLD + "-------------------------------------------------");
	}

}
