package edu.vt.cs5254.fancygallery;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PhotoPageFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PhotoPageFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PhotoPageFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PhotoPageFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PhotoPageFragmentArgs __result = new PhotoPageFragmentArgs();
    bundle.setClassLoader(PhotoPageFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("photoPageUri")) {
      Uri photoPageUri;
      if (Parcelable.class.isAssignableFrom(Uri.class) || Serializable.class.isAssignableFrom(Uri.class)) {
        photoPageUri = (Uri) bundle.get("photoPageUri");
      } else {
        throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (photoPageUri == null) {
        throw new IllegalArgumentException("Argument \"photoPageUri\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("photoPageUri", photoPageUri);
    } else {
      throw new IllegalArgumentException("Required argument \"photoPageUri\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PhotoPageFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    PhotoPageFragmentArgs __result = new PhotoPageFragmentArgs();
    if (savedStateHandle.contains("photoPageUri")) {
      Uri photoPageUri;
      photoPageUri = savedStateHandle.get("photoPageUri");
      if (photoPageUri == null) {
        throw new IllegalArgumentException("Argument \"photoPageUri\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("photoPageUri", photoPageUri);
    } else {
      throw new IllegalArgumentException("Required argument \"photoPageUri\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Uri getPhotoPageUri() {
    return (Uri) arguments.get("photoPageUri");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("photoPageUri")) {
      Uri photoPageUri = (Uri) arguments.get("photoPageUri");
      if (Parcelable.class.isAssignableFrom(Uri.class) || photoPageUri == null) {
        __result.putParcelable("photoPageUri", Parcelable.class.cast(photoPageUri));
      } else if (Serializable.class.isAssignableFrom(Uri.class)) {
        __result.putSerializable("photoPageUri", Serializable.class.cast(photoPageUri));
      } else {
        throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("photoPageUri")) {
      Uri photoPageUri = (Uri) arguments.get("photoPageUri");
      if (Parcelable.class.isAssignableFrom(Uri.class) || photoPageUri == null) {
        __result.set("photoPageUri", Parcelable.class.cast(photoPageUri));
      } else if (Serializable.class.isAssignableFrom(Uri.class)) {
        __result.set("photoPageUri", Serializable.class.cast(photoPageUri));
      } else {
        throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    PhotoPageFragmentArgs that = (PhotoPageFragmentArgs) object;
    if (arguments.containsKey("photoPageUri") != that.arguments.containsKey("photoPageUri")) {
      return false;
    }
    if (getPhotoPageUri() != null ? !getPhotoPageUri().equals(that.getPhotoPageUri()) : that.getPhotoPageUri() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getPhotoPageUri() != null ? getPhotoPageUri().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PhotoPageFragmentArgs{"
        + "photoPageUri=" + getPhotoPageUri()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PhotoPageFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Uri photoPageUri) {
      if (photoPageUri == null) {
        throw new IllegalArgumentException("Argument \"photoPageUri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("photoPageUri", photoPageUri);
    }

    @NonNull
    public PhotoPageFragmentArgs build() {
      PhotoPageFragmentArgs result = new PhotoPageFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPhotoPageUri(@NonNull Uri photoPageUri) {
      if (photoPageUri == null) {
        throw new IllegalArgumentException("Argument \"photoPageUri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("photoPageUri", photoPageUri);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Uri getPhotoPageUri() {
      return (Uri) arguments.get("photoPageUri");
    }
  }
}
