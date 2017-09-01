package com.lyrebirdstudio.svg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;

import com.lyrebirdstudio.svg2.SvgBasketball;
import com.lyrebirdstudio.svg2.SvgBlowFish;
import com.lyrebirdstudio.svg2.SvgCloudLightening;
import com.lyrebirdstudio.svg2.SvgCloudRain;
import com.lyrebirdstudio.svg2.SvgCloudSun;
import com.lyrebirdstudio.svg2.SvgClover2;
import com.lyrebirdstudio.svg2.SvgCrescent;
import com.lyrebirdstudio.svg2.SvgCross;
import com.lyrebirdstudio.svg2.SvgFilm;
import com.lyrebirdstudio.svg2.SvgFishBowl;
import com.lyrebirdstudio.svg2.SvgHeartCam;
import com.lyrebirdstudio.svg2.SvgHeartEvil;
import com.lyrebirdstudio.svg2.SvgHeartLetter;
import com.lyrebirdstudio.svg2.SvgLeaf3;
import com.lyrebirdstudio.svg2.SvgLeaf4;
import com.lyrebirdstudio.svg2.SvgLeafAutumn;
import com.lyrebirdstudio.svg2.SvgLeafEmty;
import com.lyrebirdstudio.svg2.SvgLoveYou;
import com.lyrebirdstudio.svg2.SvgPisces;
import com.lyrebirdstudio.svg2.SvgPlus;
import com.lyrebirdstudio.svg2.SvgShield;
import com.lyrebirdstudio.svg2.SvgStar6;
import com.lyrebirdstudio.svg2.SvgStarSun;
import com.lyrebirdstudio.svg2.SvgTropicFish;
import com.lyrebirdstudio.svg2.SvgVollayball;
import com.lyrebirdstudio.svg2.SvgYinYang;

