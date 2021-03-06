// Generated by view binder compiler. Do not edit!
package com.ssafy.cleanstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ssafy.cleanstore.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStuffEditBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnStuffEditCancel;

  @NonNull
  public final Button btnStuffEditDelete;

  @NonNull
  public final Button btnStuffEditSave;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final TextInputEditText etStuffEditStuffCount;

  @NonNull
  public final TextInputEditText etStuffEditStuffName;

  @NonNull
  public final TextInputLayout tlStuffCount;

  @NonNull
  public final TextInputLayout tlStuffName;

  @NonNull
  public final TextView tvDate;

  private ActivityStuffEditBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnStuffEditCancel, @NonNull Button btnStuffEditDelete,
      @NonNull Button btnStuffEditSave, @NonNull CalendarView calendarView,
      @NonNull TextInputEditText etStuffEditStuffCount,
      @NonNull TextInputEditText etStuffEditStuffName, @NonNull TextInputLayout tlStuffCount,
      @NonNull TextInputLayout tlStuffName, @NonNull TextView tvDate) {
    this.rootView = rootView;
    this.btnStuffEditCancel = btnStuffEditCancel;
    this.btnStuffEditDelete = btnStuffEditDelete;
    this.btnStuffEditSave = btnStuffEditSave;
    this.calendarView = calendarView;
    this.etStuffEditStuffCount = etStuffEditStuffCount;
    this.etStuffEditStuffName = etStuffEditStuffName;
    this.tlStuffCount = tlStuffCount;
    this.tlStuffName = tlStuffName;
    this.tvDate = tvDate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStuffEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStuffEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_stuff_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStuffEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_stuff_edit_cancel;
      Button btnStuffEditCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnStuffEditCancel == null) {
        break missingId;
      }

      id = R.id.btn_stuff_edit_delete;
      Button btnStuffEditDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnStuffEditDelete == null) {
        break missingId;
      }

      id = R.id.btn_stuff_edit_save;
      Button btnStuffEditSave = ViewBindings.findChildViewById(rootView, id);
      if (btnStuffEditSave == null) {
        break missingId;
      }

      id = R.id.calendar_view;
      CalendarView calendarView = ViewBindings.findChildViewById(rootView, id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.et_stuff_edit_stuff_count;
      TextInputEditText etStuffEditStuffCount = ViewBindings.findChildViewById(rootView, id);
      if (etStuffEditStuffCount == null) {
        break missingId;
      }

      id = R.id.et_stuff_edit_stuff_name;
      TextInputEditText etStuffEditStuffName = ViewBindings.findChildViewById(rootView, id);
      if (etStuffEditStuffName == null) {
        break missingId;
      }

      id = R.id.tl_stuff_count;
      TextInputLayout tlStuffCount = ViewBindings.findChildViewById(rootView, id);
      if (tlStuffCount == null) {
        break missingId;
      }

      id = R.id.tl_stuff_name;
      TextInputLayout tlStuffName = ViewBindings.findChildViewById(rootView, id);
      if (tlStuffName == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      return new ActivityStuffEditBinding((ConstraintLayout) rootView, btnStuffEditCancel,
          btnStuffEditDelete, btnStuffEditSave, calendarView, etStuffEditStuffCount,
          etStuffEditStuffName, tlStuffCount, tlStuffName, tvDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
