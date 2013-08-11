/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.FormattedHeader;
/*    */ import org.apache.http.HeaderElement;
/*    */ import org.apache.http.ParseException;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class BufferedHeader
/*    */   implements FormattedHeader, Cloneable
/*    */ {
/*    */   public BufferedHeader(CharArrayBuffer buffer)
/*    */     throws ParseException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getValue() { throw new RuntimeException("Stub!"); } 
/*  8 */   public HeaderElement[] getElements() throws ParseException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getValuePos() { throw new RuntimeException("Stub!"); } 
/* 10 */   public CharArrayBuffer getBuffer() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.message.BufferedHeader
 * JD-Core Version:    0.6.2
 */