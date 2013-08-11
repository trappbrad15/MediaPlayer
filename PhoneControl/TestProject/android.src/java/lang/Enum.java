/*    */ package java.lang;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class Enum<E extends Enum<E>>
/*    */   implements Serializable, Comparable<E>
/*    */ {
/*    */   protected Enum(String name, int ordinal)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final String name() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final int ordinal() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected final Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final int compareTo(E o) { throw new RuntimeException("Stub!"); } 
/*    */   public final Class<E> getDeclaringClass() {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) { throw new RuntimeException("Stub!"); } 
/*    */   protected final void finalize() {
/* 17 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.Enum
 * JD-Core Version:    0.6.2
 */