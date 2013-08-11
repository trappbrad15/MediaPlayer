/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class ListView extends AbsListView
/*    */ {
/*    */   public ListView(Context context)
/*    */   {
/* 13 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 14 */   public ListView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 15 */   public ListView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 16 */   public int getMaxScrollAmount() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void addHeaderView(View v, Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void addHeaderView(View v) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getHeaderViewsCount() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean removeHeaderView(View v) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void addFooterView(View v, Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void addFooterView(View v) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getFooterViewsCount() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean removeFooterView(View v) { throw new RuntimeException("Stub!"); } 
/* 25 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void smoothScrollByOffset(int offset) { throw new RuntimeException("Stub!"); } 
/* 31 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 32 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 33 */   protected void layoutChildren() { throw new RuntimeException("Stub!"); } 
/* 34 */   protected boolean canAnimate() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setSelectionFromTop(int position, int y) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setSelectionAfterHeaderView() { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void setItemsCanFocus(boolean itemsCanFocus) { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean getItemsCanFocus() { throw new RuntimeException("Stub!"); } 
/* 44 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); } 
/* 46 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 47 */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); } 
/* 48 */   public Drawable getDivider() { throw new RuntimeException("Stub!"); } 
/* 49 */   public void setDivider(Drawable divider) { throw new RuntimeException("Stub!"); } 
/* 50 */   public int getDividerHeight() { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setDividerHeight(int height) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setHeaderDividersEnabled(boolean headerDividersEnabled) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setFooterDividersEnabled(boolean footerDividersEnabled) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void setOverscrollHeader(Drawable header) { throw new RuntimeException("Stub!"); } 
/* 55 */   public Drawable getOverscrollHeader() { throw new RuntimeException("Stub!"); } 
/* 56 */   public void setOverscrollFooter(Drawable footer) { throw new RuntimeException("Stub!"); } 
/* 57 */   public Drawable getOverscrollFooter() { throw new RuntimeException("Stub!"); } 
/* 58 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 59 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); } 
/* 60 */   protected View findViewTraversal(int id) { throw new RuntimeException("Stub!"); } 
/* 61 */   protected View findViewWithTagTraversal(Object tag) { throw new RuntimeException("Stub!"); } 
/* 63 */   @Deprecated
/*    */   public long[] getCheckItemIds() { throw new RuntimeException("Stub!"); } 
/* 64 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public class FixedViewInfo
/*    */   {
/*    */     public View view;
/*    */     public Object data;
/*    */     public boolean isSelectable;
/*    */ 
/*    */     public FixedViewInfo()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.ListView
 * JD-Core Version:    0.6.2
 */