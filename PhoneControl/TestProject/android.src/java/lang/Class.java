/*    */ package java.lang;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.Serializable;
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.AnnotatedElement;
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.GenericDeclaration;
/*    */ import java.lang.reflect.Method;
/*    */ import java.lang.reflect.Type;
/*    */ import java.lang.reflect.TypeVariable;
/*    */ import java.net.URL;
/*    */ import java.security.ProtectionDomain;
/*    */ 
/*    */ public final class Class<T>
/*    */   implements Serializable, AnnotatedElement, GenericDeclaration, Type
/*    */ {
/*    */   Class()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static Class<?> forName(String className) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Class<?> forName(String className, boolean shouldInitialize, ClassLoader classLoader) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Class<?>[] getClasses() { throw new RuntimeException("Stub!"); } 
/*  9 */   public <A extends Annotation> A getAnnotation(Class<A> annotationType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getCanonicalName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<?> getComponentType();
/*    */ 
/* 15 */   public Constructor<T> getConstructor(Class<?>[] parameterTypes) throws NoSuchMethodException { throw new RuntimeException("Stub!"); } 
/* 16 */   public Constructor<?>[] getConstructors() { throw new RuntimeException("Stub!"); } 
/*    */   public native Annotation[] getDeclaredAnnotations();
/*    */ 
/* 18 */   public Class<?>[] getDeclaredClasses() { throw new RuntimeException("Stub!"); } 
/*    */   public Constructor<T> getDeclaredConstructor(Class<?>[] parameterTypes) throws NoSuchMethodException {
/* 20 */     throw new RuntimeException("Stub!"); } 
/* 21 */   public Constructor<?>[] getDeclaredConstructors() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Field getDeclaredField(String name) throws NoSuchFieldException { throw new RuntimeException("Stub!"); } 
/* 23 */   public Field[] getDeclaredFields() { throw new RuntimeException("Stub!"); } 
/* 24 */   public Method getDeclaredMethod(String name, Class<?>[] parameterTypes) throws NoSuchMethodException { throw new RuntimeException("Stub!"); } 
/* 25 */   public Method[] getDeclaredMethods() { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<?> getDeclaringClass();
/*    */ 
/*    */   public native Class<?> getEnclosingClass();
/*    */ 
/*    */   public native Constructor<?> getEnclosingConstructor();
/*    */ 
/*    */   public native Method getEnclosingMethod();
/*    */ 
/* 31 */   public T[] getEnumConstants() { throw new RuntimeException("Stub!"); } 
/* 32 */   public Field getField(String name) throws NoSuchFieldException { throw new RuntimeException("Stub!"); } 
/* 33 */   public Field[] getFields() { throw new RuntimeException("Stub!"); } 
/* 34 */   public Type[] getGenericInterfaces() { throw new RuntimeException("Stub!"); } 
/* 35 */   public Type getGenericSuperclass() { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<?>[] getInterfaces();
/*    */ 
/* 37 */   public Method getMethod(String name, Class<?>[] parameterTypes) throws NoSuchMethodException { throw new RuntimeException("Stub!"); } 
/* 38 */   public Method[] getMethods() { throw new RuntimeException("Stub!"); } 
/* 39 */   public int getModifiers() { throw new RuntimeException("Stub!"); } 
/* 40 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 41 */   public String getSimpleName() { throw new RuntimeException("Stub!"); } 
/* 42 */   public ProtectionDomain getProtectionDomain() { throw new RuntimeException("Stub!"); } 
/* 43 */   public URL getResource(String resourceName) { throw new RuntimeException("Stub!"); } 
/* 44 */   public InputStream getResourceAsStream(String resourceName) { throw new RuntimeException("Stub!"); } 
/* 45 */   public Object[] getSigners() { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<? super T> getSuperclass();
/*    */ 
/* 48 */   public synchronized TypeVariable<Class<T>>[] getTypeParameters() { throw new RuntimeException("Stub!"); } 
/* 49 */   public boolean isAnnotation() { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isAnonymousClass();
/*    */ 
/* 52 */   public boolean isArray() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isAssignableFrom(Class<?> paramClass);
/*    */ 
/* 54 */   public boolean isEnum() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isInstance(Object paramObject);
/*    */ 
/*    */   public native boolean isInterface();
/*    */ 
/* 57 */   public boolean isLocalClass() { throw new RuntimeException("Stub!"); } 
/* 58 */   public boolean isMemberClass() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isPrimitive();
/*    */ 
/* 60 */   public boolean isSynthetic() { throw new RuntimeException("Stub!"); } 
/* 61 */   public T newInstance() throws InstantiationException, IllegalAccessException { throw new RuntimeException("Stub!"); } 
/* 62 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 63 */   public Package getPackage() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean desiredAssertionStatus();
/*    */ 
/* 66 */   public <U> Class<? extends U> asSubclass(Class<U> c) { throw new RuntimeException("Stub!"); } 
/*    */   public T cast(Object obj) {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.Class
 * JD-Core Version:    0.6.2
 */