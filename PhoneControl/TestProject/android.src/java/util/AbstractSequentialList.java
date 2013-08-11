/*    */ package java.util;
/*    */ 
/*    */ public abstract class AbstractSequentialList<E> extends AbstractList<E>
/*    */ {
/*    */   protected AbstractSequentialList()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void add(int location, E object) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean addAll(int location, Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/*  8 */   public E get(int location) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract ListIterator<E> listIterator(int paramInt);
/*    */ 
/* 11 */   public E remove(int location) { throw new RuntimeException("Stub!"); } 
/* 12 */   public E set(int location, E object) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.AbstractSequentialList
 * JD-Core Version:    0.6.2
 */