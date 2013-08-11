/*    */ package android.animation;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ public final class AnimatorSet extends Animator
/*    */ {
/*    */   public AnimatorSet()
/*    */   {
/* 13 */     throw new RuntimeException("Stub!"); } 
/* 14 */   public void playTogether(Animator[] items) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void playTogether(Collection<Animator> items) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void playSequentially(Animator[] items) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void playSequentially(List<Animator> items) { throw new RuntimeException("Stub!"); } 
/* 18 */   public ArrayList<Animator> getChildAnimations() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setTarget(Object target) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setInterpolator(TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); } 
/* 21 */   public TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Builder play(Animator anim) { throw new RuntimeException("Stub!"); } 
/*    */   public void cancel() {
/* 24 */     throw new RuntimeException("Stub!"); } 
/* 25 */   public void end() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean isRunning() { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isStarted() { throw new RuntimeException("Stub!"); } 
/* 28 */   public long getStartDelay() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); } 
/* 30 */   public long getDuration() { throw new RuntimeException("Stub!"); } 
/* 31 */   public AnimatorSet setDuration(long duration) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setupStartValues() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setupEndValues() { throw new RuntimeException("Stub!"); } 
/*    */   public void start() {
/* 35 */     throw new RuntimeException("Stub!"); } 
/* 36 */   public AnimatorSet clone() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public class Builder
/*    */   {
/*    */     Builder()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder with(Animator anim) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder before(Animator anim) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder after(Animator anim) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder after(long delay) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.animation.AnimatorSet
 * JD-Core Version:    0.6.2
 */