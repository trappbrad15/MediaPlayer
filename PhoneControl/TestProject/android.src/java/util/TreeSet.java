/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class TreeSet<E> extends AbstractSet<E>
/*    */   implements NavigableSet<E>, Cloneable, Serializable
/*    */ {
/*    */   public TreeSet()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public TreeSet(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/*  8 */   public TreeSet(Comparator<? super E> comparator) { throw new RuntimeException("Stub!"); } 
/*  9 */   public TreeSet(SortedSet<E> set) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean add(E object) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean addAll(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void clear() { throw new RuntimeException("Stub!"); } 
/*    */   public Object clone() {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public Comparator<? super E> comparator() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean contains(Object object) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 18 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); } 
/* 19 */   public Iterator<E> descendingIterator() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean remove(Object object) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 22 */   public E first() { throw new RuntimeException("Stub!"); } 
/* 23 */   public E last() { throw new RuntimeException("Stub!"); } 
/* 24 */   public E pollFirst() { throw new RuntimeException("Stub!"); } 
/* 25 */   public E pollLast() { throw new RuntimeException("Stub!"); } 
/* 26 */   public E higher(E e) { throw new RuntimeException("Stub!"); } 
/* 27 */   public E lower(E e) { throw new RuntimeException("Stub!"); } 
/* 28 */   public E ceiling(E e) { throw new RuntimeException("Stub!"); } 
/* 29 */   public E floor(E e) { throw new RuntimeException("Stub!"); } 
/* 30 */   public NavigableSet<E> descendingSet() { throw new RuntimeException("Stub!"); } 
/*    */   public NavigableSet<E> subSet(E start, boolean startInclusive, E end, boolean endInclusive) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/* 34 */   public NavigableSet<E> headSet(E end, boolean endInclusive) { throw new RuntimeException("Stub!"); } 
/*    */   public NavigableSet<E> tailSet(E start, boolean startInclusive) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/* 38 */   public SortedSet<E> subSet(E start, E end) { throw new RuntimeException("Stub!"); } 
/*    */   public SortedSet<E> headSet(E end) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/* 42 */   public SortedSet<E> tailSet(E start) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.TreeSet
 * JD-Core Version:    0.6.2
 */