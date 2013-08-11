/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class Date
/*    */   implements Serializable, Cloneable, Comparable<Date>
/*    */ {
/*    */   public Date()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  7 */   @Deprecated
/*    */   public Date(int year, int month, int day) { throw new RuntimeException("Stub!"); } 
/*  9 */   @Deprecated
/*    */   public Date(int year, int month, int day, int hour, int minute) { throw new RuntimeException("Stub!"); } 
/* 11 */   @Deprecated
/*    */   public Date(int year, int month, int day, int hour, int minute, int second) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Date(long milliseconds) { throw new RuntimeException("Stub!"); } 
/* 14 */   @Deprecated
/*    */   public Date(String string) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean after(Date date) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean before(Date date) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 18 */   public int compareTo(Date date) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 21 */   @Deprecated
/*    */   public int getDate() { throw new RuntimeException("Stub!"); } 
/* 23 */   @Deprecated
/*    */   public int getDay() { throw new RuntimeException("Stub!"); } 
/* 25 */   @Deprecated
/*    */   public int getHours() { throw new RuntimeException("Stub!"); } 
/* 27 */   @Deprecated
/*    */   public int getMinutes() { throw new RuntimeException("Stub!"); } 
/* 29 */   @Deprecated
/*    */   public int getMonth() { throw new RuntimeException("Stub!"); } 
/* 31 */   @Deprecated
/*    */   public int getSeconds() { throw new RuntimeException("Stub!"); } 
/* 32 */   public long getTime() { throw new RuntimeException("Stub!"); } 
/* 34 */   @Deprecated
/*    */   public int getTimezoneOffset() { throw new RuntimeException("Stub!"); } 
/* 36 */   @Deprecated
/*    */   public int getYear() { throw new RuntimeException("Stub!"); } 
/* 37 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 39 */   @Deprecated
/*    */   public static long parse(String string) { throw new RuntimeException("Stub!"); } 
/* 41 */   @Deprecated
/*    */   public void setDate(int day) { throw new RuntimeException("Stub!"); } 
/* 43 */   @Deprecated
/*    */   public void setHours(int hour) { throw new RuntimeException("Stub!"); } 
/* 45 */   @Deprecated
/*    */   public void setMinutes(int minute) { throw new RuntimeException("Stub!"); } 
/* 47 */   @Deprecated
/*    */   public void setMonth(int month) { throw new RuntimeException("Stub!"); } 
/* 49 */   @Deprecated
/*    */   public void setSeconds(int second) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void setTime(long milliseconds) { throw new RuntimeException("Stub!"); } 
/* 52 */   @Deprecated
/*    */   public void setYear(int year) { throw new RuntimeException("Stub!"); } 
/* 54 */   @Deprecated
/*    */   public String toGMTString() { throw new RuntimeException("Stub!"); } 
/* 56 */   @Deprecated
/*    */   public String toLocaleString() { throw new RuntimeException("Stub!"); } 
/* 57 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 59 */   @Deprecated
/*    */   public static long UTC(int year, int month, int day, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.Date
 * JD-Core Version:    0.6.2
 */