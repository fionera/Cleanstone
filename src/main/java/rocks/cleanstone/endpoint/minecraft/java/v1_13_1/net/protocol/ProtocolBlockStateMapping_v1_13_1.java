package rocks.cleanstone.endpoint.minecraft.java.v1_13_1.net.protocol;

import org.springframework.stereotype.Component;
import rocks.cleanstone.game.block.state.BlockState;
import rocks.cleanstone.game.block.state.mapping.ModernBlockStateMapping;

import static rocks.cleanstone.endpoint.minecraft.block.VanillaBlockType.*;

/**
 * Maps Cleanstone's internal block states to the Minecraft client's format
 * !! GENERATED FILE. This file was generated using the php-converter script. !!
 */
@Component("protocolBlockStateMapping_v1_13_1")
public class ProtocolBlockStateMapping_v1_13_1 extends ModernBlockStateMapping {

    public ProtocolBlockStateMapping_v1_13_1() {
        super(BlockState.of(STONE));
        setBaseID(AIR, 0);
        setBaseID(STONE, 1);
        setBaseID(GRANITE, 2);
        setBaseID(POLISHED_GRANITE, 3);
        setBaseID(DIORITE, 4);
        setBaseID(POLISHED_DIORITE, 5);
        setBaseID(ANDESITE, 6);
        setBaseID(POLISHED_ANDESITE, 7);
        setBaseID(GRASS_BLOCK, 8);
        setBaseID(DIRT, 10);
        setBaseID(COARSE_DIRT, 11);
        setBaseID(PODZOL, 12);
        setBaseID(COBBLESTONE, 14);
        setBaseID(OAK_PLANKS, 15);
        setBaseID(SPRUCE_PLANKS, 16);
        setBaseID(BIRCH_PLANKS, 17);
        setBaseID(JUNGLE_PLANKS, 18);
        setBaseID(ACACIA_PLANKS, 19);
        setBaseID(DARK_OAK_PLANKS, 20);
        setBaseID(OAK_SAPLING, 21);
        setBaseID(SPRUCE_SAPLING, 23);
        setBaseID(BIRCH_SAPLING, 25);
        setBaseID(JUNGLE_SAPLING, 27);
        setBaseID(ACACIA_SAPLING, 29);
        setBaseID(DARK_OAK_SAPLING, 31);
        setBaseID(BEDROCK, 33);
        setBaseID(WATER, 34);
        setBaseID(LAVA, 50);
        setBaseID(SAND, 66);
        setBaseID(RED_SAND, 67);
        setBaseID(GRAVEL, 68);
        setBaseID(GOLD_ORE, 69);
        setBaseID(IRON_ORE, 70);
        setBaseID(COAL_ORE, 71);
        setBaseID(OAK_LOG, 72);
        setBaseID(SPRUCE_LOG, 75);
        setBaseID(BIRCH_LOG, 78);
        setBaseID(JUNGLE_LOG, 81);
        setBaseID(ACACIA_LOG, 84);
        setBaseID(DARK_OAK_LOG, 87);
        setBaseID(STRIPPED_SPRUCE_LOG, 90);
        setBaseID(STRIPPED_BIRCH_LOG, 93);
        setBaseID(STRIPPED_JUNGLE_LOG, 96);
        setBaseID(STRIPPED_ACACIA_LOG, 99);
        setBaseID(STRIPPED_DARK_OAK_LOG, 102);
        setBaseID(STRIPPED_OAK_LOG, 105);
        setBaseID(OAK_WOOD, 108);
        setBaseID(SPRUCE_WOOD, 111);
        setBaseID(BIRCH_WOOD, 114);
        setBaseID(JUNGLE_WOOD, 117);
        setBaseID(ACACIA_WOOD, 120);
        setBaseID(DARK_OAK_WOOD, 123);
        setBaseID(STRIPPED_OAK_WOOD, 126);
        setBaseID(STRIPPED_SPRUCE_WOOD, 129);
        setBaseID(STRIPPED_BIRCH_WOOD, 132);
        setBaseID(STRIPPED_JUNGLE_WOOD, 135);
        setBaseID(STRIPPED_ACACIA_WOOD, 138);
        setBaseID(STRIPPED_DARK_OAK_WOOD, 141);
        setBaseID(OAK_LEAVES, 144);
        setBaseID(SPRUCE_LEAVES, 158);
        setBaseID(BIRCH_LEAVES, 172);
        setBaseID(JUNGLE_LEAVES, 186);
        setBaseID(ACACIA_LEAVES, 200);
        setBaseID(DARK_OAK_LEAVES, 214);
        setBaseID(SPONGE, 228);
        setBaseID(WET_SPONGE, 229);
        setBaseID(GLASS, 230);
        setBaseID(LAPIS_ORE, 231);
        setBaseID(LAPIS_BLOCK, 232);
        setBaseID(DISPENSER, 233);
        setBaseID(SANDSTONE, 245);
        setBaseID(CHISELED_SANDSTONE, 246);
        setBaseID(CUT_SANDSTONE, 247);
        setBaseID(NOTE_BLOCK, 248);
        setBaseID(WHITE_BED, 748);
        setBaseID(ORANGE_BED, 764);
        setBaseID(MAGENTA_BED, 780);
        setBaseID(LIGHT_BLUE_BED, 796);
        setBaseID(YELLOW_BED, 812);
        setBaseID(LIME_BED, 828);
        setBaseID(PINK_BED, 844);
        setBaseID(GRAY_BED, 860);
        setBaseID(LIGHT_GRAY_BED, 876);
        setBaseID(CYAN_BED, 892);
        setBaseID(PURPLE_BED, 908);
        setBaseID(BLUE_BED, 924);
        setBaseID(BROWN_BED, 940);
        setBaseID(GREEN_BED, 956);
        setBaseID(RED_BED, 972);
        setBaseID(BLACK_BED, 988);
        setBaseID(POWERED_RAIL, 1004);
        setBaseID(DETECTOR_RAIL, 1016);
        setBaseID(STICKY_PISTON, 1028);
        setBaseID(COBWEB, 1040);
        setBaseID(GRASS, 1041);
        setBaseID(FERN, 1042);
        setBaseID(DEAD_BUSH, 1043);
        setBaseID(SEAGRASS, 1044);
        setBaseID(TALL_SEAGRASS, 1045);
        setBaseID(PISTON, 1047);
        setBaseID(PISTON_HEAD, 1059);
        setBaseID(WHITE_WOOL, 1083);
        setBaseID(ORANGE_WOOL, 1084);
        setBaseID(MAGENTA_WOOL, 1085);
        setBaseID(LIGHT_BLUE_WOOL, 1086);
        setBaseID(YELLOW_WOOL, 1087);
        setBaseID(LIME_WOOL, 1088);
        setBaseID(PINK_WOOL, 1089);
        setBaseID(GRAY_WOOL, 1090);
        setBaseID(LIGHT_GRAY_WOOL, 1091);
        setBaseID(CYAN_WOOL, 1092);
        setBaseID(PURPLE_WOOL, 1093);
        setBaseID(BLUE_WOOL, 1094);
        setBaseID(BROWN_WOOL, 1095);
        setBaseID(GREEN_WOOL, 1096);
        setBaseID(RED_WOOL, 1097);
        setBaseID(BLACK_WOOL, 1098);
        setBaseID(MOVING_PISTON, 1099);
        setBaseID(DANDELION, 1111);
        setBaseID(POPPY, 1112);
        setBaseID(BLUE_ORCHID, 1113);
        setBaseID(ALLIUM, 1114);
        setBaseID(AZURE_BLUET, 1115);
        setBaseID(RED_TULIP, 1116);
        setBaseID(ORANGE_TULIP, 1117);
        setBaseID(WHITE_TULIP, 1118);
        setBaseID(PINK_TULIP, 1119);
        setBaseID(OXEYE_DAISY, 1120);
        setBaseID(BROWN_MUSHROOM, 1121);
        setBaseID(RED_MUSHROOM, 1122);
        setBaseID(GOLD_BLOCK, 1123);
        setBaseID(IRON_BLOCK, 1124);
        setBaseID(BRICKS, 1125);
        setBaseID(TNT, 1126);
        setBaseID(BOOKSHELF, 1128);
        setBaseID(MOSSY_COBBLESTONE, 1129);
        setBaseID(OBSIDIAN, 1130);
        setBaseID(TORCH, 1131);
        setBaseID(WALL_TORCH, 1132);
        setBaseID(FIRE, 1136);
        setBaseID(SPAWNER, 1648);
        setBaseID(OAK_STAIRS, 1649);
        setBaseID(CHEST, 1729);
        setBaseID(REDSTONE_WIRE, 1753);
        setBaseID(DIAMOND_ORE, 3049);
        setBaseID(DIAMOND_BLOCK, 3050);
        setBaseID(CRAFTING_TABLE, 3051);
        setBaseID(WHEAT, 3052);
        setBaseID(FARMLAND, 3060);
        setBaseID(FURNACE, 3068);
        setBaseID(OAK_SIGN, 3076);
        setBaseID(OAK_DOOR, 3108);
        setBaseID(LADDER, 3172);
        setBaseID(RAIL, 3180);
        setBaseID(COBBLESTONE_STAIRS, 3190);
        setBaseID(OAK_WALL_SIGN, 3270);
        setBaseID(LEVER, 3278);
        setBaseID(STONE_PRESSURE_PLATE, 3302);
        setBaseID(IRON_DOOR, 3304);
        setBaseID(OAK_PRESSURE_PLATE, 3368);
        setBaseID(SPRUCE_PRESSURE_PLATE, 3370);
        setBaseID(BIRCH_PRESSURE_PLATE, 3372);
        setBaseID(JUNGLE_PRESSURE_PLATE, 3374);
        setBaseID(ACACIA_PRESSURE_PLATE, 3376);
        setBaseID(DARK_OAK_PRESSURE_PLATE, 3378);
        setBaseID(REDSTONE_ORE, 3380);
        setBaseID(REDSTONE_TORCH, 3382);
        setBaseID(REDSTONE_WALL_TORCH, 3384);
        setBaseID(STONE_BUTTON, 3392);
        setBaseID(SNOW, 3416);
        setBaseID(ICE, 3424);
        setBaseID(SNOW_BLOCK, 3425);
        setBaseID(CACTUS, 3426);
        setBaseID(CLAY, 3442);
        setBaseID(SUGAR_CANE, 3443);
        setBaseID(JUKEBOX, 3459);
        setBaseID(OAK_FENCE, 3461);
        setBaseID(PUMPKIN, 3493);
        setBaseID(NETHERRACK, 3494);
        setBaseID(SOUL_SAND, 3495);
        setBaseID(GLOWSTONE, 3496);
        setBaseID(NETHER_PORTAL, 3497);
        setBaseID(CARVED_PUMPKIN, 3499);
        setBaseID(JACK_O_LANTERN, 3503);
        setBaseID(CAKE, 3507);
        setBaseID(REPEATER, 3514);
        setBaseID(WHITE_STAINED_GLASS, 3578);
        setBaseID(ORANGE_STAINED_GLASS, 3579);
        setBaseID(MAGENTA_STAINED_GLASS, 3580);
        setBaseID(LIGHT_BLUE_STAINED_GLASS, 3581);
        setBaseID(YELLOW_STAINED_GLASS, 3582);
        setBaseID(LIME_STAINED_GLASS, 3583);
        setBaseID(PINK_STAINED_GLASS, 3584);
        setBaseID(GRAY_STAINED_GLASS, 3585);
        setBaseID(LIGHT_GRAY_STAINED_GLASS, 3586);
        setBaseID(CYAN_STAINED_GLASS, 3587);
        setBaseID(PURPLE_STAINED_GLASS, 3588);
        setBaseID(BLUE_STAINED_GLASS, 3589);
        setBaseID(BROWN_STAINED_GLASS, 3590);
        setBaseID(GREEN_STAINED_GLASS, 3591);
        setBaseID(RED_STAINED_GLASS, 3592);
        setBaseID(BLACK_STAINED_GLASS, 3593);
        setBaseID(OAK_TRAPDOOR, 3594);
        setBaseID(SPRUCE_TRAPDOOR, 3658);
        setBaseID(BIRCH_TRAPDOOR, 3722);
        setBaseID(JUNGLE_TRAPDOOR, 3786);
        setBaseID(ACACIA_TRAPDOOR, 3850);
        setBaseID(DARK_OAK_TRAPDOOR, 3914);
        setBaseID(INFESTED_STONE, 3978);
        setBaseID(INFESTED_COBBLESTONE, 3979);
        setBaseID(INFESTED_STONE_BRICKS, 3980);
        setBaseID(INFESTED_MOSSY_STONE_BRICKS, 3981);
        setBaseID(INFESTED_CRACKED_STONE_BRICKS, 3982);
        setBaseID(INFESTED_CHISELED_STONE_BRICKS, 3983);
        setBaseID(STONE_BRICKS, 3984);
        setBaseID(MOSSY_STONE_BRICKS, 3985);
        setBaseID(CRACKED_STONE_BRICKS, 3986);
        setBaseID(CHISELED_STONE_BRICKS, 3987);
        setBaseID(BROWN_MUSHROOM_BLOCK, 3988);
        setBaseID(RED_MUSHROOM_BLOCK, 4052);
        setBaseID(MUSHROOM_STEM, 4116);
        setBaseID(IRON_BARS, 4180);
        setBaseID(GLASS_PANE, 4212);
        setBaseID(MELON, 4244);
        setBaseID(ATTACHED_PUMPKIN_STEM, 4245);
        setBaseID(ATTACHED_MELON_STEM, 4249);
        setBaseID(PUMPKIN_STEM, 4253);
        setBaseID(MELON_STEM, 4261);
        setBaseID(VINE, 4269);
        setBaseID(OAK_FENCE_GATE, 4301);
        setBaseID(BRICK_STAIRS, 4333);
        setBaseID(STONE_BRICK_STAIRS, 4413);
        setBaseID(MYCELIUM, 4493);
        setBaseID(LILY_PAD, 4495);
        setBaseID(NETHER_BRICKS, 4496);
        setBaseID(NETHER_BRICK_FENCE, 4497);
        setBaseID(NETHER_BRICK_STAIRS, 4529);
        setBaseID(NETHER_WART, 4609);
        setBaseID(ENCHANTING_TABLE, 4613);
        setBaseID(BREWING_STAND, 4614);
        setBaseID(CAULDRON, 4622);
        setBaseID(END_PORTAL, 4626);
        setBaseID(END_PORTAL_FRAME, 4627);
        setBaseID(END_STONE, 4635);
        setBaseID(DRAGON_EGG, 4636);
        setBaseID(REDSTONE_LAMP, 4637);
        setBaseID(COCOA, 4639);
        setBaseID(SANDSTONE_STAIRS, 4651);
        setBaseID(EMERALD_ORE, 4731);
        setBaseID(ENDER_CHEST, 4732);
        setBaseID(TRIPWIRE_HOOK, 4740);
        setBaseID(TRIPWIRE, 4756);
        setBaseID(EMERALD_BLOCK, 4884);
        setBaseID(SPRUCE_STAIRS, 4885);
        setBaseID(BIRCH_STAIRS, 4965);
        setBaseID(JUNGLE_STAIRS, 5045);
        setBaseID(COMMAND_BLOCK, 5125);
        setBaseID(BEACON, 5137);
        setBaseID(COBBLESTONE_WALL, 5138);
        setBaseID(MOSSY_COBBLESTONE_WALL, 5202);
        setBaseID(FLOWER_POT, 5266);
        setBaseID(POTTED_OAK_SAPLING, 5267);
        setBaseID(POTTED_SPRUCE_SAPLING, 5268);
        setBaseID(POTTED_BIRCH_SAPLING, 5269);
        setBaseID(POTTED_JUNGLE_SAPLING, 5270);
        setBaseID(POTTED_ACACIA_SAPLING, 5271);
        setBaseID(POTTED_DARK_OAK_SAPLING, 5272);
        setBaseID(POTTED_FERN, 5273);
        setBaseID(POTTED_DANDELION, 5274);
        setBaseID(POTTED_POPPY, 5275);
        setBaseID(POTTED_BLUE_ORCHID, 5276);
        setBaseID(POTTED_ALLIUM, 5277);
        setBaseID(POTTED_AZURE_BLUET, 5278);
        setBaseID(POTTED_RED_TULIP, 5279);
        setBaseID(POTTED_ORANGE_TULIP, 5280);
        setBaseID(POTTED_WHITE_TULIP, 5281);
        setBaseID(POTTED_PINK_TULIP, 5282);
        setBaseID(POTTED_OXEYE_DAISY, 5283);
        setBaseID(POTTED_RED_MUSHROOM, 5284);
        setBaseID(POTTED_BROWN_MUSHROOM, 5285);
        setBaseID(POTTED_DEAD_BUSH, 5286);
        setBaseID(POTTED_CACTUS, 5287);
        setBaseID(CARROTS, 5288);
        setBaseID(POTATOES, 5296);
        setBaseID(OAK_BUTTON, 5304);
        setBaseID(SPRUCE_BUTTON, 5328);
        setBaseID(BIRCH_BUTTON, 5352);
        setBaseID(JUNGLE_BUTTON, 5376);
        setBaseID(ACACIA_BUTTON, 5400);
        setBaseID(DARK_OAK_BUTTON, 5424);
        setBaseID(SKELETON_WALL_SKULL, 5448);
        setBaseID(SKELETON_SKULL, 5452);
        setBaseID(WITHER_SKELETON_WALL_SKULL, 5468);
        setBaseID(WITHER_SKELETON_SKULL, 5472);
        setBaseID(ZOMBIE_WALL_HEAD, 5488);
        setBaseID(ZOMBIE_HEAD, 5492);
        setBaseID(PLAYER_WALL_HEAD, 5508);
        setBaseID(PLAYER_HEAD, 5512);
        setBaseID(CREEPER_WALL_HEAD, 5528);
        setBaseID(CREEPER_HEAD, 5532);
        setBaseID(DRAGON_WALL_HEAD, 5548);
        setBaseID(DRAGON_HEAD, 5552);
        setBaseID(ANVIL, 5568);
        setBaseID(CHIPPED_ANVIL, 5572);
        setBaseID(DAMAGED_ANVIL, 5576);
        setBaseID(TRAPPED_CHEST, 5580);
        setBaseID(LIGHT_WEIGHTED_PRESSURE_PLATE, 5604);
        setBaseID(HEAVY_WEIGHTED_PRESSURE_PLATE, 5620);
        setBaseID(COMPARATOR, 5636);
        setBaseID(DAYLIGHT_DETECTOR, 5652);
        setBaseID(REDSTONE_BLOCK, 5684);
        setBaseID(NETHER_QUARTZ_ORE, 5685);
        setBaseID(HOPPER, 5686);
        setBaseID(QUARTZ_BLOCK, 5696);
        setBaseID(CHISELED_QUARTZ_BLOCK, 5697);
        setBaseID(QUARTZ_PILLAR, 5698);
        setBaseID(QUARTZ_STAIRS, 5701);
        setBaseID(ACTIVATOR_RAIL, 5781);
        setBaseID(DROPPER, 5793);
        setBaseID(WHITE_TERRACOTTA, 5805);
        setBaseID(ORANGE_TERRACOTTA, 5806);
        setBaseID(MAGENTA_TERRACOTTA, 5807);
        setBaseID(LIGHT_BLUE_TERRACOTTA, 5808);
        setBaseID(YELLOW_TERRACOTTA, 5809);
        setBaseID(LIME_TERRACOTTA, 5810);
        setBaseID(PINK_TERRACOTTA, 5811);
        setBaseID(GRAY_TERRACOTTA, 5812);
        setBaseID(LIGHT_GRAY_TERRACOTTA, 5813);
        setBaseID(CYAN_TERRACOTTA, 5814);
        setBaseID(PURPLE_TERRACOTTA, 5815);
        setBaseID(BLUE_TERRACOTTA, 5816);
        setBaseID(BROWN_TERRACOTTA, 5817);
        setBaseID(GREEN_TERRACOTTA, 5818);
        setBaseID(RED_TERRACOTTA, 5819);
        setBaseID(BLACK_TERRACOTTA, 5820);
        setBaseID(WHITE_STAINED_GLASS_PANE, 5821);
        setBaseID(ORANGE_STAINED_GLASS_PANE, 5853);
        setBaseID(MAGENTA_STAINED_GLASS_PANE, 5885);
        setBaseID(LIGHT_BLUE_STAINED_GLASS_PANE, 5917);
        setBaseID(YELLOW_STAINED_GLASS_PANE, 5949);
        setBaseID(LIME_STAINED_GLASS_PANE, 5981);
        setBaseID(PINK_STAINED_GLASS_PANE, 6013);
        setBaseID(GRAY_STAINED_GLASS_PANE, 6045);
        setBaseID(LIGHT_GRAY_STAINED_GLASS_PANE, 6077);
        setBaseID(CYAN_STAINED_GLASS_PANE, 6109);
        setBaseID(PURPLE_STAINED_GLASS_PANE, 6141);
        setBaseID(BLUE_STAINED_GLASS_PANE, 6173);
        setBaseID(BROWN_STAINED_GLASS_PANE, 6205);
        setBaseID(GREEN_STAINED_GLASS_PANE, 6237);
        setBaseID(RED_STAINED_GLASS_PANE, 6269);
        setBaseID(BLACK_STAINED_GLASS_PANE, 6301);
        setBaseID(ACACIA_STAIRS, 6333);
        setBaseID(DARK_OAK_STAIRS, 6413);
        setBaseID(SLIME_BLOCK, 6493);
        setBaseID(BARRIER, 6494);
        setBaseID(IRON_TRAPDOOR, 6495);
        setBaseID(PRISMARINE, 6559);
        setBaseID(PRISMARINE_BRICKS, 6560);
        setBaseID(DARK_PRISMARINE, 6561);
        setBaseID(PRISMARINE_STAIRS, 6562);
        setBaseID(PRISMARINE_BRICK_STAIRS, 6642);
        setBaseID(DARK_PRISMARINE_STAIRS, 6722);
        setBaseID(PRISMARINE_SLAB, 6802);
        setBaseID(PRISMARINE_BRICK_SLAB, 6808);
        setBaseID(DARK_PRISMARINE_SLAB, 6814);
        setBaseID(SEA_LANTERN, 6820);
        setBaseID(HAY_BLOCK, 6821);
        setBaseID(WHITE_CARPET, 6824);
        setBaseID(ORANGE_CARPET, 6825);
        setBaseID(MAGENTA_CARPET, 6826);
        setBaseID(LIGHT_BLUE_CARPET, 6827);
        setBaseID(YELLOW_CARPET, 6828);
        setBaseID(LIME_CARPET, 6829);
        setBaseID(PINK_CARPET, 6830);
        setBaseID(GRAY_CARPET, 6831);
        setBaseID(LIGHT_GRAY_CARPET, 6832);
        setBaseID(CYAN_CARPET, 6833);
        setBaseID(PURPLE_CARPET, 6834);
        setBaseID(BLUE_CARPET, 6835);
        setBaseID(BROWN_CARPET, 6836);
        setBaseID(GREEN_CARPET, 6837);
        setBaseID(RED_CARPET, 6838);
        setBaseID(BLACK_CARPET, 6839);
        setBaseID(TERRACOTTA, 6840);
        setBaseID(COAL_BLOCK, 6841);
        setBaseID(PACKED_ICE, 6842);
        setBaseID(SUNFLOWER, 6843);
        setBaseID(LILAC, 6845);
        setBaseID(ROSE_BUSH, 6847);
        setBaseID(PEONY, 6849);
        setBaseID(TALL_GRASS, 6851);
        setBaseID(LARGE_FERN, 6853);
        setBaseID(WHITE_BANNER, 6855);
        setBaseID(ORANGE_BANNER, 6871);
        setBaseID(MAGENTA_BANNER, 6887);
        setBaseID(LIGHT_BLUE_BANNER, 6903);
        setBaseID(YELLOW_BANNER, 6919);
        setBaseID(LIME_BANNER, 6935);
        setBaseID(PINK_BANNER, 6951);
        setBaseID(GRAY_BANNER, 6967);
        setBaseID(LIGHT_GRAY_BANNER, 6983);
        setBaseID(CYAN_BANNER, 6999);
        setBaseID(PURPLE_BANNER, 7015);
        setBaseID(BLUE_BANNER, 7031);
        setBaseID(BROWN_BANNER, 7047);
        setBaseID(GREEN_BANNER, 7063);
        setBaseID(RED_BANNER, 7079);
        setBaseID(BLACK_BANNER, 7095);
        setBaseID(WHITE_WALL_BANNER, 7111);
        setBaseID(ORANGE_WALL_BANNER, 7115);
        setBaseID(MAGENTA_WALL_BANNER, 7119);
        setBaseID(LIGHT_BLUE_WALL_BANNER, 7123);
        setBaseID(YELLOW_WALL_BANNER, 7127);
        setBaseID(LIME_WALL_BANNER, 7131);
        setBaseID(PINK_WALL_BANNER, 7135);
        setBaseID(GRAY_WALL_BANNER, 7139);
        setBaseID(LIGHT_GRAY_WALL_BANNER, 7143);
        setBaseID(CYAN_WALL_BANNER, 7147);
        setBaseID(PURPLE_WALL_BANNER, 7151);
        setBaseID(BLUE_WALL_BANNER, 7155);
        setBaseID(BROWN_WALL_BANNER, 7159);
        setBaseID(GREEN_WALL_BANNER, 7163);
        setBaseID(RED_WALL_BANNER, 7167);
        setBaseID(BLACK_WALL_BANNER, 7171);
        setBaseID(RED_SANDSTONE, 7175);
        setBaseID(CHISELED_RED_SANDSTONE, 7176);
        setBaseID(CUT_RED_SANDSTONE, 7177);
        setBaseID(RED_SANDSTONE_STAIRS, 7178);
        setBaseID(OAK_SLAB, 7258);
        setBaseID(SPRUCE_SLAB, 7264);
        setBaseID(BIRCH_SLAB, 7270);
        setBaseID(JUNGLE_SLAB, 7276);
        setBaseID(ACACIA_SLAB, 7282);
        setBaseID(DARK_OAK_SLAB, 7288);
        setBaseID(STONE_SLAB, 7294);
        setBaseID(SANDSTONE_SLAB, 7300);
        setBaseID(PETRIFIED_OAK_SLAB, 7306);
        setBaseID(COBBLESTONE_SLAB, 7312);
        setBaseID(BRICK_SLAB, 7318);
        setBaseID(STONE_BRICK_SLAB, 7324);
        setBaseID(NETHER_BRICK_SLAB, 7330);
        setBaseID(QUARTZ_SLAB, 7336);
        setBaseID(RED_SANDSTONE_SLAB, 7342);
        setBaseID(PURPUR_SLAB, 7348);
        setBaseID(SMOOTH_STONE, 7354);
        setBaseID(SMOOTH_SANDSTONE, 7355);
        setBaseID(SMOOTH_QUARTZ, 7356);
        setBaseID(SMOOTH_RED_SANDSTONE, 7357);
        setBaseID(SPRUCE_FENCE_GATE, 7358);
        setBaseID(BIRCH_FENCE_GATE, 7390);
        setBaseID(JUNGLE_FENCE_GATE, 7422);
        setBaseID(ACACIA_FENCE_GATE, 7454);
        setBaseID(DARK_OAK_FENCE_GATE, 7486);
        setBaseID(SPRUCE_FENCE, 7518);
        setBaseID(BIRCH_FENCE, 7550);
        setBaseID(JUNGLE_FENCE, 7582);
        setBaseID(ACACIA_FENCE, 7614);
        setBaseID(DARK_OAK_FENCE, 7646);
        setBaseID(SPRUCE_DOOR, 7678);
        setBaseID(BIRCH_DOOR, 7742);
        setBaseID(JUNGLE_DOOR, 7806);
        setBaseID(ACACIA_DOOR, 7870);
        setBaseID(DARK_OAK_DOOR, 7934);
        setBaseID(END_ROD, 7998);
        setBaseID(CHORUS_PLANT, 8004);
        setBaseID(CHORUS_FLOWER, 8068);
        setBaseID(PURPUR_BLOCK, 8074);
        setBaseID(PURPUR_PILLAR, 8075);
        setBaseID(PURPUR_STAIRS, 8078);
        setBaseID(END_STONE_BRICKS, 8158);
        setBaseID(BEETROOTS, 8159);
        setBaseID(GRASS_PATH, 8163);
        setBaseID(END_GATEWAY, 8164);
        setBaseID(REPEATING_COMMAND_BLOCK, 8165);
        setBaseID(CHAIN_COMMAND_BLOCK, 8177);
        setBaseID(FROSTED_ICE, 8189);
        setBaseID(MAGMA_BLOCK, 8193);
        setBaseID(NETHER_WART_BLOCK, 8194);
        setBaseID(RED_NETHER_BRICKS, 8195);
        setBaseID(BONE_BLOCK, 8196);
        setBaseID(STRUCTURE_VOID, 8199);
        setBaseID(OBSERVER, 8200);
        setBaseID(SHULKER_BOX, 8212);
        setBaseID(WHITE_SHULKER_BOX, 8218);
        setBaseID(ORANGE_SHULKER_BOX, 8224);
        setBaseID(MAGENTA_SHULKER_BOX, 8230);
        setBaseID(LIGHT_BLUE_SHULKER_BOX, 8236);
        setBaseID(YELLOW_SHULKER_BOX, 8242);
        setBaseID(LIME_SHULKER_BOX, 8248);
        setBaseID(PINK_SHULKER_BOX, 8254);
        setBaseID(GRAY_SHULKER_BOX, 8260);
        setBaseID(LIGHT_GRAY_SHULKER_BOX, 8266);
        setBaseID(CYAN_SHULKER_BOX, 8272);
        setBaseID(PURPLE_SHULKER_BOX, 8278);
        setBaseID(BLUE_SHULKER_BOX, 8284);
        setBaseID(BROWN_SHULKER_BOX, 8290);
        setBaseID(GREEN_SHULKER_BOX, 8296);
        setBaseID(RED_SHULKER_BOX, 8302);
        setBaseID(BLACK_SHULKER_BOX, 8308);
        setBaseID(WHITE_GLAZED_TERRACOTTA, 8314);
        setBaseID(ORANGE_GLAZED_TERRACOTTA, 8318);
        setBaseID(MAGENTA_GLAZED_TERRACOTTA, 8322);
        setBaseID(LIGHT_BLUE_GLAZED_TERRACOTTA, 8326);
        setBaseID(YELLOW_GLAZED_TERRACOTTA, 8330);
        setBaseID(LIME_GLAZED_TERRACOTTA, 8334);
        setBaseID(PINK_GLAZED_TERRACOTTA, 8338);
        setBaseID(GRAY_GLAZED_TERRACOTTA, 8342);
        setBaseID(LIGHT_GRAY_GLAZED_TERRACOTTA, 8346);
        setBaseID(CYAN_GLAZED_TERRACOTTA, 8350);
        setBaseID(PURPLE_GLAZED_TERRACOTTA, 8354);
        setBaseID(BLUE_GLAZED_TERRACOTTA, 8358);
        setBaseID(BROWN_GLAZED_TERRACOTTA, 8362);
        setBaseID(GREEN_GLAZED_TERRACOTTA, 8366);
        setBaseID(RED_GLAZED_TERRACOTTA, 8370);
        setBaseID(BLACK_GLAZED_TERRACOTTA, 8374);
        setBaseID(WHITE_CONCRETE, 8378);
        setBaseID(ORANGE_CONCRETE, 8379);
        setBaseID(MAGENTA_CONCRETE, 8380);
        setBaseID(LIGHT_BLUE_CONCRETE, 8381);
        setBaseID(YELLOW_CONCRETE, 8382);
        setBaseID(LIME_CONCRETE, 8383);
        setBaseID(PINK_CONCRETE, 8384);
        setBaseID(GRAY_CONCRETE, 8385);
        setBaseID(LIGHT_GRAY_CONCRETE, 8386);
        setBaseID(CYAN_CONCRETE, 8387);
        setBaseID(PURPLE_CONCRETE, 8388);
        setBaseID(BLUE_CONCRETE, 8389);
        setBaseID(BROWN_CONCRETE, 8390);
        setBaseID(GREEN_CONCRETE, 8391);
        setBaseID(RED_CONCRETE, 8392);
        setBaseID(BLACK_CONCRETE, 8393);
        setBaseID(WHITE_CONCRETE_POWDER, 8394);
        setBaseID(ORANGE_CONCRETE_POWDER, 8395);
        setBaseID(MAGENTA_CONCRETE_POWDER, 8396);
        setBaseID(LIGHT_BLUE_CONCRETE_POWDER, 8397);
        setBaseID(YELLOW_CONCRETE_POWDER, 8398);
        setBaseID(LIME_CONCRETE_POWDER, 8399);
        setBaseID(PINK_CONCRETE_POWDER, 8400);
        setBaseID(GRAY_CONCRETE_POWDER, 8401);
        setBaseID(LIGHT_GRAY_CONCRETE_POWDER, 8402);
        setBaseID(CYAN_CONCRETE_POWDER, 8403);
        setBaseID(PURPLE_CONCRETE_POWDER, 8404);
        setBaseID(BLUE_CONCRETE_POWDER, 8405);
        setBaseID(BROWN_CONCRETE_POWDER, 8406);
        setBaseID(GREEN_CONCRETE_POWDER, 8407);
        setBaseID(RED_CONCRETE_POWDER, 8408);
        setBaseID(BLACK_CONCRETE_POWDER, 8409);
        setBaseID(KELP, 8410);
        setBaseID(KELP_PLANT, 8436);
        setBaseID(DRIED_KELP_BLOCK, 8437);
        setBaseID(TURTLE_EGG, 8438);
        setBaseID(DEAD_TUBE_CORAL_BLOCK, 8450);
        setBaseID(DEAD_BRAIN_CORAL_BLOCK, 8451);
        setBaseID(DEAD_BUBBLE_CORAL_BLOCK, 8452);
        setBaseID(DEAD_FIRE_CORAL_BLOCK, 8453);
        setBaseID(DEAD_HORN_CORAL_BLOCK, 8454);
        setBaseID(TUBE_CORAL_BLOCK, 8455);
        setBaseID(BRAIN_CORAL_BLOCK, 8456);
        setBaseID(BUBBLE_CORAL_BLOCK, 8457);
        setBaseID(FIRE_CORAL_BLOCK, 8458);
        setBaseID(HORN_CORAL_BLOCK, 8459);
        setBaseID(DEAD_TUBE_CORAL, 8460);
        setBaseID(DEAD_BRAIN_CORAL, 8462);
        setBaseID(DEAD_BUBBLE_CORAL, 8464);
        setBaseID(DEAD_FIRE_CORAL, 8466);
        setBaseID(DEAD_HORN_CORAL, 8468);
        setBaseID(TUBE_CORAL, 8470);
        setBaseID(BRAIN_CORAL, 8472);
        setBaseID(BUBBLE_CORAL, 8474);
        setBaseID(FIRE_CORAL, 8476);
        setBaseID(HORN_CORAL, 8478);
        setBaseID(DEAD_TUBE_CORAL_WALL_FAN, 8480);
        setBaseID(DEAD_BRAIN_CORAL_WALL_FAN, 8488);
        setBaseID(DEAD_BUBBLE_CORAL_WALL_FAN, 8496);
        setBaseID(DEAD_FIRE_CORAL_WALL_FAN, 8504);
        setBaseID(DEAD_HORN_CORAL_WALL_FAN, 8512);
        setBaseID(TUBE_CORAL_WALL_FAN, 8520);
        setBaseID(BRAIN_CORAL_WALL_FAN, 8528);
        setBaseID(BUBBLE_CORAL_WALL_FAN, 8536);
        setBaseID(FIRE_CORAL_WALL_FAN, 8544);
        setBaseID(HORN_CORAL_WALL_FAN, 8552);
        setBaseID(DEAD_TUBE_CORAL_FAN, 8560);
        setBaseID(DEAD_BRAIN_CORAL_FAN, 8562);
        setBaseID(DEAD_BUBBLE_CORAL_FAN, 8564);
        setBaseID(DEAD_FIRE_CORAL_FAN, 8566);
        setBaseID(DEAD_HORN_CORAL_FAN, 8568);
        setBaseID(TUBE_CORAL_FAN, 8570);
        setBaseID(BRAIN_CORAL_FAN, 8572);
        setBaseID(BUBBLE_CORAL_FAN, 8574);
        setBaseID(FIRE_CORAL_FAN, 8576);
        setBaseID(HORN_CORAL_FAN, 8578);
        setBaseID(SEA_PICKLE, 8580);
        setBaseID(BLUE_ICE, 8588);
        setBaseID(CONDUIT, 8589);
        setBaseID(VOID_AIR, 8591);
        setBaseID(CAVE_AIR, 8592);
        setBaseID(BUBBLE_COLUMN, 8593);
        setBaseID(STRUCTURE_BLOCK, 8595);
    }
}
