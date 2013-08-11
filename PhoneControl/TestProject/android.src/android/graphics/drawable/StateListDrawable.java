/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class StateListDrawable extends DrawableContainer
/*    */ {
/*    */   public StateListDrawable()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void addState(int[] stateSet, Drawable drawable) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isStateful() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.drawable.StateListDrawable
 * JD-Core Version:    0.6.2
 */