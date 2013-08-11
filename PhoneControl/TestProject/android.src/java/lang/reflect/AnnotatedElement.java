package java.lang.reflect;

import java.lang.annotation.Annotation;

public abstract interface AnnotatedElement
{
  public abstract <T extends Annotation> T getAnnotation(Class<T> paramClass);

  public abstract Annotation[] getAnnotations();

  public abstract Annotation[] getDeclaredAnnotations();

  public abstract boolean isAnnotationPresent(Class<? extends Annotation> paramClass);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.reflect.AnnotatedElement
 * JD-Core Version:    0.6.2
 */