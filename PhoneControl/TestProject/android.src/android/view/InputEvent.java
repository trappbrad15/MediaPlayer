/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public abstract class InputEvent
/*    */   implements Parcelable
/*    */ {
/* 13 */   public static final Parcelable.Creator<InputEvent> CREATOR = null;
/*    */ 
/*    */   InputEvent()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getDeviceId();
/*    */ 
/*  7 */   public final InputDevice getDevice() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getSource();
/*    */ 
/*  9 */   public boolean isFromSource(int source) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract long getEventTime();
/*    */ 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.InputEvent
 * JD-Core Version:    0.6.2
 */