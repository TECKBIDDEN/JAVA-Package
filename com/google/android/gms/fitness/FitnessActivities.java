package com.google.android.gms.fitness;

import android.util.SparseArray;

public class FitnessActivities
{
  public static final int AEROBICS = 9;
  public static final String AEROBICS_STRING = "aerobics";
  public static final int BADMINTON = 10;
  public static final String BADMINTON_STRING = "badminton";
  public static final int BASEBALL = 11;
  public static final String BASEBALL_STRING = "baseball";
  public static final int BASKETBALL = 12;
  public static final String BASKETBALL_STRING = "basketball";
  public static final int BIATHLON = 13;
  public static final String BIATHLON_STRING = "biathlon";
  public static final int BIKING = 1;
  public static final int BIKING_HAND = 14;
  public static final String BIKING_HAND_STRING = "biking.hand";
  public static final int BIKING_MOUNTAIN = 15;
  public static final String BIKING_MOUNTAIN_STRING = "biking.mountain";
  public static final int BIKING_ROAD = 16;
  public static final String BIKING_ROAD_STRING = "biking.road";
  public static final int BIKING_SPINNING = 17;
  public static final String BIKING_SPINNING_STRING = "biking.spinning";
  public static final int BIKING_STATIONARY = 18;
  public static final String BIKING_STATIONARY_STRING = "biking.stationary";
  public static final String BIKING_STRING = "biking";
  public static final int BIKING_UTILITY = 19;
  public static final String BIKING_UTILITY_STRING = "biking.utility";
  public static final int BOXING = 20;
  public static final String BOXING_STRING = "boxing";
  public static final int CALISTHENICS = 21;
  public static final String CALISTHENICS_STRING = "calisthenics";
  public static final int CIRCUIT_TRAINING = 22;
  public static final String CIRCUIT_TRAINING_STRING = "circuit_training";
  public static final int CRICKET = 23;
  public static final String CRICKET_STRING = "cricket";
  public static final int CURLING = 106;
  public static final String CURLING_STRING = "curling";
  public static final int DANCING = 24;
  public static final String DANCING_STRING = "dancing";
  public static final int DIVING = 102;
  public static final String DIVING_STRING = "diving";
  public static final int ELLIPTICAL = 25;
  public static final String ELLIPTICAL_STRING = "elliptical";
  public static final int ERGOMETER = 103;
  public static final String ERGOMETER_STRING = "ergometer";
  public static final String EXITING_VEHICLE_STRING = "exiting_vehicle";
  public static final int FENCING = 26;
  public static final String FENCING_STRING = "fencing";
  public static final int FOOTBALL_AMERICAN = 27;
  public static final String FOOTBALL_AMERICAN_STRING = "football.american";
  public static final int FOOTBALL_AUSTRALIAN = 28;
  public static final String FOOTBALL_AUSTRALIAN_STRING = "football.australian";
  public static final int FOOTBALL_SOCCER = 29;
  public static final String FOOTBALL_SOCCER_STRING = "football.soccer";
  public static final int FRISBEE_DISC = 30;
  public static final String FRISBEE_DISC_STRING = "frisbee_disc";
  public static final int GARDENING = 31;
  public static final String GARDENING_STRING = "gardening";
  public static final int GOLF = 32;
  public static final String GOLF_STRING = "golf";
  public static final int GYMNASTICS = 33;
  public static final String GYMNASTICS_STRING = "gymnastics";
  public static final int HANDBALL = 34;
  public static final String HANDBALL_STRING = "handball";
  public static final int HIKING = 35;
  public static final String HIKING_STRING = "hiking";
  public static final int HOCKEY = 36;
  public static final String HOCKEY_STRING = "hockey";
  public static final int HORSEBACK_RIDING = 37;
  public static final String HORSEBACK_RIDING_STRING = "horseback_riding";
  public static final int HOUSEWORK = 38;
  public static final String HOUSEWORK_STRING = "housework";
  public static final int ICE_SKATING = 104;
  public static final String ICE_SKATING_STRING = "ice_skating";
  public static final int IN_VEHICLE = 0;
  public static final String IN_VEHICLE_STRING = "in_vehicle";
  public static final int JUMP_ROPE = 39;
  public static final String JUMP_ROPE_STRING = "jump_rope";
  public static final int KAYAKING = 40;
  public static final String KAYAKING_STRING = "kayaking";
  public static final int KETTLEBELL_TRAINING = 41;
  public static final String KETTLEBELL_TRAINING_STRING = "kettlebell_training";
  public static final int KICKBOXING = 42;
  public static final String KICKBOXING_STRING = "kickboxing";
  public static final int KICK_SCOOTER = 107;
  public static final String KICK_SCOOTER_STRING = "kick_scooter";
  public static final int KITESURFING = 43;
  public static final String KITESURFING_STRING = "kitesurfing";
  public static final int MARTIAL_ARTS = 44;
  public static final String MARTIAL_ARTS_STRING = "martial_arts";
  public static final int MEDITATION = 45;
  public static final String MEDITATION_STRING = "meditation";
  public static final int MIXED_MARTIAL_ARTS = 46;
  public static final String MIXED_MARTIAL_ARTS_STRING = "martial_arts.mixed";
  public static final int ON_FOOT = 2;
  public static final String ON_FOOT_STRING = "on_foot";
  public static final int OTHER = 108;
  public static final String OTHER_STRING = "other";
  public static final int P90X = 47;
  public static final String P90X_STRING = "p90x";
  public static final int PARAGLIDING = 48;
  public static final String PARAGLIDING_STRING = "paragliding";
  public static final int PILATES = 49;
  public static final String PILATES_STRING = "pilates";
  public static final int POLO = 50;
  public static final String POLO_STRING = "polo";
  public static final int RACQUETBALL = 51;
  public static final String RACQUETBALL_STRING = "racquetball";
  public static final int ROCK_CLIMBING = 52;
  public static final String ROCK_CLIMBING_STRING = "rock_climbing";
  public static final int ROWING = 53;
  public static final int ROWING_MACHINE = 54;
  public static final String ROWING_MACHINE_STRING = "rowing.machine";
  public static final String ROWING_STRING = "rowing";
  public static final int RUGBY = 55;
  public static final String RUGBY_STRING = "rugby";
  public static final int RUNNING = 8;
  public static final int RUNNING_JOGGING = 56;
  public static final String RUNNING_JOGGING_STRING = "running.jogging";
  public static final int RUNNING_SAND = 57;
  public static final String RUNNING_SAND_STRING = "running.sand";
  public static final String RUNNING_STRING = "running";
  public static final int RUNNING_TREADMILL = 58;
  public static final String RUNNING_TREADMILL_STRING = "running.treadmill";
  public static final int SAILING = 59;
  public static final String SAILING_STRING = "sailing";
  public static final int SCUBA_DIVING = 60;
  public static final String SCUBA_DIVING_STRING = "scuba_diving";
  public static final int SKATEBOARDING = 61;
  public static final String SKATEBOARDING_STRING = "skateboarding";
  public static final int SKATING = 62;
  public static final int SKATING_CROSS = 63;
  public static final String SKATING_CROSS_STRING = "skating.cross";
  public static final int SKATING_INDOOR = 105;
  public static final String SKATING_INDOOR_STRING = "skating.indoor";
  public static final int SKATING_INLINE = 64;
  public static final String SKATING_INLINE_STRING = "skating.inline";
  public static final String SKATING_STRING = "skating";
  public static final int SKIING = 65;
  public static final int SKIING_BACK_COUNTRY = 66;
  public static final String SKIING_BACK_COUNTRY_STRING = "skiing.back_country";
  public static final int SKIING_CROSS_COUNTRY = 67;
  public static final String SKIING_CROSS_COUNTRY_STRING = "skiing.cross_country";
  public static final int SKIING_DOWNHILL = 68;
  public static final String SKIING_DOWNHILL_STRING = "skiing.downhill";
  public static final int SKIING_KITE = 69;
  public static final String SKIING_KITE_STRING = "skiing.kite";
  public static final int SKIING_ROLLER = 70;
  public static final String SKIING_ROLLER_STRING = "skiing.roller";
  public static final String SKIING_STRING = "skiing";
  public static final int SLEDDING = 71;
  public static final String SLEDDING_STRING = "sledding";
  public static final int SLEEP = 72;
  public static final String SLEEP_STRING = "sleep";
  public static final int SNOWBOARDING = 73;
  public static final String SNOWBOARDING_STRING = "snowboarding";
  public static final int SNOWMOBILE = 74;
  public static final String SNOWMOBILE_STRING = "snowmobile";
  public static final int SNOWSHOEING = 75;
  public static final String SNOWSHOEING_STRING = "snowshoeing";
  public static final int SQUASH = 76;
  public static final String SQUASH_STRING = "squash";
  public static final int STAIR_CLIMBING = 77;
  public static final int STAIR_CLIMBING_MACHINE = 78;
  public static final String STAIR_CLIMBING_MACHINE_STRING = "stair_climbing.machine";
  public static final String STAIR_CLIMBING_STRING = "stair_climbing";
  public static final int STANDUP_PADDLEBOARDING = 79;
  public static final String STANDUP_PADDLEBOARDING_STRING = "standup_paddleboarding";
  public static final int STILL = 3;
  public static final String STILL_STRING = "still";
  public static final int STRENGTH_TRAINING = 80;
  public static final String STRENGTH_TRAINING_STRING = "strength_training";
  public static final int SURFING = 81;
  public static final String SURFING_STRING = "surfing";
  public static final int SWIMMING = 82;
  public static final int SWIMMING_OPEN_WATER = 84;
  public static final String SWIMMING_OPEN_WATER_STRING = "swimming.open_water";
  public static final int SWIMMING_POOL = 83;
  public static final String SWIMMING_POOL_STRING = "swimming.pool";
  public static final String SWIMMING_STRING = "swimming";
  private static final SparseArray<String> Sg = new SparseArray(109);
  public static final int TABLE_TENNIS = 85;
  public static final String TABLE_TENNIS_STRING = "table_tennis";
  public static final int TEAM_SPORTS = 86;
  public static final String TEAM_SPORTS_STRING = "team_sports";
  public static final int TENNIS = 87;
  public static final String TENNIS_STRING = "tennis";
  public static final int TILTING = 5;
  public static final String TILTING_STRING = "tilting";
  public static final int TREADMILL = 88;
  public static final String TREADMILL_STRING = "treadmill";
  public static final int UNKNOWN = 4;
  public static final String UNKNOWN_STRING = "unknown";
  public static final int VOLLEYBALL = 89;
  public static final int VOLLEYBALL_BEACH = 90;
  public static final String VOLLEYBALL_BEACH_STRING = "volleyball.beach";
  public static final int VOLLEYBALL_INDOOR = 91;
  public static final String VOLLEYBALL_INDOOR_STRING = "volleyball.indoor";
  public static final String VOLLEYBALL_STRING = "volleyball";
  public static final int WAKEBOARDING = 92;
  public static final String WAKEBOARDING_STRING = "wakeboarding";
  public static final int WALKING = 7;
  public static final int WALKING_FITNESS = 93;
  public static final String WALKING_FITNESS_STRING = "walking.fitness";
  public static final int WALKING_NORDIC = 94;
  public static final String WALKING_NORDIC_STRING = "walking.nordic";
  public static final String WALKING_STRING = "walking";
  public static final int WALKING_TREADMILL = 95;
  public static final String WALKING_TREADMILL_STRING = "walking.treadmill";
  public static final int WATER_POLO = 96;
  public static final String WATER_POLO_STRING = "water_polo";
  public static final int WEIGHTLIFTING = 97;
  public static final String WEIGHTLIFTING_STRING = "weightlifting";
  public static final int WHEELCHAIR = 98;
  public static final String WHEELCHAIR_STRING = "wheelchair";
  public static final int WINDSURFING = 99;
  public static final String WINDSURFING_STRING = "windsurfing";
  public static final int YOGA = 100;
  public static final String YOGA_STRING = "yoga";
  public static final int ZUMBA = 101;
  public static final String ZUMBA_STRING = "zumba";

