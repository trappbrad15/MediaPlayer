package android.test;

public abstract interface PerformanceTestCase
{
  public abstract int startPerformance(Intermediates paramIntermediates);

  public abstract boolean isPerformanceOnly();

  public static abstract interface Intermediates
  {
    public abstract void setInternalIterations(int paramInt);

    public abstract void startTiming(boolean paramBoolean);

    public abstract void addIntermediate(String paramString);

    public abstract void addIntermediate(String paramString, long paramLong);

    public abstract void finishTiming(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.test.PerformanceTestCase
 * JD-Core Version:    0.6.2
 */