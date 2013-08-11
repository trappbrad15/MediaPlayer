package android.content;

import android.view.KeyEvent;

public abstract interface DialogInterface
{
  public static final int BUTTON_POSITIVE = -1;
  public static final int BUTTON_NEGATIVE = -2;
  public static final int BUTTON_NEUTRAL = -3;

  @Deprecated
  public static final int BUTTON1 = -1;

  @Deprecated
  public static final int BUTTON2 = -2;

  @Deprecated
  public static final int BUTTON3 = -3;

  public abstract void cancel();

  public abstract void dismiss();

  public static abstract interface OnKeyListener
  {
    public abstract boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent);
  }

  public static abstract interface OnMultiChoiceClickListener
  {
    public abstract void onClick(DialogInterface paramDialogInterface, int paramInt, boolean paramBoolean);
  }

  public static abstract interface OnClickListener
  {
    public abstract void onClick(DialogInterface paramDialogInterface, int paramInt);
  }

  public static abstract interface OnShowListener
  {
    public abstract void onShow(DialogInterface paramDialogInterface);
  }

  public static abstract interface OnDismissListener
  {
    public abstract void onDismiss(DialogInterface paramDialogInterface);
  }

  public static abstract interface OnCancelListener
  {
    public abstract void onCancel(DialogInterface paramDialogInterface);
  }
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.DialogInterface
 * JD-Core Version:    0.6.2
 */