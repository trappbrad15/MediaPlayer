/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.SparseArray;
/*    */ import android.view.View;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ import android.widget.FrameLayout;
/*    */ import android.widget.FrameLayout.LayoutParams;
/*    */ import android.widget.RemoteViews;
/*    */ 
/*    */ public class AppWidgetHostView extends FrameLayout
/*    */ {
/*    */   public AppWidgetHostView(Context context)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!");
/*    */   }
/*  7 */   public AppWidgetHostView(Context context, int animationIn, int animationOut) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public void setAppWidget(int appWidgetId, AppWidgetProviderInfo info) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static Rect getDefaultPaddingForWidget(Context context, ComponentName component, Rect padding) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getAppWidgetId() { throw new RuntimeException("Stub!"); } 
/* 11 */   public AppWidgetProviderInfo getAppWidgetInfo() { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void updateAppWidgetSize(Bundle newOptions, int minWidth, int minHeight, int maxWidth, int maxHeight) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void updateAppWidgetOptions(Bundle options) { throw new RuntimeException("Stub!"); } 
/* 16 */   public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void updateAppWidget(RemoteViews remoteViews) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void prepareView(View view) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected View getDefaultView() { throw new RuntimeException("Stub!"); } 
/* 21 */   protected View getErrorView() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.appwidget.AppWidgetHostView
 * JD-Core Version:    0.6.2
 */