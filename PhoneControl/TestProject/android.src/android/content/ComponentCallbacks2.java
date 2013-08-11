package android.content;

public abstract interface ComponentCallbacks2 extends ComponentCallbacks
{
  public static final int TRIM_MEMORY_COMPLETE = 80;
  public static final int TRIM_MEMORY_MODERATE = 60;
  public static final int TRIM_MEMORY_BACKGROUND = 40;
  public static final int TRIM_MEMORY_UI_HIDDEN = 20;
  public static final int TRIM_MEMORY_RUNNING_CRITICAL = 15;
  public static final int TRIM_MEMORY_RUNNING_LOW = 10;
  public static final int TRIM_MEMORY_RUNNING_MODERATE = 5;

  public abstract void onTrimMemory(int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ComponentCallbacks2
 * JD-Core Version:    0.6.2
 */