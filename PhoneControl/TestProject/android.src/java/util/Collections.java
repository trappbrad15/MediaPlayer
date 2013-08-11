/*    */ package java.util;
/*    */ 
/*    */ public class Collections
/*    */ {
/* 79 */   public static final List EMPTY_LIST = null; public static final Set EMPTY_SET = null; public static final Map EMPTY_MAP = null;
/*    */ 
/*    */   Collections()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!");
/*    */   }
/*  6 */   public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T object) { throw new RuntimeException("Stub!"); } 
/*    */   public static <T> int binarySearch(List<? extends T> list, T object, Comparator<? super T> comparator) {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public static <T> void copy(List<? super T> destination, List<? extends T> source) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static <T> Enumeration<T> enumeration(Collection<T> collection) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static <T> void fill(List<? super T> list, T object) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static <T,  extends Comparable<? super T>> T max(Collection<? extends T> collection) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static <T> T max(Collection<? extends T> collection, Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static <T,  extends Comparable<? super T>> T min(Collection<? extends T> collection) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static <T> T min(Collection<? extends T> collection, Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static <T> List<T> nCopies(int length, T object) { throw new RuntimeException("Stub!"); } 
/*    */   public static void reverse(List<?> list) {
/* 18 */     throw new RuntimeException("Stub!");
/*    */   }
/* 20 */   public static <T> Comparator<T> reverseOrder() { throw new RuntimeException("Stub!"); } 
/* 21 */   public static <T> Comparator<T> reverseOrder(Comparator<T> c) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static void shuffle(List<?> list) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static void shuffle(List<?> list, Random random) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static <E> Set<E> singleton(E object) { throw new RuntimeException("Stub!"); } 
/* 25 */   public static <E> List<E> singletonList(E object) { throw new RuntimeException("Stub!"); } 
/* 26 */   public static <K, V> Map<K, V> singletonMap(K key, V value) { throw new RuntimeException("Stub!"); } 
/*    */   public static <T extends Comparable<? super T>> void sort(List<T> list) {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/* 30 */   public static <T> void sort(List<T> list, Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/*    */   public static void swap(List<?> list, int index1, int index2) {
/* 32 */     throw new RuntimeException("Stub!"); } 
/* 33 */   public static <T> boolean replaceAll(List<T> list, T obj, T obj2) { throw new RuntimeException("Stub!"); } 
/*    */   public static void rotate(List<?> lst, int dist) {
/* 35 */     throw new RuntimeException("Stub!"); } 
/* 36 */   public static int indexOfSubList(List<?> list, List<?> sublist) { throw new RuntimeException("Stub!"); } 
/* 37 */   public static int lastIndexOfSubList(List<?> list, List<?> sublist) { throw new RuntimeException("Stub!"); } 
/* 38 */   public static <T> ArrayList<T> list(Enumeration<T> enumeration) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static <T> Collection<T> synchronizedCollection(Collection<T> collection) { throw new RuntimeException("Stub!"); } 
/* 40 */   public static <T> List<T> synchronizedList(List<T> list) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) { throw new RuntimeException("Stub!"); } 
/* 42 */   public static <E> Set<E> synchronizedSet(Set<E> set) { throw new RuntimeException("Stub!"); } 
/* 43 */   public static <K, V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> map) { throw new RuntimeException("Stub!"); } 
/* 44 */   public static <E> SortedSet<E> synchronizedSortedSet(SortedSet<E> set) { throw new RuntimeException("Stub!"); } 
/*    */   public static <E> Collection<E> unmodifiableCollection(Collection<? extends E> collection) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/* 48 */   public static <E> List<E> unmodifiableList(List<? extends E> list) { throw new RuntimeException("Stub!"); } 
/*    */   public static <K, V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> map) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/* 52 */   public static <E> Set<E> unmodifiableSet(Set<? extends E> set) { throw new RuntimeException("Stub!"); } 
/*    */   public static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> map) {
/* 54 */     throw new RuntimeException("Stub!"); } 
/* 55 */   public static <E> SortedSet<E> unmodifiableSortedSet(SortedSet<E> set) { throw new RuntimeException("Stub!"); } 
/* 56 */   public static int frequency(Collection<?> c, Object o) { throw new RuntimeException("Stub!"); } 
/*    */   public static final <T> List<T> emptyList() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/* 60 */   public static final <T> Set<T> emptySet() { throw new RuntimeException("Stub!"); } 
/*    */   public static final <K, V> Map<K, V> emptyMap() {
/* 62 */     throw new RuntimeException("Stub!"); } 
/* 63 */   public static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 64 */   public static <K, V> Map<K, V> checkedMap(Map<K, V> m, Class<K> keyType, Class<V> valueType) { throw new RuntimeException("Stub!"); } 
/* 65 */   public static <E> List<E> checkedList(List<E> list, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 66 */   public static <E> Set<E> checkedSet(Set<E> s, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 67 */   public static <K, V> SortedMap<K, V> checkedSortedMap(SortedMap<K, V> m, Class<K> keyType, Class<V> valueType) { throw new RuntimeException("Stub!"); } 
/* 68 */   public static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 69 */   public static <T> boolean addAll(Collection<? super T> c, T[] a) { throw new RuntimeException("Stub!"); } 
/* 70 */   public static boolean disjoint(Collection<?> c1, Collection<?> c2) { throw new RuntimeException("Stub!"); } 
/* 71 */   public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) { throw new RuntimeException("Stub!"); } 
/* 72 */   public static <T> Queue<T> asLifoQueue(Deque<T> deque) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.Collections
 * JD-Core Version:    0.6.2
 */