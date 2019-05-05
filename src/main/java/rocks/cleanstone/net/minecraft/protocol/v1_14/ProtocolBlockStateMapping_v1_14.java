package rocks.cleanstone.net.minecraft.protocol.v1_14;

import org.springframework.stereotype.Component;

import rocks.cleanstone.game.block.state.BlockState;
import rocks.cleanstone.game.block.state.mapping.ModernBlockStateMapping;

import static rocks.cleanstone.game.material.block.vanilla.VanillaBlockType.*;

@Component("protocolBlockStateMapping_v1_14")
public class ProtocolBlockStateMapping_v1_14 extends ModernBlockStateMapping {

    public ProtocolBlockStateMapping_v1_14() {
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
        setBaseID(WHITE_BED, 1048);
        setBaseID(ORANGE_BED, 1064);
        setBaseID(MAGENTA_BED, 1080);
        setBaseID(LIGHT_BLUE_BED, 1096);
        setBaseID(YELLOW_BED, 1112);
        setBaseID(LIME_BED, 1128);
        setBaseID(PINK_BED, 1144);
        setBaseID(GRAY_BED, 1160);
        setBaseID(LIGHT_GRAY_BED, 1176);
        setBaseID(CYAN_BED, 1192);
        setBaseID(PURPLE_BED, 1208);
        setBaseID(BLUE_BED, 1224);
        setBaseID(BROWN_BED, 1240);
        setBaseID(GREEN_BED, 1256);
        setBaseID(RED_BED, 1272);
        setBaseID(BLACK_BED, 1288);
        setBaseID(POWERED_RAIL, 1304);
        setBaseID(DETECTOR_RAIL, 1316);
        setBaseID(STICKY_PISTON, 1328);
        setBaseID(COBWEB, 1340);
        setBaseID(GRASS, 1341);
        setBaseID(FERN, 1342);
        setBaseID(DEAD_BUSH, 1343);
        setBaseID(SEAGRASS, 1344);
        setBaseID(TALL_SEAGRASS, 1345);
        setBaseID(PISTON, 1347);
        setBaseID(PISTON_HEAD, 1359);
        setBaseID(WHITE_WOOL, 1383);
        setBaseID(ORANGE_WOOL, 1384);
        setBaseID(MAGENTA_WOOL, 1385);
        setBaseID(LIGHT_BLUE_WOOL, 1386);
        setBaseID(YELLOW_WOOL, 1387);
        setBaseID(LIME_WOOL, 1388);
        setBaseID(PINK_WOOL, 1389);
        setBaseID(GRAY_WOOL, 1390);
        setBaseID(LIGHT_GRAY_WOOL, 1391);
        setBaseID(CYAN_WOOL, 1392);
        setBaseID(PURPLE_WOOL, 1393);
        setBaseID(BLUE_WOOL, 1394);
        setBaseID(BROWN_WOOL, 1395);
        setBaseID(GREEN_WOOL, 1396);
        setBaseID(RED_WOOL, 1397);
        setBaseID(BLACK_WOOL, 1398);
        setBaseID(MOVING_PISTON, 1399);
        setBaseID(DANDELION, 1411);
        setBaseID(POPPY, 1412);
        setBaseID(BLUE_ORCHID, 1413);
        setBaseID(ALLIUM, 1414);
        setBaseID(AZURE_BLUET, 1415);
        setBaseID(RED_TULIP, 1416);
        setBaseID(ORANGE_TULIP, 1417);
        setBaseID(WHITE_TULIP, 1418);
        setBaseID(PINK_TULIP, 1419);
        setBaseID(OXEYE_DAISY, 1420);
        setBaseID(CORNFLOWER, 1421);
        setBaseID(WITHER_ROSE, 1422);
        setBaseID(LILY_OF_THE_VALLEY, 1423);
        setBaseID(BROWN_MUSHROOM, 1424);
        setBaseID(RED_MUSHROOM, 1425);
        setBaseID(GOLD_BLOCK, 1426);
        setBaseID(IRON_BLOCK, 1427);
        setBaseID(BRICKS, 1428);
        setBaseID(TNT, 1429);
        setBaseID(BOOKSHELF, 1431);
        setBaseID(MOSSY_COBBLESTONE, 1432);
        setBaseID(OBSIDIAN, 1433);
        setBaseID(TORCH, 1434);
        setBaseID(WALL_TORCH, 1435);
        setBaseID(FIRE, 1439);
        setBaseID(SPAWNER, 1951);
        setBaseID(OAK_STAIRS, 1952);
        setBaseID(CHEST, 2032);
        setBaseID(REDSTONE_WIRE, 2056);
        setBaseID(DIAMOND_ORE, 3352);
        setBaseID(DIAMOND_BLOCK, 3353);
        setBaseID(CRAFTING_TABLE, 3354);
        setBaseID(WHEAT, 3355);
        setBaseID(FARMLAND, 3363);
        setBaseID(FURNACE, 3371);
        setBaseID(OAK_SIGN, 3379);
        setBaseID(SPRUCE_SIGN, 3411);
        setBaseID(BIRCH_SIGN, 3443);
        setBaseID(ACACIA_SIGN, 3475);
        setBaseID(JUNGLE_SIGN, 3507);
        setBaseID(DARK_OAK_SIGN, 3539);
        setBaseID(OAK_DOOR, 3571);
        setBaseID(LADDER, 3635);
        setBaseID(RAIL, 3643);
        setBaseID(COBBLESTONE_STAIRS, 3653);
        setBaseID(OAK_WALL_SIGN, 3733);
        setBaseID(SPRUCE_WALL_SIGN, 3741);
        setBaseID(BIRCH_WALL_SIGN, 3749);
        setBaseID(ACACIA_WALL_SIGN, 3757);
        setBaseID(JUNGLE_WALL_SIGN, 3765);
        setBaseID(DARK_OAK_WALL_SIGN, 3773);
        setBaseID(LEVER, 3781);
        setBaseID(STONE_PRESSURE_PLATE, 3805);
        setBaseID(IRON_DOOR, 3807);
        setBaseID(OAK_PRESSURE_PLATE, 3871);
        setBaseID(SPRUCE_PRESSURE_PLATE, 3873);
        setBaseID(BIRCH_PRESSURE_PLATE, 3875);
        setBaseID(JUNGLE_PRESSURE_PLATE, 3877);
        setBaseID(ACACIA_PRESSURE_PLATE, 3879);
        setBaseID(DARK_OAK_PRESSURE_PLATE, 3881);
        setBaseID(REDSTONE_ORE, 3883);
        setBaseID(REDSTONE_TORCH, 3885);
        setBaseID(REDSTONE_WALL_TORCH, 3887);
        setBaseID(STONE_BUTTON, 3895);
        setBaseID(SNOW, 3919);
        setBaseID(ICE, 3927);
        setBaseID(SNOW_BLOCK, 3928);
        setBaseID(CACTUS, 3929);
        setBaseID(CLAY, 3945);
        setBaseID(SUGAR_CANE, 3946);
        setBaseID(JUKEBOX, 3962);
        setBaseID(OAK_FENCE, 3964);
        setBaseID(PUMPKIN, 3996);
        setBaseID(NETHERRACK, 3997);
        setBaseID(SOUL_SAND, 3998);
        setBaseID(GLOWSTONE, 3999);
        setBaseID(NETHER_PORTAL, 4000);
        setBaseID(CARVED_PUMPKIN, 4002);
        setBaseID(JACK_O_LANTERN, 4006);
        setBaseID(CAKE, 4010);
        setBaseID(REPEATER, 4017);
        setBaseID(WHITE_STAINED_GLASS, 4081);
        setBaseID(ORANGE_STAINED_GLASS, 4082);
        setBaseID(MAGENTA_STAINED_GLASS, 4083);
        setBaseID(LIGHT_BLUE_STAINED_GLASS, 4084);
        setBaseID(YELLOW_STAINED_GLASS, 4085);
        setBaseID(LIME_STAINED_GLASS, 4086);
        setBaseID(PINK_STAINED_GLASS, 4087);
        setBaseID(GRAY_STAINED_GLASS, 4088);
        setBaseID(LIGHT_GRAY_STAINED_GLASS, 4089);
        setBaseID(CYAN_STAINED_GLASS, 4090);
        setBaseID(PURPLE_STAINED_GLASS, 4091);
        setBaseID(BLUE_STAINED_GLASS, 4092);
        setBaseID(BROWN_STAINED_GLASS, 4093);
        setBaseID(GREEN_STAINED_GLASS, 4094);
        setBaseID(RED_STAINED_GLASS, 4095);
        setBaseID(BLACK_STAINED_GLASS, 4096);
        setBaseID(OAK_TRAPDOOR, 4097);
        setBaseID(SPRUCE_TRAPDOOR, 4161);
        setBaseID(BIRCH_TRAPDOOR, 4225);
        setBaseID(JUNGLE_TRAPDOOR, 4289);
        setBaseID(ACACIA_TRAPDOOR, 4353);
        setBaseID(DARK_OAK_TRAPDOOR, 4417);
        setBaseID(STONE_BRICKS, 4481);
        setBaseID(MOSSY_STONE_BRICKS, 4482);
        setBaseID(CRACKED_STONE_BRICKS, 4483);
        setBaseID(CHISELED_STONE_BRICKS, 4484);
        setBaseID(INFESTED_STONE, 4485);
        setBaseID(INFESTED_COBBLESTONE, 4486);
        setBaseID(INFESTED_STONE_BRICKS, 4487);
        setBaseID(INFESTED_MOSSY_STONE_BRICKS, 4488);
        setBaseID(INFESTED_CRACKED_STONE_BRICKS, 4489);
        setBaseID(INFESTED_CHISELED_STONE_BRICKS, 4490);
        setBaseID(BROWN_MUSHROOM_BLOCK, 4491);
        setBaseID(RED_MUSHROOM_BLOCK, 4555);
        setBaseID(MUSHROOM_STEM, 4619);
        setBaseID(IRON_BARS, 4683);
        setBaseID(GLASS_PANE, 4715);
        setBaseID(MELON, 4747);
        setBaseID(ATTACHED_PUMPKIN_STEM, 4748);
        setBaseID(ATTACHED_MELON_STEM, 4752);
        setBaseID(PUMPKIN_STEM, 4756);
        setBaseID(MELON_STEM, 4764);
        setBaseID(VINE, 4772);
        setBaseID(OAK_FENCE_GATE, 4804);
        setBaseID(BRICK_STAIRS, 4836);
        setBaseID(STONE_BRICK_STAIRS, 4916);
        setBaseID(MYCELIUM, 4996);
        setBaseID(LILY_PAD, 4998);
        setBaseID(NETHER_BRICKS, 4999);
        setBaseID(NETHER_BRICK_FENCE, 5000);
        setBaseID(NETHER_BRICK_STAIRS, 5032);
        setBaseID(NETHER_WART, 5112);
        setBaseID(ENCHANTING_TABLE, 5116);
        setBaseID(BREWING_STAND, 5117);
        setBaseID(CAULDRON, 5125);
        setBaseID(END_PORTAL, 5129);
        setBaseID(END_PORTAL_FRAME, 5130);
        setBaseID(END_STONE, 5138);
        setBaseID(DRAGON_EGG, 5139);
        setBaseID(REDSTONE_LAMP, 5140);
        setBaseID(COCOA, 5142);
        setBaseID(SANDSTONE_STAIRS, 5154);
        setBaseID(EMERALD_ORE, 5234);
        setBaseID(ENDER_CHEST, 5235);
        setBaseID(TRIPWIRE_HOOK, 5243);
        setBaseID(TRIPWIRE, 5259);
        setBaseID(EMERALD_BLOCK, 5387);
        setBaseID(SPRUCE_STAIRS, 5388);
        setBaseID(BIRCH_STAIRS, 5468);
        setBaseID(JUNGLE_STAIRS, 5548);
        setBaseID(COMMAND_BLOCK, 5628);
        setBaseID(BEACON, 5640);
        setBaseID(COBBLESTONE_WALL, 5641);
        setBaseID(MOSSY_COBBLESTONE_WALL, 5705);
        setBaseID(FLOWER_POT, 5769);
        setBaseID(POTTED_OAK_SAPLING, 5770);
        setBaseID(POTTED_SPRUCE_SAPLING, 5771);
        setBaseID(POTTED_BIRCH_SAPLING, 5772);
        setBaseID(POTTED_JUNGLE_SAPLING, 5773);
        setBaseID(POTTED_ACACIA_SAPLING, 5774);
        setBaseID(POTTED_DARK_OAK_SAPLING, 5775);
        setBaseID(POTTED_FERN, 5776);
        setBaseID(POTTED_DANDELION, 5777);
        setBaseID(POTTED_POPPY, 5778);
        setBaseID(POTTED_BLUE_ORCHID, 5779);
        setBaseID(POTTED_ALLIUM, 5780);
        setBaseID(POTTED_AZURE_BLUET, 5781);
        setBaseID(POTTED_RED_TULIP, 5782);
        setBaseID(POTTED_ORANGE_TULIP, 5783);
        setBaseID(POTTED_WHITE_TULIP, 5784);
        setBaseID(POTTED_PINK_TULIP, 5785);
        setBaseID(POTTED_OXEYE_DAISY, 5786);
        setBaseID(POTTED_CORNFLOWER, 5787);
        setBaseID(POTTED_LILY_OF_THE_VALLEY, 5788);
        setBaseID(POTTED_WITHER_ROSE, 5789);
        setBaseID(POTTED_RED_MUSHROOM, 5790);
        setBaseID(POTTED_BROWN_MUSHROOM, 5791);
        setBaseID(POTTED_DEAD_BUSH, 5792);
        setBaseID(POTTED_CACTUS, 5793);
        setBaseID(CARROTS, 5794);
        setBaseID(POTATOES, 5802);
        setBaseID(OAK_BUTTON, 5810);
        setBaseID(SPRUCE_BUTTON, 5834);
        setBaseID(BIRCH_BUTTON, 5858);
        setBaseID(JUNGLE_BUTTON, 5882);
        setBaseID(ACACIA_BUTTON, 5906);
        setBaseID(DARK_OAK_BUTTON, 5930);
        setBaseID(SKELETON_SKULL, 5954);
        setBaseID(SKELETON_WALL_SKULL, 5970);
        setBaseID(WITHER_SKELETON_SKULL, 5974);
        setBaseID(WITHER_SKELETON_WALL_SKULL, 5990);
        setBaseID(ZOMBIE_HEAD, 5994);
        setBaseID(ZOMBIE_WALL_HEAD, 6010);
        setBaseID(PLAYER_HEAD, 6014);
        setBaseID(PLAYER_WALL_HEAD, 6030);
        setBaseID(CREEPER_HEAD, 6034);
        setBaseID(CREEPER_WALL_HEAD, 6050);
        setBaseID(DRAGON_HEAD, 6054);
        setBaseID(DRAGON_WALL_HEAD, 6070);
        setBaseID(ANVIL, 6074);
        setBaseID(CHIPPED_ANVIL, 6078);
        setBaseID(DAMAGED_ANVIL, 6082);
        setBaseID(TRAPPED_CHEST, 6086);
        setBaseID(LIGHT_WEIGHTED_PRESSURE_PLATE, 6110);
        setBaseID(HEAVY_WEIGHTED_PRESSURE_PLATE, 6126);
        setBaseID(COMPARATOR, 6142);
        setBaseID(DAYLIGHT_DETECTOR, 6158);
        setBaseID(REDSTONE_BLOCK, 6190);
        setBaseID(NETHER_QUARTZ_ORE, 6191);
        setBaseID(HOPPER, 6192);
        setBaseID(QUARTZ_BLOCK, 6202);
        setBaseID(CHISELED_QUARTZ_BLOCK, 6203);
        setBaseID(QUARTZ_PILLAR, 6204);
        setBaseID(QUARTZ_STAIRS, 6207);
        setBaseID(ACTIVATOR_RAIL, 6287);
        setBaseID(DROPPER, 6299);
        setBaseID(WHITE_TERRACOTTA, 6311);
        setBaseID(ORANGE_TERRACOTTA, 6312);
        setBaseID(MAGENTA_TERRACOTTA, 6313);
        setBaseID(LIGHT_BLUE_TERRACOTTA, 6314);
        setBaseID(YELLOW_TERRACOTTA, 6315);
        setBaseID(LIME_TERRACOTTA, 6316);
        setBaseID(PINK_TERRACOTTA, 6317);
        setBaseID(GRAY_TERRACOTTA, 6318);
        setBaseID(LIGHT_GRAY_TERRACOTTA, 6319);
        setBaseID(CYAN_TERRACOTTA, 6320);
        setBaseID(PURPLE_TERRACOTTA, 6321);
        setBaseID(BLUE_TERRACOTTA, 6322);
        setBaseID(BROWN_TERRACOTTA, 6323);
        setBaseID(GREEN_TERRACOTTA, 6324);
        setBaseID(RED_TERRACOTTA, 6325);
        setBaseID(BLACK_TERRACOTTA, 6326);
        setBaseID(WHITE_STAINED_GLASS_PANE, 6327);
        setBaseID(ORANGE_STAINED_GLASS_PANE, 6359);
        setBaseID(MAGENTA_STAINED_GLASS_PANE, 6391);
        setBaseID(LIGHT_BLUE_STAINED_GLASS_PANE, 6423);
        setBaseID(YELLOW_STAINED_GLASS_PANE, 6455);
        setBaseID(LIME_STAINED_GLASS_PANE, 6487);
        setBaseID(PINK_STAINED_GLASS_PANE, 6519);
        setBaseID(GRAY_STAINED_GLASS_PANE, 6551);
        setBaseID(LIGHT_GRAY_STAINED_GLASS_PANE, 6583);
        setBaseID(CYAN_STAINED_GLASS_PANE, 6615);
        setBaseID(PURPLE_STAINED_GLASS_PANE, 6647);
        setBaseID(BLUE_STAINED_GLASS_PANE, 6679);
        setBaseID(BROWN_STAINED_GLASS_PANE, 6711);
        setBaseID(GREEN_STAINED_GLASS_PANE, 6743);
        setBaseID(RED_STAINED_GLASS_PANE, 6775);
        setBaseID(BLACK_STAINED_GLASS_PANE, 6807);
        setBaseID(ACACIA_STAIRS, 6839);
        setBaseID(DARK_OAK_STAIRS, 6919);
        setBaseID(SLIME_BLOCK, 6999);
        setBaseID(BARRIER, 7000);
        setBaseID(IRON_TRAPDOOR, 7001);
        setBaseID(PRISMARINE, 7065);
        setBaseID(PRISMARINE_BRICKS, 7066);
        setBaseID(DARK_PRISMARINE, 7067);
        setBaseID(PRISMARINE_STAIRS, 7068);
        setBaseID(PRISMARINE_BRICK_STAIRS, 7148);
        setBaseID(DARK_PRISMARINE_STAIRS, 7228);
        setBaseID(PRISMARINE_SLAB, 7308);
        setBaseID(PRISMARINE_BRICK_SLAB, 7314);
        setBaseID(DARK_PRISMARINE_SLAB, 7320);
        setBaseID(SEA_LANTERN, 7326);
        setBaseID(HAY_BLOCK, 7327);
        setBaseID(WHITE_CARPET, 7330);
        setBaseID(ORANGE_CARPET, 7331);
        setBaseID(MAGENTA_CARPET, 7332);
        setBaseID(LIGHT_BLUE_CARPET, 7333);
        setBaseID(YELLOW_CARPET, 7334);
        setBaseID(LIME_CARPET, 7335);
        setBaseID(PINK_CARPET, 7336);
        setBaseID(GRAY_CARPET, 7337);
        setBaseID(LIGHT_GRAY_CARPET, 7338);
        setBaseID(CYAN_CARPET, 7339);
        setBaseID(PURPLE_CARPET, 7340);
        setBaseID(BLUE_CARPET, 7341);
        setBaseID(BROWN_CARPET, 7342);
        setBaseID(GREEN_CARPET, 7343);
        setBaseID(RED_CARPET, 7344);
        setBaseID(BLACK_CARPET, 7345);
        setBaseID(TERRACOTTA, 7346);
        setBaseID(COAL_BLOCK, 7347);
        setBaseID(PACKED_ICE, 7348);
        setBaseID(SUNFLOWER, 7349);
        setBaseID(LILAC, 7351);
        setBaseID(ROSE_BUSH, 7353);
        setBaseID(PEONY, 7355);
        setBaseID(TALL_GRASS, 7357);
        setBaseID(LARGE_FERN, 7359);
        setBaseID(WHITE_BANNER, 7361);
        setBaseID(ORANGE_BANNER, 7377);
        setBaseID(MAGENTA_BANNER, 7393);
        setBaseID(LIGHT_BLUE_BANNER, 7409);
        setBaseID(YELLOW_BANNER, 7425);
        setBaseID(LIME_BANNER, 7441);
        setBaseID(PINK_BANNER, 7457);
        setBaseID(GRAY_BANNER, 7473);
        setBaseID(LIGHT_GRAY_BANNER, 7489);
        setBaseID(CYAN_BANNER, 7505);
        setBaseID(PURPLE_BANNER, 7521);
        setBaseID(BLUE_BANNER, 7537);
        setBaseID(BROWN_BANNER, 7553);
        setBaseID(GREEN_BANNER, 7569);
        setBaseID(RED_BANNER, 7585);
        setBaseID(BLACK_BANNER, 7601);
        setBaseID(WHITE_WALL_BANNER, 7617);
        setBaseID(ORANGE_WALL_BANNER, 7621);
        setBaseID(MAGENTA_WALL_BANNER, 7625);
        setBaseID(LIGHT_BLUE_WALL_BANNER, 7629);
        setBaseID(YELLOW_WALL_BANNER, 7633);
        setBaseID(LIME_WALL_BANNER, 7637);
        setBaseID(PINK_WALL_BANNER, 7641);
        setBaseID(GRAY_WALL_BANNER, 7645);
        setBaseID(LIGHT_GRAY_WALL_BANNER, 7649);
        setBaseID(CYAN_WALL_BANNER, 7653);
        setBaseID(PURPLE_WALL_BANNER, 7657);
        setBaseID(BLUE_WALL_BANNER, 7661);
        setBaseID(BROWN_WALL_BANNER, 7665);
        setBaseID(GREEN_WALL_BANNER, 7669);
        setBaseID(RED_WALL_BANNER, 7673);
        setBaseID(BLACK_WALL_BANNER, 7677);
        setBaseID(RED_SANDSTONE, 7681);
        setBaseID(CHISELED_RED_SANDSTONE, 7682);
        setBaseID(CUT_RED_SANDSTONE, 7683);
        setBaseID(RED_SANDSTONE_STAIRS, 7684);
        setBaseID(OAK_SLAB, 7764);
        setBaseID(SPRUCE_SLAB, 7770);
        setBaseID(BIRCH_SLAB, 7776);
        setBaseID(JUNGLE_SLAB, 7782);
        setBaseID(ACACIA_SLAB, 7788);
        setBaseID(DARK_OAK_SLAB, 7794);
        setBaseID(STONE_SLAB, 7800);
        setBaseID(SMOOTH_STONE_SLAB, 7806);
        setBaseID(SANDSTONE_SLAB, 7812);
        setBaseID(CUT_SANDSTONE_SLAB, 7818);
        setBaseID(PETRIFIED_OAK_SLAB, 7824);
        setBaseID(COBBLESTONE_SLAB, 7830);
        setBaseID(BRICK_SLAB, 7836);
        setBaseID(STONE_BRICK_SLAB, 7842);
        setBaseID(NETHER_BRICK_SLAB, 7848);
        setBaseID(QUARTZ_SLAB, 7854);
        setBaseID(RED_SANDSTONE_SLAB, 7860);
        setBaseID(CUT_RED_SANDSTONE_SLAB, 7866);
        setBaseID(PURPUR_SLAB, 7872);
        setBaseID(SMOOTH_STONE, 7878);
        setBaseID(SMOOTH_SANDSTONE, 7879);
        setBaseID(SMOOTH_QUARTZ, 7880);
        setBaseID(SMOOTH_RED_SANDSTONE, 7881);
        setBaseID(SPRUCE_FENCE_GATE, 7882);
        setBaseID(BIRCH_FENCE_GATE, 7914);
        setBaseID(JUNGLE_FENCE_GATE, 7946);
        setBaseID(ACACIA_FENCE_GATE, 7978);
        setBaseID(DARK_OAK_FENCE_GATE, 8010);
        setBaseID(SPRUCE_FENCE, 8042);
        setBaseID(BIRCH_FENCE, 8074);
        setBaseID(JUNGLE_FENCE, 8106);
        setBaseID(ACACIA_FENCE, 8138);
        setBaseID(DARK_OAK_FENCE, 8170);
        setBaseID(SPRUCE_DOOR, 8202);
        setBaseID(BIRCH_DOOR, 8266);
        setBaseID(JUNGLE_DOOR, 8330);
        setBaseID(ACACIA_DOOR, 8394);
        setBaseID(DARK_OAK_DOOR, 8458);
        setBaseID(END_ROD, 8522);
        setBaseID(CHORUS_PLANT, 8528);
        setBaseID(CHORUS_FLOWER, 8592);
        setBaseID(PURPUR_BLOCK, 8598);
        setBaseID(PURPUR_PILLAR, 8599);
        setBaseID(PURPUR_STAIRS, 8602);
        setBaseID(END_STONE_BRICKS, 8682);
        setBaseID(BEETROOTS, 8683);
        setBaseID(GRASS_PATH, 8687);
        setBaseID(END_GATEWAY, 8688);
        setBaseID(REPEATING_COMMAND_BLOCK, 8689);
        setBaseID(CHAIN_COMMAND_BLOCK, 8701);
        setBaseID(FROSTED_ICE, 8713);
        setBaseID(MAGMA_BLOCK, 8717);
        setBaseID(NETHER_WART_BLOCK, 8718);
        setBaseID(RED_NETHER_BRICKS, 8719);
        setBaseID(BONE_BLOCK, 8720);
        setBaseID(STRUCTURE_VOID, 8723);
        setBaseID(OBSERVER, 8724);
        setBaseID(SHULKER_BOX, 8736);
        setBaseID(WHITE_SHULKER_BOX, 8742);
        setBaseID(ORANGE_SHULKER_BOX, 8748);
        setBaseID(MAGENTA_SHULKER_BOX, 8754);
        setBaseID(LIGHT_BLUE_SHULKER_BOX, 8760);
        setBaseID(YELLOW_SHULKER_BOX, 8766);
        setBaseID(LIME_SHULKER_BOX, 8772);
        setBaseID(PINK_SHULKER_BOX, 8778);
        setBaseID(GRAY_SHULKER_BOX, 8784);
        setBaseID(LIGHT_GRAY_SHULKER_BOX, 8790);
        setBaseID(CYAN_SHULKER_BOX, 8796);
        setBaseID(PURPLE_SHULKER_BOX, 8802);
        setBaseID(BLUE_SHULKER_BOX, 8808);
        setBaseID(BROWN_SHULKER_BOX, 8814);
        setBaseID(GREEN_SHULKER_BOX, 8820);
        setBaseID(RED_SHULKER_BOX, 8826);
        setBaseID(BLACK_SHULKER_BOX, 8832);
        setBaseID(WHITE_GLAZED_TERRACOTTA, 8838);
        setBaseID(ORANGE_GLAZED_TERRACOTTA, 8842);
        setBaseID(MAGENTA_GLAZED_TERRACOTTA, 8846);
        setBaseID(LIGHT_BLUE_GLAZED_TERRACOTTA, 8850);
        setBaseID(YELLOW_GLAZED_TERRACOTTA, 8854);
        setBaseID(LIME_GLAZED_TERRACOTTA, 8858);
        setBaseID(PINK_GLAZED_TERRACOTTA, 8862);
        setBaseID(GRAY_GLAZED_TERRACOTTA, 8866);
        setBaseID(LIGHT_GRAY_GLAZED_TERRACOTTA, 8870);
        setBaseID(CYAN_GLAZED_TERRACOTTA, 8874);
        setBaseID(PURPLE_GLAZED_TERRACOTTA, 8878);
        setBaseID(BLUE_GLAZED_TERRACOTTA, 8882);
        setBaseID(BROWN_GLAZED_TERRACOTTA, 8886);
        setBaseID(GREEN_GLAZED_TERRACOTTA, 8890);
        setBaseID(RED_GLAZED_TERRACOTTA, 8894);
        setBaseID(BLACK_GLAZED_TERRACOTTA, 8898);
        setBaseID(WHITE_CONCRETE, 8902);
        setBaseID(ORANGE_CONCRETE, 8903);
        setBaseID(MAGENTA_CONCRETE, 8904);
        setBaseID(LIGHT_BLUE_CONCRETE, 8905);
        setBaseID(YELLOW_CONCRETE, 8906);
        setBaseID(LIME_CONCRETE, 8907);
        setBaseID(PINK_CONCRETE, 8908);
        setBaseID(GRAY_CONCRETE, 8909);
        setBaseID(LIGHT_GRAY_CONCRETE, 8910);
        setBaseID(CYAN_CONCRETE, 8911);
        setBaseID(PURPLE_CONCRETE, 8912);
        setBaseID(BLUE_CONCRETE, 8913);
        setBaseID(BROWN_CONCRETE, 8914);
        setBaseID(GREEN_CONCRETE, 8915);
        setBaseID(RED_CONCRETE, 8916);
        setBaseID(BLACK_CONCRETE, 8917);
        setBaseID(WHITE_CONCRETE_POWDER, 8918);
        setBaseID(ORANGE_CONCRETE_POWDER, 8919);
        setBaseID(MAGENTA_CONCRETE_POWDER, 8920);
        setBaseID(LIGHT_BLUE_CONCRETE_POWDER, 8921);
        setBaseID(YELLOW_CONCRETE_POWDER, 8922);
        setBaseID(LIME_CONCRETE_POWDER, 8923);
        setBaseID(PINK_CONCRETE_POWDER, 8924);
        setBaseID(GRAY_CONCRETE_POWDER, 8925);
        setBaseID(LIGHT_GRAY_CONCRETE_POWDER, 8926);
        setBaseID(CYAN_CONCRETE_POWDER, 8927);
        setBaseID(PURPLE_CONCRETE_POWDER, 8928);
        setBaseID(BLUE_CONCRETE_POWDER, 8929);
        setBaseID(BROWN_CONCRETE_POWDER, 8930);
        setBaseID(GREEN_CONCRETE_POWDER, 8931);
        setBaseID(RED_CONCRETE_POWDER, 8932);
        setBaseID(BLACK_CONCRETE_POWDER, 8933);
        setBaseID(KELP, 8934);
        setBaseID(KELP_PLANT, 8960);
        setBaseID(DRIED_KELP_BLOCK, 8961);
        setBaseID(TURTLE_EGG, 8962);
        setBaseID(DEAD_TUBE_CORAL_BLOCK, 8974);
        setBaseID(DEAD_BRAIN_CORAL_BLOCK, 8975);
        setBaseID(DEAD_BUBBLE_CORAL_BLOCK, 8976);
        setBaseID(DEAD_FIRE_CORAL_BLOCK, 8977);
        setBaseID(DEAD_HORN_CORAL_BLOCK, 8978);
        setBaseID(TUBE_CORAL_BLOCK, 8979);
        setBaseID(BRAIN_CORAL_BLOCK, 8980);
        setBaseID(BUBBLE_CORAL_BLOCK, 8981);
        setBaseID(FIRE_CORAL_BLOCK, 8982);
        setBaseID(HORN_CORAL_BLOCK, 8983);
        setBaseID(DEAD_TUBE_CORAL, 8984);
        setBaseID(DEAD_BRAIN_CORAL, 8986);
        setBaseID(DEAD_BUBBLE_CORAL, 8988);
        setBaseID(DEAD_FIRE_CORAL, 8990);
        setBaseID(DEAD_HORN_CORAL, 8992);
        setBaseID(TUBE_CORAL, 8994);
        setBaseID(BRAIN_CORAL, 8996);
        setBaseID(BUBBLE_CORAL, 8998);
        setBaseID(FIRE_CORAL, 9000);
        setBaseID(HORN_CORAL, 9002);
        setBaseID(DEAD_TUBE_CORAL_FAN, 9004);
        setBaseID(DEAD_BRAIN_CORAL_FAN, 9006);
        setBaseID(DEAD_BUBBLE_CORAL_FAN, 9008);
        setBaseID(DEAD_FIRE_CORAL_FAN, 9010);
        setBaseID(DEAD_HORN_CORAL_FAN, 9012);
        setBaseID(TUBE_CORAL_FAN, 9014);
        setBaseID(BRAIN_CORAL_FAN, 9016);
        setBaseID(BUBBLE_CORAL_FAN, 9018);
        setBaseID(FIRE_CORAL_FAN, 9020);
        setBaseID(HORN_CORAL_FAN, 9022);
        setBaseID(DEAD_TUBE_CORAL_WALL_FAN, 9024);
        setBaseID(DEAD_BRAIN_CORAL_WALL_FAN, 9032);
        setBaseID(DEAD_BUBBLE_CORAL_WALL_FAN, 9040);
        setBaseID(DEAD_FIRE_CORAL_WALL_FAN, 9048);
        setBaseID(DEAD_HORN_CORAL_WALL_FAN, 9056);
        setBaseID(TUBE_CORAL_WALL_FAN, 9064);
        setBaseID(BRAIN_CORAL_WALL_FAN, 9072);
        setBaseID(BUBBLE_CORAL_WALL_FAN, 9080);
        setBaseID(FIRE_CORAL_WALL_FAN, 9088);
        setBaseID(HORN_CORAL_WALL_FAN, 9096);
        setBaseID(SEA_PICKLE, 9104);
        setBaseID(BLUE_ICE, 9112);
        setBaseID(CONDUIT, 9113);
        setBaseID(BAMBOO_SAPLING, 9115);
        setBaseID(BAMBOO, 9116);
        setBaseID(POTTED_BAMBOO, 9128);
        setBaseID(VOID_AIR, 9129);
        setBaseID(CAVE_AIR, 9130);
        setBaseID(BUBBLE_COLUMN, 9131);
        setBaseID(POLISHED_GRANITE_STAIRS, 9133);
        setBaseID(SMOOTH_RED_SANDSTONE_STAIRS, 9213);
        setBaseID(MOSSY_STONE_BRICK_STAIRS, 9293);
        setBaseID(POLISHED_DIORITE_STAIRS, 9373);
        setBaseID(MOSSY_COBBLESTONE_STAIRS, 9453);
        setBaseID(END_STONE_BRICK_STAIRS, 9533);
        setBaseID(STONE_STAIRS, 9613);
        setBaseID(SMOOTH_SANDSTONE_STAIRS, 9693);
        setBaseID(SMOOTH_QUARTZ_STAIRS, 9773);
        setBaseID(GRANITE_STAIRS, 9853);
        setBaseID(ANDESITE_STAIRS, 9933);
        setBaseID(RED_NETHER_BRICK_STAIRS, 10013);
        setBaseID(POLISHED_ANDESITE_STAIRS, 10093);
        setBaseID(DIORITE_STAIRS, 10173);
        setBaseID(POLISHED_GRANITE_SLAB, 10253);
        setBaseID(SMOOTH_RED_SANDSTONE_SLAB, 10259);
        setBaseID(MOSSY_STONE_BRICK_SLAB, 10265);
        setBaseID(POLISHED_DIORITE_SLAB, 10271);
        setBaseID(MOSSY_COBBLESTONE_SLAB, 10277);
        setBaseID(END_STONE_BRICK_SLAB, 10283);
        setBaseID(SMOOTH_SANDSTONE_SLAB, 10289);
        setBaseID(SMOOTH_QUARTZ_SLAB, 10295);
        setBaseID(GRANITE_SLAB, 10301);
        setBaseID(ANDESITE_SLAB, 10307);
        setBaseID(RED_NETHER_BRICK_SLAB, 10313);
        setBaseID(POLISHED_ANDESITE_SLAB, 10319);
        setBaseID(DIORITE_SLAB, 10325);
        setBaseID(BRICK_WALL, 10331);
        setBaseID(PRISMARINE_WALL, 10395);
        setBaseID(RED_SANDSTONE_WALL, 10459);
        setBaseID(MOSSY_STONE_BRICK_WALL, 10523);
        setBaseID(GRANITE_WALL, 10587);
        setBaseID(STONE_BRICK_WALL, 10651);
        setBaseID(NETHER_BRICK_WALL, 10715);
        setBaseID(ANDESITE_WALL, 10779);
        setBaseID(RED_NETHER_BRICK_WALL, 10843);
        setBaseID(SANDSTONE_WALL, 10907);
        setBaseID(END_STONE_BRICK_WALL, 10971);
        setBaseID(DIORITE_WALL, 11035);
        setBaseID(SCAFFOLDING, 11099);
        setBaseID(LOOM, 11131);
        setBaseID(BARREL, 11135);
        setBaseID(SMOKER, 11147);
        setBaseID(BLAST_FURNACE, 11155);
        setBaseID(CARTOGRAPHY_TABLE, 11163);
        setBaseID(FLETCHING_TABLE, 11164);
        setBaseID(GRINDSTONE, 11165);
        setBaseID(LECTERN, 11177);
        setBaseID(SMITHING_TABLE, 11193);
        setBaseID(STONECUTTER, 11194);
        setBaseID(BELL, 11198);
        setBaseID(LANTERN, 11214);
        setBaseID(CAMPFIRE, 11216);
        setBaseID(SWEET_BERRY_BUSH, 11248);
        setBaseID(STRUCTURE_BLOCK, 11252);
        setBaseID(JIGSAW, 11256);
        setBaseID(COMPOSTER, 11262);
    }
}
