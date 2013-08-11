/*    */ package android.animation;
/*    */ 
/*    */ import android.util.Property;
/*    */ 
/*    */ public final class ObjectAnimator extends ValueAnimator
/*    */ {
/*    */   public ObjectAnimator()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setPropertyName(String propertyName) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setProperty(Property property) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getPropertyName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public static ObjectAnimator ofInt(Object target, String propertyName, int[] values) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static <T> ObjectAnimator ofInt(T target, Property<T, Integer> property, int[] values) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static ObjectAnimator ofFloat(Object target, String propertyName, float[] values) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static <T> ObjectAnimator ofFloat(T target, Property<T, Float> property, float[] values) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static ObjectAnimator ofObject(Object target, String propertyName, TypeEvaluator evaluator, Object[] values) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static <T, V> ObjectAnimator ofObject(T target, Property<T, V> property, TypeEvaluator<V> evaluator, V[] values) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static ObjectAnimator ofPropertyValuesHolder(Object target, PropertyValuesHolder[] values) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setIntValues(int[] values) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setFloatValues(float[] values) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setObjectValues(Object[] values) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setAutoCancel(boolean cancel) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 21 */   public ObjectAnimator setDuration(long duration) { throw new RuntimeException("Stub!"); } 
/* 22 */   public Object getTarget() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setTarget(Object target) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setupStartValues() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setupEndValues() { throw new RuntimeException("Stub!"); } 
/* 26 */   public ObjectAnimator clone() { throw new RuntimeException("Stub!"); } 
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.animation.ObjectAnimator
 * JD-Core Version:    0.6.2
 */