// Generated code from Butter Knife. Do not modify!
package com.khilman.www.aplikasidatasiswa;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TambahActivity_ViewBinding implements Unbinder {
  private TambahActivity target;

  private View view2131230885;

  @UiThread
  public TambahActivity_ViewBinding(TambahActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TambahActivity_ViewBinding(final TambahActivity target, View source) {
    this.target = target;

    View view;
    target.etNamaSiswa = Utils.findRequiredViewAsType(source, R.id.etNamaSiswa, "field 'etNamaSiswa'", EditText.class);
    target.etNis = Utils.findRequiredViewAsType(source, R.id.etNis, "field 'etNis'", EditText.class);
    target.spKelasSiswa = Utils.findRequiredViewAsType(source, R.id.spKelasSiswa, "field 'spKelasSiswa'", Spinner.class);
    view = Utils.findRequiredView(source, R.id.t, "field 't' and method 'onViewClicked'");
    target.t = Utils.castView(view, R.id.t, "field 't'", Button.class);
    view2131230885 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TambahActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etNamaSiswa = null;
    target.etNis = null;
    target.spKelasSiswa = null;
    target.t = null;

    view2131230885.setOnClickListener(null);
    view2131230885 = null;
  }
}
