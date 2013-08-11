package android.hardware;

public abstract interface SensorEventListener
{
  public abstract void onSensorChanged(SensorEvent paramSensorEvent);

  public abstract void onAccuracyChanged(Sensor paramSensor, int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.SensorEventListener
 * JD-Core Version:    0.6.2
 */