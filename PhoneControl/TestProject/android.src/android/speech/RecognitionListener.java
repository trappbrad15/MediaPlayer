package android.speech;

import android.os.Bundle;

public abstract interface RecognitionListener
{
  public abstract void onReadyForSpeech(Bundle paramBundle);

  public abstract void onBeginningOfSpeech();

  public abstract void onRmsChanged(float paramFloat);

  public abstract void onBufferReceived(byte[] paramArrayOfByte);

  public abstract void onEndOfSpeech();

  public abstract void onError(int paramInt);

  public abstract void onResults(Bundle paramBundle);

  public abstract void onPartialResults(Bundle paramBundle);

  public abstract void onEvent(int paramInt, Bundle paramBundle);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.speech.RecognitionListener
 * JD-Core Version:    0.6.2
 */