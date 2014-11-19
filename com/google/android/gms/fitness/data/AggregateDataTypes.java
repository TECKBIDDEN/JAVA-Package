package com.google.android.gms.fitness.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AggregateDataTypes
{
  public static final DataType ACTIVITY_SUMMARY;
  public static final DataType DISTANCE_DELTA;
  public static final DataType HEART_RATE_SUMMARY;
  public static final Set<DataType> INPUT_TYPES;
  public static final DataType LOCATION_BOUNDING_BOX;
  public static final DataType POWER_SUMMARY;
  public static final DataType SPEED_SUMMARY;
  public static final DataType STEP_COUNT_DELTA = DataTypes.STEP_COUNT_DELTA;
  public static final DataType[] Sm;
  public static final String[] Sn;
  private static final Map<DataType, List<DataType>> So;
  public static final DataType WEIGHT_SUMMARY;

  static
  {
    Field[] arrayOfField1 = new Field[3];
    arrayOfField1[0] = Fields.ACTIVITY;
    arrayOfField1[1] = Fields.DURATION;
    arrayOfField1[2] = Fields.NUM_SEGMENTS;
    ACTIVITY_SUMMARY = new DataType("com.google.activity.summary", arrayOfField1);
    DISTANCE_DELTA = DataTypes.DISTANCE_DELTA;
    Field[] arrayOfField2 = new Field[3];
    arrayOfField2[0] = Fields.AVERAGE;
    arrayOfField2[1] = Fields.MAX;
    arrayOfField2[2] = Fields.MIN;
    HEART_RATE_SUMMARY = new DataType("com.google.heart_rate.summary", arrayOfField2);
    Field[] arrayOfField3 = new Field[4];
    arrayOfField3[0] = Fields.LOW_LATITUDE;
    arrayOfField3[1] = Fields.LOW_LONGITUDE;
    arrayOfField3[2] = Fields.HIGH_LATITUDE;
    arrayOfField3[3] = Fields.HIGH_LONGITUDE;
    LOCATION_BOUNDING_BOX = new DataType("com.google.location.bounding_box", arrayOfField3);
    Field[] arrayOfField4 = new Field[3];
    arrayOfField4[0] = Fields.AVERAGE;
    arrayOfField4[1] = Fields.MAX;
    arrayOfField4[2] = Fields.MIN;
    POWER_SUMMARY = new DataType("com.google.power.summary", arrayOfField4);
    Field[] arrayOfField5 = new Field[3];
    arrayOfField5[0] = Fields.AVERAGE;
    arrayOfField5[1] = Fields.MAX;
    arrayOfField5[2] = Fields.MIN;
    SPEED_SUMMARY = new DataType("com.google.speed.summary", arrayOfField5);
    Field[] arrayOfField6 = new Field[3];
    arrayOfField6[0] = Fields.AVERAGE;
    arrayOfField6[1] = Fields.MAX;
    arrayOfField6[2] = Fields.MIN;
    WEIGHT_SUMMARY = new DataType("com.google.weight.summary", arrayOfField6);
    DataType[] arrayOfDataType1 = new DataType[7];
    arrayOfDataType1[0] = DataTypes.STEP_COUNT_DELTA;
    arrayOfDataType1[1] = DataTypes.DISTANCE_DELTA;
    arrayOfDataType1[2] = DataTypes.ACTIVITY_SEGMENT;
    arrayOfDataType1[3] = DataTypes.SPEED;
    arrayOfDataType1[4] = DataTypes.HEART_RATE_BPM;
    arrayOfDataType1[5] = DataTypes.WEIGHT;
    arrayOfDataType1[6] = DataTypes.LOCATION_SAMPLE;
    INPUT_TYPES = new HashSet(Arrays.asList(arrayOfDataType1));
    DataType[] arrayOfDataType2 = new DataType[8];
    arrayOfDataType2[0] = ACTIVITY_SUMMARY;
    arrayOfDataType2[1] = DISTANCE_DELTA;
    arrayOfDataType2[2] = HEART_RATE_SUMMARY;
    arrayOfDataType2[3] = LOCATION_BOUNDING_BOX;
    arrayOfDataType2[4] = POWER_SUMMARY;
    arrayOfDataType2[5] = SPEED_SUMMARY;
    arrayOfDataType2[6] = STEP_COUNT_DELTA;
    arrayOfDataType2[7] = WEIGHT_SUMMARY;
    Sm = arrayOfDataType2;
    String[] arrayOfString = new String[8];
    arrayOfString[0] = ACTIVITY_SUMMARY.getName();
    arrayOfString[1] = DISTANCE_DELTA.getName();
    arrayOfString[2] = HEART_RATE_SUMMARY.getName();
    arrayOfString[3] = LOCATION_BOUNDING_BOX.getName();
    arrayOfString[4] = POWER_SUMMARY.getName();
    arrayOfString[5] = SPEED_SUMMARY.getName();
    arrayOfString[6] = STEP_COUNT_DELTA.getName();
    arrayOfString[7] = WEIGHT_SUMMARY.getName();
    Sn = arrayOfString;
    So = new AggregateDataTypes.1();
  }

  public static List<DataType> getForInput(DataType paramDataType)
  {
    List localList1 = (List)So.get(paramDataType);
    if (localList1 == null);
    for (List localList2 = Collections.emptyList(); ; localList2 = Collections.unmodifiableList(localList1))
      return localList2;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.AggregateDataTypes
 * JD-Core Version:    0.6.0
 */