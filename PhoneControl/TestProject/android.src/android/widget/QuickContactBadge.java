/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ public class QuickContactBadge extends ImageView
/*    */   implements View.OnClickListener
/*    */ {
/* 23 */   protected String[] mExcludeMimes = null;
/*    */ 
/*    */   public QuickContactBadge(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public QuickContactBadge(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public QuickContactBadge(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/*    */   public void setMode(int size) {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setImageToDefault() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void assignContactUri(Uri contactUri) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void assignContactFromEmail(String emailAddress, boolean lazyLookup) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void assignContactFromEmail(String emailAddress, boolean lazyLookup, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void assignContactFromPhone(String phoneNumber, boolean lazyLookup) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void assignContactFromPhone(String phoneNumber, boolean lazyLookup, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onClick(View v) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setExcludeMimes(String[] excludeMimes) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.QuickContactBadge
 * JD-Core Version:    0.6.2
 */