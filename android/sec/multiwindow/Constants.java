package android.sec.multiwindow;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.view.WindowManagerPolicy;
import java.lang.reflect.Field;

public class Constants
{
  public static class Configuration
  {
    public static int ARRANGE_CASCADE;
    public static int ARRANGE_MINIMIZED_ALL;
    public static int ARRANGE_RESTORED_ALL;
    public static int ARRANGE_SPLITED;
    public static int ARRANGE_TILED;
    public static int ARRANGE_TOGGLE_MASK;
    public static int ARRANGE_UNDEFINED;
    static String[] FIELD_NAMES;

    static
    {
      String[] arrayOfString = new String[7];
      arrayOfString[0] = "ARRANGE_UNDEFINED";
      arrayOfString[1] = "ARRANGE_TILED";
      arrayOfString[2] = "ARRANGE_CASCADE";
      arrayOfString[3] = "ARRANGE_SPLITED";
      arrayOfString[4] = "ARRANGE_MINIMIZED_ALL";
      arrayOfString[5] = "ARRANGE_RESTORED_ALL";
      arrayOfString[6] = "ARRANGE_TOGGLE_MASK";
      FIELD_NAMES = arrayOfString;
      int i = FIELD_NAMES.length;
      int j = 0;
      while (true)
      {
        if (j < i);
        try
        {
          Field localField1 = Configuration.class.getDeclaredField(FIELD_NAMES[j]);
          Field localField2 = Configuration.class.getField(FIELD_NAMES[j]);
          localField2.setInt(localField2, localField1.getInt(localField1));
          label96: j++;
          continue;
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          break label96;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          break label96;
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          break label96;
        }
      }
    }
  }

  public static class Intent
  {
    public static String ACTION_ARRANGE_WINDOWS;
    public static String CATEGORY_MULTIWINDOW_LAUNCHER;
    public static String EXTRA_ARRANGE_MODE;
    public static String EXTRA_WINDOW_ARRANGED_SIZE;
    public static String EXTRA_WINDOW_DEFAULT_SIZE;
    public static String EXTRA_WINDOW_LAST_SIZE;
    public static String EXTRA_WINDOW_MINIMIZED_SIZE;
    public static String EXTRA_WINDOW_MINIMIZED_SLOT;
    public static String EXTRA_WINDOW_MINIMUM_SIZE;
    public static String EXTRA_WINDOW_MODE;
    public static String EXTRA_WINDOW_OUT_OF_ARRANGE;
    public static String EXTRA_WINDOW_POSITION;
    static String[] FIELD_NAMES;
    public static String METADATA_MULTIWINDOW_DEF_HEIGHT;
    public static String METADATA_MULTIWINDOW_DEF_WIDTH;
    public static String METADATA_MULTIWINDOW_MIN_HEIGHT;
    public static String METADATA_MULTIWINDOW_MIN_WIDTH;
    public static String METADATA_MULTIWINDOW_STYLE;
    public static String METADATA_SUPPORT_MULTIWINDOW;

    static
    {
      String[] arrayOfString = new String[18];
      arrayOfString[0] = "EXTRA_WINDOW_MODE";
      arrayOfString[1] = "EXTRA_WINDOW_POSITION";
      arrayOfString[2] = "EXTRA_WINDOW_MINIMUM_SIZE";
      arrayOfString[3] = "EXTRA_WINDOW_MINIMIZED_SIZE";
      arrayOfString[4] = "EXTRA_WINDOW_MINIMIZED_SLOT";
      arrayOfString[5] = "EXTRA_WINDOW_DEFAULT_SIZE";
      arrayOfString[6] = "EXTRA_WINDOW_LAST_SIZE";
      arrayOfString[7] = "EXTRA_WINDOW_ARRANGED_SIZE";
      arrayOfString[8] = "EXTRA_WINDOW_OUT_OF_ARRANGE";
      arrayOfString[9] = "CATEGORY_MULTIWINDOW_LAUNCHER";
      arrayOfString[10] = "METADATA_SUPPORT_MULTIWINDOW";
      arrayOfString[11] = "METADATA_MULTIWINDOW_STYLE";
      arrayOfString[12] = "METADATA_MULTIWINDOW_MIN_WIDTH";
      arrayOfString[13] = "METADATA_MULTIWINDOW_MIN_HEIGHT";
      arrayOfString[14] = "METADATA_MULTIWINDOW_DEF_WIDTH";
      arrayOfString[15] = "METADATA_MULTIWINDOW_DEF_HEIGHT";
      arrayOfString[16] = "ACTION_ARRANGE_WINDOWS";
      arrayOfString[17] = "EXTRA_ARRANGE_MODE";
      FIELD_NAMES = arrayOfString;
      int i = FIELD_NAMES.length;
      int j = 0;
      while (true)
      {
        if (j < i);
        try
        {
          Field localField1 = Intent.class.getDeclaredField(FIELD_NAMES[j]);
          Field localField2 = Intent.class.getField(FIELD_NAMES[j]);
          localField2.set(localField2, localField1.get(localField1));
          label162: j++;
          continue;
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          break label162;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          break label162;
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          break label162;
        }
      }
    }
  }

