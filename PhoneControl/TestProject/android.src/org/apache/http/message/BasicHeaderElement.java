/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.HeaderElement;
/*    */ import org.apache.http.NameValuePair;
/*    */ 
/*    */ public class BasicHeaderElement
/*    */   implements HeaderElement, Cloneable
/*    */ {
/*    */   public BasicHeaderElement(String name, String value, NameValuePair[] parameters)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public BasicHeaderElement(String name, String value) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getValue() { throw new RuntimeException("Stub!"); } 
/*  9 */   public NameValuePair[] getParameters() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getParameterCount() { throw new RuntimeException("Stub!"); } 
/* 11 */   public NameValuePair getParameter(int index) { throw new RuntimeException("Stub!"); } 
/* 12 */   public NameValuePair getParameterByName(String name) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 16 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.message.BasicHeaderElement
 * JD-Core Version:    0.6.2
 */