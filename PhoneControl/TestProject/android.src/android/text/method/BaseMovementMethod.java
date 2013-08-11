/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.widget.TextView;
/*    */ 
/*    */ public class BaseMovementMethod
/*    */   implements MovementMethod
/*    */ {
/*    */   public BaseMovementMethod()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean canSelectArbitrarily() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void initialize(TextView widget, Spannable text) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean onKeyDown(TextView widget, Spannable text, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean onKeyOther(TextView widget, Spannable text, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean onKeyUp(TextView widget, Spannable text, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onTakeFocus(TextView widget, Spannable text, int direction) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean onTouchEvent(TextView widget, Spannable text, MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean onTrackballEvent(TextView widget, Spannable text, MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean onGenericMotionEvent(TextView widget, Spannable text, MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected int getMovementMetaState(Spannable buffer, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected boolean left(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected boolean right(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected boolean up(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected boolean down(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected boolean pageUp(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected boolean pageDown(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected boolean top(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected boolean bottom(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected boolean lineStart(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 26 */   protected boolean lineEnd(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected boolean home(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected boolean end(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.method.BaseMovementMethod
 * JD-Core Version:    0.6.2
 */