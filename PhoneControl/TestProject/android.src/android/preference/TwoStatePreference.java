/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public abstract class TwoStatePreference extends Preference
/*    */ {
/*    */   public TwoStatePreference(Context context, AttributeSet attrs, int defStyle)
/*    */   {
/*  5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public TwoStatePreference(Context context, AttributeSet attrs) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public TwoStatePreference(Context context) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  8 */   protected void onClick() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isChecked() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean shouldDisableDependents() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setSummaryOn(CharSequence summary) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setSummaryOn(int summaryResId) { throw new RuntimeException("Stub!"); } 
/* 14 */   public CharSequence getSummaryOn() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setSummaryOff(CharSequence summary) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setSummaryOff(int summaryResId) { throw new RuntimeException("Stub!"); } 
/* 17 */   public CharSequence getSummaryOff() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean getDisableDependentsState() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setDisableDependentsState(boolean disableDependentsState) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onSetInitialValue(boolean restoreValue, Object defaultValue) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.preference.TwoStatePreference
 * JD-Core Version:    0.6.2
 */