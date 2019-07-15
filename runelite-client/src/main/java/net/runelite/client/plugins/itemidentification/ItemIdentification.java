/*
 * Copyright (c) 2019, Hydrox6 <ikada@protonmail.ch>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.itemidentification;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.runelite.api.ItemID;

enum ItemIdentification
{
	//Seeds
	GUAM_SEED(Type.SEED, "Guam", "G", ItemID.GUAM_SEED),
	MARRENTILL_SEED(Type.SEED, "Marren", "M", ItemID.MARRENTILL_SEED),
	TARROMIN_SEED(Type.SEED, "Tarro", "TAR", ItemID.TARROMIN_SEED),
	HARRALANDER_SEED(Type.SEED, "Harra", "H", ItemID.HARRALANDER_SEED),
	RANARR_SEED(Type.SEED, "Ranarr", "R", ItemID.RANARR_SEED),
	TOADFLAX_SEED(Type.SEED, "Toad", "TOA", ItemID.TOADFLAX_SEED),
	IRIT_SEED(Type.SEED, "Irit", "I", ItemID.IRIT_SEED),
	AVANTOE_SEED(Type.SEED, "Avantoe", "A", ItemID.AVANTOE_SEED),
	KWUARM_SEED(Type.SEED, "Kwuarm", "K", ItemID.KWUARM_SEED),
	SNAPDRAGON_SEED(Type.SEED, "Snap", "S", ItemID.SNAPDRAGON_SEED),
	CADANTINE_SEED(Type.SEED, "Cadan", "C", ItemID.CADANTINE_SEED),
	LANTADYME_SEED(Type.SEED, "Lanta", "L", ItemID.LANTADYME_SEED),
	DWARF_WEED_SEED(Type.SEED, "Dwarf", "D", ItemID.DWARF_WEED_SEED),
	TORSTOL_SEED(Type.SEED, "Torstol", "TOR", ItemID.TORSTOL_SEED),
	POISON_IVY_SEED(Type.SEED, "Ivy", "I", ItemID.POISON_IVY_SEED),
	WHITEBERRY_SEED( Type.SEED, "White", "W", ItemID.WHITEBERRY_SEED),

	//Herbs
	GUAM(Type.HERB, "Guam", "G", ItemID.GUAM_LEAF, ItemID.GRIMY_GUAM_LEAF),
	MARRENTILL(Type.HERB, "Marren", "M", ItemID.MARRENTILL, ItemID.GRIMY_MARRENTILL),
	TARROMIN(Type.HERB, "Tarro", "TAR", ItemID.TARROMIN, ItemID.GRIMY_TARROMIN),
	HARRALANDER(Type.HERB, "Harra", "H", ItemID.HARRALANDER, ItemID.GRIMY_HARRALANDER),
	RANARR(Type.HERB, "Ranarr", "R", ItemID.RANARR_WEED, ItemID.GRIMY_RANARR_WEED),
	TOADFLAX(Type.HERB, "Toad", "TOA", ItemID.TOADFLAX, ItemID.GRIMY_TOADFLAX),
	IRIT(Type.HERB, "Irit", "I", ItemID.IRIT_LEAF, ItemID.GRIMY_IRIT_LEAF),
	AVANTOE(Type.HERB, "Avantoe", "A", ItemID.AVANTOE, ItemID.GRIMY_AVANTOE),
	KWUARM(Type.HERB, "Kwuarm", "K", ItemID.KWUARM, ItemID.GRIMY_KWUARM),
	SNAPDRAGON(Type.HERB, "Snap", "S", ItemID.SNAPDRAGON, ItemID.GRIMY_SNAPDRAGON),
	CADANTINE(Type.HERB, "Cadan", "C", ItemID.CADANTINE, ItemID.GRIMY_CADANTINE),
	LANTADYME(Type.HERB, "Lanta", "L", ItemID.LANTADYME, ItemID.GRIMY_LANTADYME),
	DWARF_WEED(Type.HERB, "Dwarf", "D", ItemID.DWARF_WEED, ItemID.GRIMY_DWARF_WEED),
	TORSTOL(Type.HERB, "Torstol", "TOR", ItemID.TORSTOL, ItemID.GRIMY_TORSTOL),

	//Saplings
	OAK_SAPLING(Type.SAPLING, "Oak", "OAK", ItemID.OAK_SAPLING, ItemID.OAK_SEEDLING, ItemID.OAK_SEEDLING_W),
	WILLOW_SAPLING(Type.SAPLING, "Willow", "WIL", ItemID.WILLOW_SAPLING, ItemID.WILLOW_SEEDLING, ItemID.WILLOW_SEEDLING_W),
	MAPLE_SAPLING(Type.SAPLING, "Maple", "MAP", ItemID.MAPLE_SAPLING, ItemID.MAPLE_SEEDLING, ItemID.MAPLE_SEEDLING_W),
	YEW_SAPLING(Type.SAPLING, "Yew", "YEW", ItemID.YEW_SAPLING, ItemID.YEW_SEEDLING, ItemID.YEW_SEEDLING_W),
	MAGIC_SAPLING(Type.SAPLING, "Magic", "MAG", ItemID.MAGIC_SAPLING, ItemID.MAGIC_SEEDLING, ItemID.MAGIC_SEEDLING_W),
	REDWOOD_SAPLING(Type.SAPLING, "Red", "RED", ItemID.REDWOOD_SAPLING, ItemID.REDWOOD_SEEDLING, ItemID.REDWOOD_SEEDLING_W),
	SPIRIT_SAPLING(Type.SAPLING, "Spirit", "SPI", ItemID.SPIRIT_SAPLING, ItemID.SPIRIT_SEEDLING, ItemID.SPIRIT_SEEDLING_W),

	APPLE_SAPLING(Type.SAPLING, "Apple", "APP", ItemID.APPLE_SAPLING, ItemID.APPLE_SEEDLING, ItemID.APPLE_SEEDLING_W),
	BANANA_SAPLING(Type.SAPLING, "Banana", "BAN", ItemID.BANANA_SAPLING, ItemID.BANANA_SEEDLING, ItemID.BANANA_SEEDLING_W),
	ORANGE_SAPLING(Type.SAPLING, "Orange", "ORA", ItemID.ORANGE_SAPLING, ItemID.ORANGE_SEEDLING, ItemID.ORANGE_SEEDLING_W),
	CURRY_SAPLING(Type.SAPLING, "Curry", "CUR", ItemID.CURRY_SAPLING, ItemID.CURRY_SEEDLING, ItemID.CURRY_SEEDLING_W),
	PINEAPPLE_SAPLING(Type.SAPLING, "Pine", "PINE", ItemID.PINEAPPLE_SAPLING, ItemID.PINEAPPLE_SEEDLING, ItemID.PINEAPPLE_SEEDLING_W),
	PAPAYA_SAPLING(Type.SAPLING, "Papaya", "PAP", ItemID.PAPAYA_SAPLING, ItemID.PAPAYA_SEEDLING, ItemID.PAPAYA_SEEDLING_W),
	PALM_SAPLING(Type.SAPLING, "Palm", "PALM", ItemID.PALM_SAPLING, ItemID.PALM_SEEDLING, ItemID.PALM_SEEDLING_W),
	DRAGONFRUIT_SAPLING(Type.SAPLING, "Dragon", "DRAG", ItemID.DRAGONFRUIT_SAPLING, ItemID.DRAGONFRUIT_SEEDLING, ItemID.DRAGONFRUIT_SEEDLING_W),

	TEAK_SAPLING(Type.SAPLING, "Teak", "TEAK", ItemID.TEAK_SAPLING, ItemID.TEAK_SEEDLING, ItemID.TEAK_SEEDLING_W),
	MAHOGANY_SAPLING(Type.SAPLING, "Mahog", "MAHOG", ItemID.MAHOGANY_SAPLING, ItemID.MAHOGANY_SEEDLING, ItemID.MAHOGANY_SEEDLING_W),
	CALQUAT_SAPLING(Type.SAPLING, "Calquat", "CALQ", ItemID.CALQUAT_SAPLING, ItemID.CALQUAT_SEEDLING, ItemID.CALQUAT_SEEDLING_W),
	CELASTRUS_SAPLING(Type.SAPLING, "Celas", "CEL", ItemID.CELASTRUS_SAPLING, ItemID.CELASTRUS_SEEDLING, ItemID.CELASTRUS_SEEDLING_W),

	//Ores
	COPPER_ORE(Type.ORE, "Copper", "COP", ItemID.COPPER_ORE),
	TIN_ORE(Type.ORE, "Tin", "TIN", ItemID.TIN_ORE),
	IRON_ORE(Type.ORE, "Iron", "IRO", ItemID.IRON_ORE),
	SILVER_ORE(Type.ORE, "Silver", "SIL", ItemID.SILVER_ORE),
	COAL_ORE(Type.ORE, "Coal", "COA", ItemID.COAL),
	GOLD_ORE(Type.ORE, "Gold", "GOL", ItemID.GOLD_ORE),
	MITHRIL_ORE(Type.ORE, "Mithril", "MIT", ItemID.MITHRIL_ORE),
	ADAMANTITE_ORE(Type.ORE, "Adaman", "ADA", ItemID.ADAMANTITE_ORE),
	RUNITE_ORE(Type.ORE, "Runite", "RUN", ItemID.RUNITE_ORE),

	RUNE_ESSENCE(Type.ORE, "R.Ess", "R.E.", ItemID.RUNE_ESSENCE),
	PURE_ESSENCE(Type.ORE, "P.Ess", "P.E.", ItemID.PURE_ESSENCE),

	PAYDIRT(Type.ORE, "Paydirt", "PAY", ItemID.PAYDIRT),
	AMETHYST(Type.ORE, "Amethy", "AME", ItemID.AMETHYST),
	LOVAKITE_ORE(Type.ORE, "Lovakit", "LOV", ItemID.LOVAKITE_ORE),
	BLURITE_ORE(Type.ORE, "Blurite", "BLU", ItemID.BLURITE_ORE),
	ELEMENTAL_ORE(Type.ORE, "Element", "ELE", ItemID.ELEMENTAL_ORE),
	DAEYALT_ORE(Type.ORE, "Daeyalt", "DAE", ItemID.DAEYALT_ORE),
	LUNAR_ORE(Type.ORE, "Lunar", "LUN", ItemID.LUNAR_ORE),

	//Gems
	SAPPHIRE(Type.GEM, "Sapphir", "S", ItemID.UNCUT_SAPPHIRE, ItemID.SAPPHIRE),
	EMERALD(Type.GEM, "Emerald", "E", ItemID.UNCUT_EMERALD, ItemID.EMERALD),
	RUBY(Type.GEM, "Ruby", "R", ItemID.UNCUT_RUBY, ItemID.RUBY),
	DIAMOND(Type.GEM, "Diamon", "DI", ItemID.UNCUT_DIAMOND, ItemID.DIAMOND),
	OPAL(Type.GEM, "Opal", "OP", ItemID.UNCUT_OPAL, ItemID.OPAL),
	JADE(Type.GEM, "Jade", "J", ItemID.UNCUT_JADE, ItemID.JADE),
	RED_TOPAZ(Type.GEM, "Topaz", "T", ItemID.UNCUT_RED_TOPAZ, ItemID.RED_TOPAZ),
	DRAGONSTONE(Type.GEM, "Dragon", "DR", ItemID.UNCUT_DRAGONSTONE, ItemID.DRAGONSTONE),
	ONYX(Type.GEM, "Onyx", "ON", ItemID.UNCUT_ONYX, ItemID.ONYX),
	ZENYTE(Type.GEM, "Zenyte", "Z", ItemID.UNCUT_ZENYTE, ItemID.ZENYTE),

	//Nets
	SMALL(Type.NET, "Small", "S", ItemID.SMALL_FISHING_NET),
	BIG_NET(Type.NET, "Big", "B", ItemID.BIG_FISHING_NET),
	DRIFT(Type.NET, "Drift", "D", ItemID.DRIFT_NET),

	//Greegrees
	ANCIENT(Type.GREEGREE, "Ancient", "A", ItemID.ANCIENT_GORILLA_GREEGREE),
	BEARDED(Type.GREEGREE, "Bearded", "B", ItemID.BEARDED_GORILLA_GREEGREE),
	GORILLA(Type.GREEGREE, "Gorilla", "G", ItemID.GORILLA_GREEGREE),
	KARAMJAN(Type.GREEGREE, "Karamja", "K", ItemID.KARAMJAN_MONKEY_GREEGREE),
	KRUK(Type.GREEGREE, "Kruk", "KR", ItemID.KRUK_MONKEY_GREEGREE),
	SMALL_NINJA(Type.GREEGREE, "S Ninja", "SN", ItemID.NINJA_MONKEY_GREEGREE),
	MEDIUM_NINJA(Type.GREEGREE, "M Ninja", "MN", ItemID.NINJA_MONKEY_GREEGREE_4025),
	SMALL_ZOMBIE(Type.GREEGREE, "S Zombie", "SZ", ItemID.ZOMBIE_MONKEY_GREEGREE),
	BIG_ZOMBIE(Type.GREEGREE, "L Zombie", "LZ", ItemID.ZOMBIE_MONKEY_GREEGREE_4030),

	//Bones
	BABYDRAGON(Type.BONE, "Baby drag", "BD", ItemID.BABYDRAGON_BONES),
	BAT(Type.BONE, "Bat", "BAT", ItemID.BAT_BONES),
	BIG_BONE(Type.BONE, "Big", "BIG", ItemID.BIG_BONES),
	BONES(Type.BONE, "Normal", "N", ItemID.BONES),
	BURNT(Type.BONE, "Burnt", "BU", ItemID.BURNT_BONES),
	CHEWED(Type.BONE, "Chewed", "CH", ItemID.CHEWED_BONES),
	DAGANNOTH(Type.BONE, "Dagan", "DA", ItemID.DAGANNOTH_BONES),
	DRAGON(Type.BONE, "Dragon", "D", ItemID.DRAGON_BONES),
	DRAKE(Type.BONE, "Drake", "DR", ItemID.DRAKE_BONES),
	FAYRG(Type.BONE, "Fayrg", "F", ItemID.FAYRG_BONES),
	HYDRA(Type.BONE, "Hydra", "H", ItemID.HYDRA_BONES),
	JOGRE(Type.BONE, "Jogre", "J", ItemID.JOGRE_BONES),
	LAVA_DRAGON(Type.BONE, "Lava", "L", ItemID.LAVA_DRAGON_BONES),
	MANGLED(Type.BONE, "Mangled", "M", ItemID.MANGLED_BONES),
	KARAMJA(Type.BONE, "Karamja", "K", ItemID.MONKEY_BONES),
	SMALL_ZOMBIE_BONE(Type.BONE, "S Zombie", "SZ", ItemID.MONKEY_BONES_3180),
	LARGE_ZOMBIE(Type.BONE, "L Zombie", "LZ", ItemID.MONKEY_BONES_3181),
	GORILLA_BONE(Type.BONE, "Gorilla", "G", ItemID.MONKEY_BONES_3182),
	BEARDED_BONE(Type.BONE, "Bearded", "B", ItemID.MONKEY_BONES_3183),
	SMALL_NINJA_BONE(Type.BONE, "S Ninja", "SN", ItemID.MONKEY_BONES_3185),
	MEDIUM_NINJA_BONE(Type.BONE, "M Ninja", "MN", ItemID.MONKEY_BONES_3186),
	OURG(Type.BONE, "Ourg", "O", ItemID.OURG_BONES),
	RAURG(Type.BONE, "Raurg", "R", ItemID.RAURG_BONES),
	SHAIKAHAN(Type.BONE, "Shaika", "SH", ItemID.SHAIKAHAN_BONES),
	SHEEP_1(Type.BONE, "Sheep 1", "S1", ItemID.SHEEP_BONES_1),
	SHEEP_2(Type.BONE, "Sheep 2", "S2", ItemID.SHEEP_BONES_2),
	SHEEP_3(Type.BONE, "Sheep 3", "S3", ItemID.SHEEP_BONES_3),
	SHEEP_4(Type.BONE, "Sheep 4", "S4", ItemID.SHEEP_BONES_4),
	SUPERIOR_DRAGON(Type.BONE, "Sup Drag", "SD", ItemID.SUPERIOR_DRAGON_BONES),
	WOLF(Type.BONE, "Wolf", "WF", ItemID.WOLF_BONES),
	WYRM(Type.BONE, "Wyrm", "WR", ItemID.WYRM_BONES),
	WYVERN(Type.BONE, "Wyvern", "WV", ItemID.WYVERN_BONES),
	ZOGRE(Type.BONE, "Zogre", "Z", ItemID.ZOGRE_BONES);

	final Type type;
	final String medName;
	final String shortName;
	final int[] itemIDs;

	ItemIdentification(Type type, String medName, String shortName, int ... ids)
	{
		this.type = type;
		this.medName = medName;
		this.shortName = shortName;
		this.itemIDs = ids;
	}

	private static final Map<Integer, ItemIdentification> itemIdentifications;

	static
	{
		ImmutableMap.Builder<Integer, ItemIdentification> builder = new ImmutableMap.Builder<>();

		for (ItemIdentification i : values())
		{
			for (int id : i.itemIDs)
			{
				builder.put(id, i);
			}
		}

		itemIdentifications = builder.build();
	}

	static ItemIdentification get(int id)
	{
		return itemIdentifications.get(id);
	}

	enum Type
	{
		SEED,
		HERB,
		SAPLING,
		ORE,
		GEM,
		NET,
		GREEGREE,
		BONE
	}
}
