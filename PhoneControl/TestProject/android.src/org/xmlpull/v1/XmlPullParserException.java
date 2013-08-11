/*    */ package org.xmlpull.v1;
/*    */ 
/*    */ public class XmlPullParserException extends Exception
/*    */ {
/*    */   protected Throwable detail;
/*    */   protected int row;
/*    */   protected int column;
/*    */ 
/*    */   public XmlPullParserException(String s)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public XmlPullParserException(String msg, XmlPullParser parser, Throwable chain) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Throwable getDetail() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getLineNumber() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getColumnNumber() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void printStackTrace() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xmlpull.v1.XmlPullParserException
 * JD-Core Version:    0.6.2
 */