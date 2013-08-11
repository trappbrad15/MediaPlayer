/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.View;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class ExpandableListView extends ListView
/*    */ {
/*    */   public static final int PACKED_POSITION_TYPE_GROUP = 0;
/*    */   public static final int PACKED_POSITION_TYPE_CHILD = 1;
/*    */   public static final int PACKED_POSITION_TYPE_NULL = 2;
/*    */   public static final long PACKED_POSITION_VALUE_NULL = 4294967295L;
/*    */   public static final int CHILD_INDICATOR_INHERIT = -1;
/*    */ 
/*    */   public ExpandableListView(Context context)
/*    */   {
/* 29 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 30 */   public ExpandableListView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 31 */   public ExpandableListView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 32 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); } 
/* 33 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setChildDivider(Drawable childDivider) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 36 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setAdapter(ExpandableListAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 39 */   public ExpandableListAdapter getExpandableListAdapter() { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean performItemClick(View v, int position, long id) { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean expandGroup(int groupPos) { throw new RuntimeException("Stub!"); } 
/* 42 */   public boolean expandGroup(int groupPos, boolean animate) { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean collapseGroup(int groupPos) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void setOnGroupCollapseListener(OnGroupCollapseListener onGroupCollapseListener) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setOnGroupExpandListener(OnGroupExpandListener onGroupExpandListener) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setOnGroupClickListener(OnGroupClickListener onGroupClickListener) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void setOnChildClickListener(OnChildClickListener onChildClickListener) { throw new RuntimeException("Stub!"); } 
/* 48 */   public long getExpandableListPosition(int flatListPosition) { throw new RuntimeException("Stub!"); } 
/* 49 */   public int getFlatListPosition(long packedPosition) { throw new RuntimeException("Stub!"); } 
/* 50 */   public long getSelectedPosition() { throw new RuntimeException("Stub!"); } 
/* 51 */   public long getSelectedId() { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setSelectedGroup(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 53 */   public boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup) { throw new RuntimeException("Stub!"); } 
/* 54 */   public boolean isGroupExpanded(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 55 */   public static int getPackedPositionType(long packedPosition) { throw new RuntimeException("Stub!"); } 
/* 56 */   public static int getPackedPositionGroup(long packedPosition) { throw new RuntimeException("Stub!"); } 
/* 57 */   public static int getPackedPositionChild(long packedPosition) { throw new RuntimeException("Stub!"); } 
/* 58 */   public static long getPackedPositionForChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); } 
/* 59 */   public static long getPackedPositionForGroup(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 60 */   public void setChildIndicator(Drawable childIndicator) { throw new RuntimeException("Stub!"); } 
/* 61 */   public void setChildIndicatorBounds(int left, int right) { throw new RuntimeException("Stub!"); } 
/* 62 */   public void setChildIndicatorBoundsRelative(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void setGroupIndicator(Drawable groupIndicator) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void setIndicatorBounds(int left, int right) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void setIndicatorBoundsRelative(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 66 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 67 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 68 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 69 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class ExpandableListContextMenuInfo
/*    */     implements ContextMenu.ContextMenuInfo
/*    */   {
/*    */     public View targetView;
/*    */     public long packedPosition;
/*    */     public long id;
/*    */ 
/*    */     public ExpandableListContextMenuInfo(View targetView, long packedPosition, long id)
/*    */     {
/* 24 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface OnChildClickListener
/*    */   {
/*    */     public abstract boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGroupClickListener
/*    */   {
/*    */     public abstract boolean onGroupClick(ExpandableListView paramExpandableListView, View paramView, int paramInt, long paramLong);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGroupExpandListener
/*    */   {
/*    */     public abstract void onGroupExpand(int paramInt);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGroupCollapseListener
/*    */   {
/*    */     public abstract void onGroupCollapse(int paramInt);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.ExpandableListView
 * JD-Core Version:    0.6.2
 */