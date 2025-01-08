// Generated by view binder compiler. Do not edit!
package com.app.blingy.reauty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.blingy.reauty.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemAccountBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ShapeableImageView imvAvatar;

  @NonNull
  public final ImageView imvSkinCareFirst;

  @NonNull
  public final ImageView imvSkinCareSecond;

  @NonNull
  public final ImageView imvSkinCareThird;

  @NonNull
  public final ImageView imvSkinType;

  @NonNull
  public final MaterialTextView tvCountReviews;

  @NonNull
  public final MaterialTextView tvName;

  @NonNull
  public final MaterialTextView tvTextReviews;

  private ItemAccountBinding(@NonNull ConstraintLayout rootView,
      @NonNull ShapeableImageView imvAvatar, @NonNull ImageView imvSkinCareFirst,
      @NonNull ImageView imvSkinCareSecond, @NonNull ImageView imvSkinCareThird,
      @NonNull ImageView imvSkinType, @NonNull MaterialTextView tvCountReviews,
      @NonNull MaterialTextView tvName, @NonNull MaterialTextView tvTextReviews) {
    this.rootView = rootView;
    this.imvAvatar = imvAvatar;
    this.imvSkinCareFirst = imvSkinCareFirst;
    this.imvSkinCareSecond = imvSkinCareSecond;
    this.imvSkinCareThird = imvSkinCareThird;
    this.imvSkinType = imvSkinType;
    this.tvCountReviews = tvCountReviews;
    this.tvName = tvName;
    this.tvTextReviews = tvTextReviews;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imv_avatar;
      ShapeableImageView imvAvatar = ViewBindings.findChildViewById(rootView, id);
      if (imvAvatar == null) {
        break missingId;
      }

      id = R.id.imv_skin_care_first;
      ImageView imvSkinCareFirst = ViewBindings.findChildViewById(rootView, id);
      if (imvSkinCareFirst == null) {
        break missingId;
      }

      id = R.id.imv_skin_care_second;
      ImageView imvSkinCareSecond = ViewBindings.findChildViewById(rootView, id);
      if (imvSkinCareSecond == null) {
        break missingId;
      }

      id = R.id.imv_skin_care_third;
      ImageView imvSkinCareThird = ViewBindings.findChildViewById(rootView, id);
      if (imvSkinCareThird == null) {
        break missingId;
      }

      id = R.id.imv_skin_type;
      ImageView imvSkinType = ViewBindings.findChildViewById(rootView, id);
      if (imvSkinType == null) {
        break missingId;
      }

      id = R.id.tv_count_reviews;
      MaterialTextView tvCountReviews = ViewBindings.findChildViewById(rootView, id);
      if (tvCountReviews == null) {
        break missingId;
      }

      id = R.id.tv_name;
      MaterialTextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_text_reviews;
      MaterialTextView tvTextReviews = ViewBindings.findChildViewById(rootView, id);
      if (tvTextReviews == null) {
        break missingId;
      }

      return new ItemAccountBinding((ConstraintLayout) rootView, imvAvatar, imvSkinCareFirst,
          imvSkinCareSecond, imvSkinCareThird, imvSkinType, tvCountReviews, tvName, tvTextReviews);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