  public static class PackageManager
  {
    public static String FEATURE_MULTIWINDOW;
    public static String FEATURE_MULTIWINDOW_PHONE;
    public static String FEATURE_MULTIWINDOW_TABLET;
    static String[] FIELD_NAMES;

    static
    {
      String[] arrayOfString = new String[3];
      arrayOfString[0] = "FEATURE_MULTIWINDOW";
      arrayOfString[1] = "FEATURE_MULTIWINDOW_PHONE";
      arrayOfString[2] = "FEATURE_MULTIWINDOW_TABLET";
      FIELD_NAMES = arrayOfString;
      int i = FIELD_NAMES.length;
      int j = 0;
      while (true)
      {
        if (j < i);
        try
        {
          Field localField1 = PackageManager.class.getDeclaredField(FIELD_NAMES[j]);
          Field localField2 = PackageManager.class.getField(FIELD_NAMES[j]);
          localField2.set(localField2, localField1.get(localField1));
          label74: j++;
          continue;
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          break label74;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          break label74;
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          break label74;
        }
      }
    }
  }

  public static class WindowManagerPolicy
  {
    static String[] FIELD_NAMES;
    public static int WINDOW_INFO_NOTHING_CHANGED;
    public static int WINDOW_INFO_SIZE_CHANGED;
    public static int WINDOW_MODE_FREESTYLE;
    public static int WINDOW_MODE_MASK;
    public static int WINDOW_MODE_NORMAL;
    public static int WINDOW_MODE_OPTION_COMMON_FIXED_RATIO;
    public static int WINDOW_MODE_OPTION_COMMON_FIXED_SIZE;
    public static int WINDOW_MODE_OPTION_COMMON_HIDDEN;
    public static int WINDOW_MODE_OPTION_COMMON_INHERIT;
    public static int WINDOW_MODE_OPTION_COMMON_MINIMIZED;
    public static int WINDOW_MODE_OPTION_COMMON_NO_CONTROLBAR;
    public static int WINDOW_MODE_OPTION_COMMON_NO_DECORATION;
    public static int WINDOW_MODE_OPTION_COMMON_PINUP;
    public static int WINDOW_MODE_OPTION_COMMON_RESIZE;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_A;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_B;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_C;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_D;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_E;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_F;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_FULL;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_MASK;
    public static int WINDOW_MODE_OPTION_SPLIT_ZONE_UNKNOWN;

    static
    {
      String[] arrayOfString = new String[23];
      arrayOfString[0] = "WINDOW_MODE_MASK";
      arrayOfString[1] = "WINDOW_MODE_NORMAL";
      arrayOfString[2] = "WINDOW_MODE_FREESTYLE";
      arrayOfString[3] = "WINDOW_MODE_OPTION_COMMON_PINUP";
      arrayOfString[4] = "WINDOW_MODE_OPTION_COMMON_INHERIT";
      arrayOfString[5] = "WINDOW_MODE_OPTION_COMMON_RESIZE";
      arrayOfString[6] = "WINDOW_MODE_OPTION_COMMON_MINIMIZED";
      arrayOfString[7] = "WINDOW_MODE_OPTION_COMMON_HIDDEN";
      arrayOfString[8] = "WINDOW_MODE_OPTION_COMMON_FIXED_SIZE";
      arrayOfString[9] = "WINDOW_MODE_OPTION_COMMON_FIXED_RATIO";
      arrayOfString[10] = "WINDOW_INFO_NOTHING_CHANGED";
      arrayOfString[11] = "WINDOW_INFO_SIZE_CHANGED";
      arrayOfString[12] = "WINDOW_MODE_OPTION_COMMON_NO_DECORATION";
      arrayOfString[13] = "WINDOW_MODE_OPTION_SPLIT_ZONE_MASK";
      arrayOfString[14] = "WINDOW_MODE_OPTION_SPLIT_ZONE_F";
      arrayOfString[15] = "WINDOW_MODE_OPTION_SPLIT_ZONE_E";
      arrayOfString[16] = "WINDOW_MODE_OPTION_SPLIT_ZONE_D";
      arrayOfString[17] = "WINDOW_MODE_OPTION_SPLIT_ZONE_C";
      arrayOfString[18] = "WINDOW_MODE_OPTION_SPLIT_ZONE_UNKNOWN";
      arrayOfString[19] = "WINDOW_MODE_OPTION_SPLIT_ZONE_B";
      arrayOfString[20] = "WINDOW_MODE_OPTION_SPLIT_ZONE_A";
      arrayOfString[21] = "WINDOW_MODE_OPTION_SPLIT_ZONE_FULL";
      arrayOfString[22] = "WINDOW_MODE_OPTION_COMMON_NO_CONTROLBAR";
      FIELD_NAMES = arrayOfString;
      int i = FIELD_NAMES.length;
      int j = 0;
      while (true)
      {
        if (j < i);
        try
        {
          Field localField1 = WindowManagerPolicy.class.getDeclaredField(FIELD_NAMES[j]);
          Field localField2 = WindowManagerPolicy.class.getField(FIELD_NAMES[j]);
          localField2.setInt(localField2, localField1.getInt(localField1));
          label192: j++;
          continue;
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          break label192;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          break label192;
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          break label192;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.sec.multiwindow.Constants
 * JD-Core Version:    0.6.0
 */