public abstract class Svg {
    public static final int DEFAULT_STROKE_SIZE = 9;
    public static final int SVG_3_BLOCK_1 = 99;
    public static final int SVG_3_BLOCK_2 = 100;
    public static final int SVG_3_BLOCK_3 = 101;
    public static final int SVG_3_HEART = 76;
    public static final int SVG_3_HEART_LEFT = 75;
    public static final int SVG_3_HEART_RIGHT = 77;
    public static final int SVG_3_WAVE_1 = 105;
    public static final int SVG_3_WAVE_2 = 106;
    public static final int SVG_3_WAVE_3 = 107;
    public static final int SVG_4_CIRCLE_1 = 90;
    public static final int SVG_4_CIRCLE_2 = 91;
    public static final int SVG_4_CIRCLE_3 = 92;
    public static final int SVG_4_CIRCLE_4 = 93;
    public static final int SVG_5_CIRCLE_1 = 94;
    public static final int SVG_5_CIRCLE_2 = 95;
    public static final int SVG_5_CIRCLE_3 = 96;
    public static final int SVG_5_CIRCLE_4 = 97;
    public static final int SVG_5_CIRCLE_5 = 98;
    public static final int SVG_APPLE = 11;
    public static final int SVG_APPLESTEVE = 12;
    public static final int SVG_BARE_FOOT = 6;
    public static final int SVG_BASEBALL = 13;
    public static final int SVG_BASKETBALL = 44;
    public static final int SVG_BAUBLE = 14;
    public static final int SVG_BEARHEART = 15;
    public static final int SVG_BIRD = 5;
    public static final int SVG_BLOWFISH = 45;
    public static final int SVG_BOX = 16;
    public static final int SVG_BROKENHEART = 17;
    public static final int SVG_BUTTERFLY = 3;
    public static final int SVG_BUTTERFLY2 = 18;
    public static final int SVG_CAMERA = 19;
    public static final int SVG_CIRCLE = 1;
    public static final int SVG_CLOUD = 7;
    public static final int SVG_CLOUDLIGHTENING = 46;
    public static final int SVG_CLOUDRAIN = 47;
    public static final int SVG_CLOUDSUN = 48;
    public static final int SVG_CLOVER = 2;
    public static final int SVG_CLOVER2 = 49;
    public static final int SVG_CRESCENT = 50;
    public static final int SVG_CROSS = 51;
    public static final int SVG_DIAMOND = 10;
    public static final int SVG_DISC = 20;
    public static final int SVG_FACE_LEFT = 83;
    public static final int SVG_FACE_MIDDLE = 85;
    public static final int SVG_FACE_RIGHT = 84;
    public static final int SVG_FILM = 52;
    public static final int SVG_FISHBOWL = 53;
    public static final int SVG_FLAME = 21;
    public static final int SVG_GIFT = 22;
    public static final int SVG_HEART = 0;
    public static final int SVG_HEARTBEAT = 23;
    public static final int SVG_HEARTBRAIN = 24;
    public static final int SVG_HEARTCAM = 54;
    public static final int SVG_HEARTCARE = 25;
    public static final int SVG_HEARTEVIL = 55;
    public static final int SVG_HEARTLETTER = 56;
    public static final int SVG_HEARTLOCK = 26;
    public static final int SVG_HEARTSQUARE = 27;
    public static final int SVG_HEARTSTAR = 28;
    public static final int SVG_HEX = 9;
    public static final int SVG_HEX_2 = 70;
    public static final int SVG_LEAF3 = 57;
    public static final int SVG_LEAF4 = 58;
    public static final int SVG_LEAFAUTUMN = 59;
    public static final int SVG_LEAFEMTY = 60;
    public static final int SVG_LOVEYOU = 61;
    public static final int SVG_MAN = 29;
    public static final int SVG_MANLOVE = 30;
    public static final int SVG_MAPLE_LEAF = 4;
    public static final int SVG_NEWBADGE = 31;
    public static final int SVG_PAC = 32;
    public static final int SVG_PAPER_CUT_1 = 78;
    public static final int SVG_PAPER_CUT_2 = 79;
    public static final int SVG_PAPER_CUT_3 = 80;
    public static final int SVG_PAPER_CUT_4 = 81;
    public static final int SVG_PAPER_CUT_5 = 82;
    public static final int SVG_PAW = 8;
    public static final int SVG_PISCES = 62;
    public static final int SVG_PLUS = 63;
    public static final int SVG_PUZZLE = 33;
    public static final int SVG_SHERIFF = 34;
    public static final int SVG_SHIELD = 64;
    public static final int SVG_STAR = 35;
    public static final int SVG_STAR6 = 65;
    public static final int SVG_STARSQUARE = 36;
    public static final int SVG_STARSUN = 66;
    public static final int SVG_STONE_1 = 86;
    public static final int SVG_STONE_2 = 87;
    public static final int SVG_STONE_3 = 88;
    public static final int SVG_STONE_4 = 89;
    public static final int SVG_STONE_HEART = 102;
    public static final int SVG_STONE_HEART_STONE_1 = 103;
    public static final int SVG_STONE_HEART_STONE_2 = 104;
    public static final int SVG_STRAWBERRY = 37;
    public static final int SVG_SUN = 38;
    public static final int SVG_SUN2 = 39;
    public static final int SVG_SUNSHAPE = 40;
    public static final int SVG_TREE = 41;
    public static final int SVG_TROPICFISH = 67;
    public static final int SVG_TURD = 42;
    public static final int SVG_VOLLAYBALL = 68;
    public static final int SVG_WAVE_1 = 71;
    public static final int SVG_WAVE_2 = 72;
    public static final int SVG_WAVE_3 = 73;
    public static final int SVG_WAVE_4 = 74;
    public static final int SVG_WOMAN = 43;
    public static final int SVG_YINYANG = 69;
    protected static ColorFilter cf = null;
    public static int colorStroke = -1;
    public static boolean isStroke = false;
    public static float strokeSize = 9.0f;
    public static Svg[] svgList = new Svg[]{new SvgHeart2(), new SvgCircle2(), new SvgClover(), new SvgButterfly(), new SvgMapleLeaf(), new SvgBird(), new SvgBareFoot(), new SvgCloud(), new SvgPaw(), new SvgHexagon(), new SvgDiamond(), new SvgApple(), new SvgAppleSteve(), new SvgBaseball(), new SvgBauble(), new SvgBearHeart(), new SvgBox(), new SvgBrokenHeart(), new SvgButterFly2(), new SvgCamera(), new SvgDisc(), new SvgFlame(), new SvgGift(), new SvgHeartBeat(), new SvgHeartBrain(), new SvgHeartCare(), new SvgHeartLock(), new SvgHeartSquare(), new SvgHeartStar(), new SvgMan(), new SvgManLove(), new SvgNewBadge(), new SvgPac(), new SvgPuzzle(), new SvgSheriff(), new SvgStar(), new SvgStarSquare(), new SvgStrawberry(), new SvgSun(), new SvgSun2(), new SvgSunShape(), new SvgTree(), new SvgFlush(), new SvgWoman(), new SvgBasketball(), new SvgBlowFish(), new SvgCloudLightening(), new SvgCloudRain(), new SvgCloudSun(), new SvgClover2(), new SvgCrescent(), new SvgCross(), new SvgFilm(), new SvgFishBowl(), new SvgHeartCam(), new SvgHeartEvil(), new SvgHeartLetter(), new SvgLeaf3(), new SvgLeaf4(), new SvgLeafAutumn(), new SvgLeafEmty(), new SvgLoveYou(), new SvgPisces(), new SvgPlus(), new SvgShield(), new SvgStar6(), new SvgStarSun(), new SvgTropicFish(), new SvgVollayball(), new SvgYinYang(), new SvgHex2(), new SvgWave1(), new SvgWave2(), new SvgWave3(), new SvgWave4(), new Svg3HeartLeft(), new Svg3Heart(), new Svg3HeartRight(), new SvgPaperCut1(), new SvgPaperCut2(), new SvgPaperCut3(), new SvgPaperCut4(), new SvgPaperCut5(), new SvgFaceLeft(), new SvgFaceRight(), new SvgFaceMiddle(), new SvgStone1(), new SvgStone3(), new SvgStone3(), new SvgStone4(), new Svg4Circle1(), new Svg4Circle2(), new Svg4Circle3(), new Svg4Circle4(), new Svg5Circle1(), new Svg5Circle2(), new Svg5Circle3(), new Svg5Circle4(), new Svg5Circle5(), new Svg3Block1(), new Svg3Block2(), new Svg3Block3(), new SvgStoneHeart(), new SvgStoneHeart1(), new SvgStoneHeart2(), new Svg3Wave1(), new Svg3Wave2(), new Svg3Wave3()};
    public Xfermode xferModeClear = new PorterDuffXfermode(Mode.CLEAR);

    public abstract void draw(Canvas canvas, float f, float f2, float f3, float f4, boolean z);

    public static void setColorTint(int color) {
        cf = new PorterDuffColorFilter(color, Mode.SRC_IN);
    }

    public void drawStroke(Canvas c, float w, float h, float dx, float dy, boolean clearMode) {
    }

    public static void clearColorTint(int color) {
        cf = null;
    }
}