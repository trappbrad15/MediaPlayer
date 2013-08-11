/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.AndroidRuntimeException;
/*    */ 
/*    */ public class KeyCharacterMap
/*    */   implements Parcelable
/*    */ {
/*    */ 
/*    */   @Deprecated
/*    */   public static final int BUILT_IN_KEYBOARD = 0;
/*    */   public static final int VIRTUAL_KEYBOARD = -1;
/*    */   public static final int NUMERIC = 1;
/*    */   public static final int PREDICTIVE = 2;
/*    */   public static final int ALPHA = 3;
/*    */   public static final int FULL = 4;
/*    */   public static final int SPECIAL_FUNCTION = 5;
/*    */   public static final char HEX_INPUT = '';
/*    */   public static final char PICKER_DIALOG_INPUT = '';
/*    */   public static final int MODIFIER_BEHAVIOR_CHORDED = 0;
/*    */   public static final int MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED = 1;
/*    */   public static final int COMBINING_ACCENT = -2147483648;
/*    */   public static final int COMBINING_ACCENT_MASK = 2147483647;
/* 53 */   public static final Parcelable.Creator<KeyCharacterMap> CREATOR = null;
/*    */ 
/*    */   KeyCharacterMap()
/*    */   {
/* 19 */     throw new RuntimeException("Stub!"); } 
/* 20 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 21 */   public static KeyCharacterMap load(int deviceId) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int get(int keyCode, int metaState) { throw new RuntimeException("Stub!"); } 
/* 23 */   public char getNumber(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 24 */   public char getMatch(int keyCode, char[] chars) { throw new RuntimeException("Stub!"); } 
/* 25 */   public char getMatch(int keyCode, char[] chars, int metaState) { throw new RuntimeException("Stub!"); } 
/* 26 */   public char getDisplayLabel(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static int getDeadChar(int accent, int c) { throw new RuntimeException("Stub!"); } 
/* 29 */   @Deprecated
/*    */   public boolean getKeyData(int keyCode, KeyData results) { throw new RuntimeException("Stub!"); } 
/* 30 */   public KeyEvent[] getEvents(char[] chars) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean isPrintingKey(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 32 */   public int getKeyboardType() { throw new RuntimeException("Stub!"); } 
/* 33 */   public int getModifierBehavior() { throw new RuntimeException("Stub!"); } 
/* 34 */   public static boolean deviceHasKey(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static boolean[] deviceHasKeys(int[] keyCodes) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 37 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class UnavailableException extends AndroidRuntimeException
/*    */   {
/*    */     public UnavailableException(String msg)
/*    */     {
/* 17 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   @Deprecated
/*    */   public static class KeyData
/*    */   {
/*    */     public static final int META_LENGTH = 4;
/*    */     public char displayLabel;
/*    */     public char number;
/* 12 */     public char[] meta = null;
/*    */ 
/*    */     public KeyData()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.KeyCharacterMap
 * JD-Core Version:    0.6.2
 */