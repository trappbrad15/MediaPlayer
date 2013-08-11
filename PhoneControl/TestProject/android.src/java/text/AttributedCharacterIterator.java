/*    */ package java.text;
/*    */ 
/*    */ import java.io.InvalidObjectException;
/*    */ import java.io.Serializable;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ public abstract interface AttributedCharacterIterator extends CharacterIterator
/*    */ {
/*    */   public abstract Set<Attribute> getAllAttributeKeys();
/*    */ 
/*    */   public abstract Object getAttribute(Attribute paramAttribute);
/*    */ 
/*    */   public abstract Map<Attribute, Object> getAttributes();
/*    */ 
/*    */   public abstract int getRunLimit();
/*    */ 
/*    */   public abstract int getRunLimit(Attribute paramAttribute);
/*    */ 
/*    */   public abstract int getRunLimit(Set<? extends Attribute> paramSet);
/*    */ 
/*    */   public abstract int getRunStart();
/*    */ 
/*    */   public abstract int getRunStart(Attribute paramAttribute);
/*    */ 
/*    */   public abstract int getRunStart(Set<? extends Attribute> paramSet);
/*    */ 
/*    */   public static class Attribute
/*    */     implements Serializable
/*    */   {
/* 17 */     public static final Attribute INPUT_METHOD_SEGMENT = null; public static final Attribute LANGUAGE = null; public static final Attribute READING = null;
/*    */ 
/*    */     protected Attribute(String name)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public final boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 10 */     protected String getName() { throw new RuntimeException("Stub!"); } 
/* 11 */     public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 12 */     protected Object readResolve() throws InvalidObjectException { throw new RuntimeException("Stub!"); } 
/* 13 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.text.AttributedCharacterIterator
 * JD-Core Version:    0.6.2
 */