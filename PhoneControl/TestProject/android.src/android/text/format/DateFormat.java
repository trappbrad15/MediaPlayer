/*    */ package android.text.format;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class DateFormat
/*    */ {
/*    */ 
/*    */   @Deprecated
/*    */   public static final char QUOTE = '\'';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char AM_PM = 'a';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char CAPITAL_AM_PM = 'A';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char DATE = 'd';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char DAY = 'E';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char HOUR = 'h';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char HOUR_OF_DAY = 'k';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char MINUTE = 'm';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char MONTH = 'M';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char STANDALONE_MONTH = 'L';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char SECONDS = 's';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char TIME_ZONE = 'z';
/*    */ 
/*    */   @Deprecated
/*    */   public static final char YEAR = 'y';
/*    */ 
/*    */   public DateFormat()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static boolean is24HourFormat(Context context) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static String getBestDateTimePattern(Locale locale, String skeleton) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static java.text.DateFormat getTimeFormat(Context context) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static java.text.DateFormat getDateFormat(Context context) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static java.text.DateFormat getLongDateFormat(Context context) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static java.text.DateFormat getMediumDateFormat(Context context) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static char[] getDateFormatOrder(Context context) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static CharSequence format(CharSequence inFormat, long inTimeInMillis) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static CharSequence format(CharSequence inFormat, Date inDate) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static CharSequence format(CharSequence inFormat, Calendar inDate) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.format.DateFormat
 * JD-Core Version:    0.6.2
 */