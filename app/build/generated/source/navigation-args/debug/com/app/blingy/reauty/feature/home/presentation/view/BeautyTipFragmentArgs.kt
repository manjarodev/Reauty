package com.app.blingy.reauty.feature.home.presentation.view

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.app.blingy.reauty.core.domain.model.feed.BeautyTipType
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class BeautyTipFragmentArgs(
  public val beautyTipTypeSafeArgs: BeautyTipType = BeautyTipType.ACNE_PRONE
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(BeautyTipType::class.java)) {
      result.putParcelable("beautyTipTypeSafeArgs", this.beautyTipTypeSafeArgs as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BeautyTipType::class.java)) {
      result.putSerializable("beautyTipTypeSafeArgs", this.beautyTipTypeSafeArgs as Serializable)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): BeautyTipFragmentArgs {
      bundle.setClassLoader(BeautyTipFragmentArgs::class.java.classLoader)
      val __beautyTipTypeSafeArgs : BeautyTipType?
      if (bundle.containsKey("beautyTipTypeSafeArgs")) {
        if (Parcelable::class.java.isAssignableFrom(BeautyTipType::class.java) ||
            Serializable::class.java.isAssignableFrom(BeautyTipType::class.java)) {
          __beautyTipTypeSafeArgs = bundle.get("beautyTipTypeSafeArgs") as BeautyTipType?
        } else {
          throw UnsupportedOperationException(BeautyTipType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__beautyTipTypeSafeArgs == null) {
          throw IllegalArgumentException("Argument \"beautyTipTypeSafeArgs\" is marked as non-null but was passed a null value.")
        }
      } else {
        __beautyTipTypeSafeArgs = BeautyTipType.ACNE_PRONE
      }
      return BeautyTipFragmentArgs(__beautyTipTypeSafeArgs)
    }
  }
}