  static
  {
    Sg.put(9, "aerobics");
    Sg.put(10, "badminton");
    Sg.put(11, "baseball");
    Sg.put(12, "basketball");
    Sg.put(13, "biathlon");
    Sg.put(1, "biking");
    Sg.put(14, "biking.hand");
    Sg.put(15, "biking.mountain");
    Sg.put(16, "biking.road");
    Sg.put(17, "biking.spinning");
    Sg.put(18, "biking.stationary");
    Sg.put(19, "biking.utility");
    Sg.put(20, "boxing");
    Sg.put(21, "calisthenics");
    Sg.put(22, "circuit_training");
    Sg.put(23, "cricket");
    Sg.put(106, "curling");
    Sg.put(24, "dancing");
    Sg.put(102, "diving");
    Sg.put(25, "elliptical");
    Sg.put(103, "ergometer");
    Sg.put(6, "exiting_vehicle");
    Sg.put(26, "fencing");
    Sg.put(27, "football.american");
    Sg.put(28, "football.australian");
    Sg.put(29, "football.soccer");
    Sg.put(30, "frisbee_disc");
    Sg.put(31, "gardening");
    Sg.put(32, "golf");
    Sg.put(33, "gymnastics");
    Sg.put(34, "handball");
    Sg.put(35, "hiking");
    Sg.put(36, "hockey");
    Sg.put(37, "horseback_riding");
    Sg.put(38, "housework");
    Sg.put(104, "ice_skating");
    Sg.put(0, "in_vehicle");
    Sg.put(39, "jump_rope");
    Sg.put(40, "kayaking");
    Sg.put(41, "kettlebell_training");
    Sg.put(107, "kick_scooter");
    Sg.put(42, "kickboxing");
    Sg.put(43, "kitesurfing");
    Sg.put(44, "martial_arts");
    Sg.put(45, "meditation");
    Sg.put(46, "martial_arts.mixed");
    Sg.put(2, "on_foot");
    Sg.put(108, "other");
    Sg.put(47, "p90x");
    Sg.put(48, "paragliding");
    Sg.put(49, "pilates");
    Sg.put(50, "polo");
    Sg.put(51, "racquetball");
    Sg.put(52, "rock_climbing");
    Sg.put(53, "rowing");
    Sg.put(54, "rowing.machine");
    Sg.put(55, "rugby");
    Sg.put(8, "running");
    Sg.put(56, "running.jogging");
    Sg.put(57, "running.sand");
    Sg.put(58, "running.treadmill");
    Sg.put(59, "sailing");
    Sg.put(60, "scuba_diving");
    Sg.put(61, "skateboarding");
    Sg.put(62, "skating");
    Sg.put(63, "skating.cross");
    Sg.put(105, "skating.indoor");
    Sg.put(64, "skating.inline");
    Sg.put(65, "skiing");
    Sg.put(66, "skiing.back_country");
    Sg.put(67, "skiing.cross_country");
    Sg.put(68, "skiing.downhill");
    Sg.put(69, "skiing.kite");
    Sg.put(70, "skiing.roller");
    Sg.put(71, "sledding");
    Sg.put(72, "sleep");
    Sg.put(73, "snowboarding");
    Sg.put(74, "snowmobile");
    Sg.put(75, "snowshoeing");
    Sg.put(76, "squash");
    Sg.put(77, "stair_climbing");
    Sg.put(78, "stair_climbing.machine");
    Sg.put(79, "standup_paddleboarding");
    Sg.put(3, "still");
    Sg.put(80, "strength_training");
    Sg.put(81, "surfing");
    Sg.put(82, "swimming");
    Sg.put(83, "swimming.pool");
    Sg.put(84, "swimming.open_water");
    Sg.put(85, "table_tennis");
    Sg.put(86, "team_sports");
    Sg.put(87, "tennis");
    Sg.put(5, "tilting");
    Sg.put(88, "treadmill");
    Sg.put(4, "unknown");
    Sg.put(89, "volleyball");
    Sg.put(90, "volleyball.beach");
    Sg.put(91, "volleyball.indoor");
    Sg.put(92, "wakeboarding");
    Sg.put(7, "walking");
    Sg.put(93, "walking.fitness");
    Sg.put(94, "walking.nordic");
    Sg.put(95, "walking.treadmill");
    Sg.put(96, "water_polo");
    Sg.put(97, "weightlifting");
    Sg.put(98, "wheelchair");
    Sg.put(99, "windsurfing");
    Sg.put(100, "yoga");
    Sg.put(101, "zumba");
  }

  public static int cw(int paramInt)
  {
    if (paramInt > 108)
      paramInt = 4;
    return paramInt;
  }

  public static String getName(int paramInt)
  {
    String str = (String)Sg.get(paramInt);
    if (str == null)
      throw new IllegalArgumentException("Unknown activity " + paramInt);
    return str;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.FitnessActivities
 * JD-Core Version:    0.6.0
 */