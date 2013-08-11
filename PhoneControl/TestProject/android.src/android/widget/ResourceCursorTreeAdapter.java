/*   */ package android.widget;
/*   */ 
/*   */ import android.content.Context;
/*   */ import android.database.Cursor;
/*   */ import android.view.View;
/*   */ import android.view.ViewGroup;
/*   */ 
/*   */ public abstract class ResourceCursorTreeAdapter extends CursorTreeAdapter
/*   */ {
/*   */   public ResourceCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, int childLayout, int lastChildLayout)
/*   */   {
/* 5 */     super((Cursor)null, (Context)null, false); throw new RuntimeException("Stub!"); } 
/* 6 */   public ResourceCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, int childLayout) { super((Cursor)null, (Context)null, false); throw new RuntimeException("Stub!"); } 
/* 7 */   public ResourceCursorTreeAdapter(Context context, Cursor cursor, int groupLayout, int childLayout) { super((Cursor)null, (Context)null, false); throw new RuntimeException("Stub!"); } 
/* 8 */   public View newChildView(Context context, Cursor cursor, boolean isLastChild, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 9 */   public View newGroupView(Context context, Cursor cursor, boolean isExpanded, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.ResourceCursorTreeAdapter
 * JD-Core Version:    0.6.2
 */