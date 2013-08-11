/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ public abstract class ResourceCursorAdapter extends CursorAdapter
/*    */ {
/*    */   @Deprecated
/*    */   public ResourceCursorAdapter(Context context, int layout, Cursor c)
/*    */   {
/*  6 */     super((Context)null, (Cursor)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public ResourceCursorAdapter(Context context, int layout, Cursor c, boolean autoRequery) { super((Context)null, (Cursor)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public ResourceCursorAdapter(Context context, int layout, Cursor c, int flags) { super((Context)null, (Cursor)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   public View newView(Context context, Cursor cursor, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 10 */   public View newDropDownView(Context context, Cursor cursor, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setViewResource(int layout) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setDropDownViewResource(int dropDownLayout) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.ResourceCursorAdapter
 * JD-Core Version:    0.6.2
 */