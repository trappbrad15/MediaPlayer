/*    */ package android.animation;
/*    */ 
/*    */ import android.util.Property;
/*    */ 
/*    */ public class PropertyValuesHolder
/*    */   implements Cloneable
/*    */ {
/*    */   PropertyValuesHolder()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static PropertyValuesHolder ofInt(String propertyName, int[] values) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static PropertyValuesHolder ofInt(Property<?, Integer> property, int[] values) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static PropertyValuesHolder ofFloat(String propertyName, float[] values) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static PropertyValuesHolder ofFloat(Property<?, Float> property, float[] values) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static PropertyValuesHolder ofObject(String propertyName, TypeEvaluator evaluator, Object[] values) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static <V> PropertyValuesHolder ofObject(Property property, TypeEvaluator<V> evaluator, V[] values) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static PropertyValuesHolder ofKeyframe(String propertyName, Keyframe[] values) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static PropertyValuesHolder ofKeyframe(Property property, Keyframe[] values) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setIntValues(int[] values) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setFloatValues(float[] values) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setKeyframes(Keyframe[] values) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setObjectValues(Object[] values) { throw new RuntimeException("Stub!"); } 
/* 18 */   public PropertyValuesHolder clone() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setEvaluator(TypeEvaluator evaluator) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setPropertyName(String propertyName) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setProperty(Property property) { throw new RuntimeException("Stub!"); } 
/* 22 */   public String getPropertyName() { throw new RuntimeException("Stub!"); } 
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.animation.PropertyValuesHolder
 * JD-Core Version:    0.6.2
 */