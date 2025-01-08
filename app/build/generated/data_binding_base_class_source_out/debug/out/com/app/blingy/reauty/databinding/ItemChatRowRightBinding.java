// Generated by view binder compiler. Do not edit!
package com.app.blingy.reauty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.blingy.reauty.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemChatRowRightBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline6;

  @NonNull
  public final ShapeableImageView imvChatAvatar;

  @NonNull
  public final MaterialTextView tvChatIntroLeft;

  @NonNull
  public final MaterialTextView tvTimestampRight;

  private ItemChatRowRightBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline6,
      @NonNull ShapeableImageView imvChatAvatar, @NonNull MaterialTextView tvChatIntroLeft,
      @NonNull MaterialTextView tvTimestampRight) {
    this.rootView = rootView;
    this.guideline6 = guideline6;
    this.imvChatAvatar = imvChatAvatar;
    this.tvChatIntroLeft = tvChatIntroLeft;
    this.tvTimestampRight = tvTimestampRight;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemChatRowRightBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemChatRowRightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_chat_row_right, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemChatRowRightBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline6;
      Guideline guideline6 = ViewBindings.findChildViewById(rootView, id);
      if (guideline6 == null) {
        break missingId;
      }

      id = R.id.imv_chat_avatar;
      ShapeableImageView imvChatAvatar = ViewBindings.findChildViewById(rootView, id);
      if (imvChatAvatar == null) {
        break missingId;
      }

      id = R.id.tv_chat_intro_left;
      MaterialTextView tvChatIntroLeft = ViewBindings.findChildViewById(rootView, id);
      if (tvChatIntroLeft == null) {
        break missingId;
      }

      id = R.id.tv_timestamp_right;
      MaterialTextView tvTimestampRight = ViewBindings.findChildViewById(rootView, id);
      if (tvTimestampRight == null) {
        break missingId;
      }

      return new ItemChatRowRightBinding((ConstraintLayout) rootView, guideline6, imvChatAvatar,
          tvChatIntroLeft, tvTimestampRight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}