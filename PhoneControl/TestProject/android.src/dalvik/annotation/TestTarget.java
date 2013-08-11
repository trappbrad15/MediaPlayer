package dalvik.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Deprecated
public @interface TestTarget
{
  public abstract String methodName();

  public abstract String conceptName();

  public abstract Class<?>[] methodArgs();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     dalvik.annotation.TestTarget
 * JD-Core Version:    0.6.2
 */