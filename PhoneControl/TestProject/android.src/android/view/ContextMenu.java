package android.view;

import android.graphics.drawable.Drawable;

public abstract interface ContextMenu extends Menu
{
  public abstract ContextMenu setHeaderTitle(int paramInt);

  public abstract ContextMenu setHeaderTitle(CharSequence paramCharSequence);

  public abstract ContextMenu setHeaderIcon(int paramInt);

  public abstract ContextMenu setHeaderIcon(Drawable paramDrawable);

  public abstract ContextMenu setHeaderView(View paramView);

  public abstract void clearHeader();

  public static abstract interface ContextMenuInfo
  {
  }
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.ContextMenu
 * JD-Core Version:    0.6.2
 */