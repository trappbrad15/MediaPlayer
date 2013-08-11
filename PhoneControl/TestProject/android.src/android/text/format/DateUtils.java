/*    */ package android.text.format;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.Formatter;
/*    */ 
/*    */ public class DateUtils
/*    */ {
/*    */   public static final long SECOND_IN_MILLIS = 1000L;
/*    */   public static final long MINUTE_IN_MILLIS = 60000L;
/*    */   public static final long HOUR_IN_MILLIS = 3600000L;
/*    */   public static final long DAY_IN_MILLIS = 86400000L;
/*    */   public static final long WEEK_IN_MILLIS = 604800000L;
/*    */   public static final long YEAR_IN_MILLIS = 31449600000L;
/*    */   public static final int FORMAT_SHOW_TIME = 1;
/*    */   public static final int FORMAT_SHOW_WEEKDAY = 2;
/*    */   public static final int FORMAT_SHOW_YEAR = 4;
/*    */   public static final int FORMAT_NO_YEAR = 8;
/*    */   public static final int FORMAT_SHOW_DATE = 16;
/*    */   public static final int FORMAT_NO_MONTH_DAY = 32;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_12HOUR = 64;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_24HOUR = 128;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_CAP_AMPM = 256;
/*    */   public static final int FORMAT_NO_NOON = 512;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_CAP_NOON = 1024;
/*    */   public static final int FORMAT_NO_MIDNIGHT = 2048;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_CAP_MIDNIGHT = 4096;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_UTC = 8192;
/*    */   public static final int FORMAT_ABBREV_TIME = 16384;
/*    */   public static final int FORMAT_ABBREV_WEEKDAY = 32768;
/*    */   public static final int FORMAT_ABBREV_MONTH = 65536;
/*    */   public static final int FORMAT_NUMERIC_DATE = 131072;
/*    */   public static final int FORMAT_ABBREV_RELATIVE = 262144;
/*    */   public static final int FORMAT_ABBREV_ALL = 524288;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_CAP_NOON_MIDNIGHT = 5120;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FORMAT_NO_NOON_MIDNIGHT = 2560;
/*    */ 
/*    */   @Deprecated
/*    */   public static final String HOUR_MINUTE_24 = "%H:%M";
/*    */   public static final String MONTH_FORMAT = "%B";
/*    */ 
/*    */   @Deprecated
/*    */   public static final String ABBREV_MONTH_FORMAT = "%b";
/*    */   public static final String NUMERIC_MONTH_FORMAT = "%m";
/*    */   public static final String MONTH_DAY_FORMAT = "%-d";
/*    */   public static final String YEAR_FORMAT = "%Y";
/*    */   public static final String YEAR_FORMAT_TWO_DIGITS = "%g";
/*    */   public static final String WEEKDAY_FORMAT = "%A";
/*    */   public static final String ABBREV_WEEKDAY_FORMAT = "%a";
/*    */ 
/*    */   @Deprecated
/* 73 */   public static final int[] sameYearTable = null;
/*    */ 
/*    */   @Deprecated
/* 75 */   public static final int[] sameMonthTable = null;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int LENGTH_LONG = 10;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int LENGTH_MEDIUM = 20;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int LENGTH_SHORT = 30;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int LENGTH_SHORTER = 40;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int LENGTH_SHORTEST = 50;
/*    */ 
/*    */   public DateUtils()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  6 */   @Deprecated
/*    */   public static String getDayOfWeekString(int dayOfWeek, int abbrev) { throw new RuntimeException("Stub!"); } 
/*  8 */   @Deprecated
/*    */   public static String getAMPMString(int ampm) { throw new RuntimeException("Stub!"); } 
/* 10 */   @Deprecated
/*    */   public static String getMonthString(int month, int abbrev) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static CharSequence getRelativeTimeSpanString(long startTime) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static CharSequence getRelativeTimeSpanString(long time, long now, long minResolution) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static CharSequence getRelativeTimeSpanString(long time, long now, long minResolution, int flags) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static CharSequence getRelativeDateTimeString(Context c, long time, long minResolution, long transitionResolution, int flags) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static String formatElapsedTime(long elapsedSeconds) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static String formatElapsedTime(StringBuilder recycle, long elapsedSeconds) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static final CharSequence formatSameDayTime(long then, long now, int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static boolean isToday(long when) { throw new RuntimeException("Stub!"); } 
/* 19 */   public static String formatDateRange(Context context, long startMillis, long endMillis, int flags) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static Formatter formatDateRange(Context context, Formatter formatter, long startMillis, long endMillis, int flags) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static Formatter formatDateRange(Context context, Formatter formatter, long startMillis, long endMillis, int flags, String timeZone) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static String formatDateTime(Context context, long millis, int flags) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static CharSequence getRelativeTimeSpanString(Context c, long millis, boolean withPreposition) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static CharSequence getRelativeTimeSpanString(Context c, long millis) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.format.DateUtils
 * JD-Core Version:    0.6.2
 */