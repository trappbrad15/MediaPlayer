package java.util.prefs;

import java.util.EventListener;

public abstract interface PreferenceChangeListener extends EventListener
{
  public abstract void preferenceChange(PreferenceChangeEvent paramPreferenceChangeEvent);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.prefs.PreferenceChangeListener
 * JD-Core Version:    0.6.2
 */