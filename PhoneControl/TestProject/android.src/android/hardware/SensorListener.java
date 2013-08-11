package android.hardware;

@Deprecated
public abstract interface SensorListener
{
  public abstract void onSensorChanged(int paramInt, float[] paramArrayOfFloat);

  public abstract void onAccuracyChanged(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.SensorListener
 * JD-Core Version:    0.6.2
 */