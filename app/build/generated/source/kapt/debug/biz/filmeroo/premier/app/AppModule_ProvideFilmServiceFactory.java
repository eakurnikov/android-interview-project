// Generated by Dagger (https://dagger.dev).
package biz.filmeroo.premier.app;

import biz.filmeroo.premier.api.FilmService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFilmServiceFactory implements Factory<FilmService> {
  private final AppModule module;

  private final Provider<OkHttpClient> clientProvider;

  public AppModule_ProvideFilmServiceFactory(AppModule module,
      Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public FilmService get() {
    return provideFilmService(module, clientProvider.get());
  }

  public static AppModule_ProvideFilmServiceFactory create(AppModule module,
      Provider<OkHttpClient> clientProvider) {
    return new AppModule_ProvideFilmServiceFactory(module, clientProvider);
  }

  public static FilmService provideFilmService(AppModule instance, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(instance.provideFilmService(client));
  }
}
