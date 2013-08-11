/*     */ package android.content.res;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import java.util.Locale;
/*     */ 
/*     */ public final class Configuration
/*     */   implements Parcelable, Comparable<Configuration>
/*     */ {
/*     */   public float fontScale;
/*     */   public int mcc;
/*     */   public int mnc;
/*     */   public Locale locale;
/*     */   public static final int SCREENLAYOUT_SIZE_MASK = 15;
/*     */   public static final int SCREENLAYOUT_SIZE_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_SIZE_SMALL = 1;
/*     */   public static final int SCREENLAYOUT_SIZE_NORMAL = 2;
/*     */   public static final int SCREENLAYOUT_SIZE_LARGE = 3;
/*     */   public static final int SCREENLAYOUT_SIZE_XLARGE = 4;
/*     */   public static final int SCREENLAYOUT_LONG_MASK = 48;
/*     */   public static final int SCREENLAYOUT_LONG_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LONG_NO = 16;
/*     */   public static final int SCREENLAYOUT_LONG_YES = 32;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_MASK = 192;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_SHIFT = 6;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_LTR = 64;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_RTL = 128;
/*     */   public static final int SCREENLAYOUT_UNDEFINED = 0;
/*     */   public int screenLayout;
/*     */   public static final int TOUCHSCREEN_UNDEFINED = 0;
/*     */   public static final int TOUCHSCREEN_NOTOUCH = 1;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int TOUCHSCREEN_STYLUS = 2;
/*     */   public static final int TOUCHSCREEN_FINGER = 3;
/*     */   public int touchscreen;
/*     */   public static final int KEYBOARD_UNDEFINED = 0;
/*     */   public static final int KEYBOARD_NOKEYS = 1;
/*     */   public static final int KEYBOARD_QWERTY = 2;
/*     */   public static final int KEYBOARD_12KEY = 3;
/*     */   public int keyboard;
/*     */   public static final int KEYBOARDHIDDEN_UNDEFINED = 0;
/*     */   public static final int KEYBOARDHIDDEN_NO = 1;
/*     */   public static final int KEYBOARDHIDDEN_YES = 2;
/*     */   public int keyboardHidden;
/*     */   public static final int HARDKEYBOARDHIDDEN_UNDEFINED = 0;
/*     */   public static final int HARDKEYBOARDHIDDEN_NO = 1;
/*     */   public static final int HARDKEYBOARDHIDDEN_YES = 2;
/*     */   public int hardKeyboardHidden;
/*     */   public static final int NAVIGATION_UNDEFINED = 0;
/*     */   public static final int NAVIGATION_NONAV = 1;
/*     */   public static final int NAVIGATION_DPAD = 2;
/*     */   public static final int NAVIGATION_TRACKBALL = 3;
/*     */   public static final int NAVIGATION_WHEEL = 4;
/*     */   public int navigation;
/*     */   public static final int NAVIGATIONHIDDEN_UNDEFINED = 0;
/*     */   public static final int NAVIGATIONHIDDEN_NO = 1;
/*     */   public static final int NAVIGATIONHIDDEN_YES = 2;
/*     */   public int navigationHidden;
/*     */   public static final int ORIENTATION_UNDEFINED = 0;
/*     */   public static final int ORIENTATION_PORTRAIT = 1;
/*     */   public static final int ORIENTATION_LANDSCAPE = 2;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int ORIENTATION_SQUARE = 3;
/*     */   public int orientation;
/*     */   public static final int UI_MODE_TYPE_MASK = 15;
/*     */   public static final int UI_MODE_TYPE_UNDEFINED = 0;
/*     */   public static final int UI_MODE_TYPE_NORMAL = 1;
/*     */   public static final int UI_MODE_TYPE_DESK = 2;
/*     */   public static final int UI_MODE_TYPE_CAR = 3;
/*     */   public static final int UI_MODE_TYPE_TELEVISION = 4;
/*     */   public static final int UI_MODE_TYPE_APPLIANCE = 5;
/*     */   public static final int UI_MODE_NIGHT_MASK = 48;
/*     */   public static final int UI_MODE_NIGHT_UNDEFINED = 0;
/*     */   public static final int UI_MODE_NIGHT_NO = 16;
/*     */   public static final int UI_MODE_NIGHT_YES = 32;
/*     */   public int uiMode;
/*     */   public static final int SCREEN_WIDTH_DP_UNDEFINED = 0;
/*     */   public int screenWidthDp;
/*     */   public static final int SCREEN_HEIGHT_DP_UNDEFINED = 0;
/*     */   public int screenHeightDp;
/*     */   public static final int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED = 0;
/*     */   public int smallestScreenWidthDp;
/*     */   public static final int DENSITY_DPI_UNDEFINED = 0;
/*     */   public int densityDpi;
/* 101 */   public static final Parcelable.Creator<Configuration> CREATOR = null;
/*     */ 
/*     */   public Configuration()
/*     */   {
/*   5 */     throw new RuntimeException("Stub!"); } 
/*   6 */   public Configuration(Configuration o) { throw new RuntimeException("Stub!"); } 
/*   7 */   public boolean isLayoutSizeAtLeast(int size) { throw new RuntimeException("Stub!"); } 
/*   8 */   public void setTo(Configuration o) { throw new RuntimeException("Stub!"); } 
/*   9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  10 */   public void setToDefaults() { throw new RuntimeException("Stub!"); } 
/*  11 */   public int updateFrom(Configuration delta) { throw new RuntimeException("Stub!"); } 
/*  12 */   public int diff(Configuration delta) { throw new RuntimeException("Stub!"); } 
/*  13 */   public static boolean needNewResources(int configChanges, int interestingChanges) { throw new RuntimeException("Stub!"); } 
/*  14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  15 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  16 */   public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  17 */   public int compareTo(Configuration that) { throw new RuntimeException("Stub!"); } 
/*  18 */   public boolean equals(Configuration that) { throw new RuntimeException("Stub!"); } 
/*  19 */   public boolean equals(Object that) { throw new RuntimeException("Stub!"); } 
/*  20 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*  21 */   public void setLocale(Locale loc) { throw new RuntimeException("Stub!"); } 
/*  22 */   public int getLayoutDirection() { throw new RuntimeException("Stub!"); } 
/*  23 */   public void setLayoutDirection(Locale locale) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.res.Configuration
 * JD-Core Version:    0.6.2
 */