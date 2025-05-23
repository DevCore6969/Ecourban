package com.ecohub.app.data.service;

import com.google.firebase.storage.FirebaseStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class FirebaseService_ProvideFirebaseStorageFactory implements Factory<FirebaseStorage> {
  @Override
  public FirebaseStorage get() {
    return provideFirebaseStorage();
  }

  public static FirebaseService_ProvideFirebaseStorageFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseStorage provideFirebaseStorage() {
    return Preconditions.checkNotNullFromProvides(FirebaseService.INSTANCE.provideFirebaseStorage());
  }

  private static final class InstanceHolder {
    private static final FirebaseService_ProvideFirebaseStorageFactory INSTANCE = new FirebaseService_ProvideFirebaseStorageFactory();
  }
}
