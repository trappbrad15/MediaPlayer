package android.text.method;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;

public abstract interface KeyListener
{
  public abstract int getInputType();

  public abstract boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent);

  public abstract boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent);

  public abstract boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent);

  public abstract void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.method.KeyListener
 * JD-Core Version:    0.6.2
 */