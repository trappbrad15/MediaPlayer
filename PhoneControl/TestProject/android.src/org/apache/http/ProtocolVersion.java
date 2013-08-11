/*    */ package org.apache.http;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class ProtocolVersion
/*    */   implements Serializable, Cloneable
/*    */ {
/*    */   protected final String protocol;
/*    */   protected final int major;
/*    */   protected final int minor;
/*    */ 
/*    */   public ProtocolVersion(String protocol, int major, int minor)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final String getProtocol() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final int getMajor() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final int getMinor() { throw new RuntimeException("Stub!"); } 
/*  9 */   public ProtocolVersion forVersion(int major, int minor) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isComparable(ProtocolVersion that) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int compareToVersion(ProtocolVersion that) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final boolean greaterEquals(ProtocolVersion version) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final boolean lessEquals(ProtocolVersion version) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.ProtocolVersion
 * JD-Core Version:    0.6.2
 